/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.custom_excepoin;

/**
 *
 * @author me
 */
public class InsufficientFigureException extends Exception {

    public InsufficientFigureException() {
    }

    public InsufficientFigureException(String message) {
	super(message);
    }

    public InsufficientFigureException(String message, Throwable cause) {
	super(message, cause);
    }

    public InsufficientFigureException(Throwable cause) {
	super(cause);
    }

}
