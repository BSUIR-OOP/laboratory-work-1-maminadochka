public class Square extends Figures {

    private String FigureName = "Square";

    private int side;

    public Square(int side){ this.side = side;}

    public void getFigureName() {
        System.out.println(String.format(FigureName + ' ' + this.side));
    }
}
