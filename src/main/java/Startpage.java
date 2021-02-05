
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import otherclasses.Doctor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suada
 */
public class Startpage extends javax.swing.JFrame {

    /**
     * Creates new form Startpage
     */
    public Startpage() {
        initComponents();
        SelectionPane.setVisible(false);
        MakeAPane.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInPane = new javax.swing.JLayeredPane();
        startseite = new javax.swing.JLayeredPane();
        label_test = new javax.swing.JLabel();
        button_test = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginpic = new javax.swing.JLabel();
        SelectionPane = new javax.swing.JLayeredPane();
        button_MakeAppointment = new javax.swing.JButton();
        button_ShiftCancelAp = new javax.swing.JButton();
        button_ExportToPdf = new javax.swing.JButton();
        MakeAPane = new javax.swing.JLayeredPane();
        label_makea_name = new javax.swing.JLabel();
        label_makea_adressinfo = new javax.swing.JLabel();
        txtfield_makeA_bday = new javax.swing.JTextField();
        button_makea_send = new javax.swing.JButton();
        label_makea_bday = new javax.swing.JLabel();
        label_makea_healthinfo = new javax.swing.JLabel();
        label_makea_type = new javax.swing.JLabel();
        txtfield_makeA_insurancename = new javax.swing.JTextField();
        label_makea_insurancename = new javax.swing.JLabel();
        txtfield_name = new javax.swing.JTextField();
        txtfield_makeA_healthinfo = new javax.swing.JTextField();
        combobox_makeA_type = new javax.swing.JComboBox<>();
        txtfield_makeA_adressinfo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(700, 1000));
        setLocationByPlatform(true);

        startseite.setBackground(new java.awt.Color(255, 102, 102));
        startseite.setForeground(new java.awt.Color(255, 255, 255));

        label_test.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        label_test.setText("Welcome to our");

        button_test.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        button_test.setText("Log in ");
        button_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_testActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel3.setText("EHS SYSTEM");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Password");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        startseite.setLayer(label_test, javax.swing.JLayeredPane.DEFAULT_LAYER);
        startseite.setLayer(button_test, javax.swing.JLayeredPane.DEFAULT_LAYER);
        startseite.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        startseite.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        startseite.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        startseite.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        startseite.setLayer(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        startseite.setLayer(loginpic, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout startseiteLayout = new javax.swing.GroupLayout(startseite);
        startseite.setLayout(startseiteLayout);
        startseiteLayout.setHorizontalGroup(
            startseiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startseiteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_test, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(startseiteLayout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(loginpic)
                .addGroup(startseiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startseiteLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startseiteLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(startseiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startseiteLayout.createSequentialGroup()
                                .addGroup(startseiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startseiteLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))))))
            .addGroup(startseiteLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(startseiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_test, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        startseiteLayout.setVerticalGroup(
            startseiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startseiteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(label_test)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(startseiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startseiteLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(40, 40, 40))
                    .addGroup(startseiteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginpic, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addComponent(button_test, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        button_test.getAccessibleContext().setAccessibleName("");

        LogInPane.setLayer(startseite, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout LogInPaneLayout = new javax.swing.GroupLayout(LogInPane);
        LogInPane.setLayout(LogInPaneLayout);
        LogInPaneLayout.setHorizontalGroup(
            LogInPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startseite)
        );
        LogInPaneLayout.setVerticalGroup(
            LogInPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startseite)
        );

        SelectionPane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        button_MakeAppointment.setText("Make an Appointment");
        button_MakeAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_MakeAppointmentMousePressed(evt);
            }
        });

        button_ShiftCancelAp.setText("Shift/Cancel Appointment");

        button_ExportToPdf.setText("Export to PDF");
        button_ExportToPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ExportToPdfActionPerformed(evt);
            }
        });

        SelectionPane.setLayer(button_MakeAppointment, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SelectionPane.setLayer(button_ShiftCancelAp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        SelectionPane.setLayer(button_ExportToPdf, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout SelectionPaneLayout = new javax.swing.GroupLayout(SelectionPane);
        SelectionPane.setLayout(SelectionPaneLayout);
        SelectionPaneLayout.setHorizontalGroup(
            SelectionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPaneLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(SelectionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_MakeAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_ExportToPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_ShiftCancelAp, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        SelectionPaneLayout.setVerticalGroup(
            SelectionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SelectionPaneLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(button_MakeAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(button_ShiftCancelAp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(button_ExportToPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        button_MakeAppointment.getAccessibleContext().setAccessibleDescription("");

        label_makea_name.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_makea_name.setText("Full name:");

        label_makea_adressinfo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_makea_adressinfo.setText("Adress information:");

        button_makea_send.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        button_makea_send.setText("send");
        button_makea_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_makea_sendMouseReleased(evt);
            }
        });
        button_makea_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_makea_sendActionPerformed(evt);
            }
        });

        label_makea_bday.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_makea_bday.setText("Date of birth: ");

        label_makea_healthinfo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_makea_healthinfo.setText("Health information:");

        label_makea_type.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_makea_type.setText("Insurance type: ");

        label_makea_insurancename.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        label_makea_insurancename.setText("Insurance name: ");

        combobox_makeA_type.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        combobox_makeA_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "private", "public" }));
        combobox_makeA_type.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Please fill out everything in order to make an appointment.");

        jLabel1.setText("Please select your health problem and the distance of search ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "heart", "lungs", "stomach", "general " }));

        jRadioButton1.setText("2km");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("5km");

        jRadioButton3.setText("10km");

        jRadioButton4.setText("15km");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel2.setText("Remind me in: ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 minutes", "1 hour", "3 days", "1 week" }));

        MakeAPane.setLayer(label_makea_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(label_makea_adressinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(txtfield_makeA_bday, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(button_makea_send, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(label_makea_bday, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(label_makea_healthinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(label_makea_type, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(txtfield_makeA_insurancename, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(label_makea_insurancename, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(txtfield_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(txtfield_makeA_healthinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(combobox_makeA_type, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(txtfield_makeA_adressinfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jRadioButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jRadioButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MakeAPane.setLayer(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MakeAPaneLayout = new javax.swing.GroupLayout(MakeAPane);
        MakeAPane.setLayout(MakeAPaneLayout);
        MakeAPaneLayout.setHorizontalGroup(
            MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MakeAPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_makea_name, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(label_makea_type, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_makea_healthinfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(label_makea_bday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_makea_insurancename, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_makea_adressinfo))
                .addGap(95, 95, 95)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfield_makeA_adressinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_makeA_bday, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_makeA_healthinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox_makeA_type, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_makeA_insurancename, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(MakeAPaneLayout.createSequentialGroup()
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MakeAPaneLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MakeAPaneLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MakeAPaneLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jRadioButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jRadioButton2)
                        .addGap(44, 44, 44)
                        .addComponent(jRadioButton3)
                        .addGap(41, 41, 41)
                        .addComponent(jRadioButton4))
                    .addGroup(MakeAPaneLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2)
                        .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MakeAPaneLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MakeAPaneLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MakeAPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_makea_send, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        MakeAPaneLayout.setVerticalGroup(
            MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MakeAPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_makea_name, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfield_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_makea_adressinfo)
                    .addComponent(txtfield_makeA_adressinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_makea_bday)
                    .addComponent(txtfield_makeA_bday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_makea_healthinfo)
                    .addComponent(txtfield_makeA_healthinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_makea_type)
                    .addComponent(combobox_makeA_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_makea_insurancename)
                    .addComponent(txtfield_makeA_insurancename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(MakeAPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_makea_send)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SelectionPane))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MakeAPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SelectionPane))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MakeAPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_ExportToPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ExportToPdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ExportToPdfActionPerformed

    private void button_MakeAppointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_MakeAppointmentMousePressed
       MakeAPane.setVisible(true);
       SelectionPane.setVisible(false);
    }//GEN-LAST:event_button_MakeAppointmentMousePressed

    private void button_makea_sendMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_makea_sendMouseReleased
       int i;
       // txtfield_name.getText().isEmpty()
       if( (!txtfield_name.getText().isEmpty()) && (!txtfield_makeA_adressinfo.getText().isEmpty()) && (!txtfield_makeA_bday.getText().isEmpty()) && (!txtfield_makeA_healthinfo.getText().isEmpty()) && (!txtfield_makeA_insurancename.getText().isEmpty()) ) {
           //Datenspeichern in Datenbank 
           
           
           //
          /* Doctor.KM2.name*/
          
         
           
           
           JOptionPane.showMessageDialog(null,"Appointment is send.");
           MakeAPane.setVisible(false);
           SelectionPane.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"You need to fill out everything.");
       }
           
    
        /*JOptionPane.showMessageDialog(null,"Appointment is send.");*/
	
    }//GEN-LAST:event_button_makea_sendMouseReleased

    private void button_makea_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_makea_sendActionPerformed
       //Save data to database
       
       // So bekommt man allgemein die eingabe

       //test.setText(txtfield_name.getText());
       
    }//GEN-LAST:event_button_makea_sendActionPerformed

    private void button_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_testActionPerformed
        button_test.setVisible(false);
        label_test.setVisible(false);
        SelectionPane.setVisible(true);
        startseite.setVisible(false);
        LogInPane.setVisible(false);
    }//GEN-LAST:event_button_testActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane LogInPane;
    private javax.swing.JLayeredPane MakeAPane;
    private javax.swing.JLayeredPane SelectionPane;
    private javax.swing.JButton button_ExportToPdf;
    private javax.swing.JButton button_MakeAppointment;
    private javax.swing.JButton button_ShiftCancelAp;
    private javax.swing.JButton button_makea_send;
    private javax.swing.JButton button_test;
    private javax.swing.JComboBox<String> combobox_makeA_type;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_makea_adressinfo;
    private javax.swing.JLabel label_makea_bday;
    private javax.swing.JLabel label_makea_healthinfo;
    private javax.swing.JLabel label_makea_insurancename;
    private javax.swing.JLabel label_makea_name;
    private javax.swing.JLabel label_makea_type;
    private javax.swing.JLabel label_test;
    private javax.swing.JLabel loginpic;
    private javax.swing.JLayeredPane startseite;
    private javax.swing.JTextField txtfield_makeA_adressinfo;
    private javax.swing.JTextField txtfield_makeA_bday;
    private javax.swing.JTextField txtfield_makeA_healthinfo;
    private javax.swing.JTextField txtfield_makeA_insurancename;
    private javax.swing.JTextField txtfield_name;
    // End of variables declaration//GEN-END:variables
}
