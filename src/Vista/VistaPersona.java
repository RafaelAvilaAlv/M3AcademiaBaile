package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VistaPersona extends javax.swing.JInternalFrame {

    public VistaPersona() {
        initComponents();
    }

    public JButton getBtnActualizar() {
        return btnModificar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnModificar = btnActualizar;
    }

    public JButton getBtnCrear() {
        return btnCrear;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnCrear = btnCrear;
    }

    public JButton getBtnGuardarDocente() {
        return btnGuardarDocente;
    }

    public void setBtnGuardarDocente(JButton btnGuardarDocente) {
        this.btnGuardarDocente = btnGuardarDocente;
    }

    public JButton getBtnGuardarProductor() {
        return btnGuardarProductor;
    }

    public void setBtnGuardarProductor(JButton btnGuardarProductor) {
        this.btnGuardarProductor = btnGuardarProductor;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JCheckBox getCheckDocente() {
        return checkDocente;
    }

    public void setCheckDocente(JCheckBox checkDocente) {
        this.checkDocente = checkDocente;
    }

    public JCheckBox getCheckProductor() {
        return checkProductor;
    }

    public void setCheckProductor(JCheckBox checkProductor) {
        this.checkProductor = checkProductor;
    }

    public JDateChooser getFechaContratacionDocente() {
        return fechaContratacionDocente;
    }

    public void setFechaContratacionDocente(JDateChooser fechaContratacionDocente) {
        this.fechaContratacionDocente = fechaContratacionDocente;
    }

    public JDateChooser getFechaContratacionProductor() {
        return fechaContratacionProductor;
    }

    public void setFechaContratacionProductor(JDateChooser fechaContratacionProductor) {
        this.fechaContratacionProductor = fechaContratacionProductor;
    }

    public JDateChooser getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(JDateChooser fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public JRadioButton getFemenino() {
        return femenino;
    }

    public void setFemenino(JRadioButton femenino) {
        this.femenino = femenino;
    }

    public ButtonGroup getGenero() {
        return genero;
    }

    public void setGenero(ButtonGroup genero) {
        this.genero = genero;
    }

    public JDialog getjDlgRegistroDocente() {
        return jDlgRegistroDocente;
    }

    public void setjDlgRegistroDocente(JDialog jDlgRegistroDocente) {
        this.jDlgRegistroDocente = jDlgRegistroDocente;
    }

    public JDialog getjDlgRegistroProductor() {
        return jDlgRegistroProductor;
    }

    public void setjDlgRegistroProductor(JDialog jDlgRegistroProductor) {
        this.jDlgRegistroProductor = jDlgRegistroProductor;
    }

    public JDialog getjDlogRegistro() {
        return jDlogRegistro;
    }

    public void setjDlogRegistro(JDialog jDlogRegistro) {
        this.jDlogRegistro = jDlogRegistro;
    }

    public JRadioButton getMasculino() {
        return masculino;
    }

    public void setMasculino(JRadioButton masculino) {
        this.masculino = masculino;
    }

    public JRadioButton getNoBinario() {
        return noBinario;
    }

    public void setNoBinario(JRadioButton noBinario) {
        this.noBinario = noBinario;
    }

    public ButtonGroup getRol() {
        return rol;
    }

    public void setRol(ButtonGroup rol) {
        this.rol = rol;
    }

    public JSpinner getSpinnerExperiencia() {
        return spinnerExperiencia;
    }

    public void setSpinnerExperiencia(JSpinner spinnerExperiencia) {
        this.spinnerExperiencia = spinnerExperiencia;
    }

    public JSpinner getSpinnerSueldoDocente() {
        return spinnerSueldoDocente;
    }

    public void setSpinnerSueldoDocente(JSpinner spinnerSueldoDocente) {
        this.spinnerSueldoDocente = spinnerSueldoDocente;
    }

    public JSpinner getSpinnerSueldoProductor() {
        return spinnerSueldoProductor;
    }

    public void setSpinnerSueldoProductor(JSpinner spinnerSueldoProductor) {
        this.spinnerSueldoProductor = spinnerSueldoProductor;
    }

    public JTable getTblPersona() {
        return tblPersona;
    }

    public void setTblPersona(JTable tblPersona) {
        this.tblPersona = tblPersona;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(JTextField txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JTextField getTxtEspecialidad() {
        return txtEspecialidad;
    }

    public void setTxtEspecialidad(JTextField txtEspecialidad) {
        this.txtEspecialidad = txtEspecialidad;
    }

    public JTextField getTxtPrimerApellido() {
        return txtPrimerApellido;
    }

    public void setTxtPrimerApellido(JTextField txtPrimerApellido) {
        this.txtPrimerApellido = txtPrimerApellido;
    }

    public JTextField getTxtPrimerNombre() {
        return txtPrimerNombre;
    }

    public JButton getBtnModificarPersona() {
        return btnModificarPersona;
    }

    public void setBtnModificarPersona(JButton btnModificarPersona) {
        this.btnModificarPersona = btnModificarPersona;
    }

    public void setTxtPrimerNombre(JTextField txtPrimerNombre) {
        this.txtPrimerNombre = txtPrimerNombre;
    }

    public JTextField getTxtSegundoApellido() {
        return txtSegundoApellido;
    }

    public void setTxtSegundoApellido(JTextField txtSegundoApellido) {
        this.txtSegundoApellido = txtSegundoApellido;
    }

    public JTextField getTxtSegundoNombre() {
        return txtSegundoNombre;
    }

    public void setTxtSegundoNombre(JTextField txtSegundoNombre) {
        this.txtSegundoNombre = txtSegundoNombre;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public JLabel getLblRol() {
        return lblRol;
    }

    public void setLblRol(JLabel lblRol) {
        this.lblRol = lblRol;
    }

    public JButton getBtnCancelarAdministrador() {
        return btnCancelarAdministrador;
    }

    public void setBtnCancelarAdministrador(JButton btnCancelarAdministrador) {
        this.btnCancelarAdministrador = btnCancelarAdministrador;
    }

    public JButton getBtnGuardarAdministrador() {
        return btnGuardarAdministrador;
    }

    public void setBtnGuardarAdministrador(JButton btnGuardarAdministrador) {
        this.btnGuardarAdministrador = btnGuardarAdministrador;
    }

    public JCheckBox getCheckAdministrador() {
        return checkAdministrador;
    }

    public void setCheckAdministrador(JCheckBox checkAdministrador) {
        this.checkAdministrador = checkAdministrador;
    }

    public JCheckBox getCheckEstudiante() {
        return checkEstudiante;
    }

    public void setCheckEstudiante(JCheckBox checkEstudiante) {
        this.checkEstudiante = checkEstudiante;
    }

    public JDateChooser getFechaContratacionAdministrador() {
        return fechaContratacionAdministrador;
    }

    public void setFechaContratacionAdministrador(JDateChooser fechaContratacionAdministrador) {
        this.fechaContratacionAdministrador = fechaContratacionAdministrador;
    }

    public JDialog getjDlgRegistroAdministrador() {
        return jDlgRegistroAdministrador;
    }

    public void setjDlgRegistroAdministrador(JDialog jDlgRegistroAdministrador) {
        this.jDlgRegistroAdministrador = jDlgRegistroAdministrador;
    }

    public JSpinner getSpinnerSueldoAdministrador() {
        return spinnerSueldoAdministrador;
    }

    public void setSpinnerSueldoAdministrador(JSpinner spinnerSueldoAdministrador) {
        this.spinnerSueldoAdministrador = spinnerSueldoAdministrador;
    }

    public JTextField getTxtContrasenia() {
        return txtContrasenia;
    }

    public void setTxtContrasenia(JTextField txtContrasenia) {
        this.txtContrasenia = txtContrasenia;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public JButton getBtnImprimir() {
        return btnImprimir;
    }

    public void setBtnImprimir(JButton btnImprimir) {
        this.btnImprimir = btnImprimir;
    }

    public JButton getBtnCancelarDocente() {
        return btnCancelarDocente;
    }

    public void setBtnCancelarDocente(JButton btnCancelarDocente) {
        this.btnCancelarDocente = btnCancelarDocente;
    }

    public JButton getBtnCancelarProductor() {
        return btnCancelarProductor;
    }

    public void setBtnCancelarProductor(JButton btnCancelarProductor) {
        this.btnCancelarProductor = btnCancelarProductor;
    }

    public JButton getBtnCancelarPersona() {
        return btnCancelarPersona;
    }

    public void setBtnCancelarPersona(JButton btnCancelarPersona) {
        this.btnCancelarPersona = btnCancelarPersona;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlogRegistro = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtCedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        txtPrimerNombre = new javax.swing.JTextField();
        femenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        noBinario = new javax.swing.JRadioButton();
        txtSegundoNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnModificarPersona = new javax.swing.JButton();
        checkDocente = new javax.swing.JCheckBox();
        checkProductor = new javax.swing.JCheckBox();
        lblRol = new javax.swing.JLabel();
        checkEstudiante = new javax.swing.JCheckBox();
        checkAdministrador = new javax.swing.JCheckBox();
        btnCancelarPersona = new javax.swing.JButton();
        genero = new javax.swing.ButtonGroup();
        rol = new javax.swing.ButtonGroup();
        jDlgRegistroDocente = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnGuardarDocente = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        fechaContratacionDocente = new com.toedter.calendar.JDateChooser();
        spinnerSueldoDocente = new javax.swing.JSpinner();
        txtEspecialidad = new javax.swing.JTextField();
        btnCancelarDocente = new javax.swing.JButton();
        jDlgRegistroProductor = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnGuardarProductor = new javax.swing.JButton();
        spinnerExperiencia = new javax.swing.JSpinner();
        spinnerSueldoProductor = new javax.swing.JSpinner();
        fechaContratacionProductor = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        btnCancelarProductor = new javax.swing.JButton();
        jDlgRegistroAdministrador = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        fechaContratacionAdministrador = new com.toedter.calendar.JDateChooser();
        spinnerSueldoAdministrador = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        btnGuardarAdministrador = new javax.swing.JButton();
        btnCancelarAdministrador = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jtxtTituloMenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();

        jDlogRegistro.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(126, 56, 64));
        jLabel12.setText("Dirección:");

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(126, 56, 64));
        jLabel8.setText("Fecha de nacimiento:");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(126, 56, 64));
        jLabel2.setText("Cédula:");

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(126, 56, 64));
        jLabel9.setText("Género:");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(126, 56, 64));
        jLabel4.setText("Primer nombre:");

        genero.add(masculino);
        masculino.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        masculino.setForeground(new java.awt.Color(126, 56, 64));
        masculino.setText("M");

        genero.add(femenino);
        femenino.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        femenino.setForeground(new java.awt.Color(126, 56, 64));
        femenino.setText("F");

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(126, 56, 64));
        jLabel5.setText("Segundo nombre:");

        genero.add(noBinario);
        noBinario.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        noBinario.setForeground(new java.awt.Color(126, 56, 64));
        noBinario.setText("No binario");

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(126, 56, 64));
        jLabel10.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(126, 56, 64));
        jLabel6.setText("Primer apellido:");

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(126, 56, 64));
        jLabel11.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(126, 56, 64));
        jLabel7.setText("Segundo apellido:");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 117, 117));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jLabel3.setText("Registrar persona");

        btnModificarPersona.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarPersona.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnModificarPersona.setForeground(new java.awt.Color(126, 56, 64));
        btnModificarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificarPersona.setText("Modificar");
        btnModificarPersona.setBorder(null);
        btnModificarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rol.add(checkDocente);
        checkDocente.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        checkDocente.setForeground(new java.awt.Color(126, 56, 64));
        checkDocente.setText("Docente");

        rol.add(checkProductor);
        checkProductor.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        checkProductor.setForeground(new java.awt.Color(126, 56, 64));
        checkProductor.setText("Director Artístico");

        lblRol.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        lblRol.setForeground(new java.awt.Color(126, 56, 64));
        lblRol.setText("Asignar rol:");

        rol.add(checkEstudiante);
        checkEstudiante.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        checkEstudiante.setForeground(new java.awt.Color(126, 56, 64));
        checkEstudiante.setText("Estudiante");

        rol.add(checkAdministrador);
        checkAdministrador.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        checkAdministrador.setForeground(new java.awt.Color(126, 56, 64));
        checkAdministrador.setText("Administrador");

        btnCancelarPersona.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarPersona.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCancelarPersona.setForeground(new java.awt.Color(126, 56, 64));
        btnCancelarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelarPersona.setText("Cancelar");
        btnCancelarPersona.setBorder(null);
        btnCancelarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrimerNombre)
                            .addComponent(txtSegundoNombre)
                            .addComponent(txtPrimerApellido)
                            .addComponent(txtSegundoApellido)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(masculino)
                                .addGap(18, 18, 18)
                                .addComponent(femenino)
                                .addGap(18, 18, 18)
                                .addComponent(noBinario))
                            .addComponent(txtCedula)
                            .addComponent(txtTelefono)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(checkAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRol)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtDireccion)
                            .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(checkProductor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(74, 74, 74))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(btnCancelarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(141, 141, 141)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkAdministrador)
                                    .addComponent(checkEstudiante)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(lblRol)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkDocente)
                                    .addComponent(checkProductor))))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(masculino)
                        .addComponent(femenino)
                        .addComponent(noBinario)))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDlogRegistroLayout = new javax.swing.GroupLayout(jDlogRegistro.getContentPane());
        jDlogRegistro.getContentPane().setLayout(jDlogRegistroLayout);
        jDlogRegistroLayout.setHorizontalGroup(
            jDlogRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlogRegistroLayout.setVerticalGroup(
            jDlogRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDlgRegistroDocente.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(126, 56, 64));
        jLabel16.setText("Sueldo");

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(126, 56, 64));
        jLabel15.setText("Especialidad:");

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(235, 117, 117));
        jLabel14.setText("Registrar docente");

        btnGuardarDocente.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarDocente.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnGuardarDocente.setForeground(new java.awt.Color(126, 56, 64));
        btnGuardarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarDocente.setText("Guardar");
        btnGuardarDocente.setBorder(null);
        btnGuardarDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(126, 56, 64));
        jLabel17.setText("Fecha de Contratación:");

        spinnerSueldoDocente.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10000.0d, 1.0d));

        btnCancelarDocente.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarDocente.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCancelarDocente.setForeground(new java.awt.Color(126, 56, 64));
        btnCancelarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelarDocente.setText("Cancelar");
        btnCancelarDocente.setBorder(null);
        btnCancelarDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(btnGuardarDocente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spinnerSueldoDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(btnCancelarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaContratacionDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEspecialidad)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel14)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerSueldoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaContratacionDocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDocente)
                    .addComponent(btnCancelarDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jDlgRegistroDocenteLayout = new javax.swing.GroupLayout(jDlgRegistroDocente.getContentPane());
        jDlgRegistroDocente.getContentPane().setLayout(jDlgRegistroDocenteLayout);
        jDlgRegistroDocenteLayout.setHorizontalGroup(
            jDlgRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgRegistroDocenteLayout.setVerticalGroup(
            jDlgRegistroDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDlgRegistroProductor.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(235, 117, 117));
        jLabel21.setText("Registrar Director Artístico");

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(126, 56, 64));
        jLabel18.setText("Experiencia:");

        jLabel19.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(126, 56, 64));
        jLabel19.setText("Sueldo:");

        jLabel20.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(126, 56, 64));
        jLabel20.setText("Fecha de Contratación:");

        btnGuardarProductor.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarProductor.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnGuardarProductor.setForeground(new java.awt.Color(126, 56, 64));
        btnGuardarProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarProductor.setText("Guardar");
        btnGuardarProductor.setBorder(null);
        btnGuardarProductor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel26.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(126, 56, 64));
        jLabel26.setText("$");

        btnCancelarProductor.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarProductor.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCancelarProductor.setForeground(new java.awt.Color(126, 56, 64));
        btnCancelarProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelarProductor.setText("Cancelar");
        btnCancelarProductor.setBorder(null);
        btnCancelarProductor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fechaContratacionProductor, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(spinnerSueldoProductor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addComponent(spinnerExperiencia)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnGuardarProductor)
                        .addGap(78, 78, 78)
                        .addComponent(btnCancelarProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel21)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(spinnerExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(spinnerSueldoProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fechaContratacionProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProductor)
                    .addComponent(btnCancelarProductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDlgRegistroProductorLayout = new javax.swing.GroupLayout(jDlgRegistroProductor.getContentPane());
        jDlgRegistroProductor.getContentPane().setLayout(jDlgRegistroProductorLayout);
        jDlgRegistroProductorLayout.setHorizontalGroup(
            jDlgRegistroProductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgRegistroProductorLayout.setVerticalGroup(
            jDlgRegistroProductorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDlgRegistroAdministrador.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(235, 117, 117));
        jLabel25.setText("Registrar administrador");

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(126, 56, 64));
        jLabel13.setText("Usuario:");

        jLabel22.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(126, 56, 64));
        jLabel22.setText("Contraseña:");

        jLabel24.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(126, 56, 64));
        jLabel24.setText("Fecha de Contratación:");

        spinnerSueldoAdministrador.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10000.0d, 1.0d));

        jLabel23.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(126, 56, 64));
        jLabel23.setText("Sueldo");

        btnGuardarAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarAdministrador.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnGuardarAdministrador.setForeground(new java.awt.Color(126, 56, 64));
        btnGuardarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardarAdministrador.setText("Guardar");
        btnGuardarAdministrador.setBorder(null);
        btnGuardarAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnCancelarAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelarAdministrador.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCancelarAdministrador.setForeground(new java.awt.Color(126, 56, 64));
        btnCancelarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        btnCancelarAdministrador.setText("Cancelar");
        btnCancelarAdministrador.setBorder(null);
        btnCancelarAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel27.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(126, 56, 64));
        jLabel27.setText("$");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel22))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(btnGuardarAdministrador, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaContratacionAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnCancelarAdministrador))
                                    .addComponent(spinnerSueldoAdministrador))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)))
                        .addGap(61, 61, 61))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(fechaContratacionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(spinnerSueldoAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarAdministrador))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jDlgRegistroAdministradorLayout = new javax.swing.GroupLayout(jDlgRegistroAdministrador.getContentPane());
        jDlgRegistroAdministrador.getContentPane().setLayout(jDlgRegistroAdministradorLayout);
        jDlgRegistroAdministradorLayout.setHorizontalGroup(
            jDlgRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDlgRegistroAdministradorLayout.setVerticalGroup(
            jDlgRegistroAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(126, 56, 64));
        jLabel1.setText("Buscar:");

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(126, 56, 64));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);

        btnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnCrear.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(126, 56, 64));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registroo.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setBorder(null);

        btnActualizar1.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnActualizar1.setForeground(new java.awt.Color(126, 56, 64));
        btnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.setBorder(null);

        btnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimir.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(126, 56, 64));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(null);
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jtxtTituloMenu.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jtxtTituloMenu.setForeground(new java.awt.Color(235, 117, 117));
        jtxtTituloMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        jtxtTituloMenu.setText("Personal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(btnCrear)
                .addGap(68, 68, 68)
                .addComponent(btnModificar)
                .addGap(46, 46, 46)
                .addComponent(btnActualizar1)
                .addGap(19, 19, 19)
                .addComponent(btnImprimir)
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(494, 494, 494)
                .addComponent(jtxtTituloMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtTituloMenu)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir))
                .addContainerGap())
        );

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Teléfono", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tblPersona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnCancelarAdministrador;
    private javax.swing.JButton btnCancelarDocente;
    private javax.swing.JButton btnCancelarPersona;
    private javax.swing.JButton btnCancelarProductor;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardarAdministrador;
    private javax.swing.JButton btnGuardarDocente;
    private javax.swing.JButton btnGuardarProductor;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarPersona;
    private javax.swing.JCheckBox checkAdministrador;
    private javax.swing.JCheckBox checkDocente;
    private javax.swing.JCheckBox checkEstudiante;
    private javax.swing.JCheckBox checkProductor;
    private com.toedter.calendar.JDateChooser fechaContratacionAdministrador;
    private com.toedter.calendar.JDateChooser fechaContratacionDocente;
    private com.toedter.calendar.JDateChooser fechaContratacionProductor;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JRadioButton femenino;
    private javax.swing.ButtonGroup genero;
    private javax.swing.JDialog jDlgRegistroAdministrador;
    private javax.swing.JDialog jDlgRegistroDocente;
    private javax.swing.JDialog jDlgRegistroProductor;
    private javax.swing.JDialog jDlogRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jtxtTituloMenu;
    private javax.swing.JLabel lblRol;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JRadioButton noBinario;
    private javax.swing.ButtonGroup rol;
    private javax.swing.JSpinner spinnerExperiencia;
    private javax.swing.JSpinner spinnerSueldoAdministrador;
    private javax.swing.JSpinner spinnerSueldoDocente;
    private javax.swing.JSpinner spinnerSueldoProductor;
    private javax.swing.JTable tblPersona;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
