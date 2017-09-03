package zeno.graphics;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JComponent {

    private Graphics2D g2;

    @Override
    protected void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;
    }

    public Graphics2D getG2() {
        return g2;
    }
}
