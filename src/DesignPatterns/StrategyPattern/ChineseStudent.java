package DesignPatterns.StrategyPattern;


public class ChineseStudent extends Student {
    public ChineseStudent(String name) {
        super(name);
        socialNetwork = new Wechat();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();
    }
}
