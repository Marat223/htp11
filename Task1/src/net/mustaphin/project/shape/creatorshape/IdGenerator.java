/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.shape.creatorshape;

/**
 *
 * @author marat
 */
public class IdGenerator {

    private int lastId = 0;
    private static IdGenerator instance = new IdGenerator();

    private IdGenerator() {
    }

    public static IdGenerator getInstance() {
	return instance;
    }

    public int getNextId() {
	return ++lastId;
    }
}
