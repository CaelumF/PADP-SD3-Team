package aaron.classes;


/**
 * @author Aaron
 * Extracted code from other people's files
 */
public class PasswordValidator {
    static boolean validate(String challengePassword){
        //Perhaps aaron.classes.details is wrong version?
        String actualPassword = Details.users.get(Details.pin);

        if(challengePassword.equals(actualPassword)) {
            // correct password
        } else {
            // incorrect
        }

    }
}
