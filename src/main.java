
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("\n--- Lab Management System Menu ---");
            System.out.println("1.  Add Chemist");
            System.out.println("2.  Add Equipment");
            System.out.println("3.  Add Project");
            System.out.println("4.  Add Assignment");
            System.out.println("5.  Get Chemist by SSN");
            System.out.println("6.  Get Equipment by Serial No");
            System.out.println("7.  Get Project by ID");
            System.out.println("8.  Get Assignment by ID");
            System.out.println("9.  Update Chemist");
            System.out.println("10. Update Equipment");
            System.out.println("11. Update Project");
            System.out.println("12. Update Assignment");
            System.out.println("13. Delete Chemist");
            System.out.println("14. Delete Equipment");
            System.out.println("15. Delete Project");
            System.out.println("16. Delete Assignment");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1: // Add Chemist
                        System.out.print("Enter SSN: ");
                        String ssn = sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Phone No: ");
                        String phoneNo = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter Address: ");
                        String address = sc.nextLine();

                        Chemist chemist = new Chemist(ssn, name, phoneNo, age, address);
                        DB.addChemist(chemist);
                        System.out.println("Chemist added successfully.");
                        break;

                    case 2: // Add Equipment
                        System.out.print("Enter Serial No: ");
                        String serialNo = sc.nextLine();
                        System.out.print("Enter Cost: ");
                        double cost = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter Type: ");
                        String type = sc.nextLine();
                        System.out.print("Is Available (true/false): ");
                        boolean isAvailable = sc.nextBoolean();

                        Equipment equipment = new Equipment(serialNo, cost, type, isAvailable);
                        DB.addEquipment(equipment);
                        System.out.println("Equipment added successfully.");
                        break;

                    case 3: // Add Project
                        System.out.print("Enter Project Name: ");
                        String projectName = sc.nextLine();
                        System.out.print("Enter Start Date (yyyy-MM-dd): ");
                        Date startDate = sdf.parse(sc.nextLine());

                        Project project = new Project(projectName, startDate);
                        DB.addProject(project);
                        System.out.println("Project added successfully.");
                        break;

                    case 4: // Add Assignment
                        System.out.print("Enter Assignment Date (yyyy-MM-dd): ");
                        Date assignDate = sdf.parse(sc.nextLine());
                        System.out.print("Enter Total Hours: ");
                        double totalHours = sc.nextDouble();
                        System.out.print("Enter Average Hours: ");
                        double averageHours = sc.nextDouble();

                        Assignment assignment = new Assignment(assignDate, totalHours, averageHours);
                        DB.addAssignment(assignment);
                        System.out.println("Assignment added successfully.");
                        break;

                    case 5: // Get Chemist by SSN
                        System.out.print("Enter SSN: ");
                        String ssnToFetch = sc.nextLine();
                        Chemist fetchedChemist = DB.getChemistByssn(ssnToFetch);
                        if (fetchedChemist != null) {
                            System.out.println(fetchedChemist);
                        } else {
                            System.out.println("Chemist not found.");
                        }
                        break;

                    case 6: // Get Equipment by Serial No
                        System.out.print("Enter Serial No: ");
                        String serialNoToFetch = sc.nextLine();
                        Equipment fetchedEquipment = DB.getEquipmentBySerialNo(serialNoToFetch);
                        if (fetchedEquipment != null) {
                            System.out.println(fetchedEquipment);
                        } else {
                            System.out.println("Equipment not found.");
                        }
                        break;

                    case 7: // Get Project by ID
                        System.out.print("Enter Project ID: ");
                        int projectIdToFetch = sc.nextInt();
                        Project fetchedProject = DB.getProjectById(projectIdToFetch);
                        if (fetchedProject != null) {
                            System.out.println(fetchedProject);
                        } else {
                            System.out.println("Project not found.");
                        }
                        break;

                    case 8: // Get Assignment by ID
                        System.out.print("Enter Assignment ID: ");
                        int assignmentIdToFetch = sc.nextInt();
                        Assignment fetchedAssignment = DB.getAssignmentById(assignmentIdToFetch);
                        if (fetchedAssignment != null) {
                            System.out.println(fetchedAssignment);
                        } else {
                            System.out.println("Assignment not found.");
                        }
                        break;

                    case 9: // Update Chemist
                        System.out.print("Enter SSN to update: ");
                        String ssnToUpdate = sc.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter New Phone No: ");
                        String newPhoneNo = sc.nextLine();
                        System.out.print("Enter New Age: ");
                        int newAge = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter New Address: ");
                        String newAddress = sc.nextLine();

                        DB.updateChemist(ssnToUpdate, newName, newPhoneNo, newAge, newAddress);
                        System.out.println("Chemist updated successfully.");
                        break;

                    case 10: // Update Equipment
                        System.out.print("Enter Serial No to update: ");
                        String serialNoToUpdate = sc.nextLine();
                        System.out.print("Enter New Cost: ");
                        double newCost = sc.nextDouble();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter New Type: ");
                        String newType = sc.nextLine();
                        System.out.print("Is Available (true/false): ");
                        boolean newAvailability = sc.nextBoolean();

                        DB.updateEquipment(serialNoToUpdate, newCost, newType, newAvailability);
                        System.out.println("Equipment updated successfully.");
                        break;

                    case 11: // Update Project
                        System.out.print("Enter Project ID to update: ");
                        int projectIdToUpdate = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter New Project Name: ");
                        String newProjectName = sc.nextLine();
                        System.out.print("Enter New Start Date (yyyy-MM-dd): ");
                        Date newStartDate = sdf.parse(sc.nextLine());

                        DB.updateProject(projectIdToUpdate, newProjectName, newStartDate);
                        System.out.println("Project updated successfully.");
                        break;

                    case 12: // Update Assignment
                        System.out.print("Enter Assignment ID to update: ");
                        int assignmentIdToUpdate = sc.nextInt();
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter New Assignment Date (yyyy-MM-dd): ");
                        Date newAssignDate = sdf.parse(sc.nextLine());
                        System.out.print("Enter New Total Hours: ");
                        double newTotalHours = sc.nextDouble();
                        System.out.print("Enter New Average Hours: ");
                        double newAverageHours = sc.nextDouble();

                        DB.updateAssignment(assignmentIdToUpdate, newAssignDate, newTotalHours, newAverageHours);
                        System.out.println("Assignment updated successfully.");
                        break;

                    case 13: // Delete Chemist
                        System.out.print("Enter SSN to delete: ");
                        String ssnToDelete = sc.nextLine();
                        DB.deleteChemist(ssnToDelete);
                        System.out.println("Chemist deleted successfully.");
                        break;

                    case 14: // Delete Equipment
                        System.out.print("Enter Serial No to delete: ");
                        String serialNoToDelete = sc.nextLine();
                        DB.deleteEquipment(serialNoToDelete);
                        System.out.println("Equipment deleted successfully.");
                        break;

                    case 15: // Delete Project
                        System.out.print("Enter Project ID to delete: ");
                        int projectIdToDelete = sc.nextInt();
                        DB.deleteProject(projectIdToDelete);
                        System.out.println("Project deleted successfully.");
                        break;

                    case 16: // Delete Assignment
                        System.out.print("Enter Assignment ID to delete: ");
                        int assignmentIdToDelete = sc.nextInt();
                        DB.deleteAssignment(assignmentIdToDelete);
                        System.out.println("Assignment deleted successfully.");
                        break;

                    case 0:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}