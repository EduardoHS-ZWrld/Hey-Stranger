/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Conexões.MySQL;
import Objetos.Pessoa;
import java.util.EmptyStackException;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class NewClient extends javax.swing.JFrame {

    MySQL conectar = new MySQL(); //acessar os métodos de conexao com o banco
    Pessoa nClient = new Pessoa(); //acessar os atributos da classe cliente
    
    String mês;
    
    public NewClient() {
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

        jPanel2 = new javax.swing.JPanel();
        NomeCompleto = new javax.swing.JLabel();
        nomecTxt = new javax.swing.JTextField();
        cadastrarSe = new javax.swing.JButton();
        CPF = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JFormattedTextField();
        DataNascença = new javax.swing.JLabel();
        monthTxt = new javax.swing.JComboBox<>();
        dayTxt = new javax.swing.JComboBox<>();
        yearTxt = new javax.swing.JComboBox<>();
        Estado = new javax.swing.JLabel();
        estadoTxt = new javax.swing.JComboBox<>();
        Cidade = new javax.swing.JLabel();
        endeTxt = new javax.swing.JTextField();
        Endereço = new javax.swing.JLabel();
        cityTxt = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        SenhaConf = new javax.swing.JLabel();
        passwTxt = new javax.swing.JPasswordField();
        cpasswTxt = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NomeCompleto.setText("Nome Completo:");

        nomecTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cadastrarSe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cadastrarSe.setText("Se cadastrar");
        cadastrarSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarSeActionPerformed(evt);
            }
        });

        CPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPF.setText("CPF:");

        try {
            cpfTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfTxt.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        cpfTxt.setMinimumSize(new java.awt.Dimension(64, 30));

        DataNascença.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DataNascença.setText("Data de Nascença:");

        monthTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        monthTxt.setToolTipText("Mês");
        monthTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        monthTxt.setName("Mês"); // NOI18N
        monthTxt.setPreferredSize(new java.awt.Dimension(69, 30));

        dayTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayTxt.setPreferredSize(new java.awt.Dimension(69, 30));

        yearTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930" }));

        Estado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Estado.setText("Estado:");

        estadoTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoTxt.setPreferredSize(new java.awt.Dimension(69, 30));

        Cidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cidade.setText("Cidade:");

        endeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Endereço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Endereço.setText("Endereço:");

        cityTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Email.setText("E-mail:");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Senha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Senha.setText("Senha:");

        SenhaConf.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        SenhaConf.setText("Confirmação de Senha:");

        cpasswTxt.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Endereço)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SenhaConf)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cpasswTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Senha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailTxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(NomeCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomecTxt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CPF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Estado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Cidade)
                                        .addGap(18, 18, 18)
                                        .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(DataNascença)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(monthTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(dayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(yearTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                            .addComponent(endeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cadastrarSe, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeCompleto)
                    .addComponent(nomecTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataNascença)
                    .addComponent(monthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yearTxt)
                    .addComponent(dayTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estado)
                    .addComponent(estadoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cidade)
                    .addComponent(cityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Endereço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Senha)
                .addGap(2, 2, 2)
                .addComponent(passwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaConf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpasswTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(cadastrarSe, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 490, 560));

        Logo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\Documents\\Facens\\2º Semestre\\Linguagem de Programação - Prof. Márcio\\imagens HeyStranger\\HS-Logo2.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarSeActionPerformed
        try {
            switch(monthTxt.getSelectedIndex()){
            case 0:     mês = "1";  break;
            case 1:     mês = "2";  break;
            case 2:     mês = "3";  break;
            case 3:     mês = "4";  break;
            case 4:     mês = "5";  break;
            case 5:     mês = "6";  break;
            case 6:     mês = "7";  break;
            case 7:     mês = "8";  break;
            case 8:     mês = "9";  break;
            case 9:     mês = "10"; break;
            case 10:    mês = "11"; break;
            case 11:    mês = "12"; break;
            }
            
            // Método para fazer as variaveis receberem seus valores
            nClient.novoCliente(nomecTxt.getText(), 
                yearTxt.getSelectedItem()+"-"+mês+"-"+dayTxt.getSelectedItem(), 
                cpfTxt.getText(), 
                estadoTxt.getToolTipText(), 
                cityTxt.getText(), 
                endeTxt.getText(), 
                emailTxt.getText(), 
                passwTxt.getText());
        
            if (passwTxt.getText().equals(cpasswTxt.getText())) {
                System.out.println("Senha confirmada");
            } else {
                throw new EmptyStackException();
            }
        
            conectar.conectaBanco();
        
            this.conectar.entrarSQL("call heystranger.insertCliente("
                    + "'" + nClient.getNome() + "',"
                    + "'" + nClient.getDataN() + "',"
                    + "'" + nClient.getCpf() + "',"
                    + "'" + nClient.getEstado() + "',"
                    + "'" + nClient.getCity() + "',"
                    + "'" + nClient.getEnde() + "',"
                    + "'" + nClient.getEmail() + "',"
                    + "'" + nClient.getPassw() + "',"
                + ");");
            
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Algum campo não foi preenchido.");
        } catch(EmptyStackException e) {
            JOptionPane.showMessageDialog(null, "Senha não confirmada.");
            passwTxt.setText("");
            cpasswTxt.setText("");
        }
        
    }//GEN-LAST:event_cadastrarSeActionPerformed

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
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel DataNascença;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereço;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NomeCompleto;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel SenhaConf;
    private javax.swing.JButton cadastrarSe;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JPasswordField cpasswTxt;
    private javax.swing.JFormattedTextField cpfTxt;
    private javax.swing.JComboBox<String> dayTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JTextField endeTxt;
    private javax.swing.JComboBox<String> estadoTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> monthTxt;
    private javax.swing.JTextField nomecTxt;
    private javax.swing.JPasswordField passwTxt;
    private javax.swing.JComboBox<String> yearTxt;
    // End of variables declaration//GEN-END:variables
}
