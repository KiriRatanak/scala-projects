object Demo {
    def main(args: Array[String]): Unit = {
        println("Enter a string: ");
        val str = getString();
        checkString(str);  
    }
    def getString(): String = {
        val str = scala.io.StdIn.readLine();
        return str;
    }
    def checkString(str: String): Unit = {
        var i: Int = 0;
        var j: Int = 0;
        var c: Char = ' ';
        // var consonant: String = " ";
        var vowel: Int = 0;
        // for(c <- str.toUpperCase()) {
        //     if(c >= 'A' && c <= 'Z'){
        //     if(c != 'A' && c != 'E' && c != 'I' 
        //         && c != 'O' && c != 'U') {
        //             print(c); 
        //         }
        //         else {
        //             vowel += 1;
        //         }
        //     }
        // }
        for(i <- 0 to str.length()-1) {
            for(j < 1 to str.length()-1) {
                
            }
        }
            
        // println("Consonant:"+consonant);
        println("\nVowel:" + vowel);
            
    }

}