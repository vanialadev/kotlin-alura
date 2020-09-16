fun main() {
    println("Bem vindo ao Bytebank")

    val holder = "Vania Almeida"
    val accountNumber = 12345

    var balance: Double = 100 + 2.0
    balance += 100
    println("titular: $holder")
    println("número da conta: $accountNumber")
    println("saldo: $balance")

    testCondition(balance)


    for (i in 1..3) {
        print("$i ")
    }

    for (i in 5 downTo 1) {
        print("$i ")
    }

    println("ímpares")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    var i = 0
    while (i < 3) {
        if (i == 2) {
            break
        } else if (i == 1) {
            continue
        }
        println("while $i")
        i++
    }

}

fun testCondition(balance: Double) {
    when {
        balance > 0.0 -> println("conta é positiva")
        balance == 0.0 -> println("conta é neutra")
        else -> println("conta negativa")
    }
}