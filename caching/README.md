---
layout: pattern
title: Caching
folder: caching
permalink: /patterns/caching/
categories: Other
tags:
 - Java
 - Difficulty-Intermediate
 - Performance
---

## 意图
为了避免高昂的重复获取资源，在用过之后并不立即释放。资源保留着它们的标识，并保存在一些快速访问的存储中，从而避免再次获取。

## 适用性
使用缓存模式当
* 重复获取，初始化，释放同样的资源

## 引用

* [Write-through, write-around, write-back: Cache explained](http://www.computerweekly.com/feature/Write-through-write-around-write-back-Cache-explained)
* [Read-Through, Write-Through, Write-Behind, and Refresh-Ahead Caching](https://docs.oracle.com/cd/E15357_01/coh.360/e15723/cache_rtwtwbra.htm#COHDG5177)
* [Cache-Aside](https://msdn.microsoft.com/en-us/library/dn589799.aspx)