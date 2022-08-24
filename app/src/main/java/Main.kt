package au.edu.usc

const val TEST_CASE_DIR = "./T1_test_cases/"

fun main() {
    val files = arrayOf(
        "False_1.json",
        "False_2.json",
        "False_3.json",
        "False_4.json",
        "False_5.json",
        "True_1.json",
        "True_2.json",
        "True_3.json",
        "True_4.json",
    )

    println("Solution 1")
    JSONCheckerSolutionOne(files).checkFiles()
    println("")

    println("Solution 2")
    JSONCheckerSolutionTwo(files).checkFiles()
}
