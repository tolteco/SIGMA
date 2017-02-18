/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.cliente;

import java.awt.Component;
import java.awt.event.ActionEvent;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.utils.ToolTipUtils;
import tolteco.sigma.view.interfaces.Operacao;
import tolteco.sigma.controller.ClienteController;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Cliente;
import tolteco.sigma.model.tables.ClienteTable;
import tolteco.sigma.view.MainFrame;
import tolteco.sigma.view.interfaces.MainEntity;

/**
 * Tela principal para operação com clientes.
 * Nela que escolhe-se qual painel será exibido.
 * Uma espécie de padrão SINGLETON é implementada
 * com o auxílio da classe:
 * {@link tolteco.sigma.view.cliente.OperacaoCliente}.
 * @author Juliano Felipe
 */
public class MainCliente extends javax.swing.JPanel implements MainEntity<ClienteController,Cliente>{
    private Operacao ultimoPanelAdicionado = null;
    private final ClienteController controller;
    private final ClienteTable model;
    private final MainFrame main;
    
    public MainCliente(MainFrame main, ClienteController controller) {
        initComponents();
        this.controller = controller;
        this.main = main;
        model = controller.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        List = new javax.swing.JButton();
        Panel = new javax.swing.JScrollPane();

        Add.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/General/Buttons/Add.png"))); // NOI18N
        Add.setText("Adicionar");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/General/Buttons/Edit.png"))); // NOI18N
        Edit.setText("Modificar");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/General/Buttons/Delete.png"))); // NOI18N
        Delete.setText("Excluir");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/General/Buttons/Search.png"))); // NOI18N
        Search.setText("Buscar");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        List.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        List.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/General/Buttons/List.png"))); // NOI18N
        List.setText("Listar");
        List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(List, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Edit)
                    .addComponent(Delete)
                    .addComponent(Search)
                    .addComponent(List))
                .addGap(16, 16, 16)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (ultimoPanelAdicionado != Operacao.Adicionar){ //Singleton - Sort of
            AdicionarCliente add = new AdicionarCliente(this);
            Panel.setViewportView( add );
        } else {
            Panel.setVisible(true);
        }
        
        ultimoPanelAdicionado = Operacao.Adicionar;
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        if (ultimoPanelAdicionado != Operacao.Modificar && ultimoPanelAdicionado != Operacao.Buscar){ //Singleton - Sort of
            ModificarCliente modif = new ModificarCliente(this);
            Panel.setViewportView( modif );
            BalloonTip tooltipBalloon = new BalloonTip(Edit, "Busque um Cliente para modificar");
            ToolTipUtils.balloonToToolTip(tooltipBalloon, 500, 3000); //balloon, delayToShowUp, TimeVisible
        }
        
        ultimoPanelAdicionado = Operacao.Modificar;
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (ultimoPanelAdicionado != Operacao.Remover && ultimoPanelAdicionado != Operacao.Buscar){ //Singleton - Sort of
            BuscarCliente add = new BuscarCliente(this);
            Panel.setViewportView( add );
            BalloonTip tooltipBalloon = new BalloonTip(Delete, "Busque um Cliente para excluir");
            ToolTipUtils.balloonToToolTip(tooltipBalloon, 500, 3000); //balloon, delayToShowUp, TimeVisible
        }
        
        ultimoPanelAdicionado = Operacao.Remover;
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if (ultimoPanelAdicionado != Operacao.Buscar){ //Singleton - Sort of
            BuscarCliente add = new BuscarCliente(this);
            Panel.setViewportView( add );
        }

        ultimoPanelAdicionado = Operacao.Buscar;
    }//GEN-LAST:event_SearchActionPerformed

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
        if (ultimoPanelAdicionado != Operacao.Listar){ //Singleton - Sort of
            ListarCliente add = new ListarCliente(this);
            Panel.setViewportView( add );
        }

        ultimoPanelAdicionado = Operacao.Listar;
    }//GEN-LAST:event_ListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton List;
    private javax.swing.JScrollPane Panel;
    private javax.swing.JButton Search;
    // End of variables declaration//GEN-END:variables

    @Override
    public ClienteTable getModel(){
        return model;
    }
    
    @Override
    public ClienteController getController(){
        return controller;
    }

    @Override
    public void displayException(Exception ex) {
        BalloonTip tooltipBalloon = new BalloonTip(main.getExceptionTab(), "Exceção jogada.");
        ToolTipUtils.balloonToToolTip(tooltipBalloon, 500, 3000); //balloon, delayToShowUp, TimeVisible
    }

    @Override
    public void displayDatabaseException(DatabaseException ex) {
        BalloonTip tooltipBalloon = new BalloonTip(main.getExceptionTab(), "Exceção do Banco de dados jogada.");
        ToolTipUtils.balloonToToolTip(tooltipBalloon, 500, 3000); //balloon, delayToShowUp, TimeVisible
    }

    @Override
    public void pressEdit(Cliente toFill) {
        EditActionPerformed( new ActionEvent(toFill, -1, "ToEdit"));
        Component[] components = Panel.getComponents();
        
        for(Component comp : components){
            if (comp instanceof ModificarCliente){
                ModificarCliente modif = (ModificarCliente) comp;
                modif.fillAllFields(toFill);
                return;
            }
        }
    }
}
