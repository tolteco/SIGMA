/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ConecBD.ConexaoBanco;
import Controles.CadastroFControle;
import Entidades.Financa;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;
import javax.swing.BorderFactory;

/**
 * PROBLEMAS COM O ALINHAMENTO DOS ITENS!!
 *
 * @author Maycon
 */
public class CadastroFinancas extends javax.swing.JFrame {

    public TelaPrincipal telaanterior;
    public int metodo;
    Connection confinanca = null;

    /**
     * 19/12 - Maycon Creates new form TelaServicos
     */
    private CadastroFinancas() {
        initComponents();

        //Seta janela para o meio da tela, independente da resolução.
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        initNoicon(); //Seta "Logo vazio".
    }

    /**
     * 06/01/16 - Juliano Felipe Seta icone 1*1px (para "remover" icone default)
     */
    private void initNoicon() {
        Image No_ico = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
        this.setIconImage(No_ico);
    }

    /**
     * 03/02/16 - Juliano Felipe "Pseudo-construtor", chama o construtor padrão,
     * função de reutilização de jFrame e salva a instância do jFrame que chamou
     * este (para poder habilitá-lo quando esta tela é fechada.
     *
     * @param telanterior - Instância da tela anterior.
     * @param option - Modo que o jFrame será utilizado (1 para Cadastro, 2 para
     * consulta, etc).
     */
    public CadastroFinancas(TelaPrincipal telanterior, int option) {
        //Chamar construtor
        this();
        this.telaanterior = telanterior;
        metodo = option;
        metodosFinancas(option);
    }

    /**
     * 06/01/16 - Juliano Felipe Define metodos sobre a janela finacas,
     * reutilizando a mesma Variavel op chama o respectivo metodo
     *
     * @param op - Opção de reutilização 1 - Cadastro (esse método não é
     * chamado, devido a condição de chamada no construtor modificado); 2 -
     * Consulta; 3 - Modificação; 4 - Exclusão;
     */
    public void metodosFinancas(int op) {
        confinanca = ConexaoBanco.confinanca();
        if (op == 2) {
            this.setTitle("Consulta de registros financeiros");
            jFormattedTextField2.setEditable(false);
            jRadioButton1.setEnabled(false);
            jRadioButton2.setEnabled(false);
            jCheckBox1.setEnabled(false);
            jDateChooser1.setEnabled(false);
            jTextPane2.setEnabled(false);
            jButton2.setText("Consultar");
        }
        if (op == 3) {//Op==3 - Modificar
            this.setTitle("Modificação de registros financeiros");
        }
        if (op == 4) {//Op==4 - Excluir
            this.setTitle("Exclusão de registros financeiros");
        }
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
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPanel1 = new javax.swing.JPanel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SelectPanel = new javax.swing.JPanel();
        SitToggle = new javax.swing.JToggleButton();
        SelectButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de registros financeiros");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormattedTextField2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Receita");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Despesa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButton1)
                .addComponent(jRadioButton2))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        jTextPane2.setToolTipText("Qualquer observação adicional.");
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

        jCheckBox1.setText("Pago");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCheckBox1)
        );

        jButton2.setText("Salvar");
        jButton2.setMaximumSize(new java.awt.Dimension(75, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(75, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(75, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SelectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), "Consultar Finança"));

        SitToggle.setText("Não pago");

        SelectButton.setText("Consultar");
        SelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SelectPanelLayout = new javax.swing.GroupLayout(SelectPanel);
        SelectPanel.setLayout(SelectPanelLayout);
        SelectPanelLayout.setHorizontalGroup(
            SelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectPanelLayout.createSequentialGroup()
                .addComponent(SitToggle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(SelectButton))
        );
        SelectPanelLayout.setVerticalGroup(
            SelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SelectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SitToggle)
                    .addComponent(SelectButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SelectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SelectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertFinanca(boolean tipo, String data, double valor, boolean sit, String obs) {
        try {
            String sql1 = "Insert into financa (tipo,data,valor,sit,obs) values (?,?,?,?,?)";
            PreparedStatement pst = confinanca.prepareStatement(sql1);
            pst.setBoolean(1, tipo);
            pst.setString(2, data);
            pst.setDouble(3, valor);
            pst.setBoolean(4, sit);
            pst.setString(5, obs);
            pst.execute();
            confinanca.close();

            System.out.println("Eh pra ter conseguido!!");
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "Erro. Código: DEFINIR ERRO!!!!", title, JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.out.println("Nao deu certo aqui!!");
            System.exit(0);
        }
    }

    /**
     * 06/02/16 - Juliano Felipe 
     * Método para pegar a data do jDayChooser (pertencente ao jCalendar)
     * e transformar no padrão salvo no banco de dados.
     * 
     * @param date - Data a ser transformada para o padrão (obtida por 
     * ".getDate().toString();")
     * 
     * @return String de data no formato estipulado
     */
    private String getJDate(String date){
        String[] split = date.split(" ",6);     //split by spaces        
        String day = split[2]; 
        String month = split[1];
        String year = split[5];
        
        switch (month) {
            case "Jan":
                month = "01";
                break;
            case "Feb":
                month = "02";               
                break;
            case "Mar":
                month = "03";                
                break;
            case "Apr":
                month = "04";                
                break;
            case "May":
                month = "05";                
                break;
            case "Jun":
                month = "06";                
                break;
            case "Jul":
                month = "07";                
                break;
            case "Aug":
                month = "08";                
                break;
            case "Sep":
                month = "09";                
                break;
            case "Oct":
                month = "10";                
                break;
            case "Nov":
                month = "11";                
                break;
            case "Dec":
                month = "12";                
                break;
            }
        
        return day + "/" + month + "/" + year;
    }
    
    /**
     * 06/02/16 - Juliano Felipe 
     * Método para pegar a String do "jFormattedTextField2"
     * e transformá-la no padrão salvo no banco de dados (double).
     * 
     * @param valorText - String a ser transformada para o padrão double.
     * 
     * @return valor double convertido.
     */
    private double getValor (String valorText){
        //Split nas vírgulas - Exemplo: 1,234.00  --> 1234.00
        String[] split = valorText.split(","); //Split on commas
        int i,j = split.length; //Contagem de "trios separados por virgulas"
        valorText=""; //String passada por parâmetro não mais necessária,
                     //A inicializa para ser "convertida".
        for (i=0; i<j; i++){
            valorText+=split[i]; //Concatena-se as partes
        }
        
        return Double.parseDouble(valorText);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Botão Salvar pressionado
        /**
         * 06/01/16 - Juliano Definido a opcao 2 (consultar), altera-se a funcao
         * do botao salvar 03/02/16 - Maycon Apagada funcao do Juliano, colar
         * quando fizer-se necessario
         */
        //Botão Salvar pressionado
        double valor = getValor (jFormattedTextField2.getValue().toString());
        
        String data = getJDate(jDateChooser1.getDate().toString());
        
        boolean sit = jCheckBox1.isEnabled();
        boolean rec = jRadioButton2.isEnabled();
        boolean des = jRadioButton1.isEnabled();
        boolean tipo = false;
        if (rec == true) {
            tipo = true;
        } else if (des == true) {
            tipo = false;
        }
        String obs = jTextPane2.getText();

        Financa p = new Financa(tipo, data, valor, obs, sit);
        //Chama o controle para cadastrar
        CadastroFControle C = new CadastroFControle();

        /**
         * 03/02 - Maycon TESTE PARA VERIFICAÇÃO SE OS DADOS DA FINANCA FORAM
         * RECEBIDOS
         *
         */
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Tipo: " + tipo);
        System.out.println("Situacao: " + sit);
        System.out.println("Obs: " + obs);
        /**
         * FIM DO TESTE!!!!
         */

        if (C.cadastrarfinanca(p)) {
            //Insere no banco de dados
            insertFinanca(tipo, data, valor, sit, obs);

            //JOptionPane.showMessageDialog(this, "Cadastrado com sucesso", title, JOptionPane.INFORMATION_MESSAGE); ERRO NA EXIBIÇÃO DESSA JANELA!!!!
            this.dispose();
            telaanterior.setEnabled(true);
            telaanterior.requestFocus(); //Traz o foco para tela anterior
        } else {
            //JOptionPane.showMessageDialog(this, "Erro. Código: A DEFINIR!!!!", title, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botão Cancelar pressionado
        this.dispose();
        telaanterior.setEnabled(true);
        telaanterior.requestFocus(); //Traz o foco para tela anterior
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        /**
         * 05/01 - Maycon Tela fechada
         */
        telaanterior.setEnabled(true);
        telaanterior.requestFocus(); //Traz o foco para tela anterior
    }//GEN-LAST:event_formWindowClosed

    private void PanelColor (Color cor){
        Border line = BorderFactory.createLineBorder(cor);
        TitledBorder Brdr = BorderFactory.createTitledBorder(line,"Consultar Finança");
        Brdr.setTitleJustification(TitledBorder.LEFT);
        Brdr.setTitlePosition(TitledBorder.TOP);
        SelectPanel.setBorder (Brdr);
    }
    
    private void SelectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectButtonActionPerformed
        System.out.println ("CONSULTOU UMA FINANÇA");
        PanelColor (Color.GREEN);
        JOptionPane.showMessageDialog(null, "Não faz nada, só uma ideia.\nA borda ficou verde.", "NOTOU ESSE TITULO, MORTAL", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_SelectButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFinancas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectButton;
    private javax.swing.JPanel SelectPanel;
    private javax.swing.JToggleButton SitToggle;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
