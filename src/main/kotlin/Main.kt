import kotlin.random.Random

fun main() {


    var dineroRestante=0
    var seguir = true

    println("Ingrese cantidad de dinero:")
    var dineroIngresado = readln().toInt()

    do{

    val numeroAleatorio = Random.nextInt(1, 4)
    println("Numero aleatorio: $numeroAleatorio")


    if (numeroAleatorio == 3){
        dineroRestante = 0
        println("Perdio todo su dinero")
        break

}else if (numeroAleatorio == 2){
        dineroRestante = dineroIngresado - (dineroIngresado/ 2)
        println("Perdio la mitad de su dinero, le quedan $$dineroRestante. Siga jugando o deje de jugar")
    }else{
        dineroRestante = dineroIngresado *2
        if(numeroAleatorio == 1)
            println("Duplico su dinero, le quedan $$dineroRestante. Siga jugando o deje de jugar")
    }
    if (dineroRestante > 0) {
        println("¿Quieres seguir jugando? (si/no)")
        val respuesta = readln().lowercase()
        seguir = respuesta == "si"

    } else {
        seguir = false
    }

}  while (seguir)
    println("Fin del juego. Te quedaste con $$dineroRestante.")
}

