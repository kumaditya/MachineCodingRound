package in.sp.simpleFactory;

public class ButtonFactory {

    public void createButton(String buttonType) {
        if (buttonType == null) {
            System.out.println("Button type cannot be null.");
            return;
        }

        Button button;
        if (buttonType.equalsIgnoreCase("WINDOWS") || buttonType.equalsIgnoreCase("WINDOW") || buttonType.equalsIgnoreCase("WINDOWBUTTON")) {
            button = new WindowButton();
        } else if (buttonType.equalsIgnoreCase("MAC") || buttonType.equalsIgnoreCase("MACBUTTON")) {
            button = new MacButton();
        } else {
            System.out.println("Invalid button type: " + buttonType);
            return;
        }

        button.createButton();
    }
}
