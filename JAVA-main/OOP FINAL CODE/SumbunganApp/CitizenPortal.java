package SumbunganApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CitizenPortal {
    Scanner cs = new Scanner(System.in);
    Output outputt = new Output();
    LinkedList<User> citizen = new LinkedList<>();
    LinkedList<Complaint> complaints = new LinkedList<>();
    int national;
    int choice, choice1;
    String category = "";
    String department = "";

    public CitizenPortal(Scanner cs, LinkedList<User> citizen, LinkedList<Complaint> complaints){
        this.cs =cs;
        this.citizen = citizen;
        this.complaints = complaints;
    }


    public void registrationCitizens() {
        System.out.println("\n======== Citizen Registration ==========\n");

        System.out.print("Enter your full name: ");
        String name = cs.nextLine();

        System.out.print("National ID#: ");
        try {
            national = cs.nextInt();
            cs.nextLine();
        } catch (InputMismatchException e) {
            System.out.println(" Invalid input! Please enter a numeric National ID.\n");
            cs.nextLine(); 
            return;
        }



        System.out.print("Contact Number: ");
        String num = cs.nextLine();
        System.out.print("Email: ");
        String email = cs.nextLine();
        System.out.print("Address: ");
        String address = cs.nextLine();
        System.out.print("Create a username: ");
        String username = cs.nextLine();
        System.out.print("Create a password: ");
        String password = cs.nextLine();
        System.out.print("Re-enter your password: ");
        String password1 = cs.nextLine();

        if (password.equals(password1)) {
            System.out.println("Password confirmed!");
            citizen.add(new User(name, national, num, email, address, username, password1));
            saveCitizensToFile();
            System.out.println("Hello Mr/Ms. " + name + "! Your information has been added successfully!");
        } else {
            System.out.println("Passwords do not match. Please try again!");
        }
    }


    public User citizenLoggedIn() {
        System.out.print("\nUsername: ");
        String username = cs.nextLine();
        System.out.print("Enter the Password: ");
        String pass = cs.nextLine();

        for (User s : citizen) {
            if (s.getUsername().equals(username) && s.getPassword().equals(pass)) {
                System.out.println("Login Successful! Welcome, " + s.getName() + "!");
                return s;
            }
        }
        System.out.println("Invalid credentials, try again!");
        return null;
    }

 
    public void citizenMenu(User user) {
        while (true) {
            outputt.choice2();
            System.out.print("Enter a choice: ");
            try {
                choice = cs.nextInt();
                cs.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(" Invalid input! Please enter a number.");
                cs.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> fileComplaint(user);
                case 2 -> trackComplaint();
                case 3 -> viewComplaintHistory(user);
                case 4 -> provideFeedback(user);
                case 5 -> updateProfile(user);
                case 6 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }


    public void fileComplaint(User user) {
        outputt.Catergories1();
        System.out.print("Select a Category: ");
        choice1 = cs.nextInt();

    
        if (choice1 == 7) {
            outputt.Catergories2();
            System.out.print("Select a Category: ");
            choice1 = cs.nextInt();
        }
        cs.nextLine(); 

        switch (choice1) {
            case 1 -> { category = "Infrastructure"; department = "Engineering Department"; }
            case 2 -> { category = "Sanitation"; department = "Sanitation Department"; }
            case 3 -> { category = "Safety & Security"; department = "Police Department"; }
            case 4 -> { category = "Utilities"; department = "Public Works Department"; }
            case 5 -> { category = "Environment"; department = "Environment Department"; }
            case 6 -> { category = "Barangay Concerns"; department = "Barangay Affairs"; }
            default -> {
                System.out.println("Invalid choice. Complaint canceled.");
                return;
            }
        }

        System.out.println("\nYou selected: " + category);
        System.out.println("Target Department: " + department);

        System.out.print("\nEnter Description: ");
        String desc = cs.nextLine();
        System.out.print("Enter Location: ");
        String loc = cs.nextLine();
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = cs.nextLine();

         Complaint complaint = new Complaint(category, desc, loc, date, user);
        complaints.add(complaint);
        saveComplaintsToFile();

        System.out.println("\nComplaint submitted successfully!");
        System.out.println("Reference ID: " + complaint.getId());
    }

        public void trackComplaint() {
        System.out.print("\nEnter Complaint ID: ");
        int id = cs.nextInt(); cs.nextLine();

        for (Complaint c : complaints) {
            if (c.getId() == id) {
                c.displayDetails();
                return;
            }
        }
        System.out.println("Complaint not found!");
    }

     private void viewComplaintHistory(User user) {
        System.out.println("\n=== Complaint History ===");
        for (Complaint c : complaints) {
            if (c.getCitizen().equals(user)) c.displayDetails();
        }
    }

    private void provideFeedback(User user) {
        System.out.print("Enter Complaint ID to rate: ");
        int id = cs.nextInt(); cs.nextLine();

        for (Complaint c : complaints) {
            if (c.getId() == id && c.getCitizen().equals(user) && c.getStatus().equals("RESOLVED")) {
                System.out.print("Rate (1–5 stars): ");
                String rate = cs.nextLine();
                System.out.print("Comment: ");
                String com = cs.nextLine();
                c.setFeedback(rate + " stars – " + com);
                System.out.println("Feedback recorded. Thank you!");
                return;
            }
        }
        System.out.println("Complaint not resolved or not found!");
    }

    private void updateProfile(User u) {
        System.out.print("New Full Name: ");
        String fn = cs.nextLine();
        System.out.print("New Email: ");
        String email = cs.nextLine();
        System.out.print("Enter a new Username: ");
        String username = cs.nextLine();
        System.out.print("New Password: ");
        String pass = cs.nextLine();
        u.updateProfile(fn, email, username, pass);
        System.out.println("Profile updated successfully!");
    }


    
private final String CITIZENS_FILE = "citizens.txt";
private final String COMPLAINTS_FILE = "complaints.txt";


public void saveCitizensToFile() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(CITIZENS_FILE))) {
        for (User u : citizen) {
            bw.write(u.getName() + "," + u.getNationalId() + "," + u.getEmail() + "," +
                     u.getContact() + "," + u.getAddress() + "," + u.getUsername() + "," +
                     u.getPassword());
            bw.newLine();
        }
    } catch (IOException e) {
        System.out.println("Error saving citizens: " + e.getMessage());
    }
}


public void loadCitizensFromFile() {
    File file = new File(CITIZENS_FILE);
    if (!file.exists()) return;
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            if (d.length == 7) {
                citizen.add(new User(d[0], Integer.parseInt(d[1]), d[2], d[3], d[4], d[5], d[6]));
            }
        }
    } catch (IOException e) {
        System.out.println("Error loading citizens: " + e.getMessage());
    }
}

public void saveComplaintsToFile() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(COMPLAINTS_FILE))) {
        for (Complaint c : complaints) {
            bw.write(
                c.getId() + "," +
                c.getCitizen().getUsername() + "," +
                c.getStatus() + "," +
                c.getFeedback() + "," +
                c.getRemarks() + "," +
                c.getCategory() + "," +
                c.getDescription() + "," +
                c.getLocation() + "," +
                c.getDate() + "," +
                c.getDepartment()
            );
            bw.newLine();
        }
    } catch (IOException e) {
        System.out.println("Error saving complaints: " + e.getMessage());
    }
}



public void loadComplaintsFromFile() {
        File file = new File(COMPLAINTS_FILE);
        if (!file.exists()) return;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if (d.length >= 10) {
                    for (User u : citizen) {
                        if (u.getUsername().equals(d[1])) {
                            Complaint c = new Complaint(d[5], d[6], d[7], d[8], u);
                            c.setStatus(d[2]);
                            c.setFeedback(d[3]);
                            c.setRemarks(d[4]);
                            c.setDepartment(d[9]);
                            complaints.add(c);
                            break;
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading complaints: " + e.getMessage());
        }
    }

}
