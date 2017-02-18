/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.financas;

import tolteco.sigma.view.cliente.*;
import java.util.List;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.utils.ToolTipUtils;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Cliente;
import tolteco.sigma.model.tables.ClienteTable;
import tolteco.sigma.view.interfaces.Buscar;

/**
 * Painel de busca de clientes.
 * Podem ser buscados por diversos
 * atributos (nome, id, etc).
 * @author Juliano Felipe
 */
public class BuscarFinanca extends javax.swing.JPanel implements Buscar<Cliente>{
    private final MainFinanca MAIN;
    private final ResultsTableModel modeloTabela = new ResultsTableModel();
    
    /**
     * Creates new form BuscarFinanca
     * @param main
     */
    public BuscarFinanca(MainFinanca main) {
        initComponents();
        MAIN = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        isNome = new javax.swing.JCheckBox();
        nomeField = new javax.swing.JTextField();
        isEndereco = new javax.swing.JCheckBox();
        enderecoField = new javax.swing.JTextField();
        isIDcliente = new javax.swing.JCheckBox();
        isIDusuario = new javax.swing.JCheckBox();
        clientIDnum = new javax.swing.JSpinner();
        userIDnum = new javax.swing.JSpinner();
        isCPF = new javax.swing.JCheckBox();
        isTelefone = new javax.swing.JCheckBox();
        cpfField = new javax.swing.JFormattedTextField();
        enderecoCombo = new javax.swing.JComboBox<>();
        enderecoNum = new javax.swing.JSpinner();
        telefoneField = new javax.swing.JFormattedTextField();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        isNome.setText("Nome");
        isNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isNomeActionPerformed(evt);
            }
        });

        isEndereco.setText("Endereço");
        isEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isEnderecoActionPerformed(evt);
            }
        });

        enderecoField.setText("Engenheiro Luis Gomes Cardim Sangirardi");

        isIDcliente.setText("ID Cliente");
        isIDcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDclienteActionPerformed(evt);
            }
        });

        isIDusuario.setText("ID Usuário");
        isIDusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDusuarioActionPerformed(evt);
            }
        });

        isCPF.setText("CPF");
        isCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isCPFActionPerformed(evt);
            }
        });

        isTelefone.setText("Telefone");
        isTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isTelefoneActionPerformed(evt);
            }
        });

        try {
            cpfField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        enderecoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alameda", "Avenida", "Estrada", "Rodovia", "Rua", "Travessa" }));
        enderecoCombo.setSelectedIndex(4);

        try {
            telefoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(nomeField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isIDcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(clientIDnum, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(enderecoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(isCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createSequentialGroup()
                                .addComponent(isIDusuario)
                                .addGap(1, 1, 1)
                                .addComponent(userIDnum)))))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isIDcliente)
                            .addComponent(clientIDnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isEndereco)
                            .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isIDusuario)
                            .addComponent(userIDnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(isNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(isTelefone)
                        .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(isCPF)
                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("*Marque as caixas para pesquisar com os filtros.");

        Delete.setText("Excluir");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setText("Editar");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete)
                        .addGap(41, 41, 41)
                        .addComponent(Buscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete)
                        .addComponent(Edit)
                        .addComponent(jButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean changed=false;
    
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (isIDcliente.isSelected() == 
            isCPF.isSelected() == 
            isEndereco.isSelected() == 
            isTelefone.isSelected() == 
            isIDusuario.isSelected() == 
            isNome.isSelected() == false){ //Nenhum filtro selecionado
            
            BalloonTip tooltipBalloon = new BalloonTip(searchPanel, "Selecione pelo menos um filtro.");
            ToolTipUtils.balloonToToolTip(tooltipBalloon, 500, 3000); //balloon, delayToShowUp, TimeVisible
        }
        
        if (!changed) return; //Se não mudou os estados dos campos, não há por que procuarar...

        boolean flag; 
        short times; //Se um for falso, nao verifica os outros
        
        List<Cliente> data=null;
        Cliente temp;
        //Identificadores únicos, não precisa procurar com outros
        if (isIDcliente.isSelected()){
            try {
                temp = MAIN.getController().search((int)clientIDnum.getValue());
                if (temp != null) modeloTabela.addRow(temp);
                else throw new IllegalStateException("ARRUMA ISSO AQUI. COLOCA UM TOOLTIP BALOON!");
                
                return;
            } catch (DatabaseException ex) {
                Logger.getLogger(BuscarFinanca.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (isCPF.isSelected()){
            try {
                temp = MAIN.getController().searchByCPF(cpfField.getText());
                if (temp != null) modeloTabela.addRow(temp);
                else throw new IllegalStateException("ARRUMA ISSO AQUI. COLOCA UM TOOLTIP BALOON!");
                return;
            } catch (DatabaseException ex) {
                Logger.getLogger(BuscarFinanca.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                data = MAIN.getController().selectAll();
                if (data == null)
                    throw new IllegalStateException("ARRUMA ISSO AQUI. COLOCA UM TOOLTIP BALOON!");
            } catch (DatabaseException ex) {
                Logger.getLogger(BuscarFinanca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for (Cliente cliente : data){
            flag=true; times=0; //Tem que ser true em todas as verifs. para ser add
            if (isNome.isSelected()){
                flag = cliente.getNome().contains(nomeField.getText()) || cliente.getSobrenome().contains(nomeField.getText());
                times++;
            }
            endIF: if (isEndereco.isSelected()){
                if (flag==false && times!=0) break endIF;
                flag = cliente.getEnd().equalsIgnoreCase((String)enderecoCombo.getSelectedItem() + " " + enderecoField.getText());
                times++;
            }
            telIF: if (isTelefone.isSelected()){
                if (flag==false && times!=0) break telIF;
                flag = cliente.getTel().equals((String)telefoneField.getText());
                times++;
            }
            idUserIF: if (isIDusuario.isSelected()){
                if (flag==false && times!=0) break idUserIF;
                flag = cliente.getUserId() == ((int) userIDnum.getValue());
                times++;
            }
            if (flag==true && times!=0) modeloTabela.addRow(cliente);
        }

        changed=false;
    }//GEN-LAST:event_BuscarActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Event changed...">
    private void isNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isNomeActionPerformed
        changed = true;
    }//GEN-LAST:event_isNomeActionPerformed

    private void isEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isEnderecoActionPerformed
        changed = true;
    }//GEN-LAST:event_isEnderecoActionPerformed

    private void isTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isTelefoneActionPerformed
        changed = true;
    }//GEN-LAST:event_isTelefoneActionPerformed

    private void isIDclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDclienteActionPerformed
        changed = true;
    }//GEN-LAST:event_isIDclienteActionPerformed

    private void isIDusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDusuarioActionPerformed
        changed = true;
    }//GEN-LAST:event_isIDusuarioActionPerformed

    private void isCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isCPFActionPerformed
        changed = true;
    }//GEN-LAST:event_isCPFActionPerformed
    //</editor-fold>
    
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int row = tabela.getSelectedRow();
        if (row>=0){
            
        } else {
            BalloonTip tooltipBalloon = new BalloonTip(Edit, "Selecione uma linha para poder editar.");
            ToolTipUtils.balloonToToolTip(tooltipBalloon, 500, 3000); //balloon, delayToShowUp, TimeVisible
        }
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int row = tabela.getSelectedRow();
        if (row>=0){
            
        } else {
            BalloonTip tooltipBalloon = new BalloonTip(Delete, "Selecione uma linha para poder excluir.");
            ToolTipUtils.balloonToToolTip(tooltipBalloon, 500, 3000); //balloon, delayToShowUp, TimeVisible
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cleanAllFields();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    public static final String EMPTY=null;
    public static final boolean NOT_SELECTED=false;
    
    @Override
    public void cleanAllFields() {      
        nomeField.setText(EMPTY);
        enderecoCombo.setSelectedItem("Rua");
        enderecoField.setText(EMPTY);
        enderecoNum.setValue(0);
        telefoneField.setText(EMPTY);
        cpfField.setText(EMPTY);
        clientIDnum.setValue(0);
        userIDnum.setValue(0);
        
        isNome.setSelected(NOT_SELECTED);
        isEndereco.setSelected(NOT_SELECTED);
        isTelefone.setSelected(NOT_SELECTED);
        isCPF.setSelected(NOT_SELECTED);
        isIDcliente.setSelected(NOT_SELECTED);
        isIDusuario.setSelected(NOT_SELECTED);
    }

    @Override
    public void fillAllFields(Cliente object) {
        /*String combo = object.getEnd().substring(0,object.getEnd().indexOf(' '));
        String rest  = object.getEnd().substring(object.getEnd().indexOf(' ')+1);
        
        nomeField.setText(object.getNome() + object.getSobrenome());
        enderecoCombo.setSelectedItem(combo);
        enderecoField.setText(rest.substring(0,rest.lastIndexOf(' ')));
        enderecoNum.setValue(rest.substring(rest.lastIndexOf(' ')));
        telefoneField.setText(object.getTel());
        cpfField.setText(object.getCpf());
        clientIDnum.setValue(object.getClienteId());
        userIDnum.setValue(object.getUserId());*/
        
        modeloTabela.addRow(object);
    }

    @Override
    public Cliente getInstance() {
        int row = tabela.getSelectedRow();
        Cliente cliente = null;
        if (row>=0){
            cliente = modeloTabela.getRow(row);
        } else {
            throw new UnsupportedOperationException("COOLOCA BALÃO AQUI");
        }
        return cliente;
    }

    private class ResultsTableModel extends ClienteTable{}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JSpinner clientIDnum;
    private javax.swing.JFormattedTextField cpfField;
    private javax.swing.JComboBox<String> enderecoCombo;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JSpinner enderecoNum;
    private javax.swing.JCheckBox isCPF;
    private javax.swing.JCheckBox isEndereco;
    private javax.swing.JCheckBox isIDcliente;
    private javax.swing.JCheckBox isIDusuario;
    private javax.swing.JCheckBox isNome;
    private javax.swing.JCheckBox isTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField telefoneField;
    private javax.swing.JSpinner userIDnum;
    // End of variables declaration//GEN-END:variables
}
