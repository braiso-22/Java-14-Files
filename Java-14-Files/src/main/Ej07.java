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
        int[] cantidades = numeroLetrasPalabrasYLineas("archivos".concat(File.separator.concat("fich04.txt")));
        System.out.println("Letras: "+cantidades[0]);
        System.out.println("Palabras: "+cantidades[1]);
        System.out.println("Lineas: "+cantidades[2]);
    }

    public static int[] numeroLetrasPalabrasYLineas(String archivo) {
        File f = new File(archivo);
        if (!f.exists()) {
            return null;
        }
        int lineas = 0, palabras = 0, caracteres = 0;
        try (FileReader fR = new FileReader(f);
                BufferedReader bfR = new BufferedReader(fR);) {

            String linea;

            while ((linea = bfR.readLine()) != null) {
                lineas++;
                caracteres += linea.length();
                palabras += linea.split(" ").length;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ej07.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ej07.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new int[]{caracteres, palabras, lineas};
    }

}
