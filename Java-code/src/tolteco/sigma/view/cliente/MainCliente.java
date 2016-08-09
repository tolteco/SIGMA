/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.cliente;

/**
 * Tela principal para operação com clientes.
 * Nela que escolhe-se qual painel será exibido.
 * Uma espécie de padrão SINGLETON é implementada
 * com o auxílio da classe:
 * {@link tolteco.sigma.view.cliente.OperacaoCliente}.
 * @author Juliano Felipe
 */
public class MainCliente extends javax.swing.JPanel {
    private OperacaoCliente ultimoPanelAdicionado = null;
    
    /**
     * Creates new form MainCliente
     */
    public MainCliente() {
        initComponents();
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
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/Costumer/AddCostumer.png"))); // NOI18N
        Add.setText("Adicionar");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/Costumer/EditCostumer.png"))); // NOI18N
        Edit.setText("Modificar");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/Costumer/DeleteCostumer.png"))); // NOI18N
        Delete.setText("Excluir");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/Costumer/SearchCostumer.png"))); // NOI18N
        Search.setText("Buscar");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        List.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        List.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/Costumer/ListCostumer.png"))); // NOI18N
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
                        .addComponent(Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(List, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(List)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if (ultimoPanelAdicionado != OperacaoCliente.Adicionar){ //Singleton - Sort of
            AdicionarCliente add = new AdicionarCliente();
            Panel.setViewportView( add );
        } else {
            Panel.setVisible(true);
        }
        
        ultimoPanelAdicionado = OperacaoCliente.Adicionar;
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        if (ultimoPanelAdicionado != OperacaoCliente.Modificar){ //Singleton - Sort of
            ModificarCliente modif = new ModificarCliente();
            Panel.setViewportView( modif );
        }
        
        ultimoPanelAdicionado = OperacaoCliente.Modificar;
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (ultimoPanelAdicionado != OperacaoCliente.Remover){ //Singleton - Sort of
            RemoverCliente add = new RemoverCliente();
            Panel.setViewportView( add );
        }

        ultimoPanelAdicionado = OperacaoCliente.Remover;
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        if (ultimoPanelAdicionado != OperacaoCliente.Buscar){ //Singleton - Sort of
            BuscarCliente add = new BuscarCliente();
            Panel.setViewportView( add );
        }

        ultimoPanelAdicionado = OperacaoCliente.Buscar;
    }//GEN-LAST:event_SearchActionPerformed

    private void ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListActionPerformed
        if (ultimoPanelAdicionado != OperacaoCliente.Listar){ //Singleton - Sort of
            ListarCliente add = new ListarCliente();
            Panel.setViewportView( add );
        }

        ultimoPanelAdicionado = OperacaoCliente.Listar;
    }//GEN-LAST:event_ListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton List;
    private javax.swing.JScrollPane Panel;
    private javax.swing.JButton Search;
    // End of variables declaration//GEN-END:variables
}
