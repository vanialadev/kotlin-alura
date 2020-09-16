fun main() {
    println("Bem vindo ao Bytebank")

    val account = Account()
    account.holder = "Vania"
    account.accountNumber = 321
    account.balance = 12.3
    println("titular: ${account.holder}")
    println("número da conta: ${account.accountNumber}")
    println("saldo: ${account.balance}")

    val account2 = Account()
    account2.holder = "Erica"
    account2.accountNumber = 123
    account2.balance = 1.23
    println("titular: ${account2.holder}")
    println("número da conta: ${account2.accountNumber}")
    println("saldo: ${account2.balance}")

    println("depositando na conta da: ${account2.holder}")

    deposita(account2, 100.00)
    deposita(account, 10.00)

}

fun deposita(account: Account, value: Double) {
    account.balance += value
}

class Account {
    var holder = ""
    var accountNumber = 0
    var balance = 0.0
}


fun tests(){
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