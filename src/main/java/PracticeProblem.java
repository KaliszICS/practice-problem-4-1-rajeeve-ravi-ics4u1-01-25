import java.util.ArrayList;

public class PracticeProblem {

    public static void main(String args[]) {
    }

    public static String[] towerOfHanoi(int n) {
        if (n <= 0) return new String[0];
        ArrayList<String> movesList = new ArrayList<>();
        solveHanoi(n, 'L', 'R', 'M', movesList);
        return movesList.toArray(new String[0]);
    }

    private static void solveHanoi(int n, char from, char to, char aux, ArrayList<String> list) {
        if (n == 1) {
            list.add("" + from + to);
            return;
        }
        solveHanoi(n - 1, from, aux, to, list);
        list.add("" + from + to);
        solveHanoi(n - 1, aux, to, from, list);
    }

    public static void q1() {}
    public static void q2() {}
    public static void q3() {}
    public static void q4() {}
    public static void q5() {}
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        if (length == 0 || width == 0) {
            return 0.0;
        }
        return 2 * (length + width);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double circumference() {
        return 2 * 3.14 * radius;
    }
}

class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColour;
    private String hairColour;

    public Person(String name, int age, int height, int weight, String eyeColour, String hairColour) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public String getEyeColour() { return eyeColour; }
    public String getHairColour() { return hairColour; }
}
