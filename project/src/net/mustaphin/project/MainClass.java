/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project;

import net.mustaphin.project.utils.ReaderFile;

/**
 *
 * @author marat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	ReaderFile rf = new ReaderFile();
	rf.readParameters();
    }

}
