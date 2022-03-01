package observer

fun createAccount(email: String, ip: String): AccountService {
    val account = AccountService(email, ip)
    account.attach(Logger())
    account.attach(Mailer())
    account.attach(Protector())
    return account
}
fun main() {
//    val account1: AccountService = createAccount("contact@gpcoder.com", "127.0.0.1")
//    account1.login()
//    account1.changeStatus(Status.EXPIRED)
//
//    println("---")
//    val account2 = AccountService("contact@gpcoder.com", "127.0.0.1")
//    val logger = Logger()
//    account2.attach(logger)
//    account2.attach(Mailer())
//    account2.attach(Protector())
//
//    account2.detach(logger)
//    account2.login()
}
