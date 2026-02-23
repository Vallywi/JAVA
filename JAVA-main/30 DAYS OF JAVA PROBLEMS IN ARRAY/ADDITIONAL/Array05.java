//Inverted Half Pyramid
//
//*****
//****
//***
//**
//*
package ADDITIONAL;
class Array05 {
    public static void main(String[] args) {
        System.out.println("The Inverted Pyramid!!\n");
        
        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <=(i*2 - i);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}