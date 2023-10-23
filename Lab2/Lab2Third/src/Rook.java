public class Rook extends Piece{
    public Rook(String pos, Colors color){
        super(pos, color);
    }
    public boolean isLegalMove(String a, String b) {
        if ((a.charAt(0) == b.charAt(0) && a.charAt(1) != b.charAt(1)) || (a.charAt(1) == b.charAt(1) && a.charAt(0) != b.charAt(0))) {
            return true;
        }
        return false;
    }
    public void setPos(String pos1){
        this.pos = pos1;
    }


}
