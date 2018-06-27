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
public class RepositoryException extends Exception {

    public RepositoryException() {
    }

    public RepositoryException(String message) {
	super(message);
    }

    public RepositoryException(String message, Throwable cause) {
	super(message, cause);
    }

}
