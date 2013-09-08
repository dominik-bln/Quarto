package quarto.players;

import java.util.Random;
import quarto.Board;
import quarto.Piece;

/**
 * This player type makes all Quarto moves randomly.
 */
public class RandomPlayer extends QuartoPlayer{

  final Random rand;
  
  public RandomPlayer(Board board){
    super(board);
    rand = new Random();
  }
  
  @Override
  public void makeMove() {
    boolean moveMade;
    int xCoordinate, yCoordinate;
    do{
      xCoordinate = rand.nextInt(Board.BOARD_LENGTH);
      yCoordinate = rand.nextInt(Board.BOARD_LENGTH);
      moveMade = this.getBoard().setField(xCoordinate, yCoordinate, this.getGivenPiece());
    }while(!moveMade);
    
    System.out.println("I made my move to " + (xCoordinate + 1) + (char) (yCoordinate + 65));
    this.getBoard().printBoard();
  }

  @Override
  public Piece selectPieceForOpponent() {
    int leftPieces = this.getBoard().getLeftoverPieceCount();
    System.out.println("Left pieces: " + leftPieces);
    Piece piece = this.getBoard().takePieceForOpponent(rand.nextInt(leftPieces) + 1);
    System.out.println("I selected " + piece);
    return piece;
  }
  
}
