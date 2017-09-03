package zeno.objects;

import zeno.graphics.Window;

import java.awt.*;

public class Rectangle extends GameObject {

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(Color.CYAN);
        g2.fillRect(10, 10, 50, 50);
    }

}
