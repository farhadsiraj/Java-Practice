import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = { "Expresso", "Iced Coffee", "Macchiato" };
        menu[2] = "Latte";
        String menuStr = Arrays.toString(menu);
        System.out.println(menuStr);

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];

        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";

        String newMenuStr = Arrays.toString(newMenu);
        System.out.println(newMenuStr);

    }

}
