import kotlin.random.Random

fun main() {

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
}