public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public boolean print(int pages, int copies){
        int totalPaper = pages * copies;
        if (this.paper >= totalPaper){
            this.paper -= totalPaper;
            this.toner -= totalPaper;
            return true;
        }
        return false;
    }
}
