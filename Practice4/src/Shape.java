public abstract class Shape {
    int position;
    Colors color;
    public Shape(int position, Colors color){
        this.position = position;
        this.color=color;
    }
    public abstract void draw();
    public abstract void showInfo();



}
