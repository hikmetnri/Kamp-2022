package Day3.Homeworks;

public class Person extends  Customer{
    private String firstname;
    private String lastname;
    private String NationaIdentity;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationaIdentity() {
        return NationaIdentity;
    }

    public void setNationaIdentity(String nationaIdentity) {
        NationaIdentity = nationaIdentity;
    }
}
