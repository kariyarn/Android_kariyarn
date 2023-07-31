package com.example.hellokotlin

class Dog constructor(){
    init {
        println("멍멍이가 생겼어요")
    }
    var name:String? = null
    constructor(name:String):this(){
        //null이 가능한 type 공간에 null이 불가능한 type공간에 담긴 값을 대입하는 것은 가능
        this.name=name
    }

}


class Cat constructor(){
    //init블럭은 primary 생성자의 일부
    init {
        println("고양이가 나타났다.")
    }

    //뒤늦은 초기화가 가능한 필드 lateinit 예약어 붙여서 선언하기
    lateinit var name:String
    constructor(name:String) : this() {//this() primary 생성자를 호출하는 표현식이다
        println("야옹이의 이름은 : ${name}")
        this.name=name
    }
}
fun main(){
    val c1 = Cat("톰캣")
    println(c1.name)
    val c2 = Cat()
    //Lateinit 필드에 값을 넣어주고
    c2.name="톰캣2"
    //필드를 참조해야 한다.
    println(c2.name)

    //null 값이 가능한 data type은 type 뒤에 ? 를 붙여 주어야 한다.
    //String type과 String? type은 다른 type으로 간주된다.
    var myName:String? = null
    myName="김구라"
    myName=null
    //Int(숫자) type도 null을 넣어 놓고 값을 나중에 대입할 수 있다.
    var myNum:Int?=null
    myNum=999;
    myNum=null
    var d1=Dog("바둑이")
    var d2=Dog()
    println(d1.name)
    println(d2.name)
}