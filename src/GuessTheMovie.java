import java.util.*;
public class GuessTheMovie {
    public static void main(String[] args) {
        String[] movie = {"mucize","Interstellar","American History X","Avengers Endgame","The Sting","rocky", "all in one","The Lord of the Rings", "who am i", "the matrix", "monpura", "train to busan", "hope2013", "a moment to remember", "monpura", "3idots",
                "messenger", "a beautiful mind", "life is beautiful","The Dark Knight", "taqdir","Alien","Hamilton", "hridoyer kotha", "no win", "successful", "the lord of the rings", "die hard"};

        int size = movie.length;
        Random random = new Random();           // random number

        int number = random.nextInt(size);
        int size1 = movie[number].length();     // select random movie length

        String str = movie[number];             // random movie name

        char[] outputMovie = new char[size1];
        String expecteedMovie = movie[number];
        System.out.print("You are Guessing:");
        for (int i = 0; i < size1; i++) {
            if(expecteedMovie.charAt(i)!=' ') {
                outputMovie[i] ='_';
            }
            else{
                outputMovie[i] =' ';
            }
        }
        System.out.println(outputMovie);
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while (t < 10) {
            System.out.println("You have guessed (" + t + ") wrong letters:");
            System.out.print("Guess a Letter:");
            char userInput = sc.next().charAt(0);
            boolean result = false;
            for (int i = 0; i < size1; i++) {
                if (userInput == expecteedMovie.charAt(i)){
                    outputMovie[i] = userInput;
                    result = true;
                }
            }
            if(result == false){
                t++;
            }
            System.out.print("You are Guessing:");
            System.out.println(outputMovie);
            boolean result1 = true;
            for (int i = 0; i < size1; i++) {
               if(outputMovie[i]=='_'){
                   result1 = false;
               }
            }
            if(result1 == true){
                System.out.println("Wow! Congratulations! You Win!");
                return;
            }

        }
        System.out.println("OOPS! You Lost It!");

    }
}
