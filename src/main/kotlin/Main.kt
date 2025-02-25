fun main() {
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
