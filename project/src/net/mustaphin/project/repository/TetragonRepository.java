/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.ArrayList;
import java.util.List;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonRepository {

    private List<Tetragon> repository = new ArrayList<>();

    private TetragonRepository() {
    }

    private final static TetragonRepository INSTANSE = new TetragonRepository();

    public static TetragonRepository getINSTANSE() {
	return INSTANSE;
    }

    public int addShape(Tetragon tetragon) {
	repository.add(tetragon);
	return repository.size() - 1;
    }

    public void removeShape(Tetragon tetragon) {
	// TODO
    }

    public void updateShape(Tetragon tetragon) {
	// TODO
    }

    public List<Tetragon> query(ISpecification specification) {
	return specification.find();
    }
}
