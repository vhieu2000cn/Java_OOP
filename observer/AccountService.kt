package observer

class AccountService(
    private val email: String,
    private val ip: String
) : Subject {
    private var observers = mutableListOf<Observer>()
    private var user: User = User(email, ip, Status.FAILURE)
    override fun attach(observer: Observer) {
        if (!observers.contains(observer)) {
            observers.add(observer)
        }
    }

    override fun detach(observer: Observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    override fun notificationAllObserver() {
        observers.forEach {
            it.update(user)
        }
    }

    fun changeStatus(status: Status) {
        user.status = status
        println("Status is changed")
        this.notificationAllObserver()
    }

    fun login() {
        if (!isValidIP()) {
            user.status = Status.INVALID
        } else if (isValidEmail()) {
            user.status = Status.SUCCESS
        } else {
            user.status = Status.FAILURE
        }
        println("Login is handled")
        this.notificationAllObserver()
    }

    private fun isValidIP(): Boolean {
        return "127.0.0.1" == user.ip
    }

    private fun isValidEmail(): Boolean {
        return "contact@gpcoder.com".equals(user.email, ignoreCase = true)
    }
}