/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tolteco.sigma.view.financas;

import java.util.Date;
import java.util.logging.Level;
import tolteco.sigma.model.dao.DatabaseException;
import tolteco.sigma.model.entidades.Financa;
import tolteco.sigma.model.entidades.FinancaTipo;
import tolteco.sigma.model.entidades.Situacao;
import tolteco.sigma.view.MainFrame;
import tolteco.sigma.view.interfaces.Adicionar;

/**
 * Painel de adição de finanças.
 * @author Juliano Felipe
 */
public class AdicionarFinanca extends javax.swing.JPanel implements Adicionar<Financa>{
    private final MainFinanca MAIN;
    /**
     * Creates new form Cliente
     * @param main
     */
    public AdicionarFinanca(MainFinanca main) {
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

        Tipo = new javax.swing.ButtonGroup();
        ValorPanel = new javax.swing.JPanel();
        ValorField = new javax.swing.JFormattedTextField();
        SituacaoPanel = new javax.swing.JPanel();
        PagoCheck = new javax.swing.JCheckBox();
        TipoPanel = new javax.swing.JPanel();
        ReceitaRadio = new javax.swing.JRadioButton();
        DespesaRadio = new javax.swing.JRadioButton();
        DataPanel = new javax.swing.JPanel();
        DataChooser = new com.toedter.calendar.JDateChooser();
        ObsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ObsPane = new javax.swing.JTextPane();
        save = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        ValorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        ValorField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        javax.swing.GroupLayout ValorPanelLayout = new javax.swing.GroupLayout(ValorPanel);
        ValorPanel.setLayout(ValorPanelLayout);
        ValorPanelLayout.setHorizontalGroup(
            ValorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ValorField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ValorPanelLayout.setVerticalGroup(
            ValorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ValorField, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        SituacaoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

        PagoCheck.setText("Paga");

        javax.swing.GroupLayout SituacaoPanelLayout = new javax.swing.GroupLayout(SituacaoPanel);
        SituacaoPanel.setLayout(SituacaoPanelLayout);
        SituacaoPanelLayout.setHorizontalGroup(
            SituacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SituacaoPanelLayout.createSequentialGroup()
                .addComponent(PagoCheck)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SituacaoPanelLayout.setVerticalGroup(
            SituacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SituacaoPanelLayout.createSequentialGroup()
                .addComponent(PagoCheck)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TipoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        Tipo.add(ReceitaRadio);
        ReceitaRadio.setSelected(true);
        ReceitaRadio.setText("Receita");

        Tipo.add(DespesaRadio);
        DespesaRadio.setText("Despesa");

        javax.swing.GroupLayout TipoPanelLayout = new javax.swing.GroupLayout(TipoPanel);
        TipoPanel.setLayout(TipoPanelLayout);
        TipoPanelLayout.setHorizontalGroup(
            TipoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoPanelLayout.createSequentialGroup()
                .addComponent(ReceitaRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DespesaRadio))
        );
        TipoPanelLayout.setVerticalGroup(
            TipoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TipoPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(TipoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReceitaRadio)
                    .addComponent(DespesaRadio)))
        );

        DataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        javax.swing.GroupLayout DataPanelLayout = new javax.swing.GroupLayout(DataPanel);
        DataPanel.setLayout(DataPanelLayout);
        DataPanelLayout.setHorizontalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanelLayout.createSequentialGroup()
                .addComponent(DataChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DataPanelLayout.setVerticalGroup(
            DataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DataPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );

        save.setText("Salvar");
        save.setMaximumSize(new java.awt.Dimension(75, 23));
        save.setMinimumSize(new java.awt.Dimension(75, 23));
        save.setPreferredSize(new java.awt.Dimension(75, 23));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clean.setText("Limpar Campos");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ObsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ValorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SituacaoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TipoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TipoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ValorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SituacaoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clean))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
       cleanAllFields();
    }//GEN-LAST:event_cleanActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        Financa finn = getInstance();
        try {
            MAIN.getController().insert(finn);
        } catch (DatabaseException ex) {
            MainFrame.LOG.log(Level.SEVERE, null, ex);
            MAIN.displayDatabaseException(ex);
        }
    }//GEN-LAST:event_saveActionPerformed

    /**
     * Classe interna para decisão de
     * atributos de finanças.
     */
    private class DecidirTipoSituacao{
        private FinancaTipo decidirTipo (){
            if (ReceitaRadio.isSelected())
                return FinancaTipo.RECEITA;
            else if (DespesaRadio.isSelected())
                return FinancaTipo.DESPESA;
            else 
                throw new IllegalArgumentException("Nenhum JRadioButton selecionado "
                    + "impossível decidir o tipo da finança.");
        }
        
        private Situacao decidirSituacao (){
            if (PagoCheck.isSelected())
                return Situacao.FINACAPAGA;
            else 
                return Situacao.PENDENTE;
        }
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataChooser;
    private javax.swing.JPanel DataPanel;
    private javax.swing.JRadioButton DespesaRadio;
    private javax.swing.JTextPane ObsPane;
    private javax.swing.JPanel ObsPanel;
    private javax.swing.JCheckBox PagoCheck;
    private javax.swing.JRadioButton ReceitaRadio;
    private javax.swing.JPanel SituacaoPanel;
    private javax.swing.ButtonGroup Tipo;
    private javax.swing.JPanel TipoPanel;
    private javax.swing.JFormattedTextField ValorField;
    private javax.swing.JPanel ValorPanel;
    private javax.swing.JButton clean;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
    private static final String EMPTY="";
    
    @Override
    public void cleanAllFields() {
        ValorField.setText(EMPTY);
        DataChooser.setCalendar(null);
        ObsPane.setText(EMPTY);
        
        PagoCheck.setSelected(false);
        ReceitaRadio.setSelected(true);
    }

    @Override
    public void fillAllFields(Financa object) {
        ValorField.setText(Double.toString(object.getValor()));
        DataChooser.setDate(object.getData());
        ObsPane.setText(object.getObs());
        
        PagoCheck.setSelected(false);
        ReceitaRadio.setSelected(true);
    }

    @Override
    public Financa getInstance() {
        double valor = new Double(ValorField.getText());
        Date data = DataChooser.getDate();
        String obs = ObsPane.getText();
        
        DecidirTipoSituacao decisao = new DecidirTipoSituacao();
        FinancaTipo tipo = decisao.decidirTipo();
        Situacao situacao = decisao.decidirSituacao();
        
        return new Financa(tipo, data, valor, obs, situacao);
    }

}
