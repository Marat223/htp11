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
public class SpecificationByName implements ISpecification {

    private String name;

    public SpecificationByName(String name) {
	this.name = name;
    }

    @Override
    public List<Tetragon> specified(List<Tetragon> repository) {
	List<Tetragon> tetragons = new ArrayList<>();
	for (Tetragon tetragon : repository) {
	    if (name.equals(tetragon.getName())) {
		tetragons.add(tetragon);
		break;
	    }
	}
	return tetragons;
    }

}
