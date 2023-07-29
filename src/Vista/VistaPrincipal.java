/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form pri
     */
    public VistaPrincipal() {
        initComponents();
        this.setTitle("Tablero");
    }

    public JButton getBtnAdministrador() {
        return btnAdministrador;
    }

    public void setBtnAdministrador(JButton btnAdministrador) {
        this.btnAdministrador = btnAdministrador;
    }

    public JButton getBtnAsignarAsignatura() {
        return btnAsignarAsignatura;
    }

    public void setBtnAsignarAsignatura(JButton btnAsignarAsignatura) {
        this.btnAsignarAsignatura = btnAsignarAsignatura;
    }

    public JButton getBtnAsignatura() {
        return btnAsignatura;
    }

    public void setBtnAsignatura(JButton btnAsignatura) {
        this.btnAsignatura = btnAsignatura;
    }

    public JButton getBtnAula() {
        return btnAula;
    }

    public void setBtnAula(JButton btnAula) {
        this.btnAula = btnAula;
    }

    public JButton getBtnCurso() {
        return btnCurso;
    }

    public void setBtnCurso(JButton btnCurso) {
        this.btnCurso = btnCurso;
    }

    public JButton getBtnDashboard() {
        return btnDashboard;
    }

    public void setBtnDashboard(JButton btnDashboard) {
        this.btnDashboard = btnDashboard;
    }

    public JButton getBtnDocente() {
        return btnDocente;
    }

    public void setBtnDocente(JButton btnDocente) {
        this.btnDocente = btnDocente;
    }

    public JButton getBtnEstudiante() {
        return btnEstudiante;
    }

    public void setBtnEstudiante(JButton btnEstudiante) {
        this.btnEstudiante = btnEstudiante;
    }

    public JButton getBtnProductor() {
        return btnProductor;
    }

    public void setBtnProductor(JButton btnProductor) {
        this.btnProductor = btnProductor;
    }

    public JButton getBtnRegistrarPersona() {
        return btnRegistrarPersona;
    }

    public void setBtnRegistrarPersona(JButton btnRegistrarPersona) {
        this.btnRegistrarPersona = btnRegistrarPersona;
    }

    public JDesktopPane getEscritorioPrincipal() {
        return escritorioPrincipal;
    }

    public void setEscritorioPrincipal(JDesktopPane escritorioPrincipal) {
        this.escritorioPrincipal = escritorioPrincipal;
    }

    public JButton getBtnInstrumento() {
        return btnInstrumento;
    }

    public void setBtnInstrumento(JButton btnInstrumento) {
        this.btnInstrumento = btnInstrumento;
    }

    public JButton getBtnSetGrab() {
        return btnSetGrab;
    }

    public void setBtnSetGrab(JButton btnSetGrab) {
        this.btnSetGrab = btnSetGrab;
    }

    public JButton getBtnHorario() {
        return btnHorario;
    }

    public void setBtnHorario(JButton btnHorario) {
        this.btnHorario = btnHorario;
    }

    public JButton getBtnMatricula() {
        return btnMatricula;
    }

    public void setBtnMatricula(JButton btnMatricula) {
        this.btnMatricula = btnMatricula;
    }

    public JButton getBtnAsiHorario() {
        return btnAsiHorario;
    }

    public void setBtnAsiHorario(JButton btnAsiHorario) {
        this.btnAsiHorario = btnAsiHorario;
    }

    public JButton getBtnReserva() {
        return btnReserva;
    }

    public void setBtnReserva(JButton btnReserva) {
        this.btnReserva = btnReserva;
    }

    public JButton getBtnAsignarAula() {
        return btnAsignarAula;
    }

    public void setBtnAsignarAula(JButton btnAsignarAula) {
        this.btnAsignarAula = btnAsignarAula;
    }

    public JButton getBtnDirigir() {
        return btnDirigir;
    }

    public void setBtnDirigir(JButton btnDirigir) {
        this.btnDirigir = btnDirigir;
    }

    public JLabel getLblUsuario() {
        return lblUsuario;
    }

    public void setLblUsuario(JLabel lblUsuario) {
        this.lblUsuario = lblUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnCurso = new javax.swing.JButton();
        btnAsignatura = new javax.swing.JButton();
        btnAsignarAsignatura = new javax.swing.JButton();
        btnAula = new javax.swing.JButton();
        btnInstrumento = new javax.swing.JButton();
        btnSetGrab = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnAsiHorario = new javax.swing.JButton();
        btnAsignarAula = new javax.swing.JButton();
        btnDirigir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarPersona = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();
        btnProductor = new javax.swing.JButton();
        btnDocente = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        escritorioPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(235, 159, 159));
        jPanel4.setAutoscrolls(true);

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuariogrande.png"))); // NOI18N
        lblUsuario.setText("USUARIO");
        lblUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnDashboard.setBackground(new java.awt.Color(191, 161, 161));
        btnDashboard.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dash.png"))); // NOI18N
        btnDashboard.setText("Tablero");
        btnDashboard.setAutoscrolls(true);
        btnDashboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnCurso.setBackground(new java.awt.Color(191, 161, 161));
        btnCurso.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ensenando (1).png"))); // NOI18N
        btnCurso.setText("Curso");
        btnCurso.setAutoscrolls(true);
        btnCurso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCurso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAsignatura.setBackground(new java.awt.Color(191, 161, 161));
        btnAsignatura.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros (1).png"))); // NOI18N
        btnAsignatura.setText("Asignatura");
        btnAsignatura.setAutoscrolls(true);
        btnAsignatura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAsignatura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAsignarAsignatura.setBackground(new java.awt.Color(191, 161, 161));
        btnAsignarAsignatura.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAsignarAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto (1).png"))); // NOI18N
        btnAsignarAsignatura.setText("Asignar Asignatura");
        btnAsignarAsignatura.setAutoscrolls(true);
        btnAsignarAsignatura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAsignarAsignatura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAsignarAsignatura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAula.setBackground(new java.awt.Color(191, 161, 161));
        btnAula.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAula.setForeground(new java.awt.Color(255, 255, 255));
        btnAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aula (1).png"))); // NOI18N
        btnAula.setText("Aula");
        btnAula.setAutoscrolls(true);
        btnAula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnInstrumento.setBackground(new java.awt.Color(191, 161, 161));
        btnInstrumento.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        btnInstrumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/danza (1).png"))); // NOI18N
        btnInstrumento.setText("Indumentaria");
        btnInstrumento.setAutoscrolls(true);
        btnInstrumento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInstrumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInstrumento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrumentoActionPerformed(evt);
            }
        });

        btnSetGrab.setBackground(new java.awt.Color(191, 161, 161));
        btnSetGrab.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnSetGrab.setForeground(new java.awt.Color(255, 255, 255));
        btnSetGrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas (1).png"))); // NOI18N
        btnSetGrab.setText("Evento");
        btnSetGrab.setAutoscrolls(true);
        btnSetGrab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSetGrab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSetGrab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnReserva.setBackground(new java.awt.Color(191, 161, 161));
        btnReserva.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reserva-en-linea (1) (1).png"))); // NOI18N
        btnReserva.setText("Reserva");
        btnReserva.setAutoscrolls(true);
        btnReserva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnHorario.setBackground(new java.awt.Color(191, 161, 161));
        btnHorario.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario (1) (1).png"))); // NOI18N
        btnHorario.setText("Horario");
        btnHorario.setAutoscrolls(true);
        btnHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHorario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAsiHorario.setBackground(new java.awt.Color(191, 161, 161));
        btnAsiHorario.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAsiHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnAsiHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seleccionar (1).png"))); // NOI18N
        btnAsiHorario.setText("Asignar Horario");
        btnAsiHorario.setAutoscrolls(true);
        btnAsiHorario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAsiHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAsiHorario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAsignarAula.setBackground(new java.awt.Color(191, 161, 161));
        btnAsignarAula.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAsignarAula.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delegar (1).png"))); // NOI18N
        btnAsignarAula.setText("Asignar aula");
        btnAsignarAula.setAutoscrolls(true);
        btnAsignarAula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAsignarAula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAsignarAula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnDirigir.setBackground(new java.awt.Color(191, 161, 161));
        btnDirigir.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDirigir.setForeground(new java.awt.Color(255, 255, 255));
        btnDirigir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gerente (1).png"))); // NOI18N
        btnDirigir.setText("Asignar director");
        btnDirigir.setAutoscrolls(true);
        btnDirigir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDirigir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDirigir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAsiHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAsignarAula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInstrumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSetGrab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDirigir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(btnAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAsignarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnAsiHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnAsignarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAula, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnAsignarAula, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInstrumento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetGrab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnDirigir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setAutoscrolls(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(235, 117, 117));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bailando.png"))); // NOI18N
        jLabel1.setText("ACADEMIA DE BAILE ODYSSEY DANCE INSTITUTE");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnRegistrarPersona.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarPersona.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnRegistrarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personas.png"))); // NOI18N
        btnRegistrarPersona.setToolTipText("Registrar persona");
        btnRegistrarPersona.setBorder(null);
        btnRegistrarPersona.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPersonaActionPerformed(evt);
            }
        });

        btnEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        btnEstudiante.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnEstudiante.setForeground(new java.awt.Color(235, 117, 117));
        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudi.png"))); // NOI18N
        btnEstudiante.setText("Estudiante");
        btnEstudiante.setToolTipText("Registrar estudiante");
        btnEstudiante.setBorder(null);
        btnEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });

        btnProductor.setBackground(new java.awt.Color(255, 255, 255));
        btnProductor.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnProductor.setForeground(new java.awt.Color(235, 117, 117));
        btnProductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/director.png"))); // NOI18N
        btnProductor.setText("Director Artistico");
        btnProductor.setToolTipText("Registrar director");
        btnProductor.setBorder(null);
        btnProductor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductorActionPerformed(evt);
            }
        });

        btnDocente.setBackground(new java.awt.Color(255, 255, 255));
        btnDocente.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnDocente.setForeground(new java.awt.Color(235, 117, 117));
        btnDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/docente.png"))); // NOI18N
        btnDocente.setText("Docente");
        btnDocente.setToolTipText("Registrar docente");
        btnDocente.setBorder(null);
        btnDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocenteActionPerformed(evt);
            }
        });

        btnAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        btnAdministrador.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(235, 117, 117));
        btnAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gerente.png"))); // NOI18N
        btnAdministrador.setText("Administrador");
        btnAdministrador.setToolTipText("Registrar administrador");
        btnAdministrador.setBorder(null);
        btnAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        btnMatricula.setBackground(new java.awt.Color(255, 255, 255));
        btnMatricula.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        btnMatricula.setForeground(new java.awt.Color(235, 117, 117));
        btnMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matricula_1.png"))); // NOI18N
        btnMatricula.setText("Matrícula");
        btnMatricula.setToolTipText("Realizar matrícula");
        btnMatricula.setBorder(null);
        btnMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnProductor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(jLabel1))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProductor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRegistrarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setLayout(new java.awt.BorderLayout());

        escritorioPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        escritorioPrincipal.setLayout(new java.awt.BorderLayout());
        jPanel5.add(escritorioPrincipal, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductorActionPerformed
        // TODO add your handling code here:
        // Obten el texto actual del botón
        String buttonText = btnProductor.getText();

// Modifica el texto del botón agregando las etiquetas HTML para el subrayado
        btnProductor.setText("<html><u>" + buttonText + "</u></html>");

    }//GEN-LAST:event_btnProductorActionPerformed

    private void btnDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocenteActionPerformed
        // TODO add your handling code here:
         String buttonText = btnDocente.getText();

// Modifica el texto del botón agregando las etiquetas HTML para el subrayado
        btnDocente.setText("<html><u>" + buttonText + "</u></html>");
    }//GEN-LAST:event_btnDocenteActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        // TODO add your handling code here:
         String buttonText = btnEstudiante.getText();

// Modifica el texto del botón agregando las etiquetas HTML para el subrayado
        btnEstudiante.setText("<html><u>" + buttonText + "</u></html>");
    }//GEN-LAST:event_btnEstudianteActionPerformed

    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        // TODO add your handling code here:
         String buttonText = btnMatricula.getText();

// Modifica el texto del botón agregando las etiquetas HTML para el subrayado
        btnMatricula.setText("<html><u>" + buttonText + "</u></html>");
    }//GEN-LAST:event_btnMatriculaActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        // TODO add your handling code here:
         String buttonText = btnAdministrador.getText();

// Modifica el texto del botón agregando las etiquetas HTML para el subrayado
        btnAdministrador.setText("<html><u>" + buttonText + "</u></html>");
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnRegistrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPersonaActionPerformed
        // TODO add your handling code here:
         String buttonText = btnRegistrarPersona.getText();

// Modifica el texto del botón agregando las etiquetas HTML para el subrayado
        btnRegistrarPersona.setText("<html><u>" + buttonText + "</u></html>");
    }//GEN-LAST:event_btnRegistrarPersonaActionPerformed

    private void btnInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInstrumentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnAsiHorario;
    private javax.swing.JButton btnAsignarAsignatura;
    private javax.swing.JButton btnAsignarAula;
    private javax.swing.JButton btnAsignatura;
    private javax.swing.JButton btnAula;
    private javax.swing.JButton btnCurso;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDirigir;
    private javax.swing.JButton btnDocente;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnInstrumento;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnProductor;
    private javax.swing.JButton btnRegistrarPersona;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnSetGrab;
    private javax.swing.JDesktopPane escritorioPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
