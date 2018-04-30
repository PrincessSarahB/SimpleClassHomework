public class Printer {
    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int getPaper(){
       return this.paper = paper;
    }

    public int print(int pages, int copies){
        return pages * copies;
    }

    public int canPrint(int pages, int copies) {
        int total = pages * copies;
        if (this.paper >= total) {
            this.paper -= total;
        }
        return this.paper;
    }

    public int refill(int newpaper){
       return this.paper += newpaper;
    }
}
