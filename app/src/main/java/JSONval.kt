import java.io.File

fun main() {
    readFromFile()
}
var filePath = "T1_test_cases"

fun readFromFile(){
    fileLocation()
   var readFromFile: CharArray = File(filePath).readText().toCharArray()
    print(readFromFile)
}

fun fileLocation(){
    File(filePath).walkTopDown().forEach {
       filePath = (it).toString()
        println(filePath)
    }
}