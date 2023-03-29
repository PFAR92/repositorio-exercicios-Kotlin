class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration("127.0.0.1", 9000)

    with(configuration) {
        println("$host:$port")
    }

    //instead of:
    println("${configuration.host}:${configuration.port}")

}