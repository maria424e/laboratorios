package vista;

import controlador.ControladorEquipos;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Equipos;
import modelo.conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kevin Fajardo Casas
 */
public class MenuEquipos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy");
    FileInputStream fis;
    int longitudBytes;
    ControladorEquipos equipoController = new ControladorEquipos();
    int fila1;

    public MenuEquipos() {
        initComponents();
        fechainin.setText("<html><p>Fecha de inicio</p><p>de operacion</p></html>");
        freman.setText("<html><p>Fr. Recomendada</p><p>Mantenimiento P:</p></html>");
        verirecomen.setText("<html><p>Fr. Recomendada</p><p>Verificación</p></html>");
        calirecomen.setText("<html><p>Fr. Recomendada</p><p>Calibración:</p></html>");
        TXTNu.setValue(0);
        TXTNu.setVisible(false);
        limpiarFormulario();
        TXTFechaequi.setDateFormatString("dd-MM-yyyy");
        TXTFechacompra.setDateFormatString("dd-MM-yyyy");
        TXTFechainicion.setDateFormatString("dd-MM-yyyy");
        jTable1.setModel(modelo);
        modelo.addColumn("Tipo Documento");
        modelo.addColumn("Idioma");
        BTNEliminar.setEnabled(false);
    }

    private void limpiarFormulario() {

        TXTNomequipo.setText("");
        TXTMarcaequi.setText("");
        TXTModeloequi.setText("");
        TXTNoserie.setText("");
        TXTProveedorequi.setText("");
        TXTArea.setText("");
        TXTPlacasena.setText("");
        TXTContratono.setText("");
        TXTGarantiaequi.setText("");
        TXTFechaequi.setDate(null);
        TXTFechacompra.setDate(null);
        TXTFechainicion.setDate(null);
        TXTAccesorios.setText("");
        TXTFrerecomante.setSelectedItem("Seleccionar");
        TXTFrerecorevi.setSelectedItem("Seleccionar");
        TXTFrerecocali.setSelectedItem("Seleccionar");
        TXTPreventivoequi.setSelectedItem("Seleccione");
        TXTVerificacionequi.setSelectedItem("Seleccione");
        TXTCalibracionequi.setSelectedItem("Seleccione");
        TXTEspecificaciones.setText("");
        TXTFuncionequi.setText("");
        TXTManualequi.setText("");
        TXTTempmax.setText("");
        TXTTempmin.setText("");
        TXTHumax.setText("");
        TXTHumin.setText("");
        TXTEnergiaequi.setText("");
        TXTObserequi.setText("");
        jTextField1.setText("");
        modelo.setRowCount(0);
        BTNModificar.setEnabled(false);
        //BTNEliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel1 = new javax.swing.JPanel();
        BTNInsertar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        TXTBuscarEquipo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTMarcaequi = new javax.swing.JTextField();
        TXTNu = new javax.swing.JFormattedTextField();
        TXTNomequipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TXTModeloequi = new javax.swing.JTextField();
        TXTNoserie = new javax.swing.JTextField();
        TXTProveedorequi = new javax.swing.JTextField();
        TXTArea = new javax.swing.JTextField();
        TXTPlacasena = new javax.swing.JTextField();
        TXTContratono = new javax.swing.JTextField();
        TXTGarantiaequi = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fechainin = new javax.swing.JLabel();
        freman = new javax.swing.JLabel();
        verirecomen = new javax.swing.JLabel();
        calirecomen = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TXTManualequi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TXTAccesorios = new javax.swing.JTextArea();
        TXTFechaequi = new com.toedter.calendar.JDateChooser();
        TXTFechacompra = new com.toedter.calendar.JDateChooser();
        TXTFechainicion = new com.toedter.calendar.JDateChooser();
        TXTFrerecomante = new javax.swing.JComboBox<>();
        TXTFrerecorevi = new javax.swing.JComboBox<>();
        TXTFrerecocali = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        TXTTempmax = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TXTTempmin = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TXTHumax = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        TXTHumin = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        TXTEnergiaequi = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTObserequi = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TXTEspecificaciones = new javax.swing.JTextArea();
        TXTPreventivoequi = new javax.swing.JComboBox<>();
        TXTVerificacionequi = new javax.swing.JComboBox<>();
        TXTCalibracionequi = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TXTFuncionequi = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BTNEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg.jpg"))); // NOI18N

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-archivo-de-salvar-en-disco-icono-4876-32.png"))); // NOI18N
        BTNInsertar.setToolTipText("Insertar");
        BTNInsertar.setContentAreaFilled(false);
        BTNInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        BTNModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar-usuario-icono-9786-32.png"))); // NOI18N
        BTNModificar.setToolTipText("Modificar");
        BTNModificar.setContentAreaFilled(false);
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        BTNBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom-icono-9136-32.png"))); // NOI18N
        BTNBuscar.setToolTipText("Buscar");
        BTNBuscar.setContentAreaFilled(false);
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        jLabel28.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Búsqueda");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));
        jPanel1.add(TXTBuscarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 197, -1));

        jLabel30.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("REGISTRO DE EQUIPOS");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 209, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar-cancelar-icono-4935-16.png"))); // NOI18N
        jButton1.setToolTipText("Limpiar");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, 41));

        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTabbedPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTabbedPane1ComponentAdded(evt);
            }
        });

        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Marca/Fabricante");

        TXTMarcaequi.setOpaque(false);
        TXTMarcaequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTMarcaequiActionPerformed(evt);
            }
        });

        TXTNu.setOpaque(false);

        TXTNomequipo.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Modelo");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("N° Serie");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Proveedor");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Ubicación");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("N° Placa SENA");

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Contrato N°");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Garantía");

        TXTModeloequi.setOpaque(false);

        TXTNoserie.setOpaque(false);

        TXTProveedorequi.setOpaque(false);
        TXTProveedorequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTProveedorequiActionPerformed(evt);
            }
        });

        TXTArea.setOpaque(false);

        TXTPlacasena.setOpaque(false);

        TXTContratono.setOpaque(false);
        TXTContratono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTContratonoActionPerformed(evt);
            }
        });

        TXTGarantiaequi.setOpaque(false);
        TXTGarantiaequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTGarantiaequiActionPerformed(evt);
            }
        });

        lblfoto.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        lblfoto.setForeground(new java.awt.Color(102, 102, 102));
        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("Cargar imagen");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addComponent(TXTProveedorequi, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTNoserie)
                            .addComponent(TXTModeloequi)
                            .addComponent(TXTMarcaequi)
                            .addComponent(TXTNomequipo))))
                .addGap(15, 15, 15)
                .addComponent(TXTNu, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTArea)
                    .addComponent(TXTPlacasena)
                    .addComponent(TXTContratono)
                    .addComponent(TXTGarantiaequi, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(TXTNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(TXTPlacasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(TXTContratono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TXTGarantiaequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TXTNomequipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TXTMarcaequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTModeloequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTNoserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTProveedorequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(531, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos", jPanel2);

        jPanel3.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Fecha");

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Fecha compra");

        fechainin.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        fechainin.setForeground(new java.awt.Color(102, 102, 102));
        fechainin.setText("fe");

        freman.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        freman.setForeground(new java.awt.Color(102, 102, 102));
        freman.setText("df ");

        verirecomen.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        verirecomen.setForeground(new java.awt.Color(102, 102, 102));
        verirecomen.setText("er");

        calirecomen.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        calirecomen.setForeground(new java.awt.Color(102, 102, 102));
        calirecomen.setText("ef");

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Manual");

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Accesorios");

        TXTAccesorios.setColumns(20);
        TXTAccesorios.setRows(5);
        jScrollPane3.setViewportView(TXTAccesorios);

        TXTFrerecomante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Anual", "Mensual", "Diaria" }));

        TXTFrerecorevi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Anual", "Mensual", "Diaria" }));
        TXTFrerecorevi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTFrerecoreviActionPerformed(evt);
            }
        });

        TXTFrerecocali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Anual", "Mensual", "Diaria" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addComponent(freman, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(fechainin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXTFrerecomante, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TXTFechacompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTFechainicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTFechaequi, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(verirecomen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addGap(42, 42, 42)
                        .addComponent(TXTManualequi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TXTFrerecorevi, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(calirecomen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTFrerecocali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTFechaequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(8, 8, 8)
                                        .addComponent(fechainin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(TXTFechacompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXTFechainicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTManualequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTFrerecomante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verirecomen, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(freman, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTFrerecorevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calirecomen, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTFrerecocali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(499, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos 2", jPanel3);

        jPanel4.setOpaque(false);

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("T. Máxima");

        TXTTempmax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTempmaxKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("T. Mínima");

        TXTTempmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTempminKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("H. Máxima");

        TXTHumax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTHumaxKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("H. Mínima");

        TXTHumin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTHuminKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Calibración");

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Función");

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Preventivo");

        jLabel26.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Requerimiento energético");

        TXTEnergiaequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTEnergiaequiActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("Observación");

        jLabel35.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("Verificación");

        jLabel36.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Especificaciones");

        TXTObserequi.setColumns(20);
        TXTObserequi.setRows(5);
        jScrollPane2.setViewportView(TXTObserequi);

        TXTEspecificaciones.setColumns(20);
        TXTEspecificaciones.setRows(5);
        jScrollPane4.setViewportView(TXTEspecificaciones);

        TXTPreventivoequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));

        TXTVerificacionequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));

        TXTCalibracionequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Si", "No" }));

        TXTFuncionequi.setColumns(20);
        TXTFuncionequi.setRows(5);
        jScrollPane5.setViewportView(TXTFuncionequi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel35)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TXTVerificacionequi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTCalibracionequi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTPreventivoequi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTTempmin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTHumax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTHumin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTTempmax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addComponent(TXTEnergiaequi)
                    .addComponent(jLabel27)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(542, 542, 542))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(TXTPreventivoequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(TXTVerificacionequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(TXTCalibracionequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(TXTTempmax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(TXTTempmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(TXTHumax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTEnergiaequi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTHumin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))))
                .addContainerGap(482, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos 3", jPanel4);

        jPanel5.setOpaque(false);

        jButton3.setText("Nuevo documento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Elija idioma:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Inglés", "Español", "Francés" }));

        jLabel37.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Documentación asociada");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tipo Documento", "Idioma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNEliminar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel32))
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton3)))))
                .addGap(364, 364, 364))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jButton3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(BTNEliminar)))
                .addContainerGap(506, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos básicos 4", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 890, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portapapeles-icono-9080-32.png"))); // NOI18N
        jButton4.setToolTipText("Generar Reporte");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, -1));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTMarcaequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTMarcaequiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTMarcaequiActionPerformed

    private void TXTContratonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTContratonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTContratonoActionPerformed

    private void BTNInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarActionPerformed
        equipoController.controlarAccion("Insertar", obtenerEquipo());
        for (int i = 0; i < modelo.getRowCount(); i++) {
            try {
                PreparedStatement sql = conexion.connection.prepareStatement("INSERT INTO documentacionasoci (documento, idioma, noserie)"
                        + "VALUES (?,?,?)");
                sql.setString(1, (String) jTable1.getValueAt(i, 0));
                sql.setString(2, (String) jTable1.getValueAt(i, 1));
                sql.setString(3, TXTNoserie.getText());
                sql.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Hubo un problema al insertar los documentos " + e.getMessage());
            }
        }
        limpiarFormulario();
    }//GEN-LAST:event_BTNInsertarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        equipoController.controlarAccion("Modificar", obtenerEquipo());
        limpiarFormulario();
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        InputStream is;
        ImageIcon foto;
        Equipos e = new Equipos();
        Iterator<Equipos> itequi = e.buscar(TXTBuscarEquipo.getText());
        while (itequi.hasNext()) {
            e = itequi.next();
            TXTNu.setValue(e.getNu());
            TXTNomequipo.setText(e.getNomequipo());
            TXTMarcaequi.setText(e.getMarcaequi());
            TXTModeloequi.setText(e.getModeloequi());
            TXTNoserie.setText(e.getNoserie());
            TXTProveedorequi.setText(e.getProveedorequi());
            TXTArea.setText(e.getArea());
            TXTPlacasena.setText(e.getPlacasena());
            TXTContratono.setText(e.getContratono());
            TXTGarantiaequi.setText(e.getGarantiaequi());
            System.out.println(e.getNomequipo());
            try {
                TXTFechaequi.setDate(fecha.parse(e.getFechaequi()));
                TXTFechacompra.setDate(fecha.parse(e.getFechacompra()));
                TXTFechainicion.setDate(fecha.parse(e.getFechainicion()));
            } catch (ParseException ex) {
                Logger.getLogger(MenuEquipos.class.getName()).log(Level.SEVERE, null, ex);
            }
            TXTAccesorios.setText(e.getAccesorios());
            TXTFrerecomante.setSelectedItem(e.getFrerecomante());
            TXTFrerecorevi.setSelectedItem(e.getFrerecorevi());
            TXTFrerecocali.setSelectedItem(e.getFrerecocali());
            TXTPreventivoequi.setSelectedItem(e.getPreventivoequi());
            TXTVerificacionequi.setSelectedItem(e.getVerificacionequi());
            TXTCalibracionequi.setSelectedItem(e.getCalibracionequi());
            TXTEspecificaciones.setText(e.getEspecificaciones());
            TXTFuncionequi.setText(e.getFuncionequi());
            TXTManualequi.setText(e.getManualequi());
            TXTTempmax.setText(e.getTempmax());
            TXTTempmin.setText(e.getTempmin());
            TXTHumax.setText(e.getHumax());
            TXTHumin.setText(e.getHumin());
            TXTEnergiaequi.setText(e.getEnergiaequi());
            TXTObserequi.setText(e.getObserequi());
            try {
                PreparedStatement sql = conexion.connection.prepareStatement("SELECT foto FROM equipos WHERE noserie = ?");
                sql.setString(1, e.getNoserie());
                ResultSet rs = sql.executeQuery();
                rs.next();
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                foto = new ImageIcon(bi);
                Image img = foto.getImage();
                Image newimg = img.getScaledInstance(140, 170, java.awt.Image.SCALE_SMOOTH);
                ImageIcon newicon = new ImageIcon(newimg);
                lblfoto.setIcon(newicon);
            } catch (IOException ex) {
                System.err.println("Hubo un error con la imagen " + ex.getMessage());
            } catch (SQLException ex) {
                System.err.println("Hubo un error al hacer la consulta " + ex.getMessage());
            }
            BTNModificar.setEnabled(true);
            //BTNEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TXTProveedorequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTProveedorequiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTProveedorequiActionPerformed

    private void jTabbedPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1ComponentAdded

    private void TXTGarantiaequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTGarantiaequiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTGarantiaequiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lblfoto.setIcon(null);
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);//solo archivos y no carpetas
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());
                //necesitamos saber la cantidad de bytes
                longitudBytes = (int) j.getSelectedFile().length();
                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT);
                    lblfoto.setIcon(new ImageIcon(icono));
                    lblfoto.updateUI();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "imagen: " + ex);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TXTEnergiaequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTEnergiaequiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTEnergiaequiActionPerformed

    private void TXTTempmaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTempmaxKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTTempmax.transferFocus();
        }
    }//GEN-LAST:event_TXTTempmaxKeyTyped

    private void TXTTempminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTempminKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTTempmin.transferFocus();
        }
    }//GEN-LAST:event_TXTTempminKeyTyped

    private void TXTHumaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTHumaxKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTHumax.transferFocus();
        }
    }//GEN-LAST:event_TXTHumaxKeyTyped

    private void TXTHuminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTHuminKeyTyped
        int k = (int) evt.getKeyChar();
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 241 || k == 209) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No debe ingresar letras!!!", "Ventana Error Datos", JOptionPane.ERROR_MESSAGE);
        }
        if (k == 10) {
            TXTHumin.transferFocus();
        }
    }//GEN-LAST:event_TXTHuminKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JasperReport jrReporte = null;
        try {
            jrReporte = (JasperReport) JRLoader.loadObject(getClass().getClassLoader().getResource("reportes/hojadevida.jasper"));
            Map params = new HashMap();
            params.put("buscarequipo", TXTNoserie.getText());
            JasperPrint jpReporte = JasperFillManager.fillReport(jrReporte, params, conexion.connection);
            JasperViewer jReporteViewer = new JasperViewer(jpReporte, false);
            jReporteViewer.setVisible(true);
        } catch (JRException e) {
            System.err.println("Hubo un problema con el jasper " + e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TXTFrerecoreviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTFrerecoreviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTFrerecoreviActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTextField1.getText().equals("")  || jComboBox1.getSelectedItem().equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar datos");

        } else {
            Object[] documentos = new Object[2];
            documentos[0] = jTextField1.getText();
            documentos[1] = jComboBox1.getSelectedItem();
            modelo.addRow(documentos);
            jTextField1.setText("");
            jComboBox1.setSelectedItem("Seleccione");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        fila1 = jTable1.rowAtPoint(evt.getPoint());
        if (fila1 > -1) {
            BTNEliminar.setEnabled(true);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        modelo.removeRow(fila1);
        BTNEliminar.setEnabled(false);
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private Equipos obtenerEquipo() {
        Equipos elEquipo = new Equipos();
        elEquipo.setNu((Integer) TXTNu.getValue());
        elEquipo.setNomequipo(TXTNomequipo.getText());
        elEquipo.setMarcaequi(TXTMarcaequi.getText());
        elEquipo.setModeloequi(TXTModeloequi.getText());
        elEquipo.setNoserie(TXTNoserie.getText());
        elEquipo.setProveedorequi(TXTProveedorequi.getText());
        elEquipo.setArea(TXTArea.getText());
        elEquipo.setPlacasena(TXTPlacasena.getText());
        elEquipo.setContratono(TXTContratono.getText());
        elEquipo.setGarantiaequi(TXTGarantiaequi.getText());
        elEquipo.setFechaequi(fecha.format(TXTFechaequi.getDate()));
        elEquipo.setFechacompra(fecha.format(TXTFechacompra.getDate()));
        elEquipo.setFechainicion(fecha.format(TXTFechainicion.getDate()));
        elEquipo.setAccesorios(TXTAccesorios.getText());
        elEquipo.setFrerecomante((String) TXTFrerecomante.getSelectedItem());
        elEquipo.setFrerecorevi((String) TXTFrerecorevi.getSelectedItem());
        elEquipo.setFrerecocali((String) TXTFrerecocali.getSelectedItem());
        elEquipo.setPreventivoequi((String) TXTPreventivoequi.getSelectedItem());
        elEquipo.setVerificacionequi((String) TXTVerificacionequi.getSelectedItem());
        elEquipo.setCalibracionequi((String) TXTCalibracionequi.getSelectedItem());
        elEquipo.setEspecificaciones(TXTEspecificaciones.getText());
        elEquipo.setFuncionequi(TXTFuncionequi.getText());
        elEquipo.setManualequi(TXTManualequi.getText());
        elEquipo.setTempmax(TXTTempmax.getText());
        elEquipo.setTempmin(TXTTempmin.getText());
        elEquipo.setHumax(TXTHumax.getText());
        elEquipo.setHumin(TXTHumin.getText());
        elEquipo.setEnergiaequi(TXTEnergiaequi.getText());
        elEquipo.setObserequi(TXTObserequi.getText());
        elEquipo.setFoto1(fis);
        elEquipo.setFoto2(longitudBytes);
        return elEquipo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNInsertar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JTextArea TXTAccesorios;
    private javax.swing.JTextField TXTArea;
    private javax.swing.JTextField TXTBuscarEquipo;
    private javax.swing.JComboBox<String> TXTCalibracionequi;
    private javax.swing.JTextField TXTContratono;
    private javax.swing.JTextField TXTEnergiaequi;
    private javax.swing.JTextArea TXTEspecificaciones;
    private com.toedter.calendar.JDateChooser TXTFechacompra;
    private com.toedter.calendar.JDateChooser TXTFechaequi;
    private com.toedter.calendar.JDateChooser TXTFechainicion;
    private javax.swing.JComboBox<String> TXTFrerecocali;
    private javax.swing.JComboBox<String> TXTFrerecomante;
    private javax.swing.JComboBox<String> TXTFrerecorevi;
    private javax.swing.JTextArea TXTFuncionequi;
    private javax.swing.JTextField TXTGarantiaequi;
    private javax.swing.JTextField TXTHumax;
    private javax.swing.JTextField TXTHumin;
    private javax.swing.JTextField TXTManualequi;
    private javax.swing.JTextField TXTMarcaequi;
    private javax.swing.JTextField TXTModeloequi;
    private javax.swing.JTextField TXTNomequipo;
    private javax.swing.JTextField TXTNoserie;
    private javax.swing.JFormattedTextField TXTNu;
    private javax.swing.JTextArea TXTObserequi;
    private javax.swing.JTextField TXTPlacasena;
    private javax.swing.JComboBox<String> TXTPreventivoequi;
    private javax.swing.JTextField TXTProveedorequi;
    private javax.swing.JTextField TXTTempmax;
    private javax.swing.JTextField TXTTempmin;
    private javax.swing.JComboBox<String> TXTVerificacionequi;
    private javax.swing.JLabel calirecomen;
    private javax.swing.JLabel fechainin;
    private javax.swing.JLabel freman;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblfoto;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JLabel verirecomen;
    // End of variables declaration//GEN-END:variables
}
