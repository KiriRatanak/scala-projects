

class ifAsExpression {
    object demo {
        def main(args: Array[String]): Unit = {
            var numberOfPeople: Int=20;
            var donutsPerPerson: Int=1;
            var defaultDonutsToBuy: Int=2;
            val numberOfDonutsToBuy: Int = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
            println(s"Number of donuts to buy = $numberOfDonutsToBuy")
        }

    }
}
val iae = new ifAsExpression();
