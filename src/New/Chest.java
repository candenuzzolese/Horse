package New;

public class Chest {

    Horse horse;
    Position board [][];


    //copie lo del otro tp para ver q onda
/*
        board = new Position[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Position(i, j);
            }
        }
        currentPosition = board[0][0];
        stacks = new StaticStack[n];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new StaticStack<>();
        }
        currentStack = 0;
        previousPositions = new ArrayList<>();
    }


 */
    public Chest (int n, Horse horse) {
        this.horse = horse;

        board = new Position[8][8];
         for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Position(i, j);
            }
        }
        horse.setCurrentPosition (board[0][0]);

}

    }
