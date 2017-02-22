/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.usuarios;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.utils.ToolTipUtils;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Access;
import tolteco.sigma.model.entidades.Usuario;
import tolteco.sigma.model.tables.UsuarioTable;
import tolteco.sigma.view.interfaces.Buscar;

/**
 * Painel de busca de clientes.
 * Podem ser buscados por diversos
 * atributos (nome, id, etc).
 * @author Juliano Felipe
 */
public class BuscarUsuario extends javax.swing.JPanel implements Buscar<Usuario>{
    private final MainUsuario MAIN;
    private final ResultsTableModel modeloTabela = new ResultsTableModel();
    
    /**
     * Creates new form BuscarUsuario
     * @param main
     */
    public BuscarUsuario(MainUsuario main) {
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
        isAccess = new javax.swing.JCheckBox();
        accessBox = new javax.swing.JComboBox<>();
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

        isAccess.setText("Nível de Acesso");
        isAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAccessActionPerformed(evt);
            }
        });

        accessBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Root", "Administrador", "Funcionario" }));
        accessBox.setSelectedIndex(2);
        accessBox.setToolTipText("");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(nomeField)
                        .addContainerGap())
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accessBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isAccess)
                            .addComponent(accessBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(isNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
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
        if (isNome.isSelected() == isAccess.isSelected() == false){ //Nenhum filtro selecionado
            BalloonTip tooltipBalloon = new BalloonTip(searchPanel, "Selecione pelo menos um filtro.");
            tooltipBalloon.setVisible(true);
        }
        
        if (!changed) return; //Se não mudou os estados dos campos, não há por que procuarar...
        
        List<Usuario> data=null;
        try {
            if (isNome.isSelected()){
                data=MAIN.getController().select(nomeField.getText());
                modeloTabela.addAll(data);
                changed=false;
                return;
            } else 
                data=MAIN.getController().selectAll();
        } catch (DatabaseException ex) {
            Logger.getLogger(BuscarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Access toLookFor = Access.porCodigo(accessBox.getSelectedIndex());
        for (Usuario user : data){
            if (user.getAccessLevel() == toLookFor){
                modeloTabela.addRow(user);
            }
        }

        changed=false;
    }//GEN-LAST:event_BuscarActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Event changed...">
    private void isNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isNomeActionPerformed
        changed = true;
    }//GEN-LAST:event_isNomeActionPerformed

    private void isAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAccessActionPerformed
        changed = true;
    }//GEN-LAST:event_isAccessActionPerformed
    //</editor-fold>
    
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int row = tabela.getSelectedRow();
        if (row>=0){
            
        } else {
            BalloonTip tooltipBalloon = new BalloonTip(Edit, "Selecione uma linha para poder editar.");
            tooltipBalloon.setVisible(true);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int row = tabela.getSelectedRow();
        if (row>=0){
            
        } else {
            BalloonTip tooltipBalloon = new BalloonTip(Delete, "Selecione uma linha para poder excluir.");
            tooltipBalloon.setVisible(true);
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
        accessBox.setSelectedItem("Funcionario");
        
        isNome.setSelected(NOT_SELECTED);
        isAccess.setSelected(NOT_SELECTED);
    }

    @Override
    public void fillAllFields(Usuario object) {
        modeloTabela.addRow(object);
    }

    @Override
    public Usuario getInstance() {
        int row = tabela.getSelectedRow();
        Usuario cliente = null;
        if (row>=0){
            cliente = modeloTabela.getRow(row);
        } else {
            //Nunca deverá entrar aqui (Tem verificação "elsewhere").
            BalloonTip tooltipBalloon = new BalloonTip(tabela, "Selecione uma linha para poder concluir a operação.");
            tooltipBalloon.setVisible(true);
        }
        return cliente;
    }

    private class ResultsTableModel extends UsuarioTable{}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JComboBox<String> accessBox;
    private javax.swing.JCheckBox isAccess;
    private javax.swing.JCheckBox isNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
