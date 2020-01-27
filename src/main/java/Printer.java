public class Printer {

    private int paperSheets;
    private int pages;
    private int copies;

    public Printer(int paperSheets) {
        this.paperSheets = paperSheets;
    }

    public int sheetsLeft() {
        return this.paperSheets;
    }

    public String print(int pages, int copies) {
        int printTotal = (pages * copies);
        if (printTotal < this.paperSheets) {
            this.paperSheets -= printTotal;
            return ("Sheets printed :" + printTotal);
        } else {
            return "The printer does not have enough paper";
        }
    }
}
