/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.servicos;

import java.util.Collection;
import java.util.List;
import net.java.balloontip.BalloonTip;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Servico;
import tolteco.sigma.model.entidades.Servico;
import tolteco.sigma.model.entidades.Situacao;
import tolteco.sigma.model.tables.ServicoTable;
import tolteco.sigma.utils.eventsAndListeners.ChangePropertyEvent;
import tolteco.sigma.utils.eventsAndListeners.DeletionEvent;
import tolteco.sigma.utils.eventsAndListeners.InsertionEvent;
import tolteco.sigma.view.MainFrame;
import tolteco.sigma.view.interfaces.Buscar;

/**
 * Painel de busca de clientes.
 * Podem ser buscados por diversos
 * atributos (nome, id, etc).
 * @author Juliano Felipe
 */
public class BuscarServico extends javax.swing.JPanel implements Buscar<Servico>{
    private final MainServico MAIN;
    private final ResultsTableModel modeloTabela = new ResultsTableModel();
    
    /**
     * Creates new form BuscarServico
     * @param main
     */
    public BuscarServico(MainServico main) {
        initComponents();
        MAIN = main;
        tabela.setModel(modeloTabela);
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
        searchPanel = new javax.swing.JPanel();
        isModelo = new javax.swing.JCheckBox();
        modeloField = new javax.swing.JTextField();
        isIDServico = new javax.swing.JCheckBox();
        isIDusuario = new javax.swing.JCheckBox();
        idServico = new javax.swing.JSpinner();
        idUsuario = new javax.swing.JSpinner();
        isSituacao = new javax.swing.JCheckBox();
        isPlaca = new javax.swing.JCheckBox();
        placaField = new javax.swing.JFormattedTextField();
        isIdCliente = new javax.swing.JCheckBox();
        idClient = new javax.swing.JSpinner();
        PagoCheck = new javax.swing.JRadioButton();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tabela.setModel(modeloTabela);
        jScrollPane1.setViewportView(tabela);

        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        isModelo.setText("Modelo");
        isModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isModeloActionPerformed(evt);
            }
        });

        isIDServico.setText("ID Serviço");
        isIDServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDServicoActionPerformed(evt);
            }
        });

        isIDusuario.setText("ID Usuário");
        isIDusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDusuarioActionPerformed(evt);
            }
        });

        isSituacao.setText("Situação");
        isSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isSituacaoActionPerformed(evt);
            }
        });

        isPlaca.setText("Placa");
        isPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPlacaActionPerformed(evt);
            }
        });

        try {
            placaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        isIdCliente.setText("ID Cliente");

        PagoCheck.setText("Pago");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(modeloField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isIDServico, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(idServico, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(PagoCheck)
                        .addGap(52, 52, 52)
                        .addComponent(isPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(placaField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(isIdCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idClient, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isIDusuario)
                        .addGap(1, 1, 1)
                        .addComponent(idUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modeloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isIDServico)
                            .addComponent(idServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(isIDusuario)
                                .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(isIdCliente)
                                .addComponent(idClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(isPlaca)
                                .addComponent(placaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(isModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isSituacao)
                            .addComponent(PagoCheck))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
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
        if (isIDServico.isSelected() == false &&
            isPlaca.isSelected() == false &&
            isIdCliente.isSelected() == false &&
            isSituacao.isSelected() == false &&
            isIDusuario.isSelected() == false &&
            isModelo.isSelected() == false){ //Nenhum filtro selecionado
            
            BalloonTip tooltipBalloon = new BalloonTip(Buscar, "Selecione pelo menos um filtro.");
            tooltipBalloon.setVisible(true);
            return;
        }
        
        if (!changed) return; //Se não mudou os estados dos campos, não há por que procuarar...

        modeloTabela.removeAll();
        
        boolean flag; 
        short times; //Se um for falso, nao verifica os outros
        
        List<Servico> data=null;
        Servico temp;
        //Identificadores únicos, não precisa procurar com outros
        if (isIDServico.isSelected()){
            try {
                temp = MAIN.getController().search((int)idServico.getValue());
                if (temp != null) modeloTabela.addRow(temp);
                else{
                    BalloonTip tooltipBalloon = new BalloonTip(Buscar, "Nada encontrado.");
                    tooltipBalloon.setVisible(true);
                }
                
                return;
            } catch (DatabaseException ex) {
                MainFrame.LOG.severe(ex.getLocalizedMessage());
            }
        } else if (isPlaca.isSelected()){
            try {
                data = MAIN.getController().searchByPlaca(placaField.getText());
                if (data == null){
                    BalloonTip tooltipBalloon = new BalloonTip(Buscar, "Nada encontrado.");
                    tooltipBalloon.setVisible(true);
                    return;
                }
            } catch (DatabaseException ex) {
                MainFrame.LOG.severe(ex.getLocalizedMessage());
            }
        } else {
            try {
                data = MAIN.getController().selectAll();
                if (data == null){
                    BalloonTip tooltipBalloon = new BalloonTip(Buscar, "Nada encontrado.");
                    tooltipBalloon.setVisible(true);
                    return;
                }
            } catch (DatabaseException ex) {
                MainFrame.LOG.severe(ex.getLocalizedMessage());
            }
        }
        
        for (Servico servico : data){
            flag=true; times=0; //Tem que ser true em todas as verifs. para ser add
            if (isModelo.isSelected()){
                flag = servico.getModelo().contains(modeloField.getText());
                times++;
            }
            sitIF: if (isSituacao.isSelected()){
                if (flag==false && times!=0) break sitIF;
                flag = servico.getSituacao() == getSitFromRadio();
                times++;
            }
            cliIF: if (isIdCliente.isSelected()){
                if (flag==false && times!=0) break cliIF;
                flag = servico.getIdcliente() == (int) idClient.getValue();
                times++;
            }
            idUserIF: if (isIDusuario.isSelected()){
                if (flag==false && times!=0) break idUserIF;
                flag = servico.getUserId() == ((int) idUsuario.getValue());
                times++;
            }
            if (flag==true && times!=0) modeloTabela.addRow(servico);
        }

        changed=false;
    }//GEN-LAST:event_BuscarActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Event changed...">
    private void isModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isModeloActionPerformed
        changed = true;
    }//GEN-LAST:event_isModeloActionPerformed

    private void isSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isSituacaoActionPerformed
        changed = true;
    }//GEN-LAST:event_isSituacaoActionPerformed

    private void isIDServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDServicoActionPerformed
        changed = true;
    }//GEN-LAST:event_isIDServicoActionPerformed

    private void isIDusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDusuarioActionPerformed
        changed = true;
    }//GEN-LAST:event_isIDusuarioActionPerformed

    private void isPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPlacaActionPerformed
        changed = true;
    }//GEN-LAST:event_isPlacaActionPerformed
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
    
    private Situacao getSitFromRadio(){
        if (PagoCheck.isSelected())
            return Situacao.SERVICOPAGO;
        else
            return Situacao.PENDENTE;
    }
    
    public static final String EMPTY=null;
    public static final boolean NOT_SELECTED=false;
    
    @Override
    public void cleanAllFields() {      
        modeloField.setText(EMPTY);
        PagoCheck.setSelected(NOT_SELECTED);
        placaField.setText(EMPTY);
        idServico.setValue(0);
        idUsuario.setValue(0);
        idClient.setValue(0);
        
        isModelo.setSelected(NOT_SELECTED);
        isIdCliente.setSelected(NOT_SELECTED);
        isSituacao.setSelected(NOT_SELECTED);
        isPlaca.setSelected(NOT_SELECTED);
        isIDServico.setSelected(NOT_SELECTED);
        isIDusuario.setSelected(NOT_SELECTED);
    }

    @Override
    public void fillAllFields(Servico object) {
        modeloTabela.addRow(object);
    }

    @Override
    public Servico getInstance() {
        int row = tabela.getSelectedRow();
        Servico servico = null;
        if (row>=0){
            int servicoId = (int) tabela.getValueAt(row, ServicoTable.ROWID);
            servico = MAIN.getModel().getRowById(servicoId);
        } else {
            //Nunca deverá entrar aqui (Tem verificação "elsewhere").
            BalloonTip tooltipBalloon = new BalloonTip(tabela, "Selecione uma linha para poder concluir a operação.");
            tooltipBalloon.setVisible(true);
        }
        return servico;
    }

    private class ResultsTableModel extends ServicoTable{
        private void removeAll(){
            super.getList().clear();
        }
        @Override
        public void setRow(Servico object, int row){
            entidades.add(row, object);
            fireTableRowsDeleted(row, row);
            fireChangeProperty(new ChangePropertyEvent(object));
        }

        @Override
        public void setRow(Servico object) throws DatabaseException{
            int indexToUpdate = -1;
            int counter=0;
            for(Servico entidade : entidades){
                if (entidade.getRowId() == object.getRowId()){
                    indexToUpdate = counter;
                    break;
                }
                counter++;
            }

            if (indexToUpdate == -1){
                throw new DatabaseException("Objeto inexistente na tabela de "
                      + object.getClass() + ". Impossível atualizar.");
            }

            entidades.set(indexToUpdate, object);
            fireChangeProperty(new ChangePropertyEvent(object));
            fireTableRowsDeleted(indexToUpdate, indexToUpdate);
        }

        @Override
        public void addRow(Servico object){
            entidades.add(object);
            final int LASTROW = entidades.size()-1;
            fireTableRowsInserted(LASTROW, LASTROW);
            fireInsertion(new InsertionEvent(object));
        }

        @Override
        public void addAll(Collection<Servico> lista){
            entidades.addAll(lista);
            fireTableDataChanged();
        }

        @Override
        public void removeRow(Servico object){
            int indexToUpdate = -1;
            int counter=0;
            for(Servico entidade : entidades){
                if (entidade.equals(object)){
                    indexToUpdate = counter;
                    break;
                }
                counter++;
            }
        }

        @Override
        public void removeRow(int row){
            Servico object = entidades.get(row);
            entidades.remove(row);
            fireDeletion(new DeletionEvent(object));
            fireTableRowsDeleted(row, row);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JRadioButton PagoCheck;
    private javax.swing.JSpinner idClient;
    private javax.swing.JSpinner idServico;
    private javax.swing.JSpinner idUsuario;
    private javax.swing.JCheckBox isIDServico;
    private javax.swing.JCheckBox isIDusuario;
    private javax.swing.JCheckBox isIdCliente;
    private javax.swing.JCheckBox isModelo;
    private javax.swing.JCheckBox isPlaca;
    private javax.swing.JCheckBox isSituacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField modeloField;
    private javax.swing.JFormattedTextField placaField;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
