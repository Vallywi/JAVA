package SumbunganApp;

public class User extends Person{
    private int nationalId;
    private String contact;
    private String address;

    public User(String name, int nationalId, String email, String contact, String Address, String username, String password){
        super(name, email, username, password);
        this.nationalId = nationalId;
        this.contact = contact;
        this.address = Address;
    }

    public int getNationalId(){
        return nationalId;
    }

    public void setNationalId(int newNationalId){
        this.nationalId = newNationalId;
    }

    public String getContact(){
        return contact;
    }

    public void setContact(String newContact){
        this.contact = newContact;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

}
