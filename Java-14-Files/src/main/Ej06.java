/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braiso-22
 */
public class Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("archivos".concat(File.separator.concat("fich04.txt")));

        try (FileReader fR = new FileReader(f);
                BufferedReader bfR = new BufferedReader(fR);) {
            String cadena;
            while ((cadena = bfR.readLine()) != null) {
                System.out.println(cadena.toUpperCase());
            }
        } catch (IOException ex) {
            Logger.getLogger(Ej06.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
