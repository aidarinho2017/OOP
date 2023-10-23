import java.lang.Math;
abstract public class Shape {
    String color;
    String material;
    public Shape(String color, String material){
        this.color=color;
        this.material=material;


    }

    abstract public double getVolume(double k);
    abstract public double surfaceArea(double lenOfSide, double height);
    abstract public double surfaceArea(double lenOfSide);
    abstract public void setColor(String color);
    abstract public void getColor();
    abstract public void setMaterial(String Material);
    abstract public void getMaterial();
}
