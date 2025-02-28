import kotlin.random.Random

fun main() {

    var intentosMin = 0
    val intentosMax = 3
    var idEmpleado = 0
    val rango1 = 1000 .. 1999
    val rango2 = 2000 .. 2999

    while (intentosMin < intentosMax) {
    println("Ingrese su codigo")
    var codigo = readln().toInt()

    if (codigo in rango1){
        println("Bienvenido usuario $idEmpleado")
        return
    } else if(codigo in rango2){

        print("Bienvenido \n Ingrese su nombre: ")
        val nombre = readLine().orEmpty()
        print("Motivo de visita: ")
        val motivo = readLine().orEmpty()
        return
    }else {
        intentosMin++
        if (intentosMin < intentosMax) {
            println("Código incorrecto. Intentos restantes: ${intentosMax - intentosMin}")
        } else {
            println("Acceso bloqueado. Demasiados intentos fallidos.")
        }
}
    }
}