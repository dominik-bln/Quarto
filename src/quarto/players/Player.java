package quarto.players;

import quarto.Piece;

/**
 * Defines the common functionality of a quarto player with an arbitrary algorithm for determining 
 * the next moves.
 */
public interface Player {
  
  /**
   * Calculates the next move to be made according to the chosen algorithm and by looking at the 
   * given board.
   */
  public void makeMove();
  
  /**
   * Calculates the piece that should be given to the opponent based on the chosen algorithm for the
   * implementation of this player.
   * 
   * @return The Quarto piece that was selected to be given to the 
   */
  public Piece selectPieceForOpponent();
}
