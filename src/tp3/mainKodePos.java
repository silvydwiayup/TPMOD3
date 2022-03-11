/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.Scanner;

/**
 *
 * @author dedyh
 */
public class mainKodePos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama kelurahan : ");
        String kl = input.nextLine();
        System.out.println(KodePos.getKodePos(kl));
        input.close();
    }
}
