package AbstractFactoryPattern.Asteroids;

public abstract class Asteroid {

    private int id;
    private String name;
    private String type;
    private int size;
    private int xVelocity;
    private int yVelocity;
    private boolean isSplitAllowed;

    public Asteroid(int id, String name, String type, int size, int xVelocity, int yVelocity, boolean isSplitAllowed) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.isSplitAllowed = isSplitAllowed;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public boolean isSplitAllowed() {
        return isSplitAllowed;
    }

    public void setSplitAllowed(boolean splitAllowed) {
        isSplitAllowed = splitAllowed;
    }

    @Override
    public String toString() {
        return "Asteroid { " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                ", size = " + size +
                ", xVelocity = " + xVelocity +
                ", yVelocity = " + yVelocity +
                ", isSplitAllowed = " + isSplitAllowed +
                " } ";
    }
}
