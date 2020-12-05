package View;

import Conexões.MySQL;
import Objetos.Pessoa;
import java.awt.event.WindowEvent;
import java.util.EmptyStackException;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class NewClient extends javax.swing.JFrame {

    MySQL conectar = new MySQL(); //acessar os métodos de conexao com o banco
    Pessoa nClient = new Pessoa(); //acessar os atributos da classe cliente
    //SingIn entrar = new SingIn();
    
    String mês;
    
    public NewClient() {
        initComponents();
        
        setDefaultCloseOperation(NewProduto.DISPOSE_ON_CLOSE);
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
        DataNascença = new javax.swing.JLabel();
        monthTxt = new javax.swing.JComboBox<>();
        dayTxt = new javax.swing.JComboBox<>();
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
        yearTxt = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JFormattedTextField();
        iconBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(233, 84));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeCompleto.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        NomeCompleto.setText("Nome Completo:");
        jPanel2.add(NomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        nomecTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 18)); // NOI18N
        jPanel2.add(nomecTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 55, 342, -1));

        cadastrarSe.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        cadastrarSe.setText("Se cadastrar");
        cadastrarSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarSeActionPerformed(evt);
            }
        });
        jPanel2.add(cadastrarSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 487, 154, 58));

        DataNascença.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        DataNascença.setText("Data de Nascença:");
        jPanel2.add(DataNascença, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 108, -1, -1));

        monthTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 13)); // NOI18N
        monthTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        monthTxt.setToolTipText("Mês");
        monthTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        monthTxt.setName("Mês"); // NOI18N
        monthTxt.setPreferredSize(new java.awt.Dimension(69, 30));
        jPanel2.add(monthTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 103, 137, -1));

        dayTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 12)); // NOI18N
        dayTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayTxt.setMinimumSize(new java.awt.Dimension(55, 30));
        dayTxt.setPreferredSize(new java.awt.Dimension(57, 30));
        jPanel2.add(dayTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 140, -1, -1));

        Estado.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        Estado.setText("Estado:");
        jPanel2.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 198, -1, -1));

        estadoTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 14)); // NOI18N
        estadoTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        estadoTxt.setPreferredSize(new java.awt.Dimension(69, 30));
        jPanel2.add(estadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 193, 60, -1));

        Cidade.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        Cidade.setText("Cidade:");
        jPanel2.add(Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 198, -1, -1));

        endeTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 18)); // NOI18N
        jPanel2.add(endeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 255, 466, -1));

        Endereço.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        Endereço.setText("Endereço:");
        jPanel2.add(Endereço, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 229, -1, -1));

        cityTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 18)); // NOI18N
        jPanel2.add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 192, 207, -1));

        Email.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        Email.setText("E-mail:");
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 309, -1, -1));

        emailTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 18)); // NOI18N
        jPanel2.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 303, 402, -1));

        Senha.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        Senha.setText("Senha:");
        jPanel2.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        SenhaConf.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        SenhaConf.setText("Confirmação de Senha:");
        jPanel2.add(SenhaConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        passwTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 18)); // NOI18N
        jPanel2.add(passwTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 365, 466, -1));

        cpasswTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 18)); // NOI18N
        cpasswTxt.setToolTipText("");
        jPanel2.add(cpasswTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 423, 466, -1));

        yearTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 14)); // NOI18N
        yearTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930" }));
        yearTxt.setMinimumSize(new java.awt.Dimension(60, 30));
        yearTxt.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel2.add(yearTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(806, 140, 74, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 15)); // NOI18N
        jLabel1.setText("CPF:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 108, -1, -1));

        try {
            cpfTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 13)); // NOI18N
        cpfTxt.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel2.add(cpfTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 104, 139, -1));

        iconBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\Documents\\Facens\\2º Semestre\\Linguagem de Programação - Prof. Márcio\\Hey-Stranger\\src\\Imagens\\Telas_Views\\SingIn.png")); // NOI18N
        jPanel2.add(iconBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));
        iconBG.getAccessibleContext().setAccessibleParent(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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

            conectar.conectaBanco(1);
            String comando = "call hs_pess.insertCliente("
            + "'" + nClient.getNome() + "',"
            + "'" + nClient.getDataN() + "',"
            + "'" + nClient.getCpf() + "',"
            + "'" + nClient.getEstado() + "',"
            + "'" + nClient.getCity() + "',"
            + "'" + nClient.getEnde() + "',"
            + "'" + nClient.getEmail() + "',"
            + "'" + nClient.getPassw() + "'"
            + ");";

            System.out.println(nClient.getCpf());
            this.conectar.cadastrarSQL(comando, 1);

            new SingIn().setVisible(true);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
            dispose();

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
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel DataNascença;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereço;
    private javax.swing.JLabel Estado;
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
    private javax.swing.JLabel iconBG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> monthTxt;
    private javax.swing.JTextField nomecTxt;
    private javax.swing.JPasswordField passwTxt;
    private javax.swing.JComboBox<String> yearTxt;
    // End of variables declaration//GEN-END:variables
}
