fun main() {
    println("Enter two number")
    val x = readln().toInt()
    val y = readln().toInt()

    fun sum(x: Int, y:Int) {
        println("Addition of $x , $y is ${x+y}")
    }

    fun sub(x:Int, y:Int) {
        println("Substraction of $x , $y is ${x-y}")
    }

    fun mul(x:Int, y:Int) {
        println("Multiplication of $x , $y is ${x*y}")
    }

    fun div(x:Int, y:Int) {
        println("Division of $x , $y is ${x/y}")
    }

    sum(x,y)
    sub(x,y)
    mul(x,y)
    div(x,y)
}