//package stack
//import java.io.File
//
//fun main(){
//    val str1: String = File("T1_test_cases/False_5.json").readText()
//    val str2: String = File("T1_test_cases/False_4.json").readText()
//    val str3: String = File("T1_test_cases/False_3.json").readText()
//    val str4: String = File("T1_test_cases/False_2.json").readText()
//    val str5: String = File("T1_test_cases/False_1.json").readText()
//    val str6: String = File("T1_test_cases/True_4.json").readText()
//    val str7: String = File("T1_test_cases/True_3.json").readText()
//    val str8: String = File("T1_test_cases/True_2.json").readText()
//    val str9: String = File("T1_test_cases/True_1.json").readText()
//
//    val strws1 = str1.filter{!it.isWhitespace()}
//    val strws2 = str2.filter{!it.isWhitespace()}
//    val strws3 = str3.filter{!it.isWhitespace()}
//    val strws4 = str4.filter{!it.isWhitespace()}
//    val strws5 = str5.filter{!it.isWhitespace()}
//    val strws6 = str6.filter{!it.isWhitespace()}
//    val strws7 = str7.filter{!it.isWhitespace()}
//    val strws8 = str8.filter{!it.isWhitespace()}
//    val strws9 = str9.filter{!it.isWhitespace()}
//
//    println("False 5")
//    println(validJSON(strws1))
//    println("False 4")
//    println(validJSON(strws2))
//    println("False 3")
//    println(validJSON(strws3))
//    println("False 2")
//    println(validJSON(strws4))
//    println("False 1")
//    println(validJSON(strws5))
//    println("True 4")
//    println(validJSON(strws6))
//    println("True 3")
//    println(validJSON(strws7))
//    println("True 2")
//    println(validJSON(strws8))
//    println("True 1")
//    println(validJSON(strws9))
//
//}