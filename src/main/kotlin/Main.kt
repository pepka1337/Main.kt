fun main() {
    val inputString = "AASADDSS" // Вместо этого можно запросить ввод у пользователя через readLine()

    val charCountMap = inputString.groupingBy { it }.eachCount().toSortedMap()

    for ((char, count) in charCountMap) {
        println("$char-$count")
    }
}