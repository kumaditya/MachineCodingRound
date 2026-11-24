package in.sp.main.flyStrategy;

public class FlyNoWay implements FLyStrategy {
    @Override
    public void fly() {
        System.out.println("This Player cannot fly");
    }
}
