/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.accessibility.AccessibleContext;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author Usuario
 */
public class VistaDirigir extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaDirigirp
     */
    public VistaDirigir() {
        initComponents();
    }

    public JTable getTblDirigir() {
        return TblDirigir;
    }

    public void setTblDirigir(JTable TblDirigir) {
        this.TblDirigir = TblDirigir;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnAsignar() {
        return btnAsignar;
    }

    public void setBtnAsignar(JButton btnAsignar1) {
        this.btnAsignar = btnAsignar1;
    }    



    public JButton getBtnBuscarProductor() {
        return btnBuscarProductor;
    }

    public void setBtnBuscarProductor(JButton btnBuscarProductor) {
        this.btnBuscarProductor = btnBuscarProductor;
    }

    public JButton getBtnBuscarSetGrabacion() {
        return btnBuscarSetGrabacion;
    }

    public void setBtnBuscarSetGrabacion(JButton btnBuscarSetGrabacion) {
        this.btnBuscarSetGrabacion = btnBuscarSetGrabacion;
    }


    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnCargarProductor() {
        return btnCargarProductor;
    }

    public void setBtnCargarProductor(JButton btnCargarProductor) {
        this.btnCargarProductor = btnCargarProductor;
    }

    public JButton getBtnCargarSetGrabacion() {
        return btnCargarSetGrabacion;
    }

    public void setBtnCargarSetGrabacion(JButton btnCargarSetGrabacion) {
        this.btnCargarSetGrabacion = btnCargarSetGrabacion;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    public void setBtnGuardar(JButton btnGuardar) {
        this.btnGuardar = btnGuardar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JDateChooser getFechaDeAsignacion() {
        return fechaDeAsignacion;
    }

    public void setFechaDeAsignacion(JDateChooser fechaDeAsignacion) {
        this.fechaDeAsignacion = fechaDeAsignacion;
    }

    public JDialog getjDlgBuscarSetgrabacion() {
        return jDlgBuscarSetgrabacion;
    }

    public void setjDlgBuscarSetgrabacion(JDialog jDlgBuscarSetgrabacion) {
        this.jDlgBuscarSetgrabacion = jDlgBuscarSetgrabacion;
    }

    public JDialog getjDlgDirigir() {
        return jDlgDirigir;
    }

    public void setjDlgDirigir(JDialog jDlgDirigir) {
        this.jDlgDirigir = jDlgDirigir;
    }

    public JTable getTblDlgProductor() {
        return tblDlgProductor;
    }

    public void setTblDlgProductor(JTable tblDlgProductor) {
        this.tblDlgProductor = tblDlgProductor;
    }

    public JTable getTblDlgjSetGrabacion() {
        return tblDlgjSetGrabacion;
    }

    public void setTblDlgjSetGrabacion(JTable tblDlgjSetGrabacion) {
        this.tblDlgjSetGrabacion = tblDlgjSetGrabacion;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtBuscarProductor() {
        return txtBuscarProductor;
    }

    public void setTxtBuscarProductor(JTextField txtBuscarProductor) {
        this.txtBuscarProductor = txtBuscarProductor;
    }

    public JTextField getTxtBuscarSetGrabacion() {
        return txtBuscarSetGrabacion;
    }

    public JDialog getjDlgBuscarProductor() {
        return jDlgBuscarProductor;
    }

    public void setjDlgBuscarProductor(JDialog jDlgBuscarProductor) {
        this.jDlgBuscarProductor = jDlgBuscarProductor;
    }

    
    public void setTxtBuscarSetGrabacion(JTextField txtBuscarSetGrabacion) {
        this.txtBuscarSetGrabacion = txtBuscarSetGrabacion;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtCodigoProductor() {
        return txtCodigoProductor;
    }

    public void setTxtCodigoProductor(JTextField txtCodigoProductor) {
        this.txtCodigoProductor = txtCodigoProductor;
    }

    public JTextField getTxtCodigoSetgrabacion() {
        return txtCodigoSetgrabacion;
    }

    public void setTxtCodigoSetgrabacion(JTextField txtCodigoSetgrabacion) {
        this.txtCodigoSetgrabacion = txtCodigoSetgrabacion;
    }

    public JTextField getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public void setTxtEspecialidad(JTextField txtEspecialidad) {
        this.txtEspecialidad = txtEspecialidad;
    }

    public JTextField getTxtNombreAsignatura() {
        return txtNombreAsignatura;
    }

    public void setTxtNombreAsignatura(JTextField txtNombreAsignatura) {
        this.txtNombreAsignatura = txtNombreAsignatura;
    }

    public JTextField getTxtNombreDocente() {
        return txtNombreDocente;
    }

    public void setTxtNombreDocente(JTextField txtNombreDocente) {
        this.txtNombreDocente = txtNombreDocente;
    }


    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlgDirigir = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        txtCedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreDocente = new javax.swing.JTextField();
        txtCodigoProductor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnBuscarProductor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        fechaDeAsignacion = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtNombreAsignatura = new javax.swing.JTextField();
        btnBuscarSetGrabacion = new javax.swing.JButton();
        txtCodigoSetgrabacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDlgBuscarSetgrabacion = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtBuscarSetGrabacion = new javax.swing.JTextField();
        btnCargarSetGrabacion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDlgjSetGrabacion = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jDlgBuscarProductor = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtBuscarProductor = new javax.swing.JTextField();
        btnCargarProductor = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDlgProductor = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAsignar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jtxtTituloMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDirigir = new javax.swing.JTable();

        jDlgDirigir.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 162, 30));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(126, 56, 64));
        jLabel6.setText("Cédula:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(126, 56, 64));
        jLabel7.setText("Nombre:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 161, -1, -1));
        jPanel2.add(txtNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 162, 30));
        jPanel2.add(txtCodigoProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 42, -1));

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(126, 56, 64));
        jLabel8.setText("Apellido:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 162, 30));

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(126, 56, 64));
        jLabel9.setText("Experencia:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel2.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 162, 30));

        btnBuscarProductor.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarProductor.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnBuscarProductor.setForeground(new java.awt.Color(126, 56, 64));
        btnBuscarProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarProductor.setText("Buscar");
        btnBuscarProductor.setBorder(null);
        btnBuscarProductor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarProductor.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(btnBuscarProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(126, 56, 64));
        jLabel13.setText("Fecha de asignación:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));
        jPanel2.add(fechaDeAsignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 190, 30));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(126, 56, 64));
        jLabel12.setText("Nombre del Evento:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));
        jPanel2.add(txtNombreAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 166, 30));

        btnBuscarSetGrabacion.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarSetGrabacion.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnBuscarSetGrabacion.setForeground(new java.awt.Color(126, 56, 64));
        btnBuscarSetGrabacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscarSetGrabacion.setText("Buscar");
        btnBuscarSetGrabacion.setBorder(null);
        btnBuscarSetGrabacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarSetGrabacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel2.add(btnBuscarSetGrabacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));
        jPanel2.add(txtCodigoSetgrabacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 38, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(126, 56, 64));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 95, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(126, 56, 64));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 96, 31));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 117, 117));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/profesor.png"))); // NOI18N
        jLabel5.setText("Asignar Evento");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 117, 117));
        jLabel2.setText("Información del Evento");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 117, 117));
        jLabel3.setText("Información del director");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        javax.swing.GroupLayout jDlgDirigirLayout = new javax.swing.GroupLayout(jDlgDirigir.getContentPane());
        jDlgDirigir.getContentPane().setLayout(jDlgDirigirLayout);
        jDlgDirigirLayout.setHorizontalGroup(
            jDlgDirigirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE)
        );
        jDlgDirigirLayout.setVerticalGroup(
            jDlgDirigirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDlgBuscarSetgrabacion.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(126, 56, 64));
        jLabel18.setText("Buscar:");

        btnCargarSetGrabacion.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarSetGrabacion.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCargarSetGrabacion.setForeground(new java.awt.Color(126, 56, 64));
        btnCargarSetGrabacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignar.png"))); // NOI18N
        btnCargarSetGrabacion.setText("Cargar");
        btnCargarSetGrabacion.setBorder(null);

        tblDlgjSetGrabacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        jScrollPane2.setViewportView(tblDlgjSetGrabacion);

        jLabel20.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(235, 117, 117));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel20.setText("Cargar Evento");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarSetGrabacion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarSetGrabacion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(192, 192, 192))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarSetGrabacion)
                    .addComponent(txtBuscarSetGrabacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jDlgBuscarSetgrabacionLayout = new javax.swing.GroupLayout(jDlgBuscarSetgrabacion.getContentPane());
        jDlgBuscarSetgrabacion.getContentPane().setLayout(jDlgBuscarSetgrabacionLayout);
        jDlgBuscarSetgrabacionLayout.setHorizontalGroup(
            jDlgBuscarSetgrabacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDlgBuscarSetgrabacionLayout.setVerticalGroup(
            jDlgBuscarSetgrabacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDlgBuscarProductor.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 19)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(126, 56, 64));
        jLabel17.setText("Buscar:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel4.add(txtBuscarProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 250, 30));

        btnCargarProductor.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarProductor.setFont(new java.awt.Font("Baskerville Old Face", 0, 19)); // NOI18N
        btnCargarProductor.setForeground(new java.awt.Color(126, 56, 64));
        btnCargarProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asignar.png"))); // NOI18N
        btnCargarProductor.setText("Cargar");
        btnCargarProductor.setBorder(null);
        jPanel4.add(btnCargarProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 88, 39));

        jLabel19.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(235, 117, 117));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel19.setText("Cargar Director Artistico");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        tblDlgProductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Experencia", "Sueldo"
            }
        ));
        jScrollPane3.setViewportView(tblDlgProductor);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 540, 160));

        javax.swing.GroupLayout jDlgBuscarProductorLayout = new javax.swing.GroupLayout(jDlgBuscarProductor.getContentPane());
        jDlgBuscarProductor.getContentPane().setLayout(jDlgBuscarProductorLayout);
        jDlgBuscarProductorLayout.setHorizontalGroup(
            jDlgBuscarProductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDlgBuscarProductorLayout.setVerticalGroup(
            jDlgBuscarProductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(126, 56, 64));
        jLabel1.setText("Buscar:");

        btnAsignar.setBackground(new java.awt.Color(255, 255, 255));
        btnAsignar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAsignar.setForeground(new java.awt.Color(126, 56, 64));
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AñadirDetalles.png"))); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.setBorder(null);
        btnAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(126, 56, 64));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(126, 56, 64));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(null);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(126, 56, 64));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compartimiento.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxtTituloMenu.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jtxtTituloMenu.setForeground(new java.awt.Color(235, 117, 117));
        jtxtTituloMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bailando.png"))); // NOI18N
        jtxtTituloMenu.setText("Asignar Evento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtxtTituloMenu)
                .addGap(350, 350, 350))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtTituloMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAsignar)
                                    .addComponent(btnModificar)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar)))
                            .addComponent(txtBuscar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        TblDirigir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Dirigir", "Codigo Director_Artistico", "Cedula", "Nombre y apellido", "Codigo del Evento", "Nombre del Evento"
            }
        ));
        jScrollPane1.setViewportView(TblDirigir);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblDirigir;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBuscarProductor;
    private javax.swing.JButton btnBuscarSetGrabacion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarProductor;
    private javax.swing.JButton btnCargarSetGrabacion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser fechaDeAsignacion;
    private javax.swing.JDialog jDlgBuscarProductor;
    private javax.swing.JDialog jDlgBuscarSetgrabacion;
    private javax.swing.JDialog jDlgDirigir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jtxtTituloMenu;
    private javax.swing.JTable tblDlgProductor;
    private javax.swing.JTable tblDlgjSetGrabacion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarProductor;
    private javax.swing.JTextField txtBuscarSetGrabacion;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoProductor;
    private javax.swing.JTextField txtCodigoSetgrabacion;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNombreAsignatura;
    private javax.swing.JTextField txtNombreDocente;
    // End of variables declaration//GEN-END:variables
}
