package zeno.graphics;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Window extends JFrame {

    public static Canvas canvas = new Canvas();

    public void initialize() {
        setTitle("JGame application - " + new Date());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Window.canvas.setPreferredSize(new Dimension(1280, 720));
        add(Window.canvas);

        pack();
    }

}
