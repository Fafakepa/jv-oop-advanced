package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super.setColor(color);
        this.radius = radius;
        super.setArea(getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle,"
                        + " area: %.1f sq. units,"
                        + " radius: %.1f sq. units,"
                        + " color: %s\n",
                getArea(), radius, getColor());
    }
}
