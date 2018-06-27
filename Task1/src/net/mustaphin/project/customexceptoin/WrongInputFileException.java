/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.customexceptoin;

/**
 *
 * @author marat
 */
public class WrongInputFileException extends Exception {

    public WrongInputFileException() {
    }

    public WrongInputFileException(String message) {
	super(message);
    }

    public WrongInputFileException(String message, Throwable cause) {
	super(message, cause);
    }

    public WrongInputFileException(Throwable cause) {
	super(cause);
    }

}
