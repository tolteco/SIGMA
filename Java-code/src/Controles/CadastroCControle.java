/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import Entidades.Cliente;

/**
 *
 * @author Maycon
 */
public class CadastroCControle {
    
    boolean cadastrarcliente(Cliente p) {
        boolean result = false;
        if (p != null && p.getNome().length() > 0 && p.getCpf() != 0 && p.getObs().length() > 0 && p.getTel() != 0) {
            result = true;
        }
        return result;
    }
}
