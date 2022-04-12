import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Rectangle(20,50));
        figures.add(new Triangle(30,50,70));
        figures.add(new Circle(50));
        figures.add(new Trapeze(15,30,20,10));
        figures.add(new Square(20));
        figures.add(new Rhomb(40,60));

        for(Figure figure: figures) {
        }
            figure.getFigureName();
    }
}
