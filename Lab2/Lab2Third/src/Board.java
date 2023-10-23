import java.util.Vector;

public class Board {
    public Vector<Piece> pieces;
    public Board() {
        pieces = new Vector<Piece>();
    }

    public void addPiece(Piece newPiece){
        pieces.add(newPiece);
    }

    public void deletePiece(Piece piece){
        pieces.remove(piece);
    }
    public boolean kingCheck(String b, Colors color){
        for(int i=0; i<pieces.size(); i++){
            if((pieces.elementAt(i).pos.charAt(0) == b.charAt(0) || pieces.elementAt(i).pos.charAt(1) == b.charAt(1))&&pieces.elementAt(i).color!=color){
                return false;
            }
            if(pieces.elementAt(i).pos.charAt(0) == b.charAt(0) && pieces.elementAt(i).pos.charAt(1) == b.charAt(1)){
                return false;
            }
        }
        return true;
    }

}
