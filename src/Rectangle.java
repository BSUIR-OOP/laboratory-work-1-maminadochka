public class Rectangle extends Figures {

    private String FigureName = "Rectangle";

    private int width, height;

    public Rectangle(int width, int height){this.width = width; this.height = height;}
    public void getFigureName() { System.out.println(String.format(FigureName + ' ' + this.width + ' ' + this.height));}
}
