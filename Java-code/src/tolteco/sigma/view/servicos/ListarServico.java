/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.servicos;

import java.util.logging.Level;
import javax.swing.JOptionPane;
import net.java.balloontip.BalloonTip;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Servico;
import tolteco.sigma.model.tables.ServicoTable;
import tolteco.sigma.view.MainFrame;
import tolteco.sigma.view.interfaces.Listar;

/**
 * Painel para listar todos os clientes
 * no banco de dados.
 * Alguma restrição pode ser imposta
 * (número de clientes mostrados?)
 * @author Juliano Felipe
 */
public class ListarServico extends javax.swing.JPanel implements Listar<Servico>{
    private final MainServico MAIN;
    
    /**
     * Creates new form ListarCliente
     * @param main
     */
    public ListarServico(MainServico main) {
        initComponents();
        
        this.MAIN = main;
        //Setar informações na tabela
        tabela.setModel(main.getModel());
        tabela.setAutoCreateRowSorter(true);
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
        deleteButton = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        deleteButton.setText("Excluir");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        edit.setText("Editar");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jLabel1.setText("* Selecione uma célula e clique no botão referente a ação que deseja executar.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteButton)
                        .addComponent(edit))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int row = tabela.getSelectedRow();
        if (row>=0){
            Servico servico = getInstance();
            MAIN.pressEdit(servico);
        } else {
            BalloonTip tooltipBalloon = new BalloonTip(edit, "Selecione uma linha para poder editar.");
            tooltipBalloon.setVisible(true);
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = tabela.getSelectedRow();
        if (row>=0){
            Object[] choices = {"Sim", "Não"};
            Object defaultChoice = choices[0];
            int dialogRet = JOptionPane.showOptionDialog(this, "Deseja realmente excluir o Serviço?", "Confirmação de exclusão", JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, null, choices, defaultChoice);
            if(dialogRet == 1) { //==0 para sim
                return;
            } 
            
            Servico servico = getInstance();
            try {
                MAIN.getController().remove(servico);
            } catch (DatabaseException ex) {
                MainFrame.LOG.log(Level.SEVERE, null, ex);
                MAIN.displayDatabaseException(ex);
            }
        } else {
            BalloonTip tooltipBalloon = new BalloonTip(deleteButton, "Selecione uma linha para poder excluir.");
            tooltipBalloon.setVisible(true);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    @Override
    public Servico getInstance() {
        int row = tabela.getSelectedRow();
        Servico servico = null;
        if (row>=0){
            int servicoId = (int) tabela.getValueAt(row, ServicoTable.ROWID);
            servico = MAIN.getModel().getRowById(servicoId);
        } else {
            //Nunca deverá entrar aqui.
            BalloonTip tooltipBalloon = new BalloonTip(edit, "Selecione uma linha para poder editar.");
            tooltipBalloon.setVisible(true);
        }
        return servico;
    }
}
