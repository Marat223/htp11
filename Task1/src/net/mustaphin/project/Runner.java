/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mustaphin.project;

import java.util.List;
import net.mustaphin.project.customexceptoin.RepositoryException;
import net.mustaphin.project.customexceptoin.WrongInputFileException;
import net.mustaphin.project.observer.Observer;
import net.mustaphin.project.observer.TetragonObserver;
import net.mustaphin.project.shape.Tetragon;
import net.mustaphin.project.shape.creatorshape.TetragonCreate;

/**
 *
 * @author marat
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws WrongInputFileException, RepositoryException {
//	System.setProperty("log4j.configurationFile","./log4j2.xml");
	Observer observer = new TetragonObserver();
	TetragonCreate tetragonCreate = new TetragonCreate();
	List<Tetragon> tetragons = tetragonCreate.create("", observer);
	/*
	TetragonRepository.getINSTANSE().addShape(tetragons);
	SpecificationById byId = new SpecificationById(1);
	System.out.println(TetragonRepository.getINSTANSE().query(byId));
	 */
    }

}
