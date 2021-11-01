package kt.string_manipulations

import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {

    println("Read a file from specified path")
    readExternalFileStorage()

    println("Enter the data to file")
    var text: String? = readLine().toString()
    writetoExternalStorage(text)
}

/**
 *  -1 and read() method provide the end line the stream has been reached I/0 Exception
 */
fun readExternalFileStorage() {

    try {
        var fileReader: FileReader = FileReader("ExternalStorageFile.txt")
        var counter: Int?
        do {
            counter = fileReader.read()
            print(counter.toChar())
        } while (counter != -1)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun writetoExternalStorage(text: String?) {
    try {

        val filewriter: FileWriter = FileWriter("ExternalStorageFile.txt")
        filewriter.write(text)
        filewriter.close()

    } catch (myException: Exception) {
        myException.printStackTrace()
    }

}
