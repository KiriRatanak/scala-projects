object Factorial {
    def main(args: Array[String]) {
        var i: Int = 5;
        println(fac(i));
    }
    def fac(num:Int): Int = {
        if (num != 0) {
            return num * fac(num-1);
        } 
        else 
            return 1;
    }
}