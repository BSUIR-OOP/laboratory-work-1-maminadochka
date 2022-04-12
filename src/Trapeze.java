public class Trapeze extends Figure {

    private String FigureName = "Trapeze";

    private int side1,side2,side3,side4;

    public Trapeze(int side1, int side2, int side3, int side4){this.side1 = side1; this.side2 = side2; this.side3 = side3; this.side4 = side4;}
    public void getFigureName() {System.out.println(String.format(FigureName + ' ' + this.side1 + ' ' + this.side2 + ' ' + this.side3 + ' ' + this.side4));}
}
