public class Body {
    String [] word = {"S", "a", "m", "a", "n", "t", "h", "a"};
    String [] guessedWord = {"_", "_", "_", "_", "_", "_", "_", "_"};
    int wrongChoice = -1;
    String [] bodyOnGround = {"Head", "Torso", "Arm", "Arm", "Leg", "Leg"};
    String [] hungBody = {"", "", "", "", "", ""};
    
    public boolean guessedRight(String letterGuessed){
        boolean correct = false;
        for (int i = 0; i < word.length; i++){
            if (word[i].equalsIgnoreCase(letterGuessed)){
                guessedWord [i] = letterGuessed;
                correct = true;
            }
        }
            return correct;
    }

    public void printWord(){
        for (int i = 0; i<word.length; i++){
            System.out.print(guessedWord[i]);
        }
    }

    public String addBodyPart(){
        wrongChoice++;
         hungBody[wrongChoice] = bodyOnGround[wrongChoice];
         return "Wrong! The " + hungBody[wrongChoice] + " is hung.";
    }

    public boolean endGame (){
        if (wrongChoice > 5) {
        System.out.println ("Game Over!");
        return true;
        }
        return false;

    } 

    public boolean wonGame (){
        if (word == guessedWord){
            System.out.println ("You Win!");
            return true;
        }
        return false;
    }
}
