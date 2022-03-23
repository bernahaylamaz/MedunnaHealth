package pojos;

public class User_Patient_info {

//    {
//        "createdBy": "anonymousUser",
//            "createdDate": "2022-01-01T17:44:48.579065Z",
//            "id": 4379,
//            "login": "patient44",
//            "firstName": "patient44",
//            "lastName": "patient44",
//            "email": "patient44@qa.team",
//            "activated": true,
//            "langKey": "en",
//            "imageUrl": null,
//            "resetDate": null,
//            "ssn": "888-33-4444"
//    },

    private boolean activated;
    private String login;
    private int ssn;

    public User_Patient_info() {
    }

    public User_Patient_info(boolean activated, String login, int ssn) {
        this.activated = activated;
        this.login = login;
        this.ssn = ssn;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User_Patient_info{" +
                "activated=" + activated +
                ", login='" + login + '\'' +
                ", ssn=" + ssn +
                '}';
    }
}
