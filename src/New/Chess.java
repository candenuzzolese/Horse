package New;

import java.util.Stack;

public class Chess {


    Horse horse;
    Position board[][];
    Stack<Position> movements = new Stack ();

    public Chess(Horse horse) {
        this.horse = horse;

        board = new Position[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Position ( i, j );
            }
        }
        horse.setCurrentPosition ( board[0][0] );


        }


    public void start() {
        //comienza el game
        for (int i = 0; i < movements.size (); i++){
            //pila que es
            horse.availableMovements ();
            horse.setCurrentPosition (movements.peek ());
        }


        }
        /*
          while (!stacks[currentStack - 1].isEmpty()) {
            printer();
            stacks[currentStack - 1].pop();
            if (stacks[currentStack - 1].isEmpty()) break;
            currentPosition = stacks[currentStack - 1].peek();
            movements();
            System.out.println();
        }
         */



    }


