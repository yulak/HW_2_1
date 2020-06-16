package HW_2_1.competitors;

public class Robot implements Competitor{
    String name;

    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;

    public Robot(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public Robot(String name) {
        this(name,10000, 15, 1000);
    }

    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0){
            System.out.printf("%s не умеет плавать\n", name);
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance){
            System.out.printf("%s трансформировался в лодку и успешно проплыл %d метров\n", name, dist);
        } else {
            System.out.printf("%s не может проплыть %d метров, замкнуло провода\n", name, dist);
            onDistance = false;
        }

    }

    @Override
    public void run(int dist) {
        if (dist <= maxSwimDistance){
            System.out.printf("%s нацепил колеса и успешно пробежал %d метров\n", name, dist);
        } else {
            System.out.printf("%s не смог пробежать %d метров, сломалось колесо\n", name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.printf("%s натянул пружины и успешно прыгнул на %d метров\n", name, height);
        } else {
            System.out.printf("%s не смог прыгнуть на %d метров, механизм заржавел\n", name, height);
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
