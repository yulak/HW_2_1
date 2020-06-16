package HW_2_1.obstacles;

import HW_2_1.competitors.Competitor;

public class Water extends Obstacle {
    private int dist;

    @Override
    public void justDoIt(Competitor c) {
        c.swim(dist);
    }

    public Water(int dist) {
        this.dist = dist;
    }
}
