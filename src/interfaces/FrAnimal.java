/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import classe.Animal;
import dao.Animaldao;

/**
 *
 * @author thiag
 */
public class FrAnimal extends javax.swing.JFrame {

    Animal animal = new Animal();
    Animaldao dao = new Animaldao();
    
    
    public FrAnimal() {
        initComponents();
    }

    public void Passadados(){
        
        animal.setNome(txnome.getText());
        animal.setIdade(txidade.getText());
        animal.setSexo(txsexo.getText());
        animal.setRaca(txraca.getText());
        animal.setDescricao(txdescricao.getText());
        animal.setStatus("P");
        
    }
    
    public void Limpar(){
        
        txidanimal.setText(null);
        txnome.setText(null);
        txidade.setText(null);
        txsexo.setText(null);
        txraca.setText(null);
        txdescricao.setText(null);
        
    }
    
    public void Mostradados(){
        
        txidanimal.setText(String.valueOf(animal.getIdanimal()));
        txnome.setText(animal.getNome());
        txidade.setText(animal.getIdade());
        txsexo.setText(animal.getSexo());
        txraca.setText(animal.getRaca());
        txdescricao.setText(animal.getDescricao());
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txidanimal = new javax.swing.JTextField();
        btbuscarid = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txnome = new javax.swing.JTextField();
        btbuscarnome = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txsexo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txraca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txdescricao = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btsalvar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cadastro De Animais");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        txidanimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidanimalActionPerformed(evt);
            }
        });
        getContentPane().add(txidanimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 90, 40));

        btbuscarid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btbuscarid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/pesquisar-usuario.png"))); // NOI18N
        btbuscarid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscaridActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscarid, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 40, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        txnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 280, 40));

        btbuscarnome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btbuscarnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/pesquisar-usuario.png"))); // NOI18N
        btbuscarnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarnomeActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscarnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, 40, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Idade:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        txidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 280, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        txsexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txsexoActionPerformed(evt);
            }
        });
        getContentPane().add(txsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 280, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Raça:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, -1));

        txraca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txracaActionPerformed(evt);
            }
        });
        getContentPane().add(txraca, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 280, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Descrição:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, -1, -1));

        txdescricao.setColumns(20);
        txdescricao.setRows(5);
        jScrollPane1.setViewportView(txdescricao);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 280, 100));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        btsalvar.setBackground(new java.awt.Color(153, 255, 102));
        btsalvar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/adicionar-usuario (1).png"))); // NOI18N
        btsalvar.setText("Salvar");
        btsalvar.setToolTipText("");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 770, 160, 50));

        btlimpar.setBackground(new java.awt.Color(255, 255, 153));
        btlimpar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons/limpar-limpo.png"))); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 770, 160, 50));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Agenda-PainelFundo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -30, 1270, 910));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dogs_Funny_Bulldog_Puppy_Bokeh_571468_1920x1080.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 0, 1850, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txidanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidanimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidanimalActionPerformed

    private void btbuscaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscaridActionPerformed
        animal.setIdanimal(Integer.parseInt(txidanimal.getText()));
        dao.Buscaid(animal);
        Mostradados();        // TODO add your handling code here:
    }//GEN-LAST:event_btbuscaridActionPerformed

    private void txnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnomeActionPerformed

    private void btbuscarnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarnomeActionPerformed
        animal.setNome(txidanimal.getText());
        dao.Buscanome(animal);
        Mostradados();        // TODO add your handling code here:
    }//GEN-LAST:event_btbuscarnomeActionPerformed

    private void txidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txidadeActionPerformed

    private void txsexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txsexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txsexoActionPerformed

    private void txracaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txracaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txracaActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        
        Passadados();
        dao.insertAnimal(animal);
        Limpar();

    }//GEN-LAST:event_btsalvarActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        
        Limpar();
    }//GEN-LAST:event_btlimparActionPerformed

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
            java.util.logging.Logger.getLogger(FrAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbuscarid;
    private javax.swing.JButton btbuscarnome;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txdescricao;
    private javax.swing.JTextField txidade;
    private javax.swing.JTextField txidanimal;
    private javax.swing.JTextField txnome;
    private javax.swing.JTextField txraca;
    private javax.swing.JTextField txsexo;
    // End of variables declaration//GEN-END:variables
}
