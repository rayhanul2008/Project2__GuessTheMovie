import java.util.*;
public class GuessTheMovie {
    public static void main(String[] args) {
        String[] movie = {"mucize", "rocky", "all in one", "who am i", "the matrix", "monpura", "train to busan", "hope2013", "a moment to remember", "monpura", "3idots",
                "messenger", "a beautiful mind", "life is beautiful", "taqdir", "hridoyer kotha", "no win", "successful", "the lord of the rings", "die hard"};
        int size = movie.length;

        Random random = new Random();           // random number
        int number = random.nextInt(size);
        System.out.println(number);

        int size1 = movie[number].length();        // select random movie length
        System.out.println(size1);

        String str = movie[number];                 // random movie name
        char[] outputMovie = new char[size1];

        String expecteedMovie = movie[number];

        for (int i = 0; i < size1; i++) {
            if(expecteedMovie.charAt(i)!=' ') {
                outputMovie[i] ='_';
            }
            else{
                outputMovie[i] =' ';
            }
        }
        System.out.println(outputMovie);
        int t = 0;
        Scanner sc = new Scanner(System.in);
        while (t < 10) {
            System.out.print("Guess a Letter:");
            char userInput = sc.next().charAt(0);
            boolean matched = false;
            for (int i = 0; i < size1; i++) {
                if (userInput == expecteedMovie.charAt(i)){
                    outputMovie[i] = userInput;
                    matched=true;
                }
            }
            if(matched==false){
                t++;
            }
            System.out.println("You have guessed (" + t + ") wrong letters");
            System.out.println(outputMovie);
            boolean success = true;
            for (int i = 0; i < size1; i++) {
               if(outputMovie[i]=='_'){
                   success= false;
               }
            }
            if(success == true){
                System.out.println("Congratulations,YOu Win! ✔✔");
                return;
            }

        }
        System.out.println("You Loose!");

    }
}
