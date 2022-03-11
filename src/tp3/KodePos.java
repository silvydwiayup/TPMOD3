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
public class KodePos {
     private static String checkName(String name){
        switch (name) {
            case "batununggal":
                return "40266";
            case "kujangsari":
                return "40287";
            case "mengger":
                return "40267";
            case "wates":
                return "40256";
            case "cijaura":
                return "40287";
            case "jatisari":
                return "40286";
            case "margasari":
                return "40286";
            case "sekejati":
                return "40286";
            case "kebonwaru":
                return "40272";
            case "maleer":
                return "40274";
            case "samoja":
                return "40273";
            default:
                return "NULL";
        }
    }
    public static String getKodePos(String kelurahan) {
        kelurahan = kelurahan.toLowerCase();
        return checkName(kelurahan);
    }
}
