/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.model.entidades;

import java.util.Comparator;
import java.util.Objects;

/**
 * Classe totalmente segura
 * que identifica o usuário
 * e o nível de acesso. Não
 * armazena a senha por motivos
 * de "segurança".
 * @author Juliano_Felipe
 */
public class Usuario implements Comparable<Usuario>,PrimaryKeyComparable {
    private int userId;
    private String userName;
    private Access accessLevel;
    private char[] pass;
    
    public Usuario(int userId, String userName, Access accessLevel, char[] pass) {
        this.userId = userId;
        this.userName = userName;
        this.accessLevel = accessLevel;
        this.pass = pass;
        
        /*for (int i=0; i<pass.length; i++){
            pass[0] = '\0';
        }*/ //What is this
    }

    /**
     * Construtor de cópia.
     * @param user para copiar
     */
    public Usuario(Usuario user){
        this.accessLevel = user.getAccessLevel();
        this.userId = user.getUserId();
        this.userName = user.getUserName();
    }
    
    public boolean canDoOperation(Tipo tipo, Opcao op){
        switch (accessLevel) {
            case ROOT:
                return true;
                
            case ADMINISTRADOR:
                //Nao pode fazer nada com usuários nem configs.
                return !(tipo==Tipo.CONFIG || tipo==Tipo.USER);
                
            case FUNCIONARIO: //Funcionario
                //Nao pode fazer nada com financa nem relatorios.
                //Tambem nao pode deletar nada.
                if (tipo==Tipo.FINANCA || tipo==Tipo.RELATORIO) return false;
                return op != Opcao.DELETE;
                
            default:
                return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.userId;
        hash = 37 * hash + Objects.hashCode(this.userName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.userId != other.userId) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        return true;
    }
    
    

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setAccessLevel(Access accessLevel) {
        this.accessLevel = accessLevel;
    }
    
    public void setPass(char[] pass) {
        this.pass = pass;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public Access getAccessLevel() {
        return accessLevel;
    }
    
    public char[] getPass(){
        return pass;
    }
//</editor-fold>
    
    /**
     * Nulifica todos os chars
     * da senha. Por segurança.
     */
    public void clearPass(){
        for (int i=0; i<pass.length; i++)
            pass[0] = '\0';
    }

    @Override
    public int compareTo(Usuario o) {
        return o.getUserName().compareTo(o.getUserName());
    }

    public static Comparator<Access> accessComparator (){
        return (Access o1, Access o2) -> o1.compareTo(o2);
    }
    
    public static Comparator<Integer> userIdComparator (){
        return (Integer o1, Integer o2) -> o1.compareTo(o2);
    }
    
    @Override
    public int getRowId() {
        return userId;
    }
}
