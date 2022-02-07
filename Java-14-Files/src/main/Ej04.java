/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author braiso-22
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        File f = new File("archivos".concat(File.separator.concat("fich04.txt")));

        try (FileWriter fW = new FileWriter(f, false);
                BufferedWriter bW = new BufferedWriter(fW);) {
            String linea;
            do {
                linea = teclado.nextLine();
                bW.write(linea);
                bW.newLine();
            } while (!"fin".equals(linea));

        } catch (IOException e) {
            System.out.println("Error al tratar con archivos: " + e.getMessage());
        } catch (Exception e) {

        }
    }

}
