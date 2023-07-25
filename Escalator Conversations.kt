link problem :    https://codeforces.com/contest/1851/problem/A

import kotlin.math.abs

fun main(args: Array<String>) {

    var testCase = readLine()!!.toInt()

    while (testCase > 0) {
        val input = readLine()!!
        val numbers = input.split(" ")
        val n = numbers[0].toInt()
        val m = numbers[1].toInt()
        val k = numbers[2].toInt()
        val h = numbers[3].toInt()

        val data = readLine() ?: ""
        val arr = data.split(" ").map { it.toInt() }.toTypedArray()

        val tempHeight = ArrayList<Int>()
        for (i in arr) {
            val x = abs(h - i)
            if (x != 0) tempHeight.add(x)
        }


        var cnt = 0
        val stepsArr = ArrayList<Int>()
        for (i in 1..m) {
            stepsArr.add(cnt)
            cnt += k
        }

        var result = 0
        for (i in tempHeight) {
            if (stepsArr.contains(i)) {
                result++
            }
        }
        println(result)

        testCase--
    }
}
