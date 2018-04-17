package aaron.classes;


/**
 * @author Aaron
 * Extracted code from other people's files
 */
public class PasswordChecker {
    public static boolean validate(String email, String challengePassword){
//        Perhaps aaron.classes.details is wrong version?
        String actualPassword = Details.users.get(Details.users.get(email));

        if(challengePassword.equals(actualPassword)) {
            // correct password
            return true;
        } else {
            // incorrect
            return false;
        }
    }
}
