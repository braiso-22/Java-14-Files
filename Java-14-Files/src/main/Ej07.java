/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braiso-22
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int[] numeroLetrasPalabrasYLineas(String archivo) {
        File f = new File(archivo);
        if (!f.exists()) {
            return null;
        }

        try (FileReader fR = new FileReader(f);
                BufferedReader bfR = new BufferedReader(fR);) {
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ej07.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ej07.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
