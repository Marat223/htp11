/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.HashMap;
import net.mustaphin.project.observer.Observer;
import net.mustaphin.project.observer.TetragonObserver;

/**
 *
 * @author marat
 */
public class Repository extends HashMap {

    Observer observer = new TetragonObserver();
}
