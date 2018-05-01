public class Printer {
    private int paper;
    private int toner;

//    can use command + n to create constructor

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

    public void print(int pages, int copies){
        int total = pages * copies;
        if ((total <= this.paper) && (this.toner >= 1)){
            this.paper -= total;
            this.toner -= total;
        }

    }

    public int refill(int newpaper){
       return this.paper += newpaper;
    }
}
