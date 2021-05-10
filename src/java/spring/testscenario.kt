import java.nio.charset.Charset
import java.util.*
import javax.xml.bind.DatatypeConverter.printString

val prods = arrayOf(
        arrayOf(
                intArrayOf(54, 97, 55, 99, 56, 98)
        ),
        arrayOf(
                intArrayOf(48, 102, 102, 55, 52, 97, 53, 101, 98, 97),
                intArrayOf(-2, -1, 0, 99, 0, 102, 0, 97, 0, 52, 0, 56, 0, 54, 0, 102, 0, 55, 0, 101, 0, 100)
        )
)

val stage = arrayOf(
        arrayOf(
                intArrayOf(98, 55, 101, 56, 50, 101)
        ),
        arrayOf(
                intArrayOf(57, 98, 100, 51, 53, 101, 54, 97, 100, 100),
                intArrayOf(-2, -1, 0, 99, 0, 52, 0, 100, 0, 100, 0, 55, 0, 98, 0, 55, 0, 100, 0, 56, 0, 102)
        )
)

fun main (args : Array<String>) {

    println("Total ArrayList Size ==>  ${prods.size}")
    println("Total ArrayList Size ==>  ${prods[0].size}")
    println("Total ArrayList Size ==>  ${prods[1].size}")
    //println("Total ArrayList Size ==>  ${prods[1][0].contentToString()}")
    // println("Total ArrayList Size ==>  ${Arrays.toString(prods[0][1])}")
    // println(" Output fetch Logic ${fetchEncryptedData(prods[0])}")
    println("final encrypted data "+ fetchEncryptedData(prods,1))
    println("final encrypted data "+ fetchEncryptedData(prods,0))


    val testBoolean : Boolean = false
    println(testBoolean)
    printStringData(testBoolean.toString())
    val dataretrieve = true.toString()
    println(" show final output $dataretrieve")
}

fun printStringData(testBoolean: String) {
    println("kt.test boolean string value $testBoolean")
}

private fun decrypt(_encode: String, type: String): String {
    var encode = _encode
    encode = encode.replace("[", "")
    encode = encode.replace("]", "")
    encode = encode.replace(" ".toRegex(), "")

    return try {
        val input = encode.split(",".toRegex()).toTypedArray()
        val bytes = ByteArray(input.size)
        var i = 0
        for (s in input) {
            bytes[i++] = s.toByte()
        }

        return try {
            String(bytes, Charset.forName(type))
        } catch (e: java.lang.Exception) {
            ""
        }

    } catch (e: Exception) {
        ""
    }
}

private fun fetchEncryptedData(encryptedData: Array<Array<IntArray>>, index: Int): String {
    var append :String = ""
    if (encryptedData[index].size == 2 ) {
        append =  decrypt(encryptedData[index][0].contentToString(),"UTF-8")
        append +=  decrypt(encryptedData[index][1].contentToString(),"UTF-16")
        return append
    }
    else return  decrypt(encryptedData[index][0].contentToString(),"UTF-8")
}
