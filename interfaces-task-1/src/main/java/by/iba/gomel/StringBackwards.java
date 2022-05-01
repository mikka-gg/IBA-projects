package by.iba.gomel;

/**
 * This class implements 'CharSequence' to use its methods to reverse a string variable.
 */
public class StringBackwards implements CharSequence {
    private String string;

    /**
     * Constructor with default value.
     */
    public StringBackwards() {
        this.string = "defaultValueOfString";
    }

    /**
     * Returns the char value of the string at the specified index.
     */
    @Override
    public char charAt(final int arg0) {
        return this.string.charAt(arg0);
    }

    /**
     * Returns the length of the string.
     */
    @Override
    public int length() {
        return this.string.length();
    }

    /**
     * This method takes a string variable, assigns it to 'string' field, and using 'charAt' and
     * 'length' methods, StringBuilder reverses chars in the string.
     *
     * @param string
     *            - word or text to reverse
     * @return reversed string
     */
    public String reversingString(final String string) {
        this.string = string;
        final StringBuilder sb = new StringBuilder();

        for (int i = this.length() - 1; i >= 0; i--) {
            sb.append(this.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Not using.
     */
    @Override
    public CharSequence subSequence(final int arg0, final int arg1) {
        return null;
    }
}
