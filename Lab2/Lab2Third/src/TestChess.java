import java.util.Vector;
public class TestChess {
    public static void main(String[] args) {
        Piece rook1 = new Rook("a3", Colors.White);
        Piece rook2 = new Rook("a6", Colors.White);
        Piece king1 = new King("e7", Colors.Black);
        System.out.println(king1.isLegalMove("a5", "a6"));
        System.out.println(king1.isLegalMove("a4", "a6"));
        System.out.println(king1.isLegalMove("b5", "a6"));
        System.out.println(rook1.isLegalMove("b5", "b8"));
        System.out.println(rook1.isLegalMove("c5", "b8"));
        System.out.println(rook1.isLegalMove("b5", "b5"));
        System.out.println(rook1.isLegalMove("a7", "g4"));

        Board board = new Board();
        board.addPiece(rook1);
        board.addPiece(rook2);
        board.addPiece(king1);
        System.out.println(board.kingCheck("c6", Colors.Black));
        





    }
}
