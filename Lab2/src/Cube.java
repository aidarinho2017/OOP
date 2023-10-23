public class Cube extends Shape{
    String color;
    String material;
    public Cube(String color, String material){
        super(color, material);

    }

    public double getVolume(double lenOfSide){
        return lenOfSide*lenOfSide*lenOfSide;

    }
    public double surfaceArea(double lenOfSide){
        return lenOfSide*lenOfSide*6;
    }
    public double surfaceArea(double lenOfSide, double diagonalLength){
        return 0;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void getColor(){
        System.out.println(this.color + " is the color of this Cube.");
    }

    public void setMaterial(String material) {
        this.material = material;

    }

    public void getMaterial() {
        System.out.println(this.material + " is the material of this Cube.");

    }





}
