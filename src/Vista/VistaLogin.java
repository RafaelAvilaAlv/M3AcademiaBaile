package Vista;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaLogin extends javax.swing.JFrame {

    public VistaLogin() {
        initComponents();
        setIconImage(getIconImage());
        this.setTitle("Inicio de Sesión");
    }

    public JButton getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public void setBtnIniciarSesion(JButton btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public JLabel getLblMostrar() {
        return lblMostrar;
    }

    public void setLblMostrar(JLabel lblMostrar) {
        this.lblMostrar = lblMostrar;
    }

    public JLabel getLblOcultar() {
        return lblOcultar;
    }

    public void setLblOcultar(JLabel lblOcultar) {
        this.lblOcultar = lblOcultar;
    }

    public JPasswordField getTxtContrasenia() {
        return txtContrasenia;
    }

    public void setTxtContrasenia(JPasswordField txtContrasenia) {
        this.txtContrasenia = txtContrasenia;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JLabel getLblImagen1() {
        return lblImagen1;
    }

    public void setLblImagen1(JLabel lblImagen1) {
        this.lblImagen1 = lblImagen1;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit()
                .getImage(ClassLoader.
                        getSystemResource("imagenes/logorosado.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImagen1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        lblMostrar = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        lblOcultar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenlogin.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen1.setToolTipText("");
        lblImagen1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 460, 330));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 60)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_1.png"))); // NOI18N
        jLabel1.setText("Inicio de sesión");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-de-flecha.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-de-flecha.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-de-flecha.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 2));
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 230, 30));

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel18.setText("Contraseña:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, -1, -1));

        txtContrasenia.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtContrasenia.setText("jPasswordField1");
        txtContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 2));
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        jPanel2.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 230, 30));

        lblMostrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye-open.png"))); // NOI18N
        jPanel2.add(lblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 204, 204));
        btnIniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        btnIniciarSesion.setText("Iniciar sesión");
        jPanel2.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        lblOcultar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye-close.png"))); // NOI18N
        jPanel2.add(lblOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel14.setText("Usuario:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dance-3169_128.gif"))); // NOI18N
        jLabel13.setText("    Datos del Usuario");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 480, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 560, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblMostrar;
    private javax.swing.JLabel lblOcultar;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
