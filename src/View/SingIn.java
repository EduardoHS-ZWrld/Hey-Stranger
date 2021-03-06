package View;

import Conexões.MySQL;

/**
 *
 * @author eduar
 */
public class SingIn extends javax.swing.JFrame {

    /**
     * Creates new form SingIn
     */
    public SingIn() {
        initComponents();
        
        setDefaultCloseOperation(NewProduto.DISPOSE_ON_CLOSE);
    }
    
    MySQL conectar = new MySQL();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        passwTxt = new javax.swing.JPasswordField();
        EntrarButt = new javax.swing.JButton();
        cadastreSe = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(233, 84));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(109, 98, 131));
        jPanel2.setPreferredSize(new java.awt.Dimension(506, 600));

        Email.setBackground(new java.awt.Color(20, 20, 20));
        Email.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(20, 20, 20));
        Email.setText("E-mail:");

        emailTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 16)); // NOI18N

        Password.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(20, 20, 20));
        Password.setText("Senha:");

        passwTxt.setFont(new java.awt.Font("Traveling _Typewriter", 0, 16)); // NOI18N

        EntrarButt.setBackground(new java.awt.Color(217, 182, 255));
        EntrarButt.setFont(new java.awt.Font("Sitka Small", 1, 20)); // NOI18N
        EntrarButt.setForeground(new java.awt.Color(20, 20, 20));
        EntrarButt.setText("Entrar");
        EntrarButt.setPreferredSize(new java.awt.Dimension(160, 60));
        EntrarButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarButtActionPerformed(evt);
            }
        });

        cadastreSe.setBackground(new java.awt.Color(217, 182, 255));
        cadastreSe.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        cadastreSe.setForeground(new java.awt.Color(20, 20, 20));
        cadastreSe.setText("Cadastre-se");
        cadastreSe.setPreferredSize(new java.awt.Dimension(160, 30));
        cadastreSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastreSeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email)
                    .addComponent(Password)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EntrarButt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastreSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(EntrarButt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastreSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 0, -1, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(394, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\eduar\\Documents\\Facens\\2º Semestre\\Linguagem de Programação - Prof. Márcio\\Hey-Stranger\\src\\Imagens\\Telas_Views\\SingIn-NewClient\\SingIn1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastreSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastreSeActionPerformed
        new NewClient().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cadastreSeActionPerformed

    private void EntrarButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarButtActionPerformed
        try {
            //leondozap@kasino.jhonson
            //CidadeGuaxinim
            conectar.conectaBanco(1);

            String sqlComand = "call hs_pess.senhaComando('"+emailTxt.getText()+"');";
            
            conectar.entrarSQL(sqlComand);
            
            if (new String (passwTxt.getPassword()).equals(conectar.getPassw())) {
                //JOptionPane.showMessageDialog(null, "Senha correta");
                //Este Pane travava o programa(Não consigo explicar o motivo, pois em outras telas eu uso o mesmo método sem acontecer o erro)
                System.out.println("Senha Correta");
                new MenuProd_Teste().setVisible(true);
                dispose();
            } else {
                //JOptionPane.showMessageDialog(null, "Senha incorreta");
                //Este método também trava o programa
                System.out.println(passwTxt.getPassword());
                System.out.println("Senha incorreta");
                passwTxt.setText("");
            }
            conectar.fechaBanco();
        } catch(NullPointerException e) {
            System.out.println("Erro: \n"
                + e.toString());
        } 
    }//GEN-LAST:event_EntrarButtActionPerformed

 
        
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
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SingIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JButton EntrarButt;
    private javax.swing.JLabel Password;
    private javax.swing.JButton cadastreSe;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwTxt;
    // End of variables declaration//GEN-END:variables
}
