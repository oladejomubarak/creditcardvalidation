package creditCard;

public class CreditCard {
    private static  long creditCardNumbers;
   // private static int creditCardNumbersCount;
    public CreditCard(long creditCardNumber) {
        if(validateCardNumbers(creditCardNumber)) CreditCard.creditCardNumbers = creditCardNumber;

    }
    public static String getStringFormat(long creditCardNumbers){
        return Long.toString(creditCardNumbers);
    }
    public static boolean validateCardNumbers(long creditCardNumber){
        String creditCardNumbersInString = getStringFormat(creditCardNumber);
        int count = creditCardNumbersInString.length();
            if (count >= 13 && count <= 16) return true;
            else throw new CreditCardValidationException("Card Numbers should not be lesser than 13 or greater than 16");

    }
    public int getDoubledSumOfEverySecondDigit(){
        int sum = 0;
        String creditCardNumbersInString = getStringFormat(creditCardNumbers);
        for (int i = creditCardNumbersInString.length() -2; i >=0 ; i -= 2) {
              char numChar = creditCardNumbersInString.charAt(i);
             int numInt = Integer.parseInt(String.valueOf(numChar));
             int doubleNum = numInt * 2;
            if (doubleNum > 9){
                 int div = doubleNum / 10;
                 int mod = doubleNum % 10;
                int  divPlusMod = div + mod;
                sum += divPlusMod;
            }
            else {
                sum += doubleNum;
            }
        }
        return sum;
    }
    public int getSumOfOddPlacedDigits(){
        int sum= 0;
        String cardNumberInString = getStringFormat(creditCardNumbers);
        for (int i = cardNumberInString.length() -1; i >=0 ; i -=2) {
            char numInChar = cardNumberInString.charAt(i);
            int numInInt = Integer.parseInt(String.valueOf(numInChar));
            sum+=numInInt;

        }
        return sum;
    }
    public int getSum(){
        return getDoubledSumOfEverySecondDigit() + getSumOfOddPlacedDigits();
    }
    public boolean isDivisibleByTen(){
        if(getSum() % 10 == 0) {
            System.out.println("The card is valid");return true;}
        System.out.println("The card is invalid");
        return false;
    }
}
