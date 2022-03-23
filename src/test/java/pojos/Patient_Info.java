package pojos;

public class Patient_Info {
    //    lastName*	string
//    phone*	string
//    ssn*
    private String firstName;
    private String lastname;
    private String phone;
    private String ssn;
    private User_Patient_info user;

    public Patient_Info() {
    }

    public Patient_Info(String firstName, String lastname, String phone, String ssn, User_Patient_info user) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.phone = phone;
        this.ssn = ssn;
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public User_Patient_info getUser() {
        return user;
    }

    public void setUser(User_Patient_info user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Patient_Info{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", ssn='" + ssn + '\'' +
                ", user=" + user +
                '}';
    }
}