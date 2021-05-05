package com.example.tbcdav1
import java.util.Arrays

import java.util.*

class davaleba {




   // 1.

    fun getUSG(num1:Int , num2:Int) : Int {

        var usg= 1


        var i = 1
        while (i <= num1 && i <= num2) {


            if (num1 % i == 0 && num2 % i == 0)
                usg= i

            ++i
        }

        return usg

    }





  //  2.
    fun getUSJ(num1:Int , num2:Int) : Int {

        var usj: Int

        if (num1 > num2) {
            usj=num1
        }
        else {
            usj=num2
        }


        while (true) {
            if (usj % num1 == 0 && usj % num2 == 0) {
                return usj

            }
            ++usj
        }
        return 0
    }


  //  3.

    fun contains(text: String): Boolean {

        val x = text.toCharArray()
        val arrLength = x.size


        println(Arrays.toString(x))
        println(arrLength)

        for (i in 1 until arrLength) {
            if ("$" == x[i].toString()) {
                return true
            }
            else {
                continue
            }
        }
        return false
    }


  //  4.

    fun evens(num: Int) : Int {
        var sum : Int=0

        if(num%2==1){
            evens(num-1)
        }
        else{
            sum+=num

            if(num>0){
                sum+= evens(num-2)
            }

        }

        return sum


    }

  //  5.

    fun reverseInt(num: Int): Int {

        var stringNum : String =num.toString()
        val x = stringNum.toCharArray()
        val arrLength = x.size
        var emptyString = ""

        println(Arrays.toString(x))
        println(arrLength)

        for (i in 1 until arrLength+1) {


            emptyString+=x[arrLength - i].toString()

        }
        return emptyString.toInt()
    }



 //   6.

    fun isPalindrome(text: String): Boolean {

        val x = text.toCharArray()
        val arrLength = x.size

        println(Arrays.toString(x))
        println(arrLength)

        for (i in 1 until arrLength) {
            if (x[i - 1] == x[arrLength - i]) {
                continue
            } else {
                return false
            }
        }
        return true
    }



    fun main() {



        println(getUSG(150,1000))
        //println(getUSJ(150,1000))
// println(contains("dsadsa'$'ddaf))
// println(evens(100))
// println(reverseInt(60010))
// println(isPalindrome("racecar"))

    }
}