/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.observer;

import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public interface Observer {
    
    void handleEvent(Tetragon tetragon) ;

}
