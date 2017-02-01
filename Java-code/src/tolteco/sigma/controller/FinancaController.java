/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.controller;

import java.util.List;
import tolteco.sigma.model.dao.DAOFactory;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.dao.FinancaDAO;
import tolteco.sigma.model.entidades.Cliente;
import tolteco.sigma.model.entidades.Financa;
import tolteco.sigma.model.tables.FinancaTable;
import tolteco.sigma.model.tables.SigmaAbstractTableModel;

/**
 *
 * @author Juliano Felipe
 */
public class FinancaController extends GenericController<Financa, FinancaTable>{

    private final FinancaDAO financaDAO;

    public FinancaController(DAOFactory dao, SigmaAbstractTableModel model) {
        super(dao, model);
        financaDAO = dao.getFinancaDAO();
    }

    @Override
    public boolean insert(Financa t) throws DatabaseException {
        boolean ins = financaDAO.insert(t);
        
        if (ins){
            List<Financa> financas = financaDAO.select(t.getData());
            int key = -1;
            
            for (Financa financa : financas){
                if (financa.equals(t)){
                    key = financa.getRowid();
                    t = financa;
                }
            }
            
            if (key==-1){ 
                throw new DatabaseException(
                "Falha na inserção de finança. Obtenção de código de inserção"
                + " falhou.");
            } else{
                model.addRow(t);
            }
            
        } else {
            throw new DatabaseException(
                "Falha na inserção de finança. Persistência no banco de dados"
                + " falhou.");
        }
        
        return false;
    }

    @Override
    public boolean remove(Financa t) throws DatabaseException {
        boolean rem = financaDAO.remove(t);
        
        if (rem){
            Financa financa = financaDAO.search(t.getRowid());
            int key = -1;
            if (financa.equals(t)){
                key = financa.getRowid();
            }
            
            if (key==-1){ 
                throw new DatabaseException(
                "Falha na remoção de finança. Obtenção de ID falhou.");
            } else{
                model.setRow(t); //Opção de updade de linha
            }
            
        } else {
            throw new DatabaseException(
                "Falha na remoção de finança. Persistência no banco de dados"
                + " falhou.");
        }
        
        return false;
    }

    @Override
    public boolean update(Financa t) throws DatabaseException {
        boolean upd = financaDAO.update(t);
        
        if (upd){
            Financa financa = financaDAO.search(t.getRowid());
            int key = -1;
            if (financa.equals(t)){
                key = financa.getRowid();
            }
            
            if (key==-1){ 
                throw new DatabaseException(
                "Falha na atualização de finança. Obtenção de ID falhou.");
            } else{
                model.removeRow(t);
            }
            
        } else {
            throw new DatabaseException(
                "Falha na atualização de finança. Persistência no banco de dados"
                + " falhou.");
        }
        
        return false;
    }

    @Override
    public List<Financa> selectAll() throws DatabaseException {
        return financaDAO.selectAll();
    }

    @Override
    public Financa search(int primaryKey) throws DatabaseException {
        return financaDAO.search(primaryKey);
    }

    @Override
    public List<Financa> select(String nome) throws DatabaseException {
        return financaDAO.select(nome);
    }
    
}