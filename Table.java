
public class Table extends Restaurant {

    public int numberTable;
    public boolean isAvailable = true;

    public Table(int numberTable) {
        this.numberTable = numberTable;
    }

    public int getNumberTable() {
        return numberTable;
    }

    public int checkAvailableTables() {
        return this.availableTables;
    }

}
