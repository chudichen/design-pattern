---
layout: pattern
title: 抽象类型
folder: abstract-document
permalink: /patterns/abstract-document/
categories: Structural
tags: 
 - Java
 - Difficulty-Intermediate
---

## 意图
实现无类型的灵活性并且具有类型安全

![alt text](./etc/abstract-document.png "Abstract Document Traits and Domain")

## 适用性
当出现如下情况的时候可以使用抽象类型：

* 需要在运行时动态添加新的属性
* 希望以树结构组织实体对象
* 需要构建一个松耦合的系统

## 引用
[Wikipedia: Abstract Document Pattern](https://en.wikipedia.org/wiki/Abstract_Document_Pattern)
[Martin Fowler: Dealing with properties](http://martinfowler.com/apsupp/properties.pdf)