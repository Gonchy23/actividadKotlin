fun main() {
    numeros()
}
private fun numeros(){
    println("numeros por consola del 1 al 100 (incluidos con saltos de linea entre cada impresión)")
    for (i in 1..100) {
        if (i % 3 == 0 ) {
            println("tri")
        } else if (i % 5 == 0) {
            println("qui")
        } else if (i % 3 == 0 && i % 5 == 0) {
            println("triqui")
        }else{
            println(i)
        }
    }
}
