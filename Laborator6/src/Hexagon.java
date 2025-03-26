import static java.lang.Math.sqrt;

public class Hexagon {
    private int latura;

    public Hexagon (int latura){
        this.latura = latura;
    }

    public double getPerimetru(int latura){
        
        double perimetru = latura*6;
        return perimetru;
    }

    public double getArie(int latura){
        double aria;
        aria = (3*sqrt(3)*latura*latura)/2;
        return aria;
    }

    @Override
    public String toString(){
        return "Hexagonul are latura " + latura +
                " si perimetrul " + getPerimetru(latura)
                + " si aria " + getArie(latura);

    }
}
