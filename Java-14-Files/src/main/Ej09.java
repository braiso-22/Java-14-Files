/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braiso-22
 */
public class Ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("archivos".concat(File.separator.concat("alumnos.txt")));
        String[] contenido = new String[5];

        fill(contenido, "Z");
        while (!contenido[0].equals("Z")) {
            writeTXT(f, contenido);
            fill(contenido, "Z");
        }

    }

    public static void writeTXT(File f, String[] contenido) {
        try (FileWriter fW = new FileWriter(f, true); BufferedWriter bW = new BufferedWriter(fW); PrintWriter pW = new PrintWriter(bW, true)) {

            pW.printf("%s%s%s%s%s\n", contenido[0], contenido[1], contenido[2], contenido[3], contenido[4]);

        } catch (IOException ex) {
            Logger.getLogger(Ej08.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void fill(String[] contenido, String stop) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < contenido.length; i++) {
            if ((contenido[i] = teclado.nextLine()).equals(stop)) {
                return;
            } else if (contenido[i].length() < 100) {
                for (int j = 0; i < 100 - contenido[i].length(); j++) {
                    contenido[i] = contenido[i].concat(" ");
                }
            }
        }
    }

}
