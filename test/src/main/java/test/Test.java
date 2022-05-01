package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(final String[] args) {
        final String jc = "javachamp_champ2012champ";
        final Pattern p = Pattern.compile(".{4}c+(m)*"); // line 1
        final Matcher m = p.matcher(jc);
        while (m.find()) {
            System.out.println(m.start());
        }
    }

}
