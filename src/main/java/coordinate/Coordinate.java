package coordinate;

public class Coordinate {
    private int abscisse;
    private int ordonnee;

    //Constructeur
    public Coordinate(int abscisse, int ordonnee){
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public int getAbscisse(){
        return abscisse;
    }

    public int getOrdonnee(){
        return ordonnee;
    }

}
