public class Circle extends Shape{
    int diameter;

    public Circle(int position, Colors color, int diameter){
        super(position, color);
        this.diameter=diameter;
    }



    public void draw() {
        String s="";
        for(int i=0; i<position; i++){
            s+=" ";
        }
        if(color==Colors.Red){
            s+="🔴️";
        }
        else{
            s+="⚫️";
        }
        System.out.println(s);
    }
    public void showInfo() {
        System.out.println(this.color + " circle's position is " + this.position + " and diameter is " + this.diameter);
    }

}
