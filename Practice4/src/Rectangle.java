public class Rectangle extends Shape{
    int width;
    int height;
    public Rectangle(int position, Colors color, int width, int height){
        super(position, color);
        this.width = width;
        this.height = height;
    }



    public void draw() {
        String s="";
        for(int i=0; i<position; i++){
            s+=" ";
        }
        if(color==Colors.Red){
            s+="🟥";
        }
        else{
            s+="⬛️";
        }
        System.out.println(s);
    }
    public void showInfo() {
        System.out.println(this.color + " rectangle's position is " + this.position + " and height is " + this.height + " and width is " + this.width);
    }

}

