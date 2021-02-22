package csc4700;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberDemo {

    public boolean isValid(String phoneNumber) {

        if (phoneNumber == null) {
            throw new IllegalArgumentException();
        }

        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

}
