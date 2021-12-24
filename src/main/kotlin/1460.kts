println(canBeEqual(intArrayOf(3, 7, 9), intArrayOf(3, 7, 11)))

/**
 * Problem 1460
 * Make Two Arrays Equal by Reversing Sub-arrays
 *
 * Easy (594 / 102)
 * @see <a href="https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/">LeetCode</a>
 */
fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
    return target.size == arr.size && target.sorted() == arr.sorted()
}
