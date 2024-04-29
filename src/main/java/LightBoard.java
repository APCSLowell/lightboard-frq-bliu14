public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    /* to be implemented in part (a) */
    for(int r = 0; r < numRows; r++) {
      for(int c = 0; c < numsCols; c++) {
        if(Math.random() < 0.4) {
          light[r][c] = true;
        }
        else {
          light[r][c] = false;
        }
      }
    }

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    /* to be implemented in part (b) */
    int on = 0;
    for(int i = 0; i< light[col].length; i++) {
      if(light[row][i] == true) {
        on++;
      }
    }
    if(on%2 == 0 && light[row][col] == true) {
      return false;
    }
    else if(on%3 == 0 && light[row][col] == false) {
      return true;
    }
    else {
      return light[row][col];
    }
   
 
  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
