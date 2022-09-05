public class Printer {

    private int paper;

    public Printer(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return paper;
    }

    public boolean print(int pages, int copies){
        if (this.paper >= pages * copies){
            this.paper -= (pages * copies);
            return true;
        }
        return false;
    }
}
