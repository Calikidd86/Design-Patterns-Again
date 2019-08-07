package prototype_pattern.spacewar_prototype;

public class Spawner {
    public Cloneable clone;

    public Enemy SpawnEnemy(Enemy prototype) {
        clone = (Enemy) prototype.clone();
        return (Enemy) clone;
    }

    public static void main(String[] args) {
        Enemy fastAlien = new FastAlien();
        Enemy drone = new Drone();

        Spawner spawner = new Spawner();
        Enemy fastAlien2 = spawner.SpawnEnemy(fastAlien);

        System.out.println(fastAlien2.getClass());

        System.out.println(fastAlien2.equals(fastAlien));

    }
}
