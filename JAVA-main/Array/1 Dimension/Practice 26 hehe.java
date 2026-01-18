import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        try{
        
        ArrayList<String> arr = new ArrayList<>();
        
        arr.add("Vallirie");
        arr.add("Zarrah");
        arr.add("Hello");
        arr.add("Kitty");
        
        for(String s : arr){
            System.out.println(s);
        }
        
        
        }catch(IndexOutOfBoundsException e){
            System.out.println("Omyghad");
        }
        
        
    }
}
