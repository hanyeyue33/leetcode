package com.luojian.leetcode.kotlin.entity

class Runoob {
//    var name: String?
//    var url: String?
//    var city: String?

    //    var allByDefault: Int? // 错误: 需要一个初始化语句, 默认实现了 getter 和 setter 方法
    var initialized = 1    // 类型为 Int, 默认实现了 getter 和 setter
    var simple: Int?       // 类型为 Int ，默认实现 getter ，但必须在构造函数中初始化
    val inferredType = 1   // 类型为 Int 类型,默认实现 getter

    /**
     * 类也可以有二级构造函数，需要加前缀 constructor:
     */
    constructor() {

//        parent.children.add(this)
        simple = null;
        println("constructor.lastName: ${simple}")
    }

    init {
        simple = null;
        println("init.lastName: ${simple}")
    }
}

// 测试
fun main(args: Array<String>) {
    var person: Runoob = Runoob()

    person.simple = 1
    println("lastName:${person.simple}")


}