public class Rhomb extends Figures {

    private String FigureName = "Rhomb";

    private int side,height;

    public Rhomb(int side, int height){ this.side = side; this.height = height;}
    public void getFigureName() {System.out.println(FigureName + ' ' + this.side + ' ' + this.height);}
}
