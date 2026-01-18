package SumbunganApp;

public class Admin extends Person {
    private String departmentAccess;

    public Admin(String fullName, String email, String username, String password, String departmentAccess) {
        super(fullName, email, username, password);
        this.departmentAccess = departmentAccess;
    }

    public String getDepartmentAccess() {
        return departmentAccess;
    }

    public void setDepartmentAccess(String departmentAccess) {
        this.departmentAccess = departmentAccess;
    }

    public void displayInfo() {
        System.out.println("Admin Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Username: " + getUsername());
        System.out.println("Department Access: " + departmentAccess);
    }
}
