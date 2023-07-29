package Vista;

import javax.swing.JLabel;

public class VistaDashboard extends javax.swing.JInternalFrame {

    public VistaDashboard() {
        initComponents();
    }

    public JLabel getLblDocentes() {
        return lblDocentes;
    }

    public void setLblDocentes(JLabel lblDocentes) {
        this.lblDocentes = lblDocentes;
    }

    public JLabel getLblEstudiantes() {
        return lblEstudiantes;
    }

    public void setLblEstudiantes(JLabel lblEstudiantes) {
        this.lblEstudiantes = lblEstudiantes;
    }

    public JLabel getLblInstrumentos() {
        return lblInstrumentos;
    }

    public void setLblInstrumentos(JLabel lblInstrumentos) {
        this.lblInstrumentos = lblInstrumentos;
    }

    public JLabel getLblProductores() {
        return lblProductores;
    }

    public void setLblProductores(JLabel lblProductores) {
        this.lblProductores = lblProductores;
    }

    public JLabel getLblReservas() {
        return lblReservas;
    }

    public void setLblReservas(JLabel lblReservas) {
        this.lblReservas = lblReservas;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelestado = new javax.swing.JPanel();
        reservas = new javax.swing.JLabel();
        estadiantes = new javax.swing.JLabel();
        lblEstudiantes = new javax.swing.JLabel();
        docentes = new javax.swing.JLabel();
        lblDocentes = new javax.swing.JLabel();
        productores1 = new javax.swing.JLabel();
        lblProductores = new javax.swing.JLabel();
        lblReservas = new javax.swing.JLabel();
        lblInstrumentos = new javax.swing.JLabel();
        reservas1 = new javax.swing.JLabel();
        jtxtTituloMenu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setAutoscrolls(true);
        setFocusable(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        panelFondo.setBackground(new java.awt.Color(255, 255, 255));
        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelestado.setBackground(new java.awt.Color(255, 255, 255));
        panelestado.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panelestado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reservas.setBackground(new java.awt.Color(191, 161, 161));
        reservas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        reservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservas.setText("Reservas");
        reservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reservas.setFocusable(false);
        reservas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reservas.setOpaque(true);
        panelestado.add(reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 20, 170, 34));

        estadiantes.setBackground(new java.awt.Color(191, 161, 161));
        estadiantes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        estadiantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estadiantes.setText("Estudiantes");
        estadiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        estadiantes.setFocusable(false);
        estadiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        estadiantes.setOpaque(true);
        panelestado.add(estadiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 30));

        lblEstudiantes.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblEstudiantes.setForeground(new java.awt.Color(235, 117, 117));
        lblEstudiantes.setText("0");
        panelestado.add(lblEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 72, -1, 40));

        docentes.setBackground(new java.awt.Color(191, 161, 161));
        docentes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        docentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        docentes.setText("Profesores");
        docentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        docentes.setFocusable(false);
        docentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        docentes.setOpaque(true);
        panelestado.add(docentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 20, 170, 30));

        lblDocentes.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblDocentes.setForeground(new java.awt.Color(235, 117, 117));
        lblDocentes.setText("0");
        panelestado.add(lblDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 72, -1, 40));

        productores1.setBackground(new java.awt.Color(191, 161, 161));
        productores1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        productores1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productores1.setText("Directores Artisticos");
        productores1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productores1.setFocusable(false);
        productores1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productores1.setOpaque(true);
        panelestado.add(productores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 190, 34));

        lblProductores.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblProductores.setForeground(new java.awt.Color(235, 117, 117));
        lblProductores.setText("0");
        panelestado.add(lblProductores, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 72, -1, 40));

        lblReservas.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblReservas.setForeground(new java.awt.Color(235, 117, 117));
        lblReservas.setText("0");
        panelestado.add(lblReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(755, 72, -1, 40));

        lblInstrumentos.setFont(new java.awt.Font("Roboto", 1, 50)); // NOI18N
        lblInstrumentos.setForeground(new java.awt.Color(235, 117, 117));
        lblInstrumentos.setText("0");
        panelestado.add(lblInstrumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(971, 72, -1, 40));

        reservas1.setBackground(new java.awt.Color(191, 161, 161));
        reservas1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        reservas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservas1.setText("Indumentaria ");
        reservas1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reservas1.setFocusable(false);
        reservas1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reservas1.setOpaque(true);
        panelestado.add(reservas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 140, 34));

        panelFondo.add(panelestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 1052, 123));

        jtxtTituloMenu.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jtxtTituloMenu.setForeground(new java.awt.Color(235, 117, 117));
        jtxtTituloMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dash.png"))); // NOI18N
        jtxtTituloMenu.setText("Tablero");
        panelFondo.add(jtxtTituloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 1037, 65));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/danzas.jpg"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setAutoscrolls(true);
        panelFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 1100, 294));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 117, 117));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Estado");
        panelFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 1051, 54));

        getContentPane().add(panelFondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel docentes;
    private javax.swing.JLabel estadiantes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jtxtTituloMenu;
    private javax.swing.JLabel lblDocentes;
    private javax.swing.JLabel lblEstudiantes;
    private javax.swing.JLabel lblInstrumentos;
    private javax.swing.JLabel lblProductores;
    private javax.swing.JLabel lblReservas;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelestado;
    private javax.swing.JLabel productores1;
    private javax.swing.JLabel reservas;
    private javax.swing.JLabel reservas1;
    // End of variables declaration//GEN-END:variables
}
