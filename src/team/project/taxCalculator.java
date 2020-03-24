package team.project;

public class taxCalculator {
    public void name(String username) {

        System.out.println(username);
    }

    public  void salary(double money) {

        double day = Math.round (money/365.0);
        double month = Math.round (money / 12);
        double year = money;

        System.out.println("The yearly salary is: " +year);
        System.out.println("The monthly salary is: " + month);
        System.out.println("The daily salary is: " + day);
    }
}
