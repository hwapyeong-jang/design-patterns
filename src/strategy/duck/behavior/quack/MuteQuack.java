package strategy.duck.behavior.quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("소리를 낼 수 없어요ㅠㅠ");
    }
}
