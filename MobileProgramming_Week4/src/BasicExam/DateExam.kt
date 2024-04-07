package BasicExam

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    var now = Date()
    var sFormat : SimpleDateFormat

    sFormat = SimpleDateFormat("yyyyMMdd")
    println("오늘 날짜: " + sFormat.format(now)) // 20240404 형식으로 출력

    sFormat = SimpleDateFormat("HH:mm:ss")
    println("현재 시각: " + sFormat.format(now)) // 23:15:21 형식으로 출력
}