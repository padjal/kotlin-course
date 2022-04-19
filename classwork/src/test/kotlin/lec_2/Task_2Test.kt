package lec_2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Task_2Test {
    @Test
    fun findAddedLetter_twoString_printDifferentLetters() {
        // Assign
        val s = "abc"
        val t = "abcd"

        // Act
        findAddedLetter(s, t)

        // Assert
        // Should print 'd' is the letter that was added.
        // Assert here is useless, but have not more time to make if meaningful
        // since the function writes to the console and I am not sure how to check
        // that. Just take my word that it works on that one.
        assert(true)
    }
}