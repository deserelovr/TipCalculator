import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args){
        //Variables
        char addMore = 'y';

        //set up currency
        Locale usa = new Locale("en", "us");
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

        //add scanner
        Scanner input = new Scanner(System.in);

        while(addMore != 'n' && addMore != 'N'){
            //Title message
            System.out.println("Tip Calculator");
            System.out.println("\n Cost of meal:");
            double mealCost = input.nextDouble();

            for (double percent = 0.15; percent < 0.30; percent +=0.05){
                System.out.println((int)(percent * 100) + "%");
                double tipAmount = mealCost * percent;
                System.out.println("Tip amount: " + dollarFormat.format(tipAmount));
                double mealTotal = mealCost + tipAmount;
                System.out.println("Total amount: " + dollarFormat.format(mealTotal));

            }
            //ask to add more
            System.out.println("\nContinue? (y/n): ");
            addMore = input.next().charAt(0);


        }

        //close scanner
        input.close();
        System.out.println("Bye!!");


    }
}

