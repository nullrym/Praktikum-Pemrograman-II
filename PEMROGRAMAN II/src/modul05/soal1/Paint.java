package modul05.soal1;
import modul05.soal1.shapes.Shape;

public class Paint {
    private double coverage;

    public Paint(double c) {
        coverage = c;
    }
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
