check(getMoneyAmount(10) == 16)
check(getMoneyAmount(1) == 0)
check(getMoneyAmount(2) == 1)
check(getMoneyAmount(6) == 8) // FIXME: Wrong Answer

/**
 * Problem 375
 * Guess Number Higher or Lower II
 *
 * Medium (1314 / 1680)
 * @see <a href="https://leetcode.com/problems/guess-number-higher-or-lower-ii/">LeetCode</a>
 */
fun getMoneyAmount(n: Int): Int {
    var sum = 0
    var num = 0
    while (num < (n - 1)) {
        num = findOptimalNode(num + 1, n)
        sum = sum + num
    }
    println(sum)
    return sum
}

fun findOptimalNode(start: Int, max: Int): Int {
    var sum = 0
    for (i in start..max) {
        sum = sum + i
    }

    var sum2 = 0
    val middle = sum / 2
    for (i in start..max) {
        sum2 = sum2 + i
        if (sum2 >= middle) return i
    }
    return 0
}
