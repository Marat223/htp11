/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.mustaphin.project.shape.Tetragon;

/**
 *
 * @author marat
 */
public class SpecificationById implements ISpecification {
    
    private int id;
    
    public SpecificationById(int id) {
	this.id = id;
    }
    
    @Override
    public List<Tetragon> specified(List<Tetragon> repository) {
	return new ArrayList<>(Arrays.asList(new Tetragon[]{repository.get(id)}));
    }
    
}