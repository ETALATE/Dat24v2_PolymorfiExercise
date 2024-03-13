public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    // Her er en metode, der skal override superklassens metode calcuclateArea(),
    // og som udregner arealet af et rektangel og returnere resultatet.
    // Tilføj override notation
    public double calculateArea() {
        return length * width;
    }
}
