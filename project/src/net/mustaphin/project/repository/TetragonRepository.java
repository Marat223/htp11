/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonRepository {

    private Map<Integer, Tetragon> repository = new HashMap<>();

    private TetragonRepository() {
    }

    private final static TetragonRepository INSTANSE = new TetragonRepository();

    public static TetragonRepository getINSTANSE() {
	return INSTANSE;
    }

    public void addShape(Tetragon tetragon) {
	// TODO
    }

    public void removeShape(Tetragon tetragon) {
	// TODO
    }

    public void updateShape(Tetragon tetragon) {
	// TODO
    }

    public int getNextId() {
	
	return 0; //TODO
    }

    public List<Tetragon> query(ISpecification specification) {
	return specification.find();
    }
}
