package mediaplayer.view;

import java.util.ArrayList;
import javafx.scene.control.Button;

public class ArrayButtons {
    private ArrayList<Button> buttons;

    public ArrayButtons(){
        buttons = new ArrayList<Button>();
    }

    public void setButton(Button b){
        buttons.add(b);
    }

    public ArrayList<Button> getButtons(){
        return buttons;
    }
}
