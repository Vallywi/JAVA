package Hello;
import java.util.ArrayList;
class Array1{
    private ArrayList <String> namer;

    public Array1(){
        namer = new ArrayList<>();
    }

    public void addName(String name){
        namer.add(name);
        System.out.println("The name has been added!!");
    }

    public void display(){
        if(namer.isEmpty()){
        System.out.println("There are no names inputted here!!");
        }
        else{
        System.out.println("The names are: ");
        for(String s : namer){
            System.out.println(s);
        }
    }
    }

    
    public void removeName(String name){
        if(namer.contains(name)){
        namer.remove(name);
        System.out.println("The name " + name + " has been deleted!!");
        }
        else{
            System.out.println("The name that you wanted to remove is not here");
        }
    }

}
