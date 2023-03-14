package com.liuhanze.design_patterns.proxy.demo3;

/**
 * 动态代理
 * 面向横切面编程，也就是AOP（Aspect Oriented Programming），其核心就是采用了动态代理机制
 * 实现AOP的技术，主要分为两大类：一是采用动态代理技术，利用截取消息的方式，对该消息进行装饰，以取代原有对象行为的执行；
 * 二是采用静态织入的方式，引入特定的语法创建“方面”，从而使得编译器可以在编译期间织入有关“方面”的代码。
 * AOP利用一种称为“横切”的技术，剖解开封装的对象内部，并将那些影响了多个类的公共行为封装到一个可重用模块，并将其命名为“Aspect”，
 * 即方面。所谓“方面”，简单地说，就是将那些与业务无关，却为业务模块所共同调用的 逻辑或责任封装起来，比如日志记录，便于减少系统的
 * 重复代码，降低模块间的耦合度，并有利于未来的可操作性和可维护性。
 *
 * 动态代理相较于静态代理的优势在于可以很方便的对代理类的所有函数进行统一管理，如果我们想在每个代理方法前都加一个方法，如果代理
 * 方法很多，我们需要在每个代理方法都要写一遍，很麻烦。而动态代理则不需要。
 * AOP的作用：
 *
 * 面向切面编程（AOP）提供另外一种角度来思考程序结构，通过这种方式弥补了面向对象编程（OOP）的不足。
 * 利用AOP对业务逻辑的各个部分进行隔离，降低业务逻辑的耦合性，提高程序的可重用型和开发效率。
 * 主要用于对同一对象层次的公用行为建模
 * ————————————————
 * 版权声明：本文为CSDN博主「学一次」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/jjclove/article/details/124386972
 */
public class ProxyMain {


    public void main(){
        //定义主题
        Subject subject = new RealSubject();

        //定义主题代理
        Subject proxy = SubjectDynamicProxy.getInstance(subject);
        proxy.doSomething();
    }
}
