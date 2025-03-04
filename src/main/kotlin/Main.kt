import kotlin.random.Random

fun main() {

    val candidato1 ="#1 - Jose"
    val candidato2 ="#2 - Laura"
    val candidato3 ="#3 - Manuela"

    var votosCandidato1 = 0
    var votosCandidato2 = 0
    var votosCandidato3 = 0

    var PorcentajeCandidato1 = 0
    var PorcentajeCandidato2 = 0
    var PorcentajeCandidato3 = 0

    var costoCandidato1 = 0
    var costoCandidato2 = 0
    var costoCandidato3 = 0

    val costoInternet = 700000
    val costoRadio = 200000
    val costoTV = 600000

    var totalVotos = 0
    var totalCosto = 0
    var promedioCosto= 0
    var opcion: Int

    do {
        println(
            """
              MENU
              1. Votar por candidato
              2. Vaciar urnas
              3. Conocer numero total de votos
              4. Conocer porcentaje obtenido por cada candidato
              5. Conocer costo promedio de cada campaña
              6. Salir
              Seleccione opcion:
          """.trimIndent()
        )
        var opcion = readln().toIntOrNull()

        when (opcion) {
            1 -> {
                print("Numero del candidato a votar")
                println("\n1. $candidato1")
                println("2. $candidato2")
                println("3. $candidato3")
                print("Opción: ")
                val candidato = readln().toIntOrNull()

                println("Seleccione el medio de publicidad que influyó en su voto:")
                println("1. Internet ($$costoInternet)")
                println("2. Radio ($$costoRadio)")
                println("3. Televisión ($$costoTV)")
                print("Opción: ")
                val medio = readln().toIntOrNull()


                val costoVoto = when (medio) {
                    1 -> costoInternet
                    2 -> costoRadio
                    3 -> costoTV
                    else -> {
                        println("Medio no válido. Voto no registrado.")
                        continue
                    }
                }

                when (candidato) {
                    1 -> {
                        votosCandidato1++
                        costoCandidato1 += costoVoto
                    }
                    2 -> {
                        votosCandidato2++
                        costoCandidato2 += costoVoto
                    }
                    3 -> {
                        votosCandidato3++
                        costoCandidato3 += costoVoto
                    }
                    else -> println("Candidato no válido. Voto no registrado.")
                }
            }
            2 -> {
                println("Vaciar todas las urnas...")
                votosCandidato1 = 0
                votosCandidato2 = 0
                votosCandidato3 = 0
                costoCandidato1 = 0
                costoCandidato2 = 0
                costoCandidato3 = 0
                println("Las urnas han sido vaciadas.")
            }
            3 -> {
                totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3
                println("Total de votos: $totalVotos")
            }
            4 -> {
                totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3
                if (totalVotos > 0) {

                    PorcentajeCandidato1 = ((votosCandidato1 * 100.0 / totalVotos).toInt())
                    PorcentajeCandidato2 = ((votosCandidato2 * 100.0 / totalVotos).toInt())
                    PorcentajeCandidato3 = ((votosCandidato3 * 100.0 / totalVotos).toInt())

                    println("Porcentaje de votos ")
                    println("$candidato1: $PorcentajeCandidato1%")
                    println("$candidato2: $PorcentajeCandidato2%")
                    println("$candidato3: $PorcentajeCandidato3%")
                } else {
                    println("Ningun voto registrado")
                }
            }
            5 -> {
                totalCosto = costoCandidato1 + costoCandidato2 + costoCandidato3
                totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3

                if (totalVotos > 0) {
                    promedioCosto = totalCosto / totalVotos
                    println("Costo promedio de campaña por voto: $$promedioCosto")
                } else {
                    println("No hay votos para calcular el promedio de los costos.")
                }
            }
            6 -> {
                println("Saliendo")
            }
        }

    } while (opcion != 6)

}



