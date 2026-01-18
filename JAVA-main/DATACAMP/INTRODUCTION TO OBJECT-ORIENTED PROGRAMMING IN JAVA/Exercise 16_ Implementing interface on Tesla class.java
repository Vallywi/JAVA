public class Main {
    
    interface ElectricCar {
        void activateSelfDriving();
    }
           
    // Implement ElectricCar Interface
    static class Tesla implements ElectricCar {
        
        // Implement activateSelfDriving method 
       public void activateSelfDriving() {
            System.out.println("self driving on");
        }                              
    }

    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        // Call activateSelfDriving method
        myTesla.activateSelfDriving();
    }
}
