package lec_2

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