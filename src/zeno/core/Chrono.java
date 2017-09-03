package zeno.core;

public class Chrono {

    private long time;
    private long step;
    private long lastElapsed;

    public Chrono() {
        time = System.nanoTime();
        step = time;
    }

    public long restart() {
        long current = System.nanoTime();
        lastElapsed = (current - step) / 1000000;
        step = current;
        return lastElapsed;
    }

    public float getTime() {
        return (System.nanoTime() - time) / 1000000;
    }

    public float getElapsedTime() {
        return (System.nanoTime() - step) / 1000000;
    }

    public float getLastElapsedTime() {
        return lastElapsed;
    }

}
