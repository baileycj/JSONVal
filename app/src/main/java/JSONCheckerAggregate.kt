package au.edu.usc

import java.io.File

abstract class JSONCheckerAggregate(private val files: Array<String>) {
    private val fileContents: Array<String> = files.map { file -> File(TEST_CASE_DIR+file).readText(Charsets.UTF_8) }.toTypedArray()

    /**
     * Check if JSON string from the file is valid.
     * @param fileContent JSON content from the file to validate
     * @return True if JSON is valid
     */
    protected abstract fun checkJSON(fileContent: String): Boolean

    /**
     * Print results for all files in array.
     * @return none
     */
    fun checkFiles() {
        for ((index, file) in fileContents.withIndex()) {
            printResult(files[index], checkJSON(file))
        }
    }

    /**
     * Print result for single file in array (used for debugging).
     * @param index of file in array
     * @return none
     */
    fun checkFile(index: Int) {
        printResult(files[index], checkJSON(fileContents[index]))
    }

    /**
     * Function to format and print result.
     * @param file name of the file from the array
     * @param result result to print
     * @return none
     */
    private fun printResult(file: String, result: Boolean) {
        print("$file is ")
        when (result) {
            true -> println("Valid")
            else -> println("Invalid")
        }
    }
}
