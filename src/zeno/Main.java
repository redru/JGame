package zeno;

import zeno.core.Engine;
import zeno.objects.Rectangle;

public class Main {

    public static void main(String[] args) {
        Engine engine = Engine.getInstance();
        engine.initialize();

        Rectangle rect = new Rectangle("");
        engine.getDataStore().addGameObject(rect);

        engine.start();
    }

}
