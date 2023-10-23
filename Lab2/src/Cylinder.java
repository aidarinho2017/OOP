public class Cylinder extends Shape{
    String color;
    String material;
    public Cylinder(String color, String material){
        super(color, material);
    }

    public double getVolume(double radius, double height){
        return 3.14*radius*radius*height;
    }
    public double getVolume(double radius){
        return 0;
    }
    public double surfaceArea(double radius, double height){
        return 2*3.14*radius * (radius + height);
    }

    public double surfaceArea(double lenOfSide) {
        return 0;
    }

    public void setColor(String color){
        this.color=color;
    }
    public void getColor(){
        System.out.println(this.color + " is the color Of this Cylinder.");
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void getMaterial(){
        System.out.println(this.material + " is the material of this Cylinder.");
    }
}
