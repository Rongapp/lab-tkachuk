package tkachuk.automationScenaries;

public class User {

     private String email;
     private String passwd;
     private String guestTitle;
     private String authorizedTitle;
     private String authorizedUsername;
     private String phone;


    public User() {
        this.email = "qwttyqww22@qortu.com";
        this.passwd = "qwerty";
        this.guestTitle = "Login - My Store";
        this.authorizedTitle = "My account - My Store";
        this.authorizedUsername = "Dmytro Tkachuk";
        this.phone = "050957238572";
    }

    public String getEmail() {
        return email;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getGuestTitle() {
        return guestTitle;
    }

    public String getAuthorizedTitle() {
        return authorizedTitle;
    }

    public String getAuthorizedUsername() {
        return authorizedUsername;
    }

    public String getPhone() {
        return phone;
    }
}
