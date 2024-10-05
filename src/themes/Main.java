package themes;

public class Main {
    public static void main(String[] args) {
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        Button lightButton = lightThemeFactory.createButton();
        Checkbox lightCheckbox = lightThemeFactory.createCheckbox();
        lightButton.display();
        lightCheckbox.display();

        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Button darkButton = darkThemeFactory.createButton();
        Checkbox darkCheckbox = darkThemeFactory.createCheckbox();
        darkButton.display();
        darkCheckbox.display();
    }
}
