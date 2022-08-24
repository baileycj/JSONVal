package stack
class StackImpl<T: Any>: Stack<T> {

    private var storage = arrayListOf<T>()

    override val count : Int
        get() = storage.size

    override fun peek(): T?{
        return storage.lastOrNull()
    }

    override fun pop(): T?{
        return storage.removeLastOrNull()
    }

    override fun push(element: T){
        storage.add(element)
    }
}

//fun validJSON(str:String): Boolean{
//    if(str.isEmpty())
//        return true
//
//    val stack = StackImpl<Char>()
//    var i = 1
//    var j = 2
//
//    // to see if the next ch after { is a " if not then not valid
//    for (ch in str.toCharArray()){
//
//        val nextChar = str[i]
//        val nextNextChar = str[j]
//
//        i++
//        if (i == str.length)
//            i = 0
//        j++
//        if (j == str.length)
//            j = i
//        if (ch == '{' && nextChar != '"')
//            return false
//        if (ch == '"' && nextChar == '}' && nextNextChar == '{' )
//            return false
//        if (ch == '}' && nextChar == '}' && nextNextChar == '"' )
//            return false
//    }
//        for(ch in str.toCharArray()){
//
//            if(ch != '[' && ch != ']' && ch != '{' && ch != '}')
//                continue
//            if(ch == ']' && stack.isEmpty || ch == '}' && stack.isEmpty)
//                return false
//            when(ch){
//                '[', '{' -> stack.push(ch)
//            }
//            when(ch){
//                ']' -> if(stack.peek() == '[') stack.pop() else return false
//                '}' -> if(stack.peek() == '{') stack.pop() else return false
//                '"' -> if(stack.peek() == '"') stack.pop() else return false
//                ',' -> if(stack.peek() == ',') stack.pop() else return false
//            }
//        }
//    return stack.isEmpty
//}