package csc4700;

/**
 * Created by jdob on 2/22/15.
 */
public class StringsDemo {

    public String reverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    public boolean isPalindrome(String s) {
        String reversed = reverse(s);
        if (reversed.equals(s)) {
            return true;
        }
        else {
            return false;
        }
    }

}
