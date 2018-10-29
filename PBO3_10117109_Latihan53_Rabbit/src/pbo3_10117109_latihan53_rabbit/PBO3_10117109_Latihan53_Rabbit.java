/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan53_rabbit;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi Program : program ini berisi program untuk menampilkan karakter 
 *                     dari seekor kelinci dengan konsep inheritance.
 */
public class PBO3_10117109_Latihan53_Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabit = new Rabbit("Peter",false, "grass", 4, "grey" );
        System.out.println("Hello, His name is "+rabit.getName());
        System.out.println(rabit.getName()+" is Vegetarian? "
                +rabit.isVegetarian());
        System.out.println(rabit.getName()+" eats "+rabit.getEats());
        System.out.println(rabit.getName()+" has "+rabit.getNoOfLegs()
                +" legs.");
        System.out.println(rabit.getName()+" color is "+rabit.getColor());
    }
    
}
