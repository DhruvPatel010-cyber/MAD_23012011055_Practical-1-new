fun main() {
    val x1 = arrayOf(10,90,60,80,100)
    println("Create Array-1 by using arrayof() method:")
    println(x1.contentToString())

    val x2 = Array(5) {0}
    println("Create Array-2 by using Array<>():")
    println(x2.contentToString())

    val x3 = Array(8) { it }
    println("Create Array-3 by using Array<>() and lambda function:")
    println(x3.contentToString())

    val x4 = IntArray(5)
    println("Create Array-4 by using IntArray():")
    println(x4.joinToString())

    val x5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("Create Array-5 by using intArrayOf():")
    println(x5.joinToString())

    val array6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    println(array6.joinToString())

}