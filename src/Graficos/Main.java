/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class Main {

    public static void main(String[] args) {
        TestPaintComponet frame = new TestPaintComponet();
        frame.setTitle("TestPainComponent");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
