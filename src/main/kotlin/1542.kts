check(longestAwesome("254534643564356523464") == 21)

/**
 * Problem 1542
 * Find Longest Awesome Substring
 *
 * Hard (454 / 9)
 * @see <a href="https://leetcode.com/problems/find-longest-awesome-substring/">LeetCode</a>
 */

fun longestAwesome(s: String): Int {
    return findPalindrome(s)?.length ?: 1
}

fun findPalindrome(s: String): String? {
    for (i in s.indices) {
        // TODO: optimize, LeetCode execution fails with "Time Limit Exceeded"
        for (j in 0..i) {
            val substring = s.substring(j, s.length - i + j)
            if (isPalindrome(substring)) return substring
        }
    }
    return null
}

fun isPalindrome(s: String): Boolean {
    val map = mutableMapOf(
        '0' to 0,
        '1' to 0,
        '2' to 0,
        '3' to 0,
        '4' to 0,
        '5' to 0,
        '6' to 0,
        '7' to 0,
        '8' to 0,
        '9' to 0
    )
    s.toCharArray().forEach { map[it] = map[it]!!.plus(1) }
    return map.values.count { it % 2 != 0 } <= 1
}
