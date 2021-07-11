# 设计模式学习代码库

> 参考书籍：《大话设计模式》
>
> 程序设计的过程，就是抽象和解耦的过程

## 设计原则

### 单一职责原则
一个类，只应有一个原因使之改变，也即一个类只应有单一的职责。
一个功能往往由不同构件实现。只有将部件解耦，部件的复用性才会更强（活字印刷）。

### 开放-封闭原则
好的代码，应该对扩展开放，对修改封闭。当出现业务扩展时，程序员更希望新增代码，而非在原来的代码上修改。
当然修改也是不可避免的，设计应该让这些修改尽可能少，即构造抽象隔离变化。

### 依赖倒转原则
应当面向接口编程，而不是面向实现编程。使得高层模块得以复用。
蕴含了里氏代换原则：子类型必须能够替换掉他们的父类型。高层模块不应直接依赖底层模块，两者应该依赖于抽象（接口）

### 迪米特法则
也叫最小知识原则。如果两个类不必彼此直接通信，那么这两个类就不应该发生直接的相互作用。如果一个类需要调用另一个类的某个方法，可以通过第三者转发这个调用。
强调类鱼类之间的松耦合。耦合越弱，复用性就越高。

## 设计模式

### 简单工厂模式 `p1.simple.factory` 

### 策略模式 `p2.strategy`
以相同的方式调用不同的算法（在不同的情况应用不同的业务规则），调用方只需要使用策略的上下文Context就行了

### 装饰器模式 `p3.decorate`
简单工厂的建造逻辑是确定的，而装饰器模式建造逻辑是不确定的。即，动态地给一个类添加一些额外的职责，比生成子类更灵活。
实现原理为：在每个子类中都引用一个父类对象（装饰的上文），在operation()方法中调用引用对象的operation()方法，从而实现代码动态重组。
将核心职责和装饰功能分开

### 代理模式 `p4.proxy`
代理Proxy和被代理对象RealSubject实现相同的接口，Proxy持有RealSubject的引用，由Proxy的对象来实现RealSubject的方法。代理模式适用于下面几种情况：
* 远程代理：为一个对象在不同的地址空间提供局部代表
* 虚拟代理：根据需要创建开销很大的对象，存放实例化需要很长时间的真实对象
* 通过代理在访问对象时附件一些内务处理，如安全代理，计算引用次数，检查是否锁定等等

### 工厂方法模式 `p5.factory`
简单工厂模式，将创建何种子类对象的判断逻辑写在简单工厂类中，而工厂方法模式对每个子类都有一个工厂，将选择的部分直接放在客户端。扩展功能时，需要新建一个子类以及一个子类的工厂。

### 原型模式 `p6.prototype`
大量创建同一个类的对象时，若这些对象之间有相似性，应采用 `复制` + `修改` 的方式。`复制`又涉及到了浅表复制和深复制（java中通过重写Object.clone()来控制）：
* 浅表复制：对象中的值类型，复制；对象中的引用类型，仅复制引用，不复制属性值
* 深复制：对引用类型也new一个对象，即递归地进行浅表复制

### 模板方法模式 `p7.template`
定义一个操作中的算法的骨架，将其中变化的部分延迟到子类中实现。即，将所有不变的行为转移到父类，以此减少子类中的重复代码，将不变的行为和可变的行为分离

### 外观模式 `p8.facade`
为子系统的一组接口实现一个统一的界面，即高层接口。此高层接口需要了解所有的子系统的方法和属性。应用于业务分层与隔离。