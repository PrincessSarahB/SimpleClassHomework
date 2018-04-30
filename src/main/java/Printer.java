public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
       return this.paper;
    }

    public int getToner(){
        return this.toner;
    }

    public int print(int pages, int copies){
        return pages * copies;
    }

    public void canPrint(int pages, int copies) {
        int total = pages * copies;
        if ((this.paper >= total) && (this.toner >= 1)){
            this.paper -= total;
            this.toner -= total;
        }

    }

    public int refill(int newpaper){
       return this.paper += newpaper;
    }
}
