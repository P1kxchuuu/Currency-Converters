//Importing to allow the scanners
import java.util.Scanner;

public class ForeignConverter {
    public static void main(String[] args) {
        //First scanner to handle the currency inputted by the user
        Scanner currency = new Scanner(System.in);
        //Second scanner to handle the user's response to the loop prompt
        Scanner converter = new Scanner(System.in);

        //String to hold the currency inputted
        String currencyType;
        //String to hold the loop prompt
        String userResponse;
        //Int variable to hold the amount of currency inputted by the user
        int amount;
        //Boolean variable to handle the loop
        boolean loopCheck = true;

        System.out.println("This program converts foreign currencies to US Dollars.");

        while(loopCheck) {
            //Prompts the user for a currency type
            System.out.println("Please input one of the currencies shown: Australian, Canadian, Euro[European], Franc[Swiss], Hong Kong, Krona[Sweden], Krone[Norway], Lira[Turkey], New Zealand, Peso[Mexican], Pound[Great Britain], Rand[South Africa], Real[Brazil], Ruble[Russian], Rupee[Indian], Singapore, Taiwan, Won[South Korean], Yen[Japanese], Yuan[Chinese], Zloty[Poland]");
            currencyType = currency.next();

            //If and else if statesments to give the correct conversion based on the user input
            if(currencyType.equals("Australian")) {
                //Asks the user for an amount of money in the selected currency
                System.out.println("Please give an amount of money in Australian dollars.");
                amount = currency.nextInt();
                //Runs conversion
                double australian = amount / 1.38;
                //Output
                System.out.println(amount + " Australian dollar(s) is/are equal to " + australian + " USD.");

            } else if(currencyType.equals("Canadian")) {
                System.out.println("Please give an amount of money in Canadian dollars.");
                amount = currency.nextInt();
                double canadian = amount / 1.27;
                System.out.println(amount + " Canadian dollar(s) is/are equal to " + canadian + " USD.");

            } else if(currencyType.equals("Euro")) {
                System.out.println("Please give an amount of money in Euros.");
                amount = currency.nextInt();
                double euro = amount / 0.88;
                System.out.println(amount + " Euro(s) is/are equal to " + euro + " USD.");

            } else if(currencyType.equals("Franc")) {
                System.out.println("Please give an amount of money in franc.");
                amount = currency.nextInt();
                double franc = amount / 0.92;
                System.out.println(amount + " Swiss franc is equal to " + franc + " USD.");

            } else if(currencyType.equals("Hong Kong")) {
                System.out.println("Please give an amount of money in Hong Kong dollars.");
                amount = currency.nextInt();
                double hongkong = amount / 7.80;
                System.out.println(amount + " Hong Kong dollar(s) is/are equal to " + hongkong + " USD.");

            } else if(currencyType.equals("Krona")) {
                System.out.println("Please give an amount of money in krona");
                amount = currency.nextInt();
                double krona = amount / 9.21;
                System.out.println(amount + " Swedish krona is equal to " + krona + " USD.");

            } else if(currencyType.equals("Krone")) {
                System.out.println("Please give an amount of money in krone.");
                amount = currency.nextInt();
                double krone = amount / 8.82;
                System.out.println(amount + " Norwegian krone is equal to " + krone + " USD.");

            } else if(currencyType.equals("Lira")) {
                System.out.println("Please give an amount of money in lira");
                amount = currency.nextInt();
                double lira = amount / 13.48;
                System.out.println(amount + " Turkish lira is equal to " + lira + " USD.");

            } else if(currencyType.equals("New Zealand")) {
                System.out.println("Please give an amount of money in New Zealand dollars.");
                amount = currency.nextInt();
                double newzealand = amount / 1.51;
                System.out.println(amount + " New Zealand dollar(s) is/are equal to " + newzealand + " USD.");

            } else if(currencyType.equals("Peso")) {
                System.out.println("Please give an amount of money in pesos.");
                amount = currency.nextInt();
                double peso = amount / 20.57;
                System.out.println(amount + " Mexican peso(s) is/are equal to " + peso + " USD.");

            } else if(currencyType.equals("Pound")) {
                System.out.println("Please give an amount of money in pounds.");
                amount = currency.nextInt();
                double pound = amount / 0.74;
                System.out.println(amount + " British pound(s) is/are equal to " + pound + " USD.");

            } else if(currencyType.equals("Rand")) {
                System.out.println("Please give an amount of money in rands.");
                amount = currency.nextInt();
                double rand = amount / 15.36;
                System.out.println(amount + " South African rand(s) is/are equal to " + rand + " USD.");

            } else if(currencyType.equals("Real")) {
                System.out.println("Please give an amount of money in reals.");
                amount = currency.nextInt();
                double real = amount / 5.26;
                System.out.println(amount + " Brazilian real(s) is/are equal to " + real + " USD.");

            } else if(currencyType.equals("Ruble")) {
                System.out.println("Please give an amount of money in rubles.");
                amount = currency.nextInt();
                double ruble = amount / 76.34;
                System.out.println(amount + " Russian ruble(s) is/are equal to " + ruble + " USD.");

            } else if(currencyType.equals("Rupee")) {
                System.out.println("Please give an amount of money in rupees.");
                amount = currency.nextInt();
                double rupee = amount / 75.03;
                System.out.println(amount + " Indian rupee(s) is/are equal to " + rupee + " USD.");

            } else if(currencyType.equals("Singapore")) {
                System.out.println("Please give an amount of money in Singaporean dollars.");
                amount = currency.nextInt();
                double singapore = amount / 1.35;
                System.out.println(amount + " Singaporean dollar(s) is/are equal to " + singapore + " USD.");

            } else if(currencyType.equals("Taiwan")) {
                System.out.println("Please give an amount of money in Taiwanese dollars.");
                amount = currency.nextInt();
                double taiwan = amount / 27.77;
                System.out.println(amount + " [New] Taiwanese dollar(s) is/are equal to " + taiwan + " USD.");

            } else if(currencyType.equals("Won")) {
                System.out.println("Please give an amount of money in won.");
                amount = currency.nextInt();
                double won = amount / 1200.32;
                System.out.println(amount + " South Korean won is equal to " + won + " USD.");

            } else if(currencyType.equals("Yen")) {
                System.out.println("Please give an amount of money in yen.");
                amount = currency.nextInt();
                double yen = amount / 114.65;
                System.out.println(amount + " Japanese yen is equal to " + yen + " USD.");

            } else if (currencyType.equals("Yuan")) {
                System.out.println("Please give an amount of money in yuan.");
                amount = currency.nextInt();
                double yuan = amount / 6.36;
                System.out.println(amount + " Chinese yuan is equal to " + yuan + " USD.");

            } else if(currencyType.equals("Zloty")) {
                System.out.println("Please give an amount of money in zloty.");
                amount = currency.nextInt();
                double zloty = amount / 4.02;
                System.out.println(amount + " Polish zloty is equal to " + zloty + " USD.");

            //If anything else is inputted, the error message is given
            } else {
                System.out.println("Sorry, that is an invalid input. Please try again.");
                
            }

            //Asks the user if they want to run another conversion
            System.out.println("Run another conversion? (Please use: Yes/No)");
            userResponse = converter.nextLine();

            //If the user's response is yes, the program is repeated
            if(userResponse.equals("Yes")) {
                loopCheck = true;
                
            //If the user's response is no, the program is ended
            } else if(userResponse.equals("No")) {
                System.out.println("Thank you for using our services.");
                loopCheck = false;
            }
        }

        //Closes the scanners
        currency.close();
        converter.close();

    }
}
