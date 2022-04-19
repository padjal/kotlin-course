package lec_2

/**
 * A program which calculates each element as a sum from the two preceding elements.
 * The first element is always copied without manipulation.
 */
fun main() {
    val nums: Array<Int> = arrayOf(1, 2, 3, 4)

    val runningSum: Array<Int> = Array(nums.size) { nums[it] }

    for (i in 1 until nums.size) {
        runningSum[i] = runningSum[i - 1] + nums[i]
    }

    for (i in runningSum){
        println(i)
    }
}

/**
 * NOTES
 *
 * 1) .. and until
 *
 *  In a for loop the .. is used to indicate that the iteration is inclusive of the last element,
 *  while the until keyword indicates an exclusive iteration over the given range.
 *
 *  For example:
 *  for(1..3) will iterate like: 1, 2, 3
 *  and for(1 until 3) will iterate like: 1, 2
 *
 * 2) Reading user input
 *
 *  Use readline() for such.
 */