package com.example.hellokotlin

/*
class Person constructor(name:String){//Kotlin의 생성자
    //필드 선언
    var name:String
    //초기화 블럭
    init {
        //생성자의 인자로 전달받은 값을 매개 변수에 저장
        this.name=name
    }
}
*/
//위를 줄이면 아래와 같다.
//var or val을 생성자의 인자에 선언하면 전달받은 값이 자동으로 같은 이름의 필드가
//만들어지면서 값이 필드에 대입된다.
//var은 수정이 가능한 필드를 만들어지고, val은 수정이 불가능한 필드가 만들어진다.
class Person(var name:String)

data class Member(var num:Int, var name: String, var addr: String)

fun main(){
    var p1=Person("김구라")
    println("p1.name:"+p1.name)
    println(p1)

    //member객체 생성
    var m1 = Member(1, "김구라", "노량진")
    println("번호 : ${m1.num} 이름 : ${m1.name}, 주소 : ${m1.addr}")
    println(m1)

    //수정 가능한 list 객체를 얻어내서 참조값을 member라는 상수에 담기
    val members:MutableList<Member> = mutableListOf<Member>()
    //type추론이 가능하기 때문에 member2의 type 생략 가능
    val members2 = mutableListOf<Member>()

    members.add(m1)
    members.add(Member(2, "해골", "행신동"))
    
    //List의 forEach() 함수를 호출하면서 함수를 전달하면 전달한 함수의 매개변수에
    //list에 저장된 아이템이 순서대로 전달된다.
    members.forEach(fun(item){
        println(item)
    })
    println("--------")
    members.forEach({
        println(it)
    })
}