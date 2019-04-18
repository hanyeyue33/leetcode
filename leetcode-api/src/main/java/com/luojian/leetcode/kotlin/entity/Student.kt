package com.luojian.leetcode.kotlin.entity

data class Student(var name : String, var age : Int, var no : String, var score : Int?){

}
fun main(args: Array<String>) {
    val s =  Student("Runoob", 18, "S12346", null)
    println("学生名： ${s.name}")
    println("年龄： ${s.age}")
    println("学生号： ${s.no}")
    println("成绩： ${s.score}")
}