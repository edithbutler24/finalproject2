import javax.swing.*;
import java.awt.*;
public class gameButton extends JButton {
    private Color color;
    private String hint;
    private int index;


    public gameButton(Color color, String hint, int index){
        super();
        this.color=color;
        this.hint=hint;
        this.index=index;

setOpaque(true);
setBorderPainted(false);
setBackground(color);
    }

    public String getHint(){
        return hint;
    }
public int getIndex(){ return index;}


}
