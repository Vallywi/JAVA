class Main {  

	static class Car {
        public String color;
        public String model;
        public int year;
        // Create private property "vehicleNumber"
        private int vehicleNumber;

        Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
            this.vehicleNumber = 101189;
        }

        public void turnEngineOn() {
            System.out.println("engine is on");            
        }

        public int calculateMPG(int milesDriven, int gallonsUsed) {
            return milesDriven / gallonsUsed;
        }
    }
    
    public static void main(String[] args) {
    	
    }
}
