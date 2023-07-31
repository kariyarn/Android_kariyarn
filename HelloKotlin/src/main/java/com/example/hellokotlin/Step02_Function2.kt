package com.example.hellokotlin

    //함수 type을 매개 변수로 전달받는 함수를 정의하고자 한다.
    fun useFunc(a:()->Unit){
        //인자로 전달 받은 함수 호출하기
        a()
    }

    fun main(){
        //위의 useFunc()함수를 호출해 보세요
        useFunc(fun (){
            println("Hello")
        })
        useFunc {
            println("Hello");
        }
        
        //Read Only 숫자 배열
        val nums:List<Int> = listOf(10, 20, 30)

        nums.forEach(fun(item){
            println(item)
        })
        nums.forEach({
            //it은 매개변수에 전달되는 바로 그것(it)을 가리킨다)
            println(it)
        })
        nums.forEach{
            println(it)
        }
        nums.forEach{ println(it)};
    }