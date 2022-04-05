import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
public static void main(String[] args){

while(true){
    try{
    Scanner s = new Scanner(System.in);
    Random r = new Random();
System.out.println("Hello! What is your name?");
String name = s.nextLine();
System.out.println("Well, "+name+", I am thinking of a number between 1 and 20.");

 int num = r.nextInt(19)+1;

    int cnt = 1;
    while (cnt <= 6) {
        System.out.println("Take a guess.");

        int guess = s.nextInt();
        if (guess > num) {
            System.out.println("Your guess is too high");
            cnt++;
        } else if (guess < num) {
            System.out.println("Your guess is too low.");
            cnt++;
        } else {
            System.out.println("Good job, " + name + "! You guessed my number in " + cnt + " guesses!");
            break;
        }}

    if (cnt > 6)
        System.out.println("You are out of guesses. You lost.");
    System.out.println("Would you like to play again? (y or n)");
    Scanner g = new Scanner(System.in);

    String input = g.nextLine();
    if (input.equals("n") || input.equals("N"))
        break;} catch(Exception e){
            System.out.println("Invalid number input. Restarting the game.");
        }
}

}

}