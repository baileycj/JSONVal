import java.io.File

fun main() {
    check()
}

fun check() {
    readFromFile()
}


//Folder of test cases
var filePath = "T1_test_cases"
//List each file inside test case folder
//var fileList: List<String> = listOf("")

val files = listOf(
    "False_1.json",
    "False_2.json",
    "False_3.json",
    "False_4.json",
    "False_5.json",
    "True_1.json",
    "True_2.json",
    "True_3.json",
    "True_4.json")

//takes the file Location and turns the file list in to the file path used to read
//file into the char array
fun readFromFile(){
    for (file in files){
        var readFromFile: CharArray = File("T1_test_cases/$file").readText().toCharArray()
        print(readFromFile)
}
//get the file location using the default file path and steps through each file in the fold
// updating the file path for each test case
//fun fileLocation(){
//    File(filePath).walkTopDown().forEach {
//       filePath = (it).toString()
//        fileList = listOf(filePath)
//        print(fileList)
//    }
}