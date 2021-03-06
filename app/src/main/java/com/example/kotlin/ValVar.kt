package com.example.kotlin

// JVM을 통해 프로그램이 시작되는 진입점
fun main() {

    /*

    변수와 상수

    수학으로 예를 들어보자
    시험에서 반지름이 6cm인 이 원의 둘레를 구하시오. (π=3.0)

    원의 둘레를 구하는 공식은 2πr이다. 그러면 자연스레 36cm라는 답을 우리는 도출하지 않는가
    저 수학기호에 해당하는 값을 머리에서 치환해서 2 * 3.0 * 6 = 36 을 생각한거다.

    프로그래밍에서 변수와 상수도 마찬가지의 개념이다.
    단지 값(메모리주소)을 저장하는 역할을 한다.

     */

    var age = 28
    val bloodType = "O형"

    age = 29
//    bloodType = "AB형" // Error: Val cannot be reassigned

    /*
    변수와 상수의 차이는 변경을 할 수 있냐 없냐의 차이를 가지고 있다.
    변수는 var, 상수는 val이라는 예약어를 사용하여 선언을 한다.

     (예약어란? 컴퓨터 프로그래밍언어에서 이미 문법적인 용도로 사용되고 있기 때문에 식별자로 사용할 수 없는 단어)
     var fun = 123 // Error: The expression is unused

     방금 변수와 상수를 만드는 과정에서 사실 2가지 작업을 했는데 선언과 할당을 동시에 한것이다
    */

//    var day Error: This variable must either have a type annotation or be initialized

    var day: Any
    day = "saturday"
    var day2 = "saturday"

    /*
    방금 본것처럼 변수 및 상수를 선언할때는 자료형이 필요하다
    다음장에서 자료형에 대해서 설명하겠다
     */



}