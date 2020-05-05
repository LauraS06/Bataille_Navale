package boat;

import coordinate.Coordinate;
import coordinate.Direction;

import java.util.ArrayList;
import java.util.List;

public class Boat {

    private List<Coordinate> coordinate = new ArrayList<>();
    private int size;

    public Boat(Coordinate abscisse, int size, Direction direction) {
        this.coordinate.add(abscisse);
        this.size = size;
        setCoordinate(direction);
    }
    private void setCoordinate (Direction direction){
        int positionAbscisse = this.coordinate.get(0).getAbscisse();
        int positionOrdonnee = this.coordinate.get(0).getOrdonnee();

        for (int i = 1; i < this.size; i++) {
            if (direction === "NORD") {
                this.coordinate.add(new Coordinate(positionAbscisse, positionOrdonnee + 1));
            }
        }

    }


}

