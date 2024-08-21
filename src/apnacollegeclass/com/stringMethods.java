package apnacollegeclass.com;

import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {
        String name = "    Krishnendu   ";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring );
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String trimmedstring = name.trim();
        System.out.println(trimmedstring);
        String substring = name.substring(7);
        System.out.println(substring );
        String substring2 = name.substring(7,10);
        System.out.println(substring2);
        String replace = name.replace('n','p');
        System.out.println(replace);
        String replace2 = name.replace("nendu","na");
        System.out.println(replace2 );
        char at7 = name.charAt(7);
        System.out.println(at7);
    }
}
