package DesignPatterns.StrategyPattern;


public class Main {
    public static void main(String[] args) {

            Student rakshith = new IndianStudent("Rakshith");
            System.out.println("Rakshith uses :");
            rakshith.useSocialNetwork();

          Student vadim = new RussianStudent("Vadim");
          System.out.println("Vadim uses :");
          vadim.useSocialNetwork();

          Student zhang = new ChineseStudent("Zhang");
          System.out.println("Zhang uses :");
          zhang.useSocialNetwork();


            zhang.setSocialNetwork(new Facebook());
            System.out.println("Zhang Changed to :");
            zhang.useSocialNetwork();





    }
}
