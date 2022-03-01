package observer

class Mailer: Observer {
    override fun update(user: User) {
        if (user.status == Status.EXPIRED){
            println("Mailer: User ${user.email} + is expired. An email was sent")
        }
    }
}