package HW_2_1.obstacles;

import HW_2_1.competitors.Competitor;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void justDoIt(Competitor c) {
        c.jump(height);
    }
}
