object demo {
    def main(args: Array[String]) {
        var bob = new Array[Int](4);
        var alex = new Array[Int](4);
        bob = Array(65,74,32,13);
        alex = Array(46,89,32,69);
        var i = 0;
        for (i <- 0 to 3) {
            if(bob(i) != alex(i)) {
                print("1 ");
            }
        }
    }
}