/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.custom_excepoin;

/**
 *
 * @author marat
 */
public class IncorrectDataHandle extends Exception {

    public IncorrectDataHandle() {
    }

    public IncorrectDataHandle(String message) {
	super(message);
    }

    public IncorrectDataHandle(String message, Throwable cause) {
	super(message, cause);
    }

    public IncorrectDataHandle(Throwable cause) {
	super(cause);
    }

}
