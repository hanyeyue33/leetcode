package com.luojian.leetcode.kotlin.entity

import lombok.Data

@Data
class Greeter(val name: String, val age: Int?) {
    fun greet() {
        println("Hello, $name")
    }

    fun main(args: Array<String>) {

    }
}

fun sum(a: Int, b: Int?): Int {   // Int 参数，返回值 Int
    var ages1 = b?.toInt() ?: -1
    return a + ages1
}

fun main() {
//    println(Greeter("World!", 1).name)          // 创建一个对象不用 new 关键字

    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
// 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s1)
    println(s2)
    println("${Greeter("World!", 1).greet()}")
    println("${sum(1, null)}")
}

fun main2(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))  // 输出 3
}


fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
    for (i in 1..4) print(i)
}

fun rangeAtoB() {
    for (i in 1..4) print(i) // 输出“1234”

    for (i in 4..1) print(i) // 什么都不输出

    var i = 1
    if (i in 1..10) { // 等同于 1 <= i && i <= 10
        println(i)
    }

// 使用 step 指定步长
    for (i in 1..4 step 2) print(i) // 输出“13”

    for (i in 4 downTo 1 step 2) print(i) // 输出“42”


// 使用 until 函数排除结束元素
    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
        println(i)
    }
}
fun mainFor(args: Array<String>) {
    print("循环输出：")
    for (i in 1..4) print(i) // 输出“1234”
    println("\n----------------")
    print("设置步长：")
    for (i in 1..4 step 2) print(i) // 输出“13”
    println("\n----------------")
    print("使用 downTo：")
    for (i in 4 downTo 1 step 2) print(i) // 输出“42”
    println("\n----------------")
    print("使用 until：")
    // 使用 until 函数排除结束元素
    for (i in 1 until 4) {   // i in [1, 4) 排除了 4
        print(i)
    }
    println("\n----------------")

    var a =  123.5e10
    println("\n----------------"+a.toString())
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}
fun main(args: Array<String>) {
    //[1,2,3]
    val a = arrayOf(1, 2, 3)
    //[0,2,4]
    val b = Array(3, { i -> (i * 2) })
    val x: IntArray = intArrayOf(1, 2, 3)
    //读取数组内容
    println(a[0])    // 输出结果：1
    println(b[1])    // 输出结果：2
    println(x[2])    // 输出结果：3
    val text = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text)   // 输出有一些前置空格

//    val max = if (a > b) {
//        print("Choose a")
//        a
//    } else {
//        print("Choose b")
//        b
//    }
//    print(max)
}

