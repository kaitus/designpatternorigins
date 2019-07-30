package patterns.flyweight;

public class Main {

    private static final String colors[] = {"red", "blue", "ping", "black"};

    public static void main(String[] args) {
        for (int i=0; i<20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRadomColor());
            circle.setX(getRadomX());
            circle.setY(getRadomY());
            circle.setRadius(400);
            circle.draw();
        }
    }

    private static String getRadomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRadomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRadomY() {
        return (int) (Math.random() * 100);
    }
}
