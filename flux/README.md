---
layout: pattern
title: Flux
folder: flux
permalink: /patterns/flux/
categories: Presentation Tier
tags:
 - Java
 - Difficulty-Intermediate
---

## 意图
Flux是一个避开MVC的单项数据流。当用户通过视图进行交互，视图通过控制中心进行分发，为了存储各种各样的应用逻辑和数据，更新所有的视图受到影响。

！[alt text](./etc/flux.png "Flux")

## 适用性
当出现下面场景的时候可以使用Flux：

* 当你需要专注于创造一个清晰的容易理解的应用更新途径。开发追踪和找到bug都很容易。

## 引用

* [Flux - Application architecture for building user interfaces](http://facebook.github.io/flux/)