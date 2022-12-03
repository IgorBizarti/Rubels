public class Rubels {

    public static void main(String[] args) {

       int baseAmount = 100;
       int addAmount = 1020;

       int bonus;

       if (addAmount >= 1020) {
           bonus = addAmount / 100;
       } else {
           bonus = 0;
       }
        int balance = addAmount / baseAmount * bonus;

       System.out.println( " Вам начислено " + bonus + " Бонусных рублей" );


    }
}
