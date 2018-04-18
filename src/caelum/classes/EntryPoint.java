package caelum.classes;

import aaron.classes.LoginMenu;
import stephen.classes.PersonalAndCreditDetails;

/**
 * @author PADP SD3 Team 2/B:
 * Caelum,
 * Stephen,
 * Sherin.
 * Aaron,
 * Luke
 */
public class EntryPoint {
    public static void main(String[] args) {
        LoginMenu.main();
        boolean returningBike = new UserQuery<Boolean>("Have you logged in to return a bike? yes/no")
                .query(s -> s.matches("[Yy]"),
                        s -> true,
                        s -> "If input is invalid this just assumes no, so how did you fail???");
        if (returningBike) {
            BikeManager.returnBike(LoginMenu.email);
        } else {
            boolean toppingUp = new UserQuery<Boolean>("Have you logged in to top up? yes/no")
                    .query(s -> s.matches("[Yy]"),
                            s -> true,
                            s -> "If input is invalid this just assumes no, so how did you fail???");
            if (toppingUp) {
                PersonalAndCreditDetails.getCreditDetails();
            } else {
                boolean reporting = new UserQuery<Boolean>("Are there damages to report?")
                        .query(s -> s.matches("[Yy]"),
                                s -> true,
                                s -> "If input is invalid this just assumes no, so how did you fail???");
                if (reporting) {
                    BikeManager.appendFault();
                } else {
                    sherin.classes.Bike.getBike();
                }
            }
        }
    }
}
