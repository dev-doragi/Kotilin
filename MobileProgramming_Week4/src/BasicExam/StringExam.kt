package BasicExam

fun main() {
    var strList = ArrayList<String>(4)

    strList.add("첫번쩨")
    strList.add("두번째")
    //strList.add(3)
    println(strList)

    var str : String = "안녕하세요"
    if (str.equals("안녕하세요")) {
        println("왜 두번말함?")
    }
}