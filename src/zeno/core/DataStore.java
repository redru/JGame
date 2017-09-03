package zeno.core;

import zeno.objects.GameObject;

import java.util.ArrayList;

public class DataStore {

    private ArrayList<GameObject> gameObjects = new ArrayList<>(1000);

    public void addGameObject(GameObject object) {
        gameObjects.add(object);
    }

    public ArrayList<GameObject> getGameObjects() {
        return gameObjects;
    }

}
