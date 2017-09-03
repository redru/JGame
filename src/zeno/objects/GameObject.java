package zeno.objects;

public abstract class GameObject {

    private static int count = 0;

    private int id;
    private String name;

    GameObject(String name) {
        this.name = name != null ? name : "DEFAULT";
        id = GameObject.count;
        GameObject.count++;
    }

    public void update() { }

    public void draw() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
