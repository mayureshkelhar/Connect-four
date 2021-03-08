public class Board {

    private static final int rows = 6;
    private static final int columns = 7;

    Piece[][] ourBoard = new Piece[rows][columns];

    public static int getColumns() {
        return columns;
    }

    public static int getRows() {
        return rows;
    }

    /*
    Function : Create Board with 6 rows and 7 column
    Commented by: Mayuresh Kelhar
    * */

    public Board() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                ourBoard[row][col] = null;
            }
        }
    }

    /*
    Function : Print a board on console
    Commented by: Mayuresh Kelhar
    * */

    public void printBoard (){
        System.out.println("###############################");
        for (int row = 0; row< rows; row++){

            System.out.print ("|");
            for (int col=0; col<columns;col++){
                if (ourBoard[row][col]==null){
                    System.out.print("_");
                }
                else {
                    System.out.print(ourBoard[row][col].getColor());
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    /*
  Function : Verify the winner?
  Commented by: Mayuresh Kelhar
  * */
    public boolean checkForWinner(int col, String winningColor ){
        boolean winner = false;

        for (int row =0 ;row< rows ; row++){
            if (ourBoard[row][col]!=null){

                int winningStreak= 3;

                for (int winRow= row +1;winRow< rows; winRow++){
                    if(ourBoard[winRow][col].getColor()==winningColor){
                        winningStreak--;
                        if (winningStreak == 0){
                            System.out.println("Columns are connected");
                            winner = true;
                        }
                    }
                    else {
                        winningStreak =3;
                    }
                }
                winningStreak =4;

                for (int winCol = col-3 ; winCol<=col+3; winCol++){
                    if (winCol< 0){
                        continue;
                    }
                    if (winCol>=columns){
                        break;
                    }
                    if (ourBoard[row][winCol]!=null && ourBoard[row][winCol].getColor()==winningColor){
                        winningStreak--;
                        if (winningStreak == 0){
                            System.out.println("Rows are connected");
                            winner = true;
                        }
                    }
                    else {
                        winningStreak =4;
                    }
                }
                winningStreak =4;

                for (int winRow = row -3,winCol = col-3; winRow<=row+3 && winCol<=col+3; winRow++,winCol++ ){
                    if (winRow<0 || winCol <0){
                        continue;
                    }
                    if (winRow>=rows || winCol>=columns){
                        break;
                    }
                    if (ourBoard[winRow][winCol]!=null && ourBoard[winRow][winCol].getColor()==winningColor){
                        winningStreak--;
                        if (winningStreak == 0){
                            System.out.println("Left diagonals are connected");
                            winner = true;
                        }
                    }
                    else {
                        winningStreak =4;
                    }
                }
                winningStreak =4;

                for (int winRow = row -3,winCol = col+3; winRow<=row+3 && winCol>=col-3; winRow++,winCol-- ){
                    if (winRow<0 ||winCol>=columns){
                        continue;
                    }
                    if (winRow>=rows || winCol<0){
                        break;
                    }
                    if (ourBoard[winRow][winCol]!=null && ourBoard[winRow][winCol].getColor()==winningColor){
                        winningStreak--;
                        if (winningStreak == 0){
                            System.out.println("Right diagonals are connected");
                            winner = true;
                        }
                    }
                    else {
                        winningStreak =4;
                    }
                }

                break;
            }
        }
        return  winner;
    }

    /*
  Function : Add pieces to board
  Commented by: Mayuresh Kelhar
  * */
    public boolean addPiece (int colToAdd, String color){
        if (colToAdd >=0 && colToAdd< columns){


            // MATCH DRAWN IF ALL COLUMNS ARE FULL
            for(int col = 0 ;  col<columns ;col++){
                if (ourBoard[0][col]!=null){
                    if (col==(columns-1))
                    {
                        System.out.println("All columns are full...!!! Match is draw!!");
                        System.exit(0);
                    }
                    continue;
                }
                else{
                    break;
                }
            }

            //Verify if column has space to insert
            if (ourBoard[0][colToAdd]==null){
                boolean addedThePiece = false;
                for (int row = rows-1 ;row>=0;row--){
                    if (ourBoard[row][colToAdd]==null){
                        ourBoard[row][colToAdd]=new Piece();
                        ourBoard[row][colToAdd].setColor(color);
                        addedThePiece = true;
                        break;
                    }
                }
                return addedThePiece;
            }
            else {
                System.out.println("--------->>>>>>COLUMN IS FULL. PLEASE CHOOSE ANOTHER COLUMN<<<<<<----------");
                return false;
            }



        }
        else{
            System.out.println("----------->>>>>>>>INVALID INPUT<<<<<--------");
            return false;
        }
    }






}
