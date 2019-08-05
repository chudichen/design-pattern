---
layout: pattern
title: Balking
folder: balking
permalink: /patterns/balking/
categories: Concurrency
tags:
 - Java
 - Difficulty-Beginner
---

## 意图
阻止模式被用来保护一个对象执行残缺或者不适当的状态的代码

![alt text](./etc/balking.png "Balking")

* 你想要在特定状态下执行动作
* 对于未知的状态，对象通常会短暂性停止

## 相关方法

* 守卫悬停模式
* 双重检测锁模式