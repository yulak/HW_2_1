package HW_2_1;

import HW_2_1.competitors.Cat;
import HW_2_1.competitors.Competitor;
import HW_2_1.competitors.Human;
import HW_2_1.competitors.Robot;
import HW_2_1.obstacles.Cross;
import HW_2_1.obstacles.Obstacle;
import HW_2_1.obstacles.Wall;
import HW_2_1.obstacles.Water;

public class Main {

    public static void main(String[] args) {
        Competitor[] competitors = {
            new Human("Макс"),
            new Human("Петя"),
            new Cat("Дуся"),
            new Cat("Муся"),
            new Robot("Электроник", 15000, 2, 150),
            new Robot("Ева"),
            new Robot("Валли", 80000, 14, 0)
        };

        Obstacle[] obstacles = {
                new Cross(400),
                new Wall(1),
                new Water(150)
        };

        for (Competitor c: competitors) {
            for (Obstacle o: obstacles){
                o.justDoIt(c);
                if (c.isOnDistance()){
                    break;
                }
            }
            /*for (Competitor competitor : competitors) {
                competitor.info();
            }*/
        }
    }
}
