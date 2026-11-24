package in.sp.simpleFactory;

public class CheckBoxFactory {

    public void createCheckBox(String checkBoxType) {
        if (checkBoxType == null) {
            System.out.println("CheckBox type cannot be null.");
            return;
        }

        CheckBox checkBox;
        if (checkBoxType.equalsIgnoreCase("WINDOWS") || checkBoxType.equalsIgnoreCase("WINDOW") || checkBoxType.equalsIgnoreCase("WINDOWSCHECKBOX")) {
            checkBox = new WindowsCheckBox();
        } else if (checkBoxType.equalsIgnoreCase("MAC") || checkBoxType.equalsIgnoreCase("MACCHECKBOX")) {
            checkBox = new MacCheckBox();
        } else {
            System.out.println("Invalid checkbox type: " + checkBoxType);
            return;
        }

        checkBox.createCheckBox();
    }
}
