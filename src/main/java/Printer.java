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
}
