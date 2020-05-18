package examples.pltw.virtualplanner.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */

// @author: Akamai Wong
// @ Date: 18 May, 2020
// @ Update 1
public class LoggedInUser {

    private String userId;
    private String displayName;

    public LoggedInUser(String userId, String displayName) {
        this.userId = userId;
        this.displayName = displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
}
