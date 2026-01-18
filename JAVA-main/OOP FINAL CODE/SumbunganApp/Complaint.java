package SumbunganApp;

public class Complaint {
    private static int counter = 1000;
    private int id;
    private String category;
    private String description;
    private String location;
    private String date;
    private String status;
    private String department;
    private User citizen;
    private String remarks;
    private String feedback;

    public Complaint(String category, String description, String location, String date, User citizen) {
        this.id = counter++;
        this.category = category;
        this.description = description;
        this.location = location;
        this.date = date;
        this.status = "SUBMITTED";
        this.department = assignDepartment(category);
        this.citizen = citizen;
        this.remarks = "";
        this.feedback = "";
    }

    private String assignDepartment(String category) {
        switch (category.toLowerCase()) {
            case "infrastructure": return "Engineering Department";
            case "sanitation": return "Sanitation Department";
            case "safety & security": return "Police Department";
            case "utilities": return "Public Works Department";
            case "environment": return "Environment Department";
            case "barangay concerns": return "Barangay Affairs";
            default: return "General";
        }
    }

    public int getId() { 
        return id; 
    }

    public String getStatus() { 
        return status; 
    }

    public User getCitizen() { 
        return citizen; 
    }

    public void setStatus(String status) { 
        this.status = status; 
    }

    public void setRemarks(String remarks) { 
        this.remarks = remarks; 
    }

    public void setFeedback(String feedback) {
         this.feedback = feedback; 
    }

    public void setDepartment(String department) {
    this.department = department;
}

   public String getCategory() { return category; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }
    public String getDate() { return date; }
    public String getFeedback() { return feedback; }
    public String getRemarks() { return remarks; }
     public String getDepartment() { return department; }


    public void displayDetails() {
        System.out.println("\nComplaint ID: " + id);
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Status: " + status);
        System.out.println("Department: " + department);
        System.out.println("Remarks: " + remarks);
        System.out.println("-------------------------------------------");
    }
}
