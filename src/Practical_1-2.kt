fun main() {
    var a : Int = 10
    var b : Double = a.toDouble()
    var s : String = "10"
    var s2 : String = "11.12"
    var c : Int = s.toInt()
    var d : Int = s.toInt()
    var e : Double = s2.toDouble()
    
    println("Integer value : $a")
    println("Double value (from Integer): $b")
    println("String value : $s")
    println("Integer value1 (from String) : $c")
    println("Integer value2 (from String) : $d")
    println("Double value (from String): $e")

}