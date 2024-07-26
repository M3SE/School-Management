package DesignPatterns.StrategyPattern;


public class RussianStudent extends Student {
    public RussianStudent(String name) {
        super(name);
        socialNetwork = new Vk();
    }

    @Override
    public void useSocialNetwork() {
        socialNetwork.useIt();
    }
}
