/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.mustaphin.project.parameter.registrator.Registrator;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class TetragonRepository {

    public static TetragonRepository getINSTANSE() {
	return SingletonHolder.INSTANCE;
    }

    private List<Tetragon> repository = new ArrayList<>();

    private TetragonRepository() {
    }

    public int addShape(Tetragon tetragon) {
	repository.add(tetragon);
	return repository.indexOf(tetragon);
    }

    public void removeShape(Tetragon tetragon) {
	int id = tetragon.getId();
	Registrator.getInstance().removeParameter(id);
	repository.remove(id);
    }

    public void updateShape(Tetragon tetragon) {
	for (Tetragon internal : repository) {
	    if (internal.equals(tetragon)) {
		internal.setPoints(tetragon.getPoint());
		break;
	    }
	}
    }

    public List<Tetragon> query(ISpecification specification) {
	return specification.specified(repository);
    }
    
    public void sort(Comparator<Tetragon> comparator){
	repository.sort(comparator);
    }

    private static class SingletonHolder {

	private final static TetragonRepository INSTANCE = new TetragonRepository();
    }
}
