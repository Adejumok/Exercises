package chapterEight;

public class RectangleClass {

    private double length;
    private double width;


    public RectangleClass() {
        this.length = 1;
        this.width = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length){
        if (length < 0.0 || length > 20.0) {
           throw new IllegalArgumentException("width must be 1-19");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        if (width < 0.0 || width > 20.0){
            throw new IllegalArgumentException("width must be 1-19");
        }
        this.width = width;
    }

    public double perimeter() {

        return 2 * (length + width);
    }

    public double area() {

        return length * width;
    }
}
