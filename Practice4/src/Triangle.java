public class Triangle extends Shape{
    int lengthOfBase;
    int height;
    public Triangle(int position, Colors color, int lengthOfBase, int height){
        super(position, color);
        this.lengthOfBase = lengthOfBase;
        this.height = height;
    }



    public void draw() {
        String s="";
        for(int i=0; i<position; i++){
            s+=" ";
        }
        if(color==Colors.Red){
            s+="🔺";
        }
        else{
            s+="⃤";
        }
        System.out.println(s);
    }
    public void showInfo() {
        System.out.println(this.color + " triangle's position is " + this.position + " and height is " + this.height + " and length of base is " + this.lengthOfBase);
    }

}

