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

    val first: Boolean = true
    val second: Boolean = false
    val third: Boolean = false

    val result = first || second || third
    println("result => $result")

    val status = isNewApplyCouponExperimentEnabled(listOf( "all"), listOf( "all"))
    print("status $status")
}

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) {
        return b
    } else {
        return getFibonacciNumber(n - 1, a + b, a)
    }


}

fun isNewApplyCouponExperimentEnabled(city : List<String>, userid: List<String>): Boolean {

        if (included1(
                city,
                "sfsfs"
            ) && included(
                userid,
               "sssf"
            )
        ) {
            return true
        }
    return false
}
fun included(userIdLastDigitList: List<String>?, currentUserIdLastDigit: String): Boolean {
    return userIdLastDigitList?.firstOrNull {
        it.equals("all", true) || currentUserIdLastDigit.endsWith(it)
    }.isNullOrEmpty().not()
}

fun included1(cities: List<String>?, currentCity: String?): Boolean {
    val cityName = cities?.firstOrNull {
        it.equals(currentCity, true) || it.equals("all", true)
    }
    return cityName != null
}

