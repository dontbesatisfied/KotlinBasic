package com.example.kotlin

fun main() {

    /**
     * 반복문은 코드를 반복적으로 실행하고자 할때 사용한다.
     * 예를들어 1-10까지 로그를 찍는다고할때
     * println()을 열번하는것이 아닌 반복문안에서 한번만 사용하면 쉽게 할 수 있다.
     *
     * 반복문에는 for 과 while 2가지가 있다.
     * 컨셉의 차이가 있다
     * for문은 특정횟수만큼 반복하는것
     * while은 특정조건이 만족할때까지 이다.
     */

    /**
     * for문 부터 알아보자
     *
     * for (반복할 범위) {
     *  // 실행 코드
     * }
     * 로 이루어져 있다
     * if 부분에서 보았던 in을 사용해서 반복할 범위를 정의하며 if에서 보았던것보다 더 다양한 기능이 있다
     */

//    .. 은 시작부터 끝을 다 포함한다
    for (i in 1..10) {
        println(".. $i")
    }

//    until을 사용하면 끝을 포함하지 않는다
    for (i in 1 until 10) {
        println("until $i")
    }

//    step을 이용하여 건너뛸수 있다
    for (i in 1..10 step 2) {
        println("step $i")
    }
//    ..와는 다르게 downTo를 이용하여 큰수부터 감소하면서 실행이 가능하다
    for (i in 10 downTo 1) {
        println("downTo $i")
    }

//    range가 아닌 배열이나 컬렉션을 사용할수도 있다
    var arr = mutableListOf("a", "b", "c", "d", "e")
    for (i in arr) {
        println("arr in $i")
    }

    for (index in arr.indices) {
        println("index $index is ${arr[index]}")
    }

    for ((index, value) in arr.withIndex()) {
        println("index $index is $value")
    }

//    구구단

    for (i in 2..9) {
        for (j in 1..9) {
            println("$i x $j = ${i*j}")
        }
    }


    /**
     * while
     *
     * while(조건식) {
     *  // 실행 코드
     * } 로 이루어져 있다
     *
     * for문처럼 증감되는 인덱스가 없으므로 변수를 통해 관리해야한다
     */

    var index = 1

    while (index < 10) {
        println("while $index")
        index += 1 // index = index + 1
    }

    /**
     * do ~ while
     *
     * do {
     *  // 실행코드
     * } while (조건식) 으로 이루어져있다
     *
     * while과의 차이점은 실행을 하고 조건을 비교하기 때문에 조건이 맞지 않아도 한번은 실행이된다는것이다.
     */
    var index2 = 1
    do {
        println("do ~ while $index2")
        index2 +=1
    } while (index2 < 1)


    /**
     * 반복문 제어
     *
     * break, continue가 있다
     * break는 반복문을 탈출하게 만드는것이고
     * continue는 continue 후의 코드를 실행시키지 않고 다음차례로 뛰어넘습니다.
     */

    for (i in 2..9) {
        if (i > 5) {
            break
        }
        for (j in 1..9) {
            if (j > 2) {
                break
            }
            println("$i x $j = ${i*j}")
        }
    }

    for (i in 2..9) {
        if (i == 5) {
            continue
        }
        for (j in 1..9) {
            println("$i x $j = ${i*j}")
        }
    }



    //    정렬 (선택정렬) 구현해보기

    var target = mutableListOf(10,9,4,1,6,5,8,3,2,7)
//    target.sort()
//    println(target)

    for (i in target.indices) {
        var leastValue = target[i]
        var leastIndex = i
        for (j in i+1 until target.size) {
            if (leastValue > target[j]) {
                leastValue = target[j]
                leastIndex = j
            }
        }
        var tmp = target[i]
        target[i] = leastValue
        target[leastIndex] = tmp
    }

    println(target)


}