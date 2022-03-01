package observer

class Logger: Observer {
    override fun update(user: User) {
        println("Logger $user")
    }
}