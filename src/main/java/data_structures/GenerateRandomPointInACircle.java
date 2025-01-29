package data_structures;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomPointInACircle {
    private double radius;
    private double xCenter;
    private double yCenter;

    public GenerateRandomPointInACircle(double radius, double x_center, double yCenter) {
        this.radius = radius;
        this.xCenter = x_center;
        this.yCenter = yCenter;
    }

    public double[] randPoint() {
        double x, y;
        do {
            x = ThreadLocalRandom.current().nextDouble(xCenter - radius, xCenter + radius);
            y = ThreadLocalRandom.current().nextDouble(yCenter - radius, yCenter + radius);
        } while (!checkInCircle(x, y));

        return new double[]{x, y};
    }

    private boolean checkInCircle(double x, double y) {
        double dx = x - xCenter;
        double dy = y - yCenter;
        return dx * dx + dy * dy <= radius * radius;
    }
}

