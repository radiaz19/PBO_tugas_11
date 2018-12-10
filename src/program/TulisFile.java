/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
public class TulisFile {
public static void main(String[] args) {
try {
      FileOutputStream file = new FileOutputStream("D:/test.txt");
 BufferedWriter output = new BufferedWriter(new OutputStreamWriter(file));
 String data = "Nama Saya ";
 output.write(data);
 output.close();
 file.close();
 System.out.println("OK");
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch(IOException e){
e.printStackTrace();
}
}
}