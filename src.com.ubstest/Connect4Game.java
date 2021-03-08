import java.util.Random;
import java.util.Scanner;

public class Connect4Game {
    private Board board;
    private String color1;
    private String color2;

    private boolean is1Playing;

       /*
Function : Constructor params define
Commented by: Mayuresh Kelhar
* */

    public Connect4Game (String color1, String color2){
        this.board = new Board();
        this.color1 = color1;
        this.color2 = color2;

        is1Playing= (new Random().nextBoolean());
    }

    /*
Function : Start the game
Commented by: Mayuresh Kelhar
* */

    public void startGame(){
        boolean running = true;

        while (running){
            board.printBoard();
            String color;
            if(is1Playing){
                color = color1;
                System.out.println("Player RED turn:");
            }
            else {
                color = color2;
                System.out.println("Player GREEN turn:");
            }
            System.out.println("Please select which column you want to put your piece in:");
            System.out.print("Choose between 1 and "+ board.getColumns()+":");
            Scanner input = new Scanner(System.in);
            int column = input.nextInt()-1;

            boolean success = board.addPiece(column,color);

            if (success){
                if (checkForWinner(column)){
                    board.printBoard();
                    running = false;
                    if(is1Playing){
                        System.out.println("Player RED won");
                    }
                    else {
                        System.out.println("Player GREEN won");
                    }
                }
                is1Playing=!is1Playing;
            }
        }
    }
    /*
Function : Function get winner
Commented by: Mayuresh Kelhar
* */
    public boolean checkForWinner(int column){

        String winningColor;
        if (is1Playing){
            winningColor = color1
            ;        }
        else {
            winningColor = color2;
        }
        return  board.checkForWinner(column,winningColor);
    }
}
