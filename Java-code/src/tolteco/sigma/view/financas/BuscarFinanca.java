/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.financas;

import java.util.Collection;
import java.util.List;
import net.java.balloontip.BalloonTip;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Financa;
import tolteco.sigma.model.entidades.FinancaTipo;
import tolteco.sigma.model.entidades.Situacao;
import tolteco.sigma.model.tables.FinancaTable;
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
public class BuscarFinanca extends javax.swing.JPanel implements Buscar<Financa>{
    private final MainFinanca MAIN;
    private final ResultsTableModel modeloTabela = new ResultsTableModel();
    
    /**
     * Creates new form BuscarFinanca
     * @param main
     */
    public BuscarFinanca(MainFinanca main) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        isTipo = new javax.swing.JCheckBox();
        isData = new javax.swing.JCheckBox();
        isIDFinanca = new javax.swing.JCheckBox();
        isIDusuario = new javax.swing.JCheckBox();
        idFinanca = new javax.swing.JSpinner();
        idUser = new javax.swing.JSpinner();
        isSituacao = new javax.swing.JCheckBox();
        receitaR = new javax.swing.JRadioButton();
        despesaR = new javax.swing.JRadioButton();
        pagoRadio = new javax.swing.JRadioButton();
        dataChooser = new com.toedter.calendar.JDateChooser();
        Buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        tabela.setModel(modeloTabela);
        jScrollPane1.setViewportView(tabela);

        searchPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        isTipo.setText("Tipo");
        isTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isTipoActionPerformed(evt);
            }
        });

        isData.setText("Data");
        isData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isDataActionPerformed(evt);
            }
        });

        isIDFinanca.setText("ID Finança");
        isIDFinanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isIDFinancaActionPerformed(evt);
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

        buttonGroup1.add(receitaR);
        receitaR.setSelected(true);
        receitaR.setText("Receita");

        buttonGroup1.add(despesaR);
        despesaR.setText("Despesa");

        pagoRadio.setText("Paga");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(isTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(receitaR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(despesaR))
                    .addComponent(dataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(isSituacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagoRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(isIDFinanca, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(isIDusuario)))
                .addGap(1, 1, 1)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idFinanca)
                    .addComponent(idUser, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isTipo)
                            .addComponent(receitaR)
                            .addComponent(despesaR)
                            .addComponent(isSituacao)
                            .addComponent(pagoRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isIDFinanca)
                            .addComponent(idFinanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isData)
                            .addComponent(isIDusuario)
                            .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
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
        if (isIDFinanca.isSelected() == false &&
            isSituacao.isSelected() == false &&
            isData.isSelected() == false &&
            isIDusuario.isSelected() == false &&
            isTipo.isSelected() == false){ //Nenhum filtro selecionado
            
            BalloonTip tooltipBalloon = new BalloonTip(Buscar, "Selecione pelo menos um filtro.");
            tooltipBalloon.setVisible(true);
            return;
        }
        
        if (!changed) return; //Se não mudou os estados dos campos, não há por que procuarar...

        modeloTabela.removeAll();
        
        boolean flag; 
        short times; //Se um for falso, nao verifica os outros
        
        List<Financa> data=null;
        Financa temp;
        //Identificadores únicos, não precisa procurar com outros
        if (isIDFinanca.isSelected()){
            try {
                temp = MAIN.getController().search((int)idFinanca.getValue());
                if (temp != null) modeloTabela.addRow(temp);
                else{
                    BalloonTip tooltipBalloon = new BalloonTip(Buscar, "Nada encontrado.");
                    tooltipBalloon.setVisible(true);
                }
                
                return;
            } catch (DatabaseException ex) {
                MainFrame.LOG.severe(ex.getLocalizedMessage());
            }
        } else if (isData.isSelected()){
            try {
                data = MAIN.getController().select(dataChooser.getDate());
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
        
        for (Financa financa : data){
            flag=true; times=0; //Tem que ser true em todas as verifs. para ser add
            if (isTipo.isSelected()){
                FinancaTipo toCompare;
                if (despesaR.isSelected()) toCompare = FinancaTipo.DESPESA;
                else                       toCompare = FinancaTipo.RECEITA;
                flag = financa.getTipo() == toCompare;
                times++;
            }
            telIF: if (isSituacao.isSelected()){
                if (flag==false && times!=0) break telIF;
                Situacao toCompareSit;
                if (pagoRadio.isSelected()) toCompareSit = Situacao.FINANCAPAGA;
                else                        toCompareSit = Situacao.PENDENTE;
                flag = financa.getSituacao() == toCompareSit;
                times++;
            }
            idUserIF: if (isIDusuario.isSelected()){
                if (flag==false && times!=0) break idUserIF;
                flag = financa.getUserId() == ((int) idUser.getValue());
                times++;
            }
            if (flag==true && times!=0) modeloTabela.addRow(financa);
        }

        changed=false;
    }//GEN-LAST:event_BuscarActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Event changed...">
    private void isTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isTipoActionPerformed
        changed = true;
    }//GEN-LAST:event_isTipoActionPerformed

    private void isDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isDataActionPerformed
        changed = true;
    }//GEN-LAST:event_isDataActionPerformed

    private void isIDFinancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDFinancaActionPerformed
        changed = true;
    }//GEN-LAST:event_isIDFinancaActionPerformed

    private void isIDusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isIDusuarioActionPerformed
        changed = true;
    }//GEN-LAST:event_isIDusuarioActionPerformed

    private void isSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isSituacaoActionPerformed
        changed = true;
    }//GEN-LAST:event_isSituacaoActionPerformed
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
        receitaR.setSelected(true);
        despesaR.setSelected(NOT_SELECTED);
        dataChooser.setDate(null);
        pagoRadio.setSelected(NOT_SELECTED);
        idFinanca.setValue(0);
        idUser.setValue(0);
        
        isTipo.setSelected(NOT_SELECTED);
        isData.setSelected(NOT_SELECTED);
        isSituacao.setSelected(NOT_SELECTED);
        isIDFinanca.setSelected(NOT_SELECTED);
        isIDusuario.setSelected(NOT_SELECTED);
    }

    @Override
    public void fillAllFields(Financa object) {
        modeloTabela.addRow(object);
    }

    @Override
    public Financa getInstance() {
        int row = tabela.getSelectedRow();
        Financa financa = null;
        if (row>=0){
            int finnId = (int) tabela.getValueAt(row, FinancaTable.ROWID);
            financa = MAIN.getModel().getRowById(finnId);
        } else {
            //Nunca deverá entrar aqui (Tem verificação "elsewhere").
            BalloonTip tooltipBalloon = new BalloonTip(tabela, "Selecione uma linha para poder concluir a operação.");
            tooltipBalloon.setVisible(true);
        }
        return financa;
    }

    private class ResultsTableModel extends FinancaTable{
        private void removeAll(){
            super.getList().clear();
        }
        
        @Override
        public void setRow(Financa object, int row){
            entidades.add(row, object);
            fireTableRowsDeleted(row, row);
            fireChangeProperty(new ChangePropertyEvent(object));
        }

        @Override
        public void setRow(Financa object) throws DatabaseException{
            int indexToUpdate = -1;
            int counter=0;
            for(Financa entidade : entidades){
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
        public void addRow(Financa object){
            entidades.add(object);
            final int LASTROW = entidades.size()-1;
            fireTableRowsInserted(LASTROW, LASTROW);
            fireInsertion(new InsertionEvent(object));
        }

        @Override
        public void addAll(Collection<Financa> lista){
            entidades.addAll(lista);
            fireTableDataChanged();
        }

        @Override
        public void removeRow(Financa object){
            int indexToUpdate = -1;
            int counter=0;
            for(Financa entidade : entidades){
                if (entidade.equals(object)){
                    indexToUpdate = counter;
                    break;
                }
                counter++;
            }
        }

        @Override
        public void removeRow(int row){
            Financa object = entidades.get(row);
            entidades.remove(row);
            fireDeletion(new DeletionEvent(object));
            fireTableRowsDeleted(row, row);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dataChooser;
    private javax.swing.JRadioButton despesaR;
    private javax.swing.JSpinner idFinanca;
    private javax.swing.JSpinner idUser;
    private javax.swing.JCheckBox isData;
    private javax.swing.JCheckBox isIDFinanca;
    private javax.swing.JCheckBox isIDusuario;
    private javax.swing.JCheckBox isSituacao;
    private javax.swing.JCheckBox isTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton pagoRadio;
    private javax.swing.JRadioButton receitaR;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
