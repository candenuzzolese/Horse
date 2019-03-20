package New;

import java.util.ArrayList;

public class Horse {

    private Position currentPosition; //posicion actual
    private ArrayList<Position> possiblePosition = new ArrayList<> (  ); // posibles movimientos aceptados

    public Horse(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    //posibles movimientos lleno

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


    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setPossiblePosition(ArrayList<Position> possiblePosition) {
        this.possiblePosition = possiblePosition;
    }
}
