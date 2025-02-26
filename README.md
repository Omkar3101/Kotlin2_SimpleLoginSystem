# SimpleLoginSystem
A basic login system built using Kotlin that takes **username** and **password** as input and verifies the credentials.

## Features
1. Takes user input for username and password.
2. Uses simple conditional logic (if-else) for validation.
3. Provide feedback on successful or failed login.
4. Beginner-friendly Kotlin project.

## Technologies Used
1. **Kotlin**
2. **IntelliJ IDEA**

## How to Run the Project?
### Clone the Repository
https://github.com/Omkar3101/Kotlin2_SimpleLoginSystem.git
### Open in IntelliJ IDEA
* Open IntelliJ IDEA
* Select Open Project and navigate to the cloned repository

### Run the Project
* Open Main.kt file
* Click on Run or use Shift + F10

### Enter Credentials
* Enter **username** and **password** when prompted.
* The system will validate your credentials.

## Code Overview
Markdown

'''kotlin
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
    val userName = readLi* ne() ?: ""
    println("Enter your Password: ")
    val password = readLine() ?: ""

    //Conditions
    val condition = if (userName in users.keys && users[userName] == password) "Login Successful, Welcome $userName" else "Invalid username or password! Click below to Signup."

    //Output
    println(condition)
}

## Future Improvement
* **Secure password handling** using hashing
* **Login attempts limit** to prevent brute force attacks
* **Graphical UI version** instead of console-based

## License


## Let's Connect 
* Linkedin : https://www.linkedin.com/in/omkar3101
* Github : https://github.com/Omkar3101 
