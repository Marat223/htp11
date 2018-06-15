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
public class RegistratorException extends WrongFigureException {

    public RegistratorException() {
    }

    public RegistratorException(String message) {
	super(message);
    }

    public RegistratorException(String message, Throwable cause) {
	super(message, cause);
    }

    public RegistratorException(Throwable cause) {
	super(cause);
    }

}
