package creditCard;

import java.util.Scanner;

public class CreditCardValidationApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the card numbers: ");
        long userCardNumbers = input.nextLong();
        CreditCard creditCard = new CreditCard(userCardNumbers);
        //CreditCard creditCard = new CreditCard(4388576018402626L);
        int result = creditCard.getDoubledSumOfEverySecondDigit();
        System.out.println(result);
        int result1 = creditCard.getSumOfOddPlacedDigits();
        System.out.println(result1);
        int result2 = creditCard.getSum();
        System.out.println(result2);
        boolean result3 = creditCard.isDivisibleByTen();
        System.out.println(result3);

    }


}
