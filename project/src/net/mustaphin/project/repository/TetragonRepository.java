/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.ArrayList;
import java.util.Iterator;
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

    public boolean removeShape(Tetragon tetragon) {
	boolean removed = false;
	Iterator<Tetragon> it = repository.iterator();
	while (it.hasNext()) {
	    if (it.next().equals(tetragon)) {
		it.remove();
		removed = true;
		break;
	    }
	}
	return removed;
    }

    public boolean updateShape(Tetragon tetragon) {
	boolean added = false;
	for (Tetragon internal : repository) {
	    if (internal.equals(tetragon)) {
		internal.setPoints(tetragon.getPoint());
		added = true;
		break;
	    }
	}
	return added;
    }

    public List<Tetragon> query(ISpecification specification) {
	return specification.specified();
    }
}
