/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.servicos;

import java.util.logging.Level;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Servico;
import tolteco.sigma.model.entidades.Situacao;
import tolteco.sigma.view.MainFrame;
import tolteco.sigma.view.interfaces.Adicionar;

/**
 * Painel de adição de clientes.
 * @author Juliano Felipe
 */
public class ModificarServico extends javax.swing.JPanel implements Adicionar<Servico>{
    private final MainServico MAIN;
    
    /**
     * Creates new form Servico
     * @param main
     */
    public ModificarServico(MainServico main) {
        initComponents();
        this.MAIN = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModelPanel = new javax.swing.JPanel();
        ModelField = new javax.swing.JTextField();
        IDCPanel = new javax.swing.JPanel();
        idCliente = new javax.swing.JSpinner();
        PlacaPanel = new javax.swing.JPanel();
        PlacaField = new javax.swing.JFormattedTextField();
        KmPanel = new javax.swing.JPanel();
        KmField = new javax.swing.JTextField();
        ObsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ObsPane = new javax.swing.JTextPane();
        Salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SituacaoPanel = new javax.swing.JPanel();
        PagoCheck = new javax.swing.JCheckBox();
        IDServicoPanel = new javax.swing.JPanel();
        idServico = new javax.swing.JSpinner();
        IDUserPanel = new javax.swing.JPanel();
        idUser = new javax.swing.JSpinner();

        ModelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));

        javax.swing.GroupLayout ModelPanelLayout = new javax.swing.GroupLayout(ModelPanel);
        ModelPanel.setLayout(ModelPanelLayout);
        ModelPanelLayout.setHorizontalGroup(
            ModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ModelField, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );
        ModelPanelLayout.setVerticalGroup(
            ModelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModelPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ModelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        IDCPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Cliente"));

        idCliente.setEnabled(false);

        javax.swing.GroupLayout IDCPanelLayout = new javax.swing.GroupLayout(IDCPanel);
        IDCPanel.setLayout(IDCPanelLayout);
        IDCPanelLayout.setHorizontalGroup(
            IDCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        IDCPanelLayout.setVerticalGroup(
            IDCPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDCPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PlacaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa"));

        try {
            PlacaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout PlacaPanelLayout = new javax.swing.GroupLayout(PlacaPanel);
        PlacaPanel.setLayout(PlacaPanelLayout);
        PlacaPanelLayout.setHorizontalGroup(
            PlacaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlacaField, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );
        PlacaPanelLayout.setVerticalGroup(
            PlacaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlacaPanelLayout.createSequentialGroup()
                .addComponent(PlacaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        KmPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Quilometragem"));

        KmField.setToolTipText("");

        javax.swing.GroupLayout KmPanelLayout = new javax.swing.GroupLayout(KmPanel);
        KmPanel.setLayout(KmPanelLayout);
        KmPanelLayout.setHorizontalGroup(
            KmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KmField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        KmPanelLayout.setVerticalGroup(
            KmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ObsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        ObsPane.setToolTipText("Qualquer observação adicional sobre o cliente");
        jScrollPane2.setViewportView(ObsPane);

        javax.swing.GroupLayout ObsPanelLayout = new javax.swing.GroupLayout(ObsPanel);
        ObsPanel.setLayout(ObsPanelLayout);
        ObsPanelLayout.setHorizontalGroup(
            ObsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        ObsPanelLayout.setVerticalGroup(
            ObsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );

        Salvar.setText("Salvar");
        Salvar.setMaximumSize(new java.awt.Dimension(75, 23));
        Salvar.setMinimumSize(new java.awt.Dimension(75, 23));
        Salvar.setPreferredSize(new java.awt.Dimension(75, 23));
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolteco/sigma/view/images/General/Internal/Add.png"))); // NOI18N

        jButton1.setText("Limpar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SituacaoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

        PagoCheck.setText("Paga");

        javax.swing.GroupLayout SituacaoPanelLayout = new javax.swing.GroupLayout(SituacaoPanel);
        SituacaoPanel.setLayout(SituacaoPanelLayout);
        SituacaoPanelLayout.setHorizontalGroup(
            SituacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SituacaoPanelLayout.createSequentialGroup()
                .addComponent(PagoCheck)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        SituacaoPanelLayout.setVerticalGroup(
            SituacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SituacaoPanelLayout.createSequentialGroup()
                .addComponent(PagoCheck)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IDServicoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Serviço"));

        idServico.setEnabled(false);

        javax.swing.GroupLayout IDServicoPanelLayout = new javax.swing.GroupLayout(IDServicoPanel);
        IDServicoPanel.setLayout(IDServicoPanelLayout);
        IDServicoPanelLayout.setHorizontalGroup(
            IDServicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idServico, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        IDServicoPanelLayout.setVerticalGroup(
            IDServicoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDServicoPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        IDUserPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Usuário"));

        idUser.setEnabled(false);

        javax.swing.GroupLayout IDUserPanelLayout = new javax.swing.GroupLayout(IDUserPanel);
        IDUserPanel.setLayout(IDUserPanelLayout);
        IDUserPanelLayout.setHorizontalGroup(
            IDUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(idUser, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );
        IDUserPanelLayout.setVerticalGroup(
            IDUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IDUserPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ObsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDCPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IDServicoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SituacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlacaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ModelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlacaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDCPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDServicoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SituacaoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        try {
            MAIN.getController().update(getInstance());
        } catch (DatabaseException ex) {
            MainFrame.LOG.log(Level.SEVERE, null, ex);
            MAIN.displayDatabaseException(ex);
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cleanAllFields();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IDCPanel;
    private javax.swing.JPanel IDServicoPanel;
    private javax.swing.JPanel IDUserPanel;
    private javax.swing.JTextField KmField;
    private javax.swing.JPanel KmPanel;
    private javax.swing.JTextField ModelField;
    private javax.swing.JPanel ModelPanel;
    private javax.swing.JTextPane ObsPane;
    private javax.swing.JPanel ObsPanel;
    private javax.swing.JCheckBox PagoCheck;
    private javax.swing.JFormattedTextField PlacaField;
    private javax.swing.JPanel PlacaPanel;
    private javax.swing.JButton Salvar;
    private javax.swing.JPanel SituacaoPanel;
    private javax.swing.JSpinner idCliente;
    private javax.swing.JSpinner idServico;
    private javax.swing.JSpinner idUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private static final String EMPTY="";
    
    @Override
    public void cleanAllFields() {
        ModelField.setText(EMPTY);
        PlacaField.setText(EMPTY);
        ObsPane.setText(EMPTY);
        KmField.setText(EMPTY);
        PagoCheck.setSelected(false);
    }

    @Override
    public void fillAllFields(Servico object) {
        ModelField.setText(object.getModelo());
        PlacaField.setText(object.getPlaca());
        ObsPane.setText(object.getObs());
        KmField.setText(Double.toString( object.getKm() ));
        if (object.getSituacao() == Situacao.PENDENTE)
            PagoCheck.setSelected(false);
        else
            PagoCheck.setSelected(true);
        idCliente.setValue(object.getIdcliente());
        idServico.setValue(object.getRowid());
        idUser.setValue(object.getUserId());
    }

    @Override
    public Servico getInstance() {
        Situacao sit=Situacao.PENDENTE;
        if (PagoCheck.isSelected()) sit = Situacao.SERVICOPAGO;
        
        return new Servico((int) idServico.getValue(),
                (int) idCliente.getValue(), 
                PlacaField.getText(), 
                ModelField.getText(), 
                Double.parseDouble(KmField.getText()), 
                sit, 
                ObsPane.getText(),
                (int) idUser.getValue());
    }
}
