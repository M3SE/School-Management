package DesignPatterns.StrategyPattern;


public class Wechat implements SocialNetwork {
    @Override
    public void useIt() {
        System.out.println("Using WeChat");
    }
}
