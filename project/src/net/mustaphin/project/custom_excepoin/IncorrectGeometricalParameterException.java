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
public class IncorrectGeometricalParameterException extends Exception {

    public IncorrectGeometricalParameterException() {
    }

    public IncorrectGeometricalParameterException(String message) {
	super(message);
    }

    public IncorrectGeometricalParameterException(String message, Throwable cause) {
	super(message, cause);
    }

    public IncorrectGeometricalParameterException(Throwable cause) {
	super(cause);
    }

}
