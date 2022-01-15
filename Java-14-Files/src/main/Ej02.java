/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Brais
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("archivos".concat(File.separator.concat("fich01.txt")));

        try ( FileWriter fW = new FileWriter(f, false);  
                BufferedWriter bW = new BufferedWriter(fW);) {
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
