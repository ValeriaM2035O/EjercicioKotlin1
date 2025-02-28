import kotlin.random.Random

fun main() {
    /*
      var moneda20 = 0
      var moneda50 = 0
      var moneda100 = 0
      var moneda200 = 0
      var moneda500 = 0
      var totalDinero = 0
      var opcion: Int

      do {
          println(
              """
              MENU DE OPCIONES
              1. Agregar moneda de denominacion indicada
              2. Contar cuantas monedas hay de cada denominacion
              3. Calcular el total del dinero ahorrado
              4. Romper la alcancia
              Seleccione opcion:
          """.trimIndent()
          )
          var opcion = readln().toInt()

          when (opcion) {
              1 -> {
                  print("Ingrese la denominación de la moneda ($20, $50, $100, $200, $500): ")
                  val moneda = readLine()?.toIntOrNull()
                  when (moneda) {
                      20 -> {
                          moneda20++
                          totalDinero += 20
                      }

                      50 -> {
                          moneda50++
                          totalDinero += 50
                      }

                      100 -> {
                          moneda100++
                          totalDinero += 100
                      }

                      200 -> {
                          moneda200++
                          totalDinero += 200
                      }

                      500 -> {
                          moneda500++
                          totalDinero += 500
                      }

                      else -> println("Denominación no válida.")
                  }
                  if (moneda in listOf(20, 50, 100, 200, 500)) {
                      println("Moneda de $$moneda agregada")
                  }
              }

              2 -> println(
                  """
              Monedas contadas:
              Monedas de $20: $moneda20
              Monedas de $50: $moneda50
              Monedas de $100: $moneda100
              Monedas de $200: $moneda200
              Monedas de $500: $moneda500

          """.trimIndent()
              )

              3 -> println("Total ahorrado: $$totalDinero")
              4 -> {
                  println("Romper alcancia")
                  moneda20 = 0
                  moneda50 = 0
                  moneda100 = 0
                  moneda200 = 0
                  moneda500 = 0
                  totalDinero = 0
              }

              else -> println("Opcion no valida")
          }

      } while (opcion != 4)
  }


      var sumaDadoN1=0
      var sumaDadoN2=0

      println("Tirando dados")

      repeat(4) {
          val dado1 = Random.nextInt(1, 6)
          val dado2 = Random.nextInt(1, 6)

          sumaDadoN1 += dado1
          sumaDadoN2 += dado2

          println("Tirada N° ${it + 1}: Dado 1 = $dado1, Dado 2 = $dado2")
      }
      println("La suma del dado 1 es: $sumaDadoN1")

      println("La suma del dado 2 es: $sumaDadoN2")


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

     */

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

