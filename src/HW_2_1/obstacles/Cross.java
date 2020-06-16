package HW_2_1.obstacles;

import HW_2_1.competitors.Competitor;

public class Cross extends Obstacle {
    private int dist;

    @Override
    public void justDoIt(Competitor c) {
        c.run(dist);
    }

    public Cross(int dist) {
        this.dist = dist;
    }
}
