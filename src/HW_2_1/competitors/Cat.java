package HW_2_1.competitors;

public class Cat implements Competitor{
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public Cat(String name) {
        this(name,1000, 3, 0);
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0){
            System.out.printf("%s не умеет плавать\n", name);
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance){
            System.out.printf("%s успешно проплыл %d метров\n", name, dist);
        } else {
            System.out.printf("%s не может проплыть %d метров\n", name, dist);
            onDistance = false;
        }

    }

    @Override
    public void run(int dist) {
        if (dist <= maxSwimDistance){
            System.out.printf("%s успешно пробежал %d метров\n", name, dist);
        } else {
            System.out.printf("%s не смог пробежать %d метров\n", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.printf("%s успешно прыгнул на %d метров\n", name, height);
        } else {
            System.out.printf("%s не смог прыгнуть на %d метров\n", name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %d\n", name, onDistance);
    }
}
