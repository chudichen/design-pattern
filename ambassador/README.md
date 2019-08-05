---
layout: pattern
title: Ambassador
folder: ambassador
permalink: /patterns/ambassador/
categories: Structural
tags:
 - Java
 - Difficulty-Intermediate
---

## 意图
为客户端提供一个帮助服务实例，并把相应的功能从共享资源中卸载。

## 解释
案例分析

> 远程服务有许多客户端通过所提供的方法来访问。服务是一个旧系统很可能面临着更新。用户的大量请求将会面临并发问题。访问记录需要被记录在客户端日志。

简单来说

> 使用大使模式我们可以实现客户端低频率的延迟检查和日志记录。

微软文档

> 大使服务可以被认为是与客户端协同进行的额外处理代理。这个设计模式对于减少客户端连接类型的任务很有帮助，比如：日志，路由，安全，是一种语言无关的弹性设计模式。他通常与遗留项目一起使用，或者其他很难被修改的项目，为了扩展其网络能力。它可以使特定的团队来实现一些功能。

**编程案例**

为了实现这个设计模式案例，我们需要实现一些功能。首先我们要实现了一个远程服务的作为大使模式：

```java
interface RemoteServiceInterface {
    long doRemoteFunction(int value) throws Exception;
}
```

一个远程的单例服务

```java
@Slf4j
public class RemoteService implements RemoteServiceInterface {
    private static RemoteService service = new RemoteService();;
    
    static RemoteService getRemoteService() {
        return service;
    }
    
    public long doRemoteFunction(int value) {
        long waitTime = (long) Math.floor(Math.random() * 1000);
        try{
            sleep(waitTime);
        } catch (InterruptedException e) {
            LOGGER.error("Thread sleep interrupted", e);
        }
        return waitTime >= 200 ? value * 10 : -1;
    }
}
```

大使服务添加额外的特性如日志，延迟检测。

```java
@Slf4j
public class ServiceAmbassador implements RemoteServiceInterface {
    
    private static final int PETRIES = 3;
    private static final int DELAY_MS = 3000;
    
    ServiceAmbassador() {}
    
    @Override
    public long doRemoteFunction(int value) {
        return safeCall(value);
    }
    
    private long checkLatency(int value) {
        RemoteService service = RemoteService.getRemoteService();
        long startTime = System.currentTimeMillis();
        long result = service.doRemoteFunction(value);
        long timeTaken = System.currentTimeMillis() - startTime;
        
        log.info("Time taken (ms): " + timeTaken);
        return result;
    }
    
    private long safeCall(int value) {
        int retries = 0;
        long result = -1;
        
        for (int i = 0; i < PETRIES; i++) {
            if (retries >= PETRIES) {
                return -1;
            }
            
            if ((result = checkLatency(value)) == -1) {
                log.info("Failed to reach remote: ( " + (i + 1) + " )");
                retries++;
                try {
                    sleep(DELAY_MS);
                } catch (InterruptedException e) {
                    LOGGER.error("Thread sleep state interrupted", e);
                }
            } else {
                break;
            }
        }
        return result;
    }
}
```

客户端有本地大使服务用来与远程服务相互作用：

```java
public class Client {
    
    private ServiceAmbassador serviceAmbassador;
    
    Client() {
        serviceAmbassador = new ServiceAmbassador();
    }
    
    long useService(int value) {
        long result = serviceAmbassador.doRemoteFunction(value);
        log.info("Service result: " + result);
        return result;
    }
}
```

这里有两个客户端使用服务。

```java
Client host1 = new Client();
Client host2 = new Client();
host1.useService(12);
host2.useService(73);
```

## 适用性
在使用旧系统或者很难更改的系统时候，可以使用大使模式。连接的特性可以通过客户端来实现，以避免服务器代码的更改。

## 典型用例

* 控制其他对象的访问
* 实现日志
* 实现断路器
* 卸载远程服务任务
* 促进网络连接

## 现实案例

* [Kubernetes-native API gateway for microservices](https://github.com/datawire/ambassador)

## 引用

* [Ambassador pattern](https://docs.microsoft.com/en-us/azure/architecture/patterns/ambassador)
* [Designing Distributed Systems: Patterns and Paradigms for Scalable, Reliable Services](https://books.google.co.uk/books?id=6BJNDwAAQBAJ&pg=PT35&lpg=PT35&dq=ambassador+pattern+in+real+world&source=bl&ots=d2e7GhYdHi&sig=Lfl_MDnCgn6lUcjzOg4GXrN13bQ&hl=en&sa=X&ved=0ahUKEwjk9L_18rrbAhVpKcAKHX_KA7EQ6AEIWTAI#v=onepage&q=ambassador%20pattern%20in%20real%20world&f=false)