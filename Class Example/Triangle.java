public class Triangle {
    double base;
    double height;
    double lenOne;
    double lenTwo;
    double lenThree;

    public Triangle(double base, double height, double lenOne, double lenTwo,
            double lenThree) {
        this.base = base;
        this.height = height;
        this.lenOne = lenOne;
        this.lenTwo = lenTwo;
        this.lenThree = lenThree;
    }
    public double findArea() {
        return ((this.base * this.height) / 2);
    }
}