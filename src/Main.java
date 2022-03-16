public class Main {
    public static void main(String[] args) {
        ArrayFigures array = new ArrayFigures();
                array.addfigure(new Rectangle(20,50));
                array.addfigure(new Triangle(30,50,70));
                array.addfigure(new Circle(50));
                array.addfigure(new Square(20));
                array.addfigure(new Trapeze(15,30,20,10));
                array.addfigure(new Rhomb(40,60));
                array.showfigure();
    }
}
