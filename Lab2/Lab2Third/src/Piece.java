
public abstract class Piece {
    public String pos;
    public Colors color;
    public Piece(String pos, Colors color) {
        this.pos = pos;
        this.color = color;
    }
    abstract public void setPos(String pos);


    public abstract boolean isLegalMove(String a, String b);
}
