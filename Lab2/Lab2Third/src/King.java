
public class King extends Piece{
    public King(String pos, Colors color){
        super(pos, color);
    }
    public boolean isLegalMove(String a, String b) {
        if (Math.abs(a.charAt(0) - b.charAt(0)) <= 1 && Math.abs(a.charAt(1) - b.charAt(1)) <= 1) {
            return true;
        }
        return false;
    }
    public void setPos(String pos1){
        this.pos = pos1;
    }



}
