package zeno.core;

import zeno.graphics.Window;
import zeno.objects.GameObject;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Engine {

    public static float Time = 0;
    public static float FrameTime = 1;

    private Window window = new Window();

    private Chrono timer;
    private DataStore dataStore = new DataStore();
    private Boolean running = true;
    private Boolean paused = false;

    public void initialize() {
        window.initialize();
    }

    public void start() {
        timer = new Chrono();

        while (running) {
            if (timer.getElapsedTime() >= 16) {
                Engine.Time = timer.getTime();
                Engine.FrameTime = timer.restart();

                dataStore.getGameObjects().forEach(GameObject::update);
                dataStore.getGameObjects().forEach(GameObject::draw);


                window.repaint();
                Window.canvas.getG2().setColor(Color.BLACK);
                Window.canvas.getG2().fillRect(0,0,1280,720);
            }
        }
    }

    public Chrono getTimer() {
        return timer;
    }

    public DataStore getDataStore() {
        return dataStore;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    public Boolean getPaused() {
        return paused;
    }

    // Singleton
    // ===========================
    private static Engine instance = new Engine();

    private Engine() {
        window.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                running = false;
            }

        });
    }

    public static Engine getInstance() {
        return Engine.instance;
    }

}
