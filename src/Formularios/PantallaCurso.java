/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author RYZEN3
 */
public class PantallaCurso extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCurso
     */
    public PantallaCurso() {
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

        txtbuscarcurs = new javax.swing.JTextField();
        btnbuscarcurs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstCursos = new javax.swing.JList<>();
        btnagregar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(null);

        txtbuscarcurs.setBackground(new java.awt.Color(204, 204, 204));
        txtbuscarcurs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtbuscarcurs.setText("Buscar");
        getContentPane().add(txtbuscarcurs);
        txtbuscarcurs.setBounds(10, 62, 346, 33);

        btnbuscarcurs.setBackground(new java.awt.Color(0, 204, 204));
        btnbuscarcurs.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnbuscarcurs.setText("Buscar");
        getContentPane().add(btnbuscarcurs);
        btnbuscarcurs.setBounds(374, 61, 109, 34);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Gestor de Cursos : [ ]");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 473, 38);

        LstCursos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(LstCursos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 107, 473, 130);

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar);
        btnagregar.setBounds(295, 255, 93, 44);

        btnborrar.setText("BORRAR");
        getContentPane().add(btnborrar);
        btnborrar.setBounds(398, 255, 85, 44);

        btnsalir.setText("SALIR");
        getContentPane().add(btnsalir);
        btnsalir.setBounds(398, 305, 84, 44);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        this.setVisible(false);
        EditarCurso editcurso=new EditarCurso();
        editcurso.setVisible(true);
        
    }//GEN-LAST:event_btnagregarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PantallaCurso().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList<String> LstCursos;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnbuscarcurs;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtbuscarcurs;
    // End of variables declaration//GEN-END:variables
}