public class Circle extends Figures {

    private String FigureName = "Circle";

    private int radius;
    public Circle(int radius) {this.radius = radius;}

    public void getFigureName() { System.out.println(String.format(FigureName + ' ' + this.radius));}
}

