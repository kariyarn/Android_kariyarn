package com.example.hellokotlin

fun main(){
    /*
        String type의 편리한 기능 활용
     */
    val myName="김구라"
    val yourName="해골"
    //연결연산자 가능
    val result="내 이름 :"+myName
    //$변수명 해서 문자열을 연결할 수 있다.
    val result2="너의 이름 :$yourName"
    //${}javascript backtick에서 활용했던 표현식도 가능
    val result3 = "우리의 이름:${myName+yourName}"
    val num1 = 10
    val num2 = 20
    val result4 = "num1+num2=${num1+num2}"
    //여러줄의 문자열을 편리하게 작성할 수 있다.
    val html="""
        <div>
            <p>p요소입니다.</p>
        </div>
    """
    val html2="""
        <div>
            <p>p요소입니다.</p>
        </div>
    """.trimIndent()//trim은 들여쓰기 없애줌
    println(html)
    println("----------")
    println(html2)
}