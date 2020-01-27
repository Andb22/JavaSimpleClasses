public class Printer {

    private int paperSheets;
//    private int pages;
//    private int copies;
    private int toner;

    public Printer(int paperSheets, int toner) {
        this.paperSheets = paperSheets;
        this.toner = toner;
    }

    public int sheetsLeft() {
        return this.paperSheets;
    }

    public String print(int pages, int copies) {
        int printTotal = (pages * copies);
        if (printTotal < this.paperSheets) {
            this.paperSheets -= printTotal;
            this.toner -= printTotal;
            return ("Sheets printed :" + printTotal);
        } else {
            return "The printer does not have enough paper";
        }
    }
    public int getToner() {
        return this.toner;
    }
}
