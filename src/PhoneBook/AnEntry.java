package PhoneBook;

public class AnEntry {
    private String name;
    private String address;
    private String telephone;
    private String email;

    public AnEntry(String name, String address, String telephone, String email) {
        this.name=name;
        this.address=address;
        this.telephone=telephone;
        this.email=email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s
                Address: %s
                Telephone: %s
                Email: %s
                """,name,address,telephone,email);
    }
}
