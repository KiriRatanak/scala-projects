
class Greeter {
    object Demo{
        //Unit is a return type, it's the same as void in Java
        var a: String = _ ;
        def SayHi(name: String): Unit = {
            println("Hello, "+name+"!");
            println(a);
        }
    }
}
//Instantiate an object for Greeter class
val greeter = new Greeter();


//Accessing SayHi function through Demo object
greeter.Demo.SayHi("Noob");
