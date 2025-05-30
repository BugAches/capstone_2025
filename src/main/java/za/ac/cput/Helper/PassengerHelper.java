package za.ac.cput.Helper;

/*  PassengerHelper.java
    Passenger Helper class
    Author: Kelsey-Jane Fabe (220328293)
    Date: 15/05/2025
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassengerHelper {
    //method checks if given string is null or empty
    public static boolean isNullOrEmpty(String str) {
        if(str.isEmpty() || str == null) {
            return true; //returns true if null or empty
        }
        return false; //returns false if not null nor empty
    }

    //check if email is valid
    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) {
            System.out.println("Email is null or empty");
            return false;
        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);

        //returns true if email matches pattern
        boolean isNotValid = m.matches();
        System.out.println("Email: " + email + " is not valid. Try again");
        return isNotValid;

    }
}
