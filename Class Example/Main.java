public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 2.543, 8, 6, 7);
        Triangle triangleB = new Triangle(13, 5.675, 8, 8, 8);
        System.out.println(triangleA.findArea());
        System.out.println(triangleB.findArea());
    }
}