package creational.prototype;

abstract class PrototypeTest {

    static void main() {
        Enemy goblin = new Enemy("Goblin", 1000, 15);
        Enemy thief = goblin.copy();
        Enemy zombie = thief.copy();

        thief.setName("Thief");
        zombie.setName("Zombie");

        IO.println(goblin);
        IO.println(thief);
        IO.println(zombie);
    }
}
