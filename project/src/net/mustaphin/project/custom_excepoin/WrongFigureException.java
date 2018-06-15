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
public class WrongFigureException extends Exception {

    public WrongFigureException() {
    }

    public WrongFigureException(String message) {
	super(message);
    }

    public WrongFigureException(String message, Throwable cause) {
	super(message, cause);
    }

    public WrongFigureException(Throwable cause) {
	super(cause);
    }

}
