package observer

class Protector: Observer {
    override fun update(user: User) {
        if (user.status == Status.INVALID){
            println(
                "Protector: User  ${user.email} is invalid. IP  ${user.ip} is blocked")
        }
    }
}