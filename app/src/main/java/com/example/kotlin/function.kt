package com.example.kotlin

fun main() {

    /**
     * 함수
     * 우리는 이미 함수를 여러번 사용했다
     * fun main() 을 선언하여 kotlin 파일을 실행시키거나
     * Activity에서 onCreate 함수내에서 작업을 해왔다
     *
     * fun (파라미터1: 타입, 파라미터2: 타입 , ...): 반환타입 {
     *      return 반환값
     * } 의 형태로 이뤄진다
     *
     * 함수는 작업의 단위라고 생각할수 있다.
     * 함수를 이용하여 작업을 명확하게 구분하여 사용하면 코드의 재사용성 및 유지보수가 원활해진다
     */

//    1. 반환값과 입력값이 있는 함수

    fun square(x: Int): Int {
        return x * x
    }

    println("Result from square function :  ${square(4)}")

//    2. 반환값이 없는 함수

    fun printSquare(x: Int) {
        println("Result from printSquare function :  ${x * x}")
    }

    printSquare(4)

//    3. 입력값 없이 반환값만 있는 함수

    fun getDefaultInfo(): Map<String, String> {
        return mapOf(Pair("language", "kotlin"), Pair("for", "android"))
    }

    println("Result from getDefaultInfo function :  ${getDefaultInfo()}")

//    4. 파라미터의 기본값이 있는 함수

    fun myInfo(name: String, univ: String = "hanyang"): Map<String,String> {
        return mapOf(Pair("name", name), Pair("univ", univ))
    }

    println("Result from myInfo function :  ${myInfo("ian")}")

//    5. 파라미터 이름으로 값을 입력하기

    fun myInfo2(name: String, univ: String = "hanyang", grade: Int = 1): Map<String,Any> {
        return mapOf(Pair("name", name), Pair("univ", univ), Pair("grade", grade))
    }

    println("Result from myInfo2 function :  ${myInfo2("ian", grade = 4)}")
}