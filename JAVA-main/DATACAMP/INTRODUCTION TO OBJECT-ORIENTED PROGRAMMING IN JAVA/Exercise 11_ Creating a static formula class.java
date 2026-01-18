public class Main {
	// Mark Formula static
    static class Formula{
    
        // Create the calculateSpeed static method
        static double calculateSpeed(double distance, double time) {
          return distance / time;
        }            
    
    }

    public static void main(String[] args) {
        // Print the result of the calculateSpeed method with the correct parameters
        System.out.println(Formula.calculateSpeed(165.00, 15.00));
    }
}
