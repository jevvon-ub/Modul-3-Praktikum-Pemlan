package praktic.geometry.shapes;

public class Circle {
    private int id;
    private double radius;
    final private int pembilang = 22;
    final private int penyebut = 7;

    public Circle() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getKeliling() {
        return 2 * this.pembilang * this.radius / this.penyebut;
    }

    public double getLuas() {
        return this.pembilang * this.radius * this.radius / this.penyebut;
    }

    public void getDeskripsi() {
        System.out.printf("ID \t: %d\n", this.id);
        System.out.printf("Radius \t: %.2f\n", this.radius);
        System.out.printf("Keliling: %.2f\n", this.getKeliling());
        System.out.printf("Luas \t: %.2f\n", this.getLuas());
    }
}
