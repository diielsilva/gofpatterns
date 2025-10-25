package creational.prototype;

class Enemy implements Prototype {
    private String name;
    private int health;
    private int level;

    Enemy() {
    }

    Enemy(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getHealth() {
        return health;
    }

    void setHealth(int health) {
        this.health = health;
    }

    int getLevel() {
        return level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Enemy {" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                '}';
    }

    @Override
    public Enemy copy() {
        return new Enemy(this.name, this.health, this.level);
    }
}
