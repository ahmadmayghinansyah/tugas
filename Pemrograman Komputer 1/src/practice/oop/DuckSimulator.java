/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DuckSimulator {
    
    
    public void main (String[] args) {
        
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();
        
        ModelDuck model = new ModelDuck();
        
        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();
        
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); 
        model.performFly();
    }
    
    public class DukSimulator {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int choice;
            
            do {
            System.out.println("Pilih bebek yang ingin Anda ketahui sifatnya:");
            System.out.println("1. Bebek Biasa");
            System.out.println("2. Bebek Karet");
            System.out.println("3. Keluar");

            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    OrdinaryDuck ordinaryDuck = new OrdinaryDuck();
                    ordinaryDuck.quack();
                    ordinaryDuck.swim();
                    break;

                case 2:
                   RuberDuck rubberDuck = new RuberDuck();
                   rubberDuck.quack();
                   rubberDuck.swim();
                    break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan Duck Simulator");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, Silahkan pilih lagi");
                    break;
            }
        }while (choice != 3);
    }
}
    
class Duck{
    public void quack(){
        System.out.println("bebek mengeluarkan suara quack");
    }
    
    public void swim(){
        System.out.println("Bebek bisa berenang");
    }
}


class RubberDuck extends Duck {

        private RubberDuck(FlyBehavior cantFly, QuackBehavior squeak) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
    @Override
    public void quack(){
        System.out.println("Bebek karet tidak mengeluarkan suara quack"); 
    }
    
    @Override
    public void swim(){
        System.out.println("Bebek karet mengapung di air");
    }

        private void performQuack() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    
}

}

