link problem:   https://codeforces.com/problemset/problem/1/A


import java.math.BigInteger
import kotlin.math.*

fun main() {
    val input = readLine()!!
    val data = input.split(" ")
    val n = data[0].toInt()
    val m = data[1].toInt()
    val a = data[2].toInt()


    var cntW:Long = 0
    var cntH:Long = 0
    var w = max(n, m)
    var h = min(n, m)

    while (w >= 1) {
        w -= a
        cntW++
    }

    while (h >= 1) {
        h -= a
        cntH++
    }

    val res: BigInteger = BigInteger.valueOf(cntW * cntH)
    println(res)
}
