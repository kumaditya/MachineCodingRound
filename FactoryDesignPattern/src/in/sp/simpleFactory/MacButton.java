package in.sp.simpleFactory;

public class MacButton implements Button {

    @Override
    public void createButton() {
        System.out.println("MacButton created.");
    }
}
