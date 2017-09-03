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
    public void draw() {
        Graphics2D g2d =  Window.canvas.getG2();
        g2d.setColor(Color.CYAN);
        g2d.fillRect(10, 10, 50, 50);
    }

}
