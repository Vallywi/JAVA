public class ShapeTest{
        public static void main(String [] args){
            Shape[] shapesArray = new Shape[4]; 

        shapesArray[0] = new Circle("Yellow", 23.4);
        shapesArray[1] = new Rectangle("Blue", 4, 5);
        shapesArray[2] = new Circle("Red", 2.5);
        shapesArray[3] = new Rectangle("Pink", 10.0, 2.0);

        
        for (Shape shape : shapesArray) {
            shape.displayInfo();
        }
    }
}
