/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author braiso-22
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("archivos".concat(File.separator.concat("fich03.txt")));

        try (FileOutputStream fOS = new FileOutputStream(f, true);
                OutputStreamWriter oSW = new OutputStreamWriter(fOS, "ISO-8859-1");
                BufferedWriter bW = new BufferedWriter(oSW);) {
            bW.write("Hola, soy Brais Fernández Vázquez");
            bW.newLine();
            bW.write("Vivo en España");
            bW.newLine();

        } catch (IOException e) {
            System.out.println("Error al tratar con archivos: " + e.getMessage());
        } catch (Exception e) {

        }
    }

}
