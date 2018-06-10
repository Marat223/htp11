/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.List;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonRepository {

    public void addShape(Tetragon tetragon) {
    }

    public void removeShape(Tetragon tetragon) {
    }

    public void changeShape(Tetragon tetragon) {
    }

    public List<Tetragon> query(Specification specification) {
	return specification.find();
    }
}
