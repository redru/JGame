package zeno.graphics;

import zeno.core.Engine;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JComponent {

    private Graphics2D g2;

    @Override
    protected void paintComponent(Graphics g) {
        g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, 1280, 720);

        Engine.getInstance().getDataStore().getGameObjects().forEach(gameObject -> {
            if (gameObject != null) gameObject.draw(g2);
        });
    }

    public Graphics2D getG2() {
        return g2;
    }
}
