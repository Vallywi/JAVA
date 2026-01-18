public class FindArray {
    public static void main(String[] args) {

        
        String[] names = {"Cypress", "Vallirie", "Ailish", "Excelsis", "Sandee"};
        

        try {
            
            for (int i = 0; i <= names.length; i++) {
                System.out.println("Index " + i + ": " + names[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to access an index outside the array bounds!");
            System.out.println("Details: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Error: The array has not been initialized (it is null).");
            System.out.println("Details: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("A runtime error occurred: " + e.getMessage());

        } finally {
            System.out.println("Program finished safely.");
        }
    }
}
