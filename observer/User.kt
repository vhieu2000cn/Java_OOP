package observer

data class User(
    val email: String,
    val ip: String,
    var status: Status
)