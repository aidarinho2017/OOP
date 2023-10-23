import java.lang.Math;
public class Sphere extends Shape{
    String color;
    String material;
    public Sphere(String color, String material){
        super(color, material);
    }

    public double getVolume(double radius){
        return (double) 4 / 3 * 3.14 * Math.pow(radius, 3);
    }
    public double surfaceArea(double radius){
        return (double) 4 * 3.14 * radius * radius;
    }
    public double surfaceArea(double radius, double diameter){
        return 0;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void getColor(){

        System.out.println(this.color + " is the color of this Sphere.");
    }
    public void setMaterial(String material){
        this.material = material;

    }
    public void getMaterial(){
        System.out.println(this.material + " is the material of this Sphere.");
    }
}
