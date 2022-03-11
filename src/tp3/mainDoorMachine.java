/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author dedyh
 */
import java.util.Scanner;

public class mainDoorMachine {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoorMachine pintu = new DoorMachine();
        System.out.println(pintu.getState());
        System.out.print("Command : ");
        String c = input.nextLine();
        pintu.pintu(c);
        System.out.println(pintu.getState());
        System.out.print("Command : ");
        c = input.nextLine();
        pintu.pintu(c);
        System.out.println(pintu.getState());
        input.close();        
    }
}
