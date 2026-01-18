package SumbunganApp;

import java.util.*;

public class AdminPortal {
    private Output outputt = new Output();
    private Scanner cs;
    private LinkedList<Complaint> complaints;
    private List<Admin> admins = new ArrayList<>();

    public AdminPortal(Scanner sc, LinkedList<Complaint> complaints) {
        this.cs = sc;
        this.complaints = complaints;

   
        admins.add(new Admin("Cypress Ferrer", "cferrer@gov.ph", "cypress", "1234", "All Departments"));
        admins.add(new Admin("Jecyn Vallirie Turbanos", "jmturbanos@gov.ph", "valiwri", "valiri", "All Departments"));
        admins.add(new Admin("Jeremy San Juan", "jsanjuan@gov.ph", "jeremy", "jemy", "All Departments"));
        admins.add(new Admin("Justine Fernando Sangil", "jsangil@gov.ph", "justine", "leader", "All Departments"));
    }

  
    public Admin loginAdmin() {
        System.out.print("\nAdmin Username: ");
        String uname = cs.nextLine();
        System.out.print("Admin Password: ");
        String pass = cs.nextLine();

        for (Admin a : admins) {
            if (a.getUsername().equals(uname) && a.getPassword().equals(pass)) {
                System.out.println("\nLogin successful! Welcome, " + a.getName() + " (" + a.getDepartmentAccess() + ")");
                return a;
            }
        }

        System.out.println(" Invalid admin credentials!");
        return null;
    }


    public void adminMenu(Admin admin) {
        if (admin == null) return;

        while (true) {
            outputt.Dashboard();
            System.out.print("Choice: ");
            int ch;

            try {
                ch = cs.nextInt();
                cs.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                cs.nextLine();
                continue;
            }

            switch (ch) {
                case 1 -> viewNewComplaints();
                case 2 -> updateComplaintStatus();
                case 3 -> viewStats();
                case 4 -> {
                    System.out.println("Logging out... Goodbye, " + admin.getName() + "!");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

 
    private void viewNewComplaints() {
        System.out.println("\n=== New Complaints ===");
        boolean found = false;

        for (Complaint c : complaints) {
            if (c.getStatus().equalsIgnoreCase("SUBMITTED")) {
                c.displayDetails();
                found = true;
            }
        }

        if (!found)
            System.out.println("No new complaints at the moment.");
    }

    
    private void updateComplaintStatus() {
        System.out.print("Enter Complaint ID: ");
        int id = cs.nextInt();
        cs.nextLine();

        for (Complaint c : complaints) {
            if (c.getId() == id) {
                System.out.println("\n--- Complaint Found ---");
                c.displayDetails();
                System.out.println("Current Status: " + c.getStatus());
                System.out.print("Enter new status (IN_REVIEW / RESOLVED / REJECTED): ");
                String newStatus = cs.nextLine().trim().toUpperCase();

                if (!newStatus.equals("IN_REVIEW") && !newStatus.equals("RESOLVED") && !newStatus.equals("REJECTED")) {
                    System.out.println("Invalid status! Please choose only from: IN_REVIEW, RESOLVED, REJECTED.");
                    return;
                }

                c.setStatus(newStatus);
                System.out.print("Add Remarks: ");
                c.setRemarks(cs.nextLine());
                System.out.println("Complaint updated successfully!");
                return;
            }
        }

        System.out.println("Complaint not found!");
    }

    // View statistical summary of complaints
    private void viewStats() {
        long total = complaints.size();
        long submitted = complaints.stream().filter(c -> c.getStatus().equalsIgnoreCase("SUBMITTED")).count();
        long inReview = complaints.stream().filter(c -> c.getStatus().equalsIgnoreCase("IN_REVIEW")).count();
        long resolved = complaints.stream().filter(c -> c.getStatus().equalsIgnoreCase("RESOLVED")).count();
        long rejected = complaints.stream().filter(c -> c.getStatus().equalsIgnoreCase("REJECTED")).count();

        System.out.println("\n--- Complaint Statistics ---");
        System.out.println("Total Complaints: " + total);
        System.out.println("Submitted: " + submitted);
        System.out.println("In Review: " + inReview);
        System.out.println("Resolved: " + resolved);
        System.out.println("Rejected: " + rejected);
        System.out.println("-------------------------------");
    }
}
