package SumbunganApp;

public class Person {
    private String name;
    private String email;
    private String username;
    private String password;

    public Person(String name,String email,String username, String password){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getEmail(){
        return email;
    }
    
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public void updateProfile(String name, String email, String username, String password){
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public void displayInfo() {
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }
}
