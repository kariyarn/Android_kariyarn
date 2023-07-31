package com.example.hellokotlin

//추상 클래스 => abstrack 예약어를 이용해서 만든다.
abstract class Weapon(){
    fun move(){
        println("이동합니다.")
    }
    //추상 메소드 역시 abstract 예약어를 이용해서 만든다.
    abstract fun attack()
}

class MyWeapon : Weapon(){
    //추상 메소드를 강제로 오버라이드 해야한다.
    override fun attack() {
        println("무언가를 공격해요")
    }
}
fun main(){
    val w1:Weapon = MyWeapon()
    w1.move()
    w1.attack()

    val w2 = object:Weapon(){
        override fun attack() {
            println("공중 공격을 해요!")
        }
    }
    w2.attack()
    w2.move()
    println("--------------")

    with(w2){
        move()
        attack()
    }

    //다형성
    val w3=MyWeapon()//w3에는 MyWeapon 객체의 참조값이 들어 있다.
    val a:MyWeapon=w3 //w3에는 당연히 MyWeapon 타입이다.
    val b:Weapon=w3 //w3는 Weapon 타입이기도 하다.
    val c:Any=w3 //Any type은 java에서 Object type에 해당되는 type이다.

    //Any type 변수에는 어떤 type이든 담을 수 있다.
    var d:Any=10
    d=true
    d="kim"
    d=w3
}