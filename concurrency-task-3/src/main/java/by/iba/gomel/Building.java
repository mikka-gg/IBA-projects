package by.iba.gomel;

/**
 * This class contains number of builded floors, max floor is 10.
 */
public class Building {
    private static final int EIGHT     = 8;
    private static final int MAX_FLOOR = 10;
    private int              floorsBuilded;

    /**
     * Default constructor.
     */
    public Building() {
        this.floorsBuilded = 0;
    }

    public int getFloorsBuilded() {
        return this.floorsBuilded;
    }

    public void setFloorsBuilded(int floorsBuilded) {
        if (this.floorsBuilded < Building.EIGHT) {
            this.floorsBuilded += floorsBuilded;
        } else {
            while (floorsBuilded != 0) {
                if (this.floorsBuilded == Building.MAX_FLOOR) {
                    break;
                }
                this.floorsBuilded++;
                floorsBuilded--;
            }
        }
    }

}
