package in.sp.simpleFactory;

public class WindowButton implements Button {

    @Override
    public void createButton() {
        System.out.println("WindowButton created.");
    }
}
