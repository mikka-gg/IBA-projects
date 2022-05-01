package by.iba.gomel.five.level;

/**
 * This class has static members to directly access them
 */
public class StaticMembers {
    public static final int    TEMP_CONST = 25;
    public static final int    NUMBER_TWO = 2;
    public static final String NAME_CONST = "Name";

    /**
     * Constructor
     */
    StaticMembers() {

    }

    /**
     * Returns Full + Name
     *
     * @return a string variable
     */
    public static String fullName() {
        return "Full " + StaticMembers.NAME_CONST;
    }

    /**
     * Returns 27
     *
     * @return an integer variable
     */
    public static int riseTemp() {
        return StaticMembers.TEMP_CONST + StaticMembers.NUMBER_TWO;
    }
}
