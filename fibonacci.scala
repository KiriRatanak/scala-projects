object fibonacci {
    var first: Int = 0;
    var second: Int = 1;
    var sum: Int = 0;
    def main (args: Array[String]): Unit = {  
        var loop: Int = 0;
        fib(loop);
    }
    def fib (loop: Int): Int = {
        println(sum);   
        sum = first+second; 
        second = first;
        first = sum;
        if (loop != 6) {
            return fib(loop+1);
        }
        else 
            return 1;
    }
    
}