import java.util.*;

class Main {

    public static void main (String[] args)
    {
        RNG(100,3);
    }
    public static void RNG(int range, int iteration)
    {
        RNG(0,range);
    }
    public static void RNG(int perm_min, int perm_max, int iteration) {
        //Scanner input = new Scanner(System.in);
        int guess = 0;  //current guess
        int times = 1;
        int max = perm_max;
        int min = perm_min;
        int range = max - min;
        int num = (int)(Math.random()*range) + min + 1;
        int max_guess = 0;
        int counter = 1;
        for(int i = 1; i <= Math.pow(10,4); i++){
        //System.out.println("Choose a number :" + num);
            //int num = input.nextInt();
            while(num != guess){
                guess = (int)(Math.random()*range)+ min + 1;
                if(guess > num){
                    max = guess;
                    range = max - min -1;
                    //System.out.println("Number guessed, " + guess + " was too high.");
                    times++;
                }
                else if (guess < num){
                    min = guess;
                    range = max - min -1;
                    //System.out.println("Number guessed, " + guess + " was too low.");
                    times++;
                }
                else{
                    //System.out.println("The computer guessed : " + guess + " which is correct.");
                    //System.out.println("It took the computer " + times + " guesses.");
                }
            }
            max_guess = Math.max(max_guess,times);
            System.out.println(counter++ + " " + max_guess + " " + times);
            max = perm_max;
            min = perm_min;
            range = max-min;
            guess = 0;
            num = (int)(Math.random()*range) + min + 1;
            times = 1;
        }
        System.out.println(max_guess);
        //input.close();
    }
}