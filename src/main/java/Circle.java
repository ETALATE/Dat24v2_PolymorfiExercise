public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Her er en metode, der skal override superklassens metode calcuclateArea(),
    // og som udregner arealet af en cirkel og returnere resultatet.
    // Tilføj override notation
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
