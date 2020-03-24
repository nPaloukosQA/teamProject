package team.project;

public class income {
    public void name(String username) {

        System.out.println(username);
    }

    public  void salary(double money) {

        double day = Math.round (money/365.0);
        double month = Math.round (money / 12);
        double year = money;

        System.out.println("The yearly salary is: " + year);
        System.out.println("The monthly salary is: " + month);
        System.out.println("The daily salary is: " + day);
    }

    public void taxCalculator (double money) {


        if (money < 21000) {
            System.out.println("You pay 10% tax. You get: " + (money * 0.9) );
        }   else if ( money < 32500) {
            System.out.println("You pay 20% tax. You get: " + (money * 0.8) );
        }   else {
            System.out.println("You pay 40% tax. You get: " + (money * 0.6) );
        }

    }
}
