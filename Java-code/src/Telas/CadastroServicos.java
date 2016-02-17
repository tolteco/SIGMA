/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


import ConecBD.ConexaoBanco;
import Controles.CadastroSControle;
import Entidades.Servico;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.AbstractDocument;
import Controles.UppercaseDocumentFilter;
import javax.swing.text.DocumentFilter;


/**
 * 29/11/15 - Juliano Felipe
 * Inserção incial de campos.
 */

/**
 *
 * @author Maycon
 */
public class CadastroServicos extends javax.swing.JFrame {
public TelaPrincipal telaanterior;
    public int metodo;
    private String title;
    private int serviceId=-1;
    Connection Mul = null;

    /**
     * 05/12 - Maycon
     * Creates new form TelaServicos
     */
    private CadastroServicos() {
        initComponents();
        initNoicon ();
        
        //Seta janela para o meio da tela, independente da resolução.
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        title = this.getTitle(); //Pega o título do frame
        
        DocumentFilter UpperFilter = new UppercaseDocumentFilter();
        ((AbstractDocument) PlacaField.getDocument()).setDocumentFilter(UpperFilter);
        ((AbstractDocument) ClienteField.getDocument()).setDocumentFilter(UpperFilter);
    }
    
    /**
    * 12/12/15 - Juliano Felipe
    * Seta icone 1*1px (para "remover" icone default)
    */
    private void initNoicon (){
        Image No_ico = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
        this.setIconImage(No_ico);
    }

    /**
    * 03/02/16 - Juliano Felipe
    * "Pseudo-construtor", chama o construtor padrão, função de reutilização de jFrame e salva
    * a instância do jFrame que chamou este (para poder habilitá-lo quando esta tela é fechada.
    * @param telanterior - Instância da tela anterior. 
    * @param option - Modo que o jFrame será utilizado (1 para Cadastro, 2 para consulta, etc).
    */
    public CadastroServicos(TelaPrincipal telanterior, int option) {
        //Chamar construtor
        this();
        this.telaanterior = telanterior;
        metodo = option;
        metodosServicos (option);
    }
    
    /**
     * 06/01/16 - Juliano Felipe Define metodos sobre a janela servicos,
     * reutilizando a mesma Variavel op chama o respectivo metodo
     * @param op - Opção de reutilização
     * 1 - Cadastro (esse método não é chamado, devido a condição de chamada no construtor modificado);
     * 2 - Consulta;
     * 3 - Modificação;
     * 4 - Exclusão;
     */
    public void metodosServicos (int op){
        Mul = ConexaoBanco.Multiple();
        IDField.setEnabled(false);
        if (op>=2){//Op==2 - Consulta
           this.setTitle("Consulta de serviços"); 
           jFormattedTextField2.setEnabled(false);
           KMField.setEnabled(false);
           jCheckBox1.setEnabled(false);
           jTextPane1.setEnabled(false);
           IDField.setEnabled(false);
           ClienteField.setEnabled(false);
           ConsultarCliente.setEnabled(false);
           jButton1.setText("Consultar");
        }
        if (op==3){//Op==3 - Modificar
           this.setTitle("Modificação de serviços");       
        }
        if (op==4){//Op==4 - Excluir
           this.setTitle("Exclusão de serviços");       
        }
        if (op==5){//Op==5 - Quitar
           this.setTitle("Quitar serviços"); //Escolhi essa opção para "4" ser padrão de exclusão entre as janelas - Juliano      
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PlacaPanel = new javax.swing.JPanel();
        PlacaField = new javax.swing.JTextField();
        KMPanel = new javax.swing.JPanel();
        KMField = new javax.swing.JFormattedTextField();
        ModeloPanel = new javax.swing.JPanel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        ObsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        SitPanel = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        ClientePanel = new javax.swing.JPanel();
        ClienteField = new javax.swing.JTextField();
        ConsultarCliente = new javax.swing.JButton();
        IDField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de serviços");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PlacaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa"));

        javax.swing.GroupLayout PlacaPanelLayout = new javax.swing.GroupLayout(PlacaPanel);
        PlacaPanel.setLayout(PlacaPanelLayout);
        PlacaPanelLayout.setHorizontalGroup(
            PlacaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PlacaField)
        );
        PlacaPanelLayout.setVerticalGroup(
            PlacaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlacaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PlacaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        KMPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Quilometragem"));

        KMField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        javax.swing.GroupLayout KMPanelLayout = new javax.swing.GroupLayout(KMPanel);
        KMPanel.setLayout(KMPanelLayout);
        KMPanelLayout.setHorizontalGroup(
            KMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KMField, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );
        KMPanelLayout.setVerticalGroup(
            KMPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KMPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(KMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ModeloPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));

        javax.swing.GroupLayout ModeloPanelLayout = new javax.swing.GroupLayout(ModeloPanel);
        ModeloPanel.setLayout(ModeloPanelLayout);
        ModeloPanelLayout.setHorizontalGroup(
            ModeloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        ModeloPanelLayout.setVerticalGroup(
            ModeloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ObsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout ObsPanelLayout = new javax.swing.GroupLayout(ObsPanel);
        ObsPanel.setLayout(ObsPanelLayout);
        ObsPanelLayout.setHorizontalGroup(
            ObsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        ObsPanelLayout.setVerticalGroup(
            ObsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        SitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

        jCheckBox1.setText("Concluído");

        javax.swing.GroupLayout SitPanelLayout = new javax.swing.GroupLayout(SitPanel);
        SitPanel.setLayout(SitPanelLayout);
        SitPanelLayout.setHorizontalGroup(
            SitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        SitPanelLayout.setVerticalGroup(
            SitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jCheckBox1))
        );

        ClientePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), "Cliente"));

        ConsultarCliente.setText("Consultar");
        ConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        javax.swing.GroupLayout ClientePanelLayout = new javax.swing.GroupLayout(ClientePanel);
        ClientePanel.setLayout(ClientePanelLayout);
        ClientePanelLayout.setHorizontalGroup(
            ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientePanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClienteField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarCliente))
        );
        ClientePanelLayout.setVerticalGroup(
            ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ConsultarCliente)
                .addComponent(ClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClientePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ObsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PlacaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KMPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ModeloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(KMPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlacaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ModeloPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ObsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Botão Cancelar pressionado
        this.dispose();
        telaanterior.setEnabled(true);
        telaanterior.requestFocus(); //Traz o foco para tela anterior
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        /**
         * 05/12 - Maycon
         * Tela fechada
         */
        telaanterior.setEnabled(true);
        telaanterior.requestFocus(); //Traz o foco para tela anterior
    }//GEN-LAST:event_formWindowClosed

    /**
     * 09/02/16 - Juliano Felipe
     * Função para inserção de serviços no banco de dados
     * @param idCliente - Id do cliente para qual o serviço será prestado
     * @param placa do veículo
     * @param modelo do veículo
     * @param km do veículo no momento de início do serviço
     * @param situacao do serviço (Concluído=true; não concluido=false)
     * @param obs a respeito do serviço
     */
    private void insertService(String placa, int km, String modelo,  boolean situacao, int idCliente, String obs) throws Exception{
        PreparedStatement pst = null;
        try {
            String sql1 = "INSERT INTO servico (Placa,Quilometragem,Modelo,Situacao,Idcliente,Obs) VALUES (?,?,?,?,?,?)";
            pst = Mul.prepareStatement(sql1);
            pst.setString (1, placa);
            pst.setInt    (2, km);
            pst.setString (3, modelo);
            pst.setBoolean(4, situacao);
            pst.setInt    (5, idCliente);
            pst.setString (6, obs);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-06.", title, JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        } finally {
            if (pst != null) 
                pst.close();
            if (Mul != null) 
                Mul.close();
        }
    }
    
    /**
     * 09/02/16 - Juliano Felipe
     * Função para consulta de serviços no banco de dados.
     * @param placa do veículo (Consulta por placa).
     * @return id do serviço pesquisado.
     */
    private int selectService (String placa){
        this.setEnabled(false);
        String []columnNames = {"rowid","Placa","Quilometragem","Modelo","Situacao","Nome do Cliente","Idcliente","Obs"};
        MultipleTable MServiceTable = new MultipleTable (this, columnNames, placa);
        MServiceTable.setVisible(true);
        
        //Gets
        //nome = MServiceTable.getString();
        int rowid = MServiceTable.getId();
        Object[] rowDados = MServiceTable.getRow();
        
        PlacaField.setText(rowDados[1].toString());
        KMField.setText(rowDados[2].toString());
        jFormattedTextField2.setText(rowDados[3].toString());
        
        String tmp = rowDados[4].toString();
        if (tmp.equals("Concluído")){
            jCheckBox1.setSelected(true);
        } else if (tmp.equals("Inconcluído")){
            jCheckBox1.setSelected(false);
        }
        
        ClienteField.setText(rowDados[5].toString());
        PanelColor (4, Color.GREEN);
        IDField.setText(rowDados[6].toString());
        jTextPane1.setText(rowDados[7].toString());
        
        MServiceTable.parafechar.dispose();
        
        return rowid;
    }
    
    /**
     * 09/02/16 - Juliano Felipe
     * Função para atualizar dados do serviço no banco de dados.
     * @param idCliente - Id do cliente para qual o serviço será prestado
     * @param placa do veículo
     * @param modelo do veículo
     * @param km do veículo no momento de início do serviço
     * @param situacao do serviço (Concluído=true; não concluido=false)
     * @param obs a respeito do serviço
     */
    private void updateService (String placa, int km, String modelo,  boolean situacao, int idCliente, String obs, int rowid) throws Exception{
        if (rowid==-1){
            JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-07.", title, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        PreparedStatement pst = null;
        try {
            String sql1 = "UPDATE servico SET Placa=?, Quilometragem=?, Modelo=?, Situacao=?, Idcliente=?, Obs=? WHERE rowid="+rowid;
            pst = Mul.prepareStatement(sql1);
            pst.setString (1, placa);
            pst.setInt    (2, km);
            pst.setString (3, modelo);
            pst.setBoolean(4, situacao);
            pst.setInt    (5, idCliente);
            pst.setString (6, obs);
            pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-08.", title, JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            //System.exit(0);
        } finally {
            if (pst != null) 
                pst.close();
            if (Mul != null) 
                Mul.close();
        }
    }

    /**
     * 14/02/16 - Juliano Felipe
     * Função para validar campos obrigatórios. Verifica campos obrigatórios.
     * Também valida os outros campos (caso não estejam vazios).
     * @return valido - Todos os campos validos.
     */
    private boolean validateFields (){
        //Obrigatórios placa e idCliente
        boolean valido=true;
        
        //Trecho de placa
        String placa = PlacaField.getText();
        int length = placa.length();
        int num_count=0, char_count=0;
        for (int i=0; i<length; i++){
            if (Character.isDigit(placa.charAt(i))) num_count++;
            else if (Character.isLetter(placa.charAt(i))) char_count++;
        }
        if (num_count>3 || char_count>4){ //Placa tem que ter 3 nums. e 4 letras.
            //BalloonTip(PlacaField, "Placa inválida. Deve conter 3 números e 4 letras, em qualquer ordem.");
            System.err.println("Erro. Código: 04-04-0E");
            PanelColor (0, Color.RED);
            valido=false;
        } else {
            PanelColor (0, Color.GREEN);
        }
        
        //Trecho de idcliente
        int idcliente = Integer.parseInt(IDField.getText());
        if (idcliente<=0){
            PanelColor (4, Color.RED);
            System.err.println("Erro. Código: 04-04-0F");
            valido=false;
        }
        return valido;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!validateFields()) return;
        
        /**
         * 03/02/16 - Juliano
         * Definido a opcao 2 (consultar), altera-se a funcao do botao salvar
         */
        //Trecho de consultar clientes. Apenas
        if (metodo == 2) {
            //Id (no retorno) não é necessário.
            selectService (PlacaField.getText()); //Consulta por PLACA
            return; //Somente consulta, nao necessario salvar dados
        }

        //Trecho de Modificar serviços. Consulta, lista, habilita edição, salva, e chama o "refresh"
        //(para outra modificação sem fechar a janela).
        if (metodo == 3) {
            String flag = jButton1.getText();
            if (!flag.equals("Modificar")){
                serviceId = selectService (PlacaField.getText());
                if (serviceId==-1){
                    JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-04.", title, JOptionPane.ERROR_MESSAGE);
                    return;
                }
                jFormattedTextField2.setEnabled(true);
                KMField.setEnabled(true);
                jCheckBox1.setEnabled(true);
                jTextPane1.setEnabled(true);
                ClienteField.setEnabled(true);
                ConsultarCliente.setEnabled(true);
            }else{
                int id = Integer.parseInt(IDField.getText());
                String KM = KMField.getText();
                String[] split = KM.split(Pattern.quote(".")); // Split no "." (Ponto final)
                int length = split.length;
                KM="";
                for (int i=0; i<length; i++){
                    KM+= split[i];
                }
                split = KM.split(Pattern.quote(","));
                KM = split[0];
                try {
                    updateService (PlacaField.getText(), Integer.parseInt(KM), jFormattedTextField2.getText(),  jCheckBox1.isSelected(), id, jTextPane1.getText(), serviceId);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-05.", title, JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getClass().getName() + ": " + e.getMessage());
                }
                
                metodosServicos(3); //Resetar modificação
                return;
            }
            jButton1.setText("Modificar");
            return;
        }
        
        //Trecho de excluir serviços. Consulta e exclui
        if (metodo == 4) {
            String flag = jButton1.getText();
            if (!flag.equals("Excluir")){
                serviceId = selectService (PlacaField.getText());
                if (serviceId==-1){
                    JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-09.", title, JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }else{
                try {
                    String sql1 = "DELETE FROM servico WHERE rowid="+serviceId;
                    PreparedStatement pst = Mul.prepareStatement(sql1);            
                    pst.execute();
                    Mul.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-0A.", title, JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getClass().getName() + ": " + e.getMessage());
                    System.exit(0);
                }
                
                jButton1.setEnabled(false); //Para não tentar Excluir novamente
                jButton2.setText("Sair");
            }
            jButton1.setText("Excluir");
            return;
        }
        
        //Trecho de quitar serviços. Consulta os dados e força salvar com a situação em true (Quitado)
        if (metodo==5){
            String flag = jButton1.getText();
            if (!flag.equals("Quitar")){
                serviceId = selectService (PlacaField.getText());
                if (jCheckBox1.isSelected()){
                    JOptionPane.showMessageDialog(this, "Serviço já quitado.\nCódigo: 04-04-0B.", title, JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (serviceId==-1){
                    JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-0C.", title, JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }else{
                int id = Integer.parseInt(IDField.getText());
                String KM = KMField.getText();
                String[] split = KM.split(Pattern.quote(".")); // Split no "." (Ponto final)
                int length = split.length;
                KM="";
                for (int i=0; i<length; i++){
                    KM+= split[i];
                }
                split = KM.split(Pattern.quote(","));
                KM = split[0];
                try {//Passando "True" no lugar do "jCheckBox1.isSelected()" para o usuário não precisar clicar.
                    updateService (PlacaField.getText(), Integer.parseInt(KM), jFormattedTextField2.getText(),  true, id, jTextPane1.getText(), serviceId);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-0D.", title, JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getClass().getName() + ": " + e.getMessage());
                }
                
                metodosServicos(5); //Resetar modificação
                return;
            }
            jButton1.setText("Quitar");
            return;
        }
        
        /**
         * 04/01 - Maycon
         * Botão salvar pressionado
         */
        //Trecho de cadastro de clientes (Chega aqui se não saiu em nenhum trecho antes. Default).
        String placa = PlacaField.getText();
        String modelo = jFormattedTextField2.getText();
        String KM = KMField.getText();
        String obs = jTextPane1.getText();
        boolean sit = jCheckBox1.isSelected();  //Outro método para que true seja para "checked" no concluído
        String txtId = IDField.getText();
        
        String[] split = KM.split(Pattern.quote(".")); // Split no "." (Ponto final)
        int length = split.length;
        KM="";
        for (int i=0; i<length; i++){
            KM+= split[i];
        }
        //KM = KM.replaceAll(",","."); //Se fosse DOUBLE, seria bom trocar a , decimal para o .
        split = KM.split(Pattern.quote(","));
        KM = split[0];
        
        int km=0, idc=-1;
        try {
            km = Integer.parseInt(KM);
            idc = Integer.parseInt(txtId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-01.", title, JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getClass().getName() + ": " + e.getMessage());            return;
        }
               
        Servico N = new Servico(idc, placa, modelo, km, sit, obs);
        //Chama o controle para cadastrar
        CadastroSControle C = new CadastroSControle();
        if (C.cadastrarservico(N)) {
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
            try {
                insertService(placa, km, modelo, sit, idc, obs);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-05.", title, JOptionPane.ERROR_MESSAGE);
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
            }
            this.dispose();
            telaanterior.setEnabled(true);
            telaanterior.requestFocus(); //Traz o foco para tela anterior
        } else {
            JOptionPane.showMessageDialog(this, "Erro. Código: 04-04-02.", title, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * 06/02/16 - Juliano Felipe 
    * Método para alterar a cor dos painéis.
    * Coloca uma borda igual a padrão, no entando, altera-se a cor.
    * 
    * @param Borda Int dizendo qual borda deve ser pintada.
    * @param cor para pintar a borda.
    */
    private void PanelColor (int Borda, Color cor){
        String[] titles = {"Placa", "Quilometragem", "Modelo", "Situação", "Cliente", "Observações"};
        Border line = BorderFactory.createLineBorder(cor);
        TitledBorder Brdr = BorderFactory.createTitledBorder(line,titles[Borda]);
        Brdr.setTitleJustification(TitledBorder.LEFT);
        Brdr.setTitlePosition(TitledBorder.TOP);
        switch (Borda) {
            case 0:
                PlacaPanel.setBorder (Brdr);
                break;
            case 1:
                KMPanel.setBorder (Brdr);
                break;
            case 2:
                ModeloPanel.setBorder (Brdr);
                break;
            case 3:
                SitPanel.setBorder (Brdr);
                break;
            case 4:
                ClientePanel.setBorder (Brdr);
                break;
            case 5:
                ObsPanel.setBorder (Brdr);
                break;
            }
    }
    
    private void ConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarClienteActionPerformed
        String fname = ClienteField.getText();
        if (fname.isEmpty() || fname.charAt(0)==' '){ //Vazio ou começa com espaço
            JOptionPane.showMessageDialog(this, "Campo de cliente vazio ou iniciando por espaço. Código: 04-04-03.", title, JOptionPane.WARNING_MESSAGE);
            return;
        }
                
        this.setEnabled(false);
        MultipleEntries multipleEntries = new MultipleEntries(this, fname);
        multipleEntries.setVisible(true);
        
        String nome = multipleEntries.getString();
        int rowid = multipleEntries.getId();
        
        multipleEntries.parafechar.dispose();
        
        IDField.setText("" + rowid); //Gambiarra de transformação de int para String
        ClienteField.setText(nome);
        
        if (rowid>0) //Retornou um id existente
            PanelColor (4, Color.GREEN);
    }//GEN-LAST:event_ConsultarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClienteField;
    private javax.swing.JPanel ClientePanel;
    private javax.swing.JButton ConsultarCliente;
    private javax.swing.JTextField IDField;
    private javax.swing.JFormattedTextField KMField;
    private javax.swing.JPanel KMPanel;
    private javax.swing.JPanel ModeloPanel;
    private javax.swing.JPanel ObsPanel;
    private javax.swing.JTextField PlacaField;
    private javax.swing.JPanel PlacaPanel;
    private javax.swing.JPanel SitPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
