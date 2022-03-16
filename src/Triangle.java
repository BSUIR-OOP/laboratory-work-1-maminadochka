public class Triangle extends Figures {

    private String FigureName = "Triangle";

    private int side1,side2,side3;

    public Triangle(int side1, int side2, int side3){ this.side1 = side1; this.side2 = side2; this.side3 = side3;}

    public void getFigureName() { System.out.println(String.format(FigureName + ' ' + this.side1 + ' ' + this.side2 + ' ' + this.side3));}
}
