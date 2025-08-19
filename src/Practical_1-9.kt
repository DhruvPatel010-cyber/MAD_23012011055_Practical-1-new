fun main() {
    val x = Array(5){0}

    for (i in 0 until x.size) {
        print("x[$i]=")
        x[i] = readln().toInt()
    }

    var large = x[0]
    for (i in 1 until x.size) {
        if (x[i] > large) {
            large = x[i]
        }
    }
    println("Largest element = $large")

}