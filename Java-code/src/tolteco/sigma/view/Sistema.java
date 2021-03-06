/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view;

import java.util.logging.Level;
import tolteco.sigma.controller.ClienteController;
import tolteco.sigma.controller.FinancaController;
import tolteco.sigma.controller.ServicoController;
import tolteco.sigma.controller.UsuarioController;
import tolteco.sigma.controller.VersionController;
import tolteco.sigma.model.dao.DAOFactory;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.dao.jdbc.JDBCDAOFactory;
import tolteco.sigma.model.entidades.Usuario;
import tolteco.sigma.model.entidades.Version;
import tolteco.sigma.model.tables.ClienteTable;
import tolteco.sigma.model.tables.FinancaTable;
import tolteco.sigma.model.tables.ServicoTable;
import tolteco.sigma.model.tables.UsuarioTable;
import tolteco.sigma.model.tables.VersionTable;

/**
 *
 * @author JFPS
 */
public class Sistema {
    private static Sistema system;
    private static Usuario user; //= new Usuario(0, "Teste", Access.ROOT, new char[]{123}); //Para testes
    private static MainFrame MAIN;
    private static final DAOFactory DAO = new JDBCDAOFactory();
    private static UsuarioController controller;
    
    //<editor-fold defaultstate="collapsed" desc="MainFrame Initializer">
    public static MainFrame assembleMain() {
        return new MainFrame(initSubCliente(), initSubFinanca(), initSubServico(), initSubUsuario(), initSubVersion());
    }
    
    private static ServicoController initSubServico() {
        ServicoTable model = new ServicoTable();
        return new ServicoController(Sistema.DAO, model);
    }

    private static UsuarioController initSubUsuario() {
        UsuarioTable model = new UsuarioTable();
        return new UsuarioController(Sistema.DAO, model);
    }

    private static FinancaController initSubFinanca() {
        FinancaTable model = new FinancaTable();
        return new FinancaController(Sistema.DAO, model);
    }

    private static ClienteController initSubCliente() {
        ClienteTable model = new ClienteTable();
        return new ClienteController(Sistema.DAO, model);
    }

    private static VersionController initSubVersion() {
        VersionTable model = new VersionTable();
        return new VersionController(Sistema.DAO, model);
    }
    
    //</editor-fold>
    
    private Sistema(Usuario user) {
        Sistema.user = user;
        MAIN = assembleMain();
        MAIN.setVisible(true);
    }
    
    public static int getUserID(){
        return user.getUserId();
    }

    public static Usuario getUser() {
        return user;
    }
    
    /*
    SYSTEM OPERATIONS
    */
    
    public static void login(Usuario user, UsuarioController controller){
        if (Sistema.user != null) 
            throw new IllegalStateException("Usuário: " + Sistema.user.getUserName() + " logado.");
        
        if (user != null){
            system = new Sistema(user);
            Sistema.controller = controller;
            MainFrame.LOG.log(Level.INFO, "Usu\u00e1rio: " + user.getUserName() + " logou.");
        }else {
            MainFrame.LOG.log(Level.WARNING, "Tentativa de Log no sistema com usuário nulo");
        }
    }
    
    public static void logout() throws DatabaseException{
        MainFrame.LOG.info("Usuário: " + Sistema.user.getUserName() + " saindo do sistema.");
        user = null;
        
        Version latestVersion = DAO.getVersionDAO().fetchLatestVersion();
        new Login(controller, latestVersion).setVisible(true);
    }
    
    public static void shutdown(){     
        MainFrame.LOG.info("Usuário: " + Sistema.user.getUserName() + " finalizando o sistema.");
    }
}
