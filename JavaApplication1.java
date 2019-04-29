/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author abdul
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pattern p = Pattern.compile(
             "(((?<=(int))\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s*(=)\\s*((\\d+)(?!.)|([a-zA-Z_][a-zA-Z0-9_]*)))"
            + "|(?<=(float))\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s*(=)\\s*((\\d+\\.*\\d*)(?!.)|([a-zA-Z_][a-zA-Z0-9_]*))"
            + "|(?<=(char))\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s*(=)\\s*((\\'.\\')(?!.)|([a-zA-Z_][a-zA-Z0-9_]*))"
            + "|(?<=(string))\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s*(=)\\s*((\\\".*\\\")(?!.)|([a-zA-Z_][a-zA-Z0-9_]*)))"
        );

        while(true)
        {
            System.out.println("Enter Input: ");
            Matcher m = p.matcher(s.nextLine());

            if (m.find( ))
            {
//               System.out.println("Found value: " + m.group(0) ); // x = 10
//               System.out.println("Found value: " + m.group(1) ); // x = 10
//               System.out.println("Found value: " + m.group(2) ); // x = 10
               System.out.println("Found value: " + m.group(3) ); // int, char
//               System.out.println("Found value: " + m.group(4) ); // x
//               System.out.println("Found value: " + m.group(5) ); // =
//               System.out.println("Found value: " + m.group(6) );
            } else
                System.err.println("Wrong input!");
            
            System.out.println();
        }
    }
}
