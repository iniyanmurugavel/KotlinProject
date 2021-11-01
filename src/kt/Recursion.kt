package kt

import java.math.BigInteger

/**
 * Recursive functions TailRec
 * Prevent stack overflow memory error
 *
 * Fibanocci
 * // 0 1 1 2 3 5 8 13 21
 * BigInteger support large size integer
 * Generally if you run in java or c++ if you make 10000 it will throws stackoverlow error
 * tailrec provides executes internally and prevents stack over flow memory error
 */
fun main(args: Array<String>) {
    println(getFibonacciNumber(10000, BigInteger("1"), BigInteger("0")))
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) {
        return b
    } else {
        return getFibonacciNumber(n - 1, a + b, a)
    }
}