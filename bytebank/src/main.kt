fun main() {
    println("Bem vindo ao Bytebank")

    val account = Account("Vania", 321)
//    account.holder = "Vania"
//    account.accountNumber = 321
    account.deposit(12.3)
    println("titular: ${account.holder}")
    println("número da conta: ${account.accountNumber}")
    println("saldo: ${account.balance}")

    val account2 = Account( 123)
    account2.holder = "Erica"
//    account2.accountNumber = 123
    account2.deposit(1.23)
    println("titular: ${account2.holder}")
    println("número da conta: ${account2.accountNumber}")
    println("saldo: ${account2.balance}")


}

fun deposit(account: Account, value: Double) {
    account.deposit(value)
}

class Account(var holder: String, var accountNumber: Int) {
    var balance = 0.0
        private set

//    constructor(holder: String, accountNumber: Int){
//        this.holder = holderx
//        this.accountNumber = accountNumber
//    }

    constructor(accountNumber: Int) {
        this.accountNumber = accountNumber
    }

    fun deposit(value: Double) {
        if (value > 0) {
            balance += value
        }
    }

    fun withdraw(value: Double) {
        if (balance >= value) {
            balance -= value
        }
    }

    fun transfer(value: Double, destiny: Account): Boolean {
        return if (balance >= value) {
            balance -= value
            destiny.balance += value
            true
        } else {
            false
        }
    }

//    fun getBalance(): Double {
//        return  balance
//    }
//
//    fun setBalance(value: Double) {
//        balance += value
//    }

}

fun tests2(account: Account, account2: Account) {
    println("depositando na conta da: ${account2.holder}")

    deposit(account2, 100.00)
    println("saldo: ${account2.balance}")
    deposit(account, 10.00)
    println("saldo: ${account.balance}")

    account2.deposit(1.00)

    println("saque nas conta")

    account2.withdraw(100.00)
    account.withdraw(25.00)

    println("saldo: ${account2.balance}")
    println("saldo: ${account.balance}")

    println("transferir nas conta")

    if (account2.transfer(100.00, account)) {
        println("transferencia sucedida")

    } else {
        print("falha na transferencia")
    }

    account.transfer(25.00, account2)

    println("saldo: ${account2.balance}")
    println("saldo: ${account.balance}")
}

fun tests() {
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