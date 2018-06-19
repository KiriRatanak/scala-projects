object demo {
    def main (args: Array[String]): Unit = {
        var arr = new Array[Int](3);
        println("Enter the number: ");
        arr = getNum();
        // getGreatest(arr);
    }
    def getNum (): Array[Int] = {
        var num = new Array[Int](3);
        var i = 0;
        for (i <- 0 to 2) {
            num(i) = scala.io.StdIn.readInt();
            println(num(i));
        }
        return num;
    }
    def getGreatest(arrOfNum: Array[Int]): Array[Int] = {
        var i = 0;
        println(arrOfNum(i));
        // for(i <- 0 to 3) {
        //     println(arrOfNum(i))
        // }
        return arrOfNum;
    }
}