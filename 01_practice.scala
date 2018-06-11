object Demo{
    def main(args: Array[String]) {
        val num1: Int = 10;
        val num2: Int = 19;
        var sum: Int = add(num1,num2);
        loop(sum);
        println(sum);
    }
    def add(a: Int, b: Int): Int = {
        return a+b;
    }
    def loop(iteration: Int) {
        var i: Int = 0;
        for(i <- 1 to iteration) {
            println(i);
        }
        
    }
}