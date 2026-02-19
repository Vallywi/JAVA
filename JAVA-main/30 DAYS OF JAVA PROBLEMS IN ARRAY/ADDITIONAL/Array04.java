//Half Pyramid (Left Aligned)
//
//*
//**
//***
//****
//*****
//
class Array04 {
    public static void main(String[] args) {
        System.out.println("The Inverted Pyramid!!\n");
        int k = 1;
        
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= (i*2 - k);j++){
                System.out.print("*");
            }
            
            System.out.println();
            k++;
        }
    }
}