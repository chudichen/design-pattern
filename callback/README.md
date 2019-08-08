---
layout: pattern
title: Callback
folder: callback
permalink: /patterns/callback/
categories: Other
tags:
 - Java
 - Difficulty-Beginner
 - Functional
 - Idiom
---

## 意图

回调是传递给其他方法的一个代码参数，在合适的时候执行回调。

![alt text](./etc/callback.png "Callback")

## 适用性

当出现一下情况的时候可以使用回调模式

* 一些特定的执行结果后需要同步执行的方法。

## 现实案例

* [CyclicBarrier](http://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CyclicBarrier.html#CyclicBarrier%28int,%20java.lang.Runnable%29) constructor can accept callback that will be triggered every time when barrier is tripped.