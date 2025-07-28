import java.util.Random;
import java.util.Scanner;
class Number_game{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random num =new Random();

        System.out.println("The number which you used to guess:");
        int n = num.nextInt(100)+1;
        int tries = 0;
        int A = 0;

        while(n!=A){
            System.out.print("Enter the Random number: ");
            A = sc.nextInt();

            if(n==A){
                System.out.println("Congratulation,you guess "+A+" number!");
            }
            else if(n>A){
                System.out.println("You guess to low that number!");
            }
            else{
                System.out.println("Your guess to high that number!");
            }
             tries++;
        }
        System.out.println("You got the guessing number in "+tries+" attempts");
        System.out.println("Guessed Number: "+n);
    }
}