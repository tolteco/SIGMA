/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.controller;

import java.util.List;
import tolteco.sigma.model.dao.DAOFactory;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Servico;

/**
 *
 * @author Juliano Felipe
 */
public class ServicoController extends GenericController<Servico>{

    public ServicoController(DAOFactory dao) {
        super(dao);
    }

    @Override
    public boolean insert(Servico t) throws DatabaseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Servico t) throws DatabaseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Servico t) throws DatabaseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servico> selectAll() throws DatabaseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servico search(int primaryKey) throws DatabaseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servico> select(String nome) throws DatabaseException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
