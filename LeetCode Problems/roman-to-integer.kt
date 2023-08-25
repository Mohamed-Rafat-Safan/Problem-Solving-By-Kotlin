link problem:  https://leetcode.com/problems/roman-to-integer/description/


class Solution {
    fun romanToInt(s: String): Int {
        val roman: Map<String, Int> = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )
    
        var sum = 0
        var i = 0
        while (i < s.length) {
            if (i == s.length - 1) {
                sum += roman[s[i].toString()] ?: 0
                break
            }
            if (s[i] == 'I' && s[i + 1] == 'V') {
                sum += 4
                i += 2
            } else if (s[i] == 'I' && s[i + 1] == 'X') {
                sum += 9
                i += 2
            } else if (s[i] == 'X' && s[i + 1] == 'L') {
                sum += 40
                i += 2
            } else if (s[i] == 'X' && s[i + 1] == 'C') {
                sum += 90
                i += 2
            } else if (s[i] == 'C' && s[i + 1] == 'D') {
                sum += 400
                i += 2
            } else if (s[i] == 'C' && s[i + 1] == 'M') {
                sum += 900
                i += 2
            } else {
                sum += roman[s[i].toString()] ?: 0
                i++
            }
        }
    
        return sum
    }
}
