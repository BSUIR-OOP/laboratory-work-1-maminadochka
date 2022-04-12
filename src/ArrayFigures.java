public class ArrayFigures {

    private Figures[] list = new Figures[10];
    private int count;

    public ArrayFigures(){
    }

    public void showfigure(){
        for(int i = 0; i < this.count; ++i) {
            this.list[i].getFigureName();
        }
    }

    public void addfigure(Figures shape) {
        if (count == list.length) {
            System.out.println("Error!");
        }
        else {
            this.list[count] = shape;
            count++;
        }
    }
}
