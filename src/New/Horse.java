package New;

import java.util.ArrayList;

public class Horse {

    private Position currentPosition;
    private ArrayList<Position> possiblePosition = new ArrayList<> (  );

    public Horse(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    void availableMovements(){
        possiblePosition.add ( new Position ( 1,-1 ) );
        possiblePosition.add ( new Position ( -1,1 ) );
        possiblePosition.add ( new Position ( -1,-1 ) );
        possiblePosition.add ( new Position ( 1,1 ) );
        possiblePosition.add ( new Position ( 1,1 ) );
        possiblePosition.add ( new Position ( 2,1 ) );
        possiblePosition.add ( new Position ( -2,1 ) );
        possiblePosition.add ( new Position ( 2,-1 ) );
    }


    public Position getCurrentPosition() {
        return currentPosition;
    }

    public ArrayList<Position> getPossiblePosition() {
        return possiblePosition;
    }



}
