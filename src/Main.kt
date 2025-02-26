//Project 2 : Simple Login System
/*
Simulate a basic login system where:
1. The user enters a username and password.
2. If the credentials match, print "Login successful!"
3. Otherwise, print "Invalid username or password".
 */

//Hardcoded Credentials
/*
fun main() {
    println("Welcome to FRAIND")
    println("Login here!")
    //Take Input
    println("Enter your User User Name :")
    val userName: String = readLine() ?: ""
    println("Enter your Password :")
    val password: String = readLine() ?: ""

    //Write Conditions
    val condition = if (userName == "Tony" && password == "To/1234") "Login Successful! Welcome $userName" else "Invalid Username or Password. Click below to Sign up"

    //Give Output
    println(condition)
}
*/

//Multiple Users Support
fun main() {
    println("Welcome to FRAIND")
    println("Login here!")
    //List of authentic users
    val users = mapOf(
        "tony" to "To/1234",
        "omkar" to "Os/1234",
        "emilia" to "Em/1234",
        "akash" to "Ak/1234"
    )

    //Inputs from Users
    println("Enter your Username: ")
    val userName = readLine() ?: ""
    println("Enter your Password: ")
    val password = readLine() ?: ""

    //Conditions
    val condition = if (userName in users.keys && users[userName] == password) "Login Successful, Welcome $userName" else "Invalid username or password! Click below to Signup."

    //Output
    println(condition)
}
