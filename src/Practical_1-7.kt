fun main() {
    print("Enter Number:")
    val x = readln().toInt()

    fun factorial(n:Int) : Int {
        if (n == 1 || n == 0){
            return 1
        }
        return n *factorial(n-1)
    }

    val fact = factorial(x)
    println("Factorial of $x = $fact")
}