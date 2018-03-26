package Public;

import Classes.Contact;
import Connection.UserDB;
import Connection.DatabaseConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.commons.dbutils.DbUtils;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Name of the User
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     * @throws java.lang.ClassNotFoundException
     */
    
    String allergy = "";
    ButtonGroup bg;
    DatabaseConnection DBcon;
    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    DefaultTableModel model;
    String version = "(v32418)";
    
    public MainForm() {
        DBcon = new DatabaseConnection();
        con = DBcon.getConnection();
        initComponents();
        setMode();
        groupButton();
        RefreshTable();
        
    }
    
    private void setMode() {
        lbl_version.setText(this.version);
        setColor(btn_register);
        ind_register.setOpaque(true);
        ViewPanel.setVisible(false);
        RegisterPanel.requestFocusInWindow();
        Placeholder.GhostText name = new Placeholder.GhostText(tfl_name, "Example: Rezane, Warren D.");
        Placeholder.GhostText campsattended = new Placeholder.GhostText(tfl_campsattended, "If first time, put 0.");
    }
    
    private void groupButton() {
        bg = new ButtonGroup();
        bg.add(rb_male);
        bg.add(rb_female);
    }
    
    private void clearAll() {
        tfl_name.setText("");
        tfl_age.setText("");
        bg.clearSelection();
        tfl_church.setText("");
        tfl_churchaddress.setText("");
        tfl_churchpos.setText("");
        cbx_district.setSelectedIndex(0);
        tfl_email.setText("");
        tfl_contact.setText("");
        tfl_pastorname.setText("");
        tfl_pastorcontact.setText("");
        tfl_campsattended.setText("");
        this.allergy = "";
        chk_chicken.setSelected(false);
        chk_shrimp.setSelected(false);
        chk_pork.setSelected(false);
        chk_none.setSelected(false);
        chk_fish.setSelected(false);
        chk_chicken.setEnabled(true);
        chk_shrimp.setEnabled(true);
        chk_fish.setEnabled(true);
        chk_pork.setEnabled(true);
        chk_none.setEnabled(true);
        tfl_other.setText("");
        tfl_other.setEnabled(false);
        RegisterPanel.requestFocusInWindow();
        Placeholder.GhostText name = new Placeholder.GhostText(tfl_name, "Example: Rezane, Warren D.");
        Placeholder.GhostText campsattended = new Placeholder.GhostText(tfl_campsattended, "If first time, put 0.");
    }
    
    void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        tbl_responses.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + query));
    }
    
    private void RefreshTable() {
        model = new DefaultTableModel(new String[]{"ID", "Name", "Age", "Gender", "District", "Group", "BS Leader"}, 0);
        String query = "SELECT id, name, age, gender, district, campergroup, bsleader FROM contactinformation order by name asc";
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String district = rs.getString("district");
                String group = rs.getString("campergroup");
                String bsleader = rs.getString("bsleader");
                model.addRow(new Object[]{id, name, age, gender, district, group, bsleader});
            }
            tbl_responses.setModel(model);
            btn_set.setEnabled(false);
            btn_delete.setEnabled(false);
            btn_group.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: \nPossible Errors: " + e.getMessage(), "IBCPMS " + this.version, ERROR_MESSAGE);
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(st);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidePanel = new javax.swing.JPanel();
        btn_view = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        ind_view = new javax.swing.JPanel();
        btn_register = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        ind_register = new javax.swing.JPanel();
        RegisterPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnl_step1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        tfl_name = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        tfl_age = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        tfl_church = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        tfl_churchpos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        tfl_churchaddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rb_female = new javax.swing.JRadioButton();
        rb_male = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        tfl_email = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        tfl_contact = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        tfl_pastorname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        tfl_pastorcontact = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        tfl_campsattended = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbx_district = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chk_shrimp = new javax.swing.JCheckBox();
        jSeparator10 = new javax.swing.JSeparator();
        tfl_other = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_sub = new javax.swing.JButton();
        chk_fish = new javax.swing.JCheckBox();
        chk_none = new javax.swing.JCheckBox();
        chk_chicken = new javax.swing.JCheckBox();
        chk_pork = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        MenuPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_version = new javax.swing.JLabel();
        ViewPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_responses = new javax.swing.JTable();
        FilterField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_set = new javax.swing.JButton();
        btn_group = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfl_total = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(31, 74, 98));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_view.setBackground(new java.awt.Color(31, 74, 98));
        btn_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewMouseClicked(evt);
            }
        });

        label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("View Campers");

        ind_view.setBackground(new java.awt.Color(255, 255, 255));
        ind_view.setOpaque(false);
        ind_view.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout ind_viewLayout = new javax.swing.GroupLayout(ind_view);
        ind_view.setLayout(ind_viewLayout);
        ind_viewLayout.setHorizontalGroup(
            ind_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind_viewLayout.setVerticalGroup(
            ind_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_viewLayout = new javax.swing.GroupLayout(btn_view);
        btn_view.setLayout(btn_viewLayout);
        btn_viewLayout.setHorizontalGroup(
            btn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_viewLayout.createSequentialGroup()
                .addComponent(ind_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(label)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        btn_viewLayout.setVerticalGroup(
            btn_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(ind_view, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SidePanel.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, -1));

        btn_register.setBackground(new java.awt.Color(31, 74, 98));
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerMouseClicked(evt);
            }
        });

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Register");

        ind_register.setBackground(new java.awt.Color(255, 255, 255));
        ind_register.setOpaque(false);
        ind_register.setPreferredSize(new java.awt.Dimension(4, 0));

        javax.swing.GroupLayout ind_registerLayout = new javax.swing.GroupLayout(ind_register);
        ind_register.setLayout(ind_registerLayout);
        ind_registerLayout.setHorizontalGroup(
            ind_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind_registerLayout.setVerticalGroup(
            ind_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout btn_registerLayout = new javax.swing.GroupLayout(btn_register);
        btn_register.setLayout(btn_registerLayout);
        btn_registerLayout.setHorizontalGroup(
            btn_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_registerLayout.createSequentialGroup()
                .addComponent(ind_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(label1)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        btn_registerLayout.setVerticalGroup(
            btn_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(ind_register, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SidePanel.add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 50));

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 610));

        RegisterPanel.setBackground(new java.awt.Color(255, 255, 255));
        RegisterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(236, 240, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Registration Form");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 50));

        RegisterPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 50));

        pnl_step1.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        tfl_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_name.setToolTipText("");
        tfl_name.setBorder(null);
        tfl_name.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        tfl_age.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_age.setBorder(null);
        tfl_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfl_ageKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Gender:");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Name of Local Church:");

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        tfl_church.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_church.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Church Position:");

        jSeparator5.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        tfl_churchpos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_churchpos.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Church Address:");

        jSeparator6.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        tfl_churchaddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_churchaddress.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Age:");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Name:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("*");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");

        rb_female.setBackground(new java.awt.Color(255, 255, 255));
        rb_female.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        rb_female.setForeground(new java.awt.Color(51, 51, 51));
        rb_female.setText("Female");

        rb_male.setBackground(new java.awt.Color(255, 255, 255));
        rb_male.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        rb_male.setForeground(new java.awt.Color(51, 51, 51));
        rb_male.setText("Male");

        javax.swing.GroupLayout pnl_step1Layout = new javax.swing.GroupLayout(pnl_step1);
        pnl_step1.setLayout(pnl_step1Layout);
        pnl_step1Layout.setHorizontalGroup(
            pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_step1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_female)
                    .addComponent(rb_male)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel21))
                    .addComponent(tfl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel22))
                    .addComponent(tfl_age, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23))
                    .addComponent(jLabel11)
                    .addComponent(tfl_church, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfl_churchpos, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfl_churchaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnl_step1Layout.setVerticalGroup(
            pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_step1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel22)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_age, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(rb_male)
                .addGap(7, 7, 7)
                .addComponent(rb_female)
                .addGap(18, 18, 18)
                .addGroup(pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_church, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_churchpos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_step1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(pnl_step1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_churchaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        RegisterPanel.add(pnl_step1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 560));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Email:");

        tfl_email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_email.setBorder(null);

        jSeparator11.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Contact no.:");

        tfl_contact.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_contact.setBorder(null);
        tfl_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfl_contactKeyTyped(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Youth Pastor/Local Pastor:");

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        tfl_pastorname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_pastorname.setBorder(null);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Youth Pastor/Local Pastor Contact no.:");

        jSeparator8.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        tfl_pastorcontact.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_pastorcontact.setBorder(null);
        tfl_pastorcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfl_pastorcontactKeyTyped(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        tfl_campsattended.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_campsattended.setBorder(null);
        tfl_campsattended.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfl_campsattendedKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("No. of Camps Attended:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("District:");

        cbx_district.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbx_district.setForeground(new java.awt.Color(51, 51, 51));
        cbx_district.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Agusan District", "Bukidnon", "Cebu", "CENODA District", "COMVAL District", "Cotabato 1 (North)", "Cotabato 2", "Davao City", "Davao Del Sur", "Emmanuel District", "MANA District", "Maranatha District", "Monkayo District", "NEDA District ", "Samal (IGACOS) District", "Sarangani District", "SOCSARGEN District", "Valenzuela City", "Zampen District", "Bohol" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25)
                    .addComponent(tfl_email)
                    .addComponent(jSeparator11)
                    .addComponent(jLabel26)
                    .addComponent(tfl_contact)
                    .addComponent(jSeparator12)
                    .addComponent(jLabel15)
                    .addComponent(tfl_pastorname)
                    .addComponent(jSeparator7)
                    .addComponent(jLabel16)
                    .addComponent(tfl_pastorcontact)
                    .addComponent(jSeparator8)
                    .addComponent(tfl_campsattended)
                    .addComponent(jLabel20)
                    .addComponent(jSeparator9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(cbx_district, 0, 310, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_district, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_pastorname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_pastorcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfl_campsattended, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        RegisterPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 370, 560));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        chk_shrimp.setBackground(new java.awt.Color(255, 255, 255));
        chk_shrimp.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chk_shrimp.setForeground(new java.awt.Color(51, 51, 51));
        chk_shrimp.setText("Shrimp");
        chk_shrimp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_shrimpMouseClicked(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        tfl_other.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfl_other.setBorder(null);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Food Preference:");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Allergies:");

        btn_sub.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btn_sub.setText("SUBMIT");
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });

        chk_fish.setBackground(new java.awt.Color(255, 255, 255));
        chk_fish.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chk_fish.setForeground(new java.awt.Color(51, 51, 51));
        chk_fish.setText("Fish");
        chk_fish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_fishMouseClicked(evt);
            }
        });

        chk_none.setBackground(new java.awt.Color(255, 255, 255));
        chk_none.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chk_none.setForeground(new java.awt.Color(51, 51, 51));
        chk_none.setText("None");
        chk_none.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_noneMouseClicked(evt);
            }
        });

        chk_chicken.setBackground(new java.awt.Color(255, 255, 255));
        chk_chicken.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chk_chicken.setForeground(new java.awt.Color(51, 51, 51));
        chk_chicken.setText("Chicken");
        chk_chicken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_chickenMouseClicked(evt);
            }
        });

        chk_pork.setBackground(new java.awt.Color(255, 255, 255));
        chk_pork.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        chk_pork.setForeground(new java.awt.Color(51, 51, 51));
        chk_pork.setText("Pork");
        chk_pork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_porkMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Other:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_none)
                    .addComponent(chk_fish)
                    .addComponent(chk_chicken)
                    .addComponent(chk_shrimp)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(chk_pork))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfl_other, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addComponent(chk_none)
                .addGap(18, 18, 18)
                .addComponent(chk_fish)
                .addGap(18, 18, 18)
                .addComponent(chk_chicken)
                .addGap(18, 18, 18)
                .addComponent(chk_shrimp)
                .addGap(18, 18, 18)
                .addComponent(chk_pork)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfl_other, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        RegisterPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 350, 560));

        getContentPane().add(RegisterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 1070, 610));

        MenuPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenuPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuPanelMouseDragged(evt);
            }
        });
        MenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuPanelMousePressed(evt);
            }
        });
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 31)); // NOI18N
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        MenuPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 20, 40));

        btn_minimize.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        btn_minimize.setText("_");
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseClicked(evt);
            }
        });
        MenuPanel.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, -20, 20, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel3.setText("IBCPMS [National Youth Camp Module] - Administrator View");
        MenuPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 60));

        lbl_version.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        MenuPanel.add(lbl_version, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, 60));

        getContentPane().add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 60));

        ViewPanel.setBackground(new java.awt.Color(204, 204, 204));
        ViewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_refresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_refresh.setText("Load/Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel4.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        jScrollPane1.setBorder(null);

        tbl_responses.setAutoCreateRowSorter(true);
        tbl_responses.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbl_responses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Gender", "District", "Group", "BS Leader"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_responses.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_responses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_responsesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_responses);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 990, 400));

        FilterField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FilterField.setToolTipText("filter");
        FilterField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilterFieldKeyReleased(evt);
            }
        });
        jPanel4.add(FilterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Filter:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 50, -1));

        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_delete.setText("Delete Response");
        btn_delete.setEnabled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel4.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        btn_set.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_set.setText("Set Group");
        btn_set.setEnabled(false);
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });
        jPanel4.add(btn_set, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 90, -1));

        btn_group.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_group.setText("View Group");
        btn_group.setEnabled(false);
        btn_group.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_groupActionPerformed(evt);
            }
        });
        jPanel4.add(btn_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Total Campers:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, -1));

        tfl_total.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel4.add(tfl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 100, -1));

        ViewPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1070, 560));

        jPanel5.setBackground(new java.awt.Color(236, 240, 241));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Camper's Data");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 50));

        ViewPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 50));

        getContentPane().add(ViewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 1070, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chk_porkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_porkMouseClicked
        if (chk_pork.isSelected()) {
            this.allergy += "Pork ";
            chk_none.setEnabled(false);
        }
        else if (chk_pork.isSelected() == false) {
            this.allergy = this.allergy.replace("Pork ", "");
            
        }
        if (this.allergy.equals("")) {
            chk_none.setEnabled(true);
        }
    }//GEN-LAST:event_chk_porkMouseClicked

    private void chk_chickenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_chickenMouseClicked
        if (chk_chicken.isSelected()) {
            this.allergy += "Chicken ";
            chk_none.setEnabled(false);
        }
        else if (chk_chicken.isSelected() == false) {
            this.allergy = this.allergy.replace("Chicken ", "");
        }
        if (this.allergy.equals("")) {
            chk_none.setEnabled(true);
        }
    }//GEN-LAST:event_chk_chickenMouseClicked

    private void chk_noneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_noneMouseClicked
        if (chk_none.isSelected()) {
            this.allergy += "None ";
            chk_chicken.setEnabled(false);
            chk_shrimp.setEnabled(false);
            chk_fish.setEnabled(false);
            chk_pork.setEnabled(false);
        }
        else if (!chk_none.isSelected()) {
            this.allergy = this.allergy.replace("None ", "");
            chk_chicken.setEnabled(true);
            chk_shrimp.setEnabled(true);
            chk_fish.setEnabled(true);
            chk_pork.setEnabled(true);
        }
    }//GEN-LAST:event_chk_noneMouseClicked

    private void chk_fishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_fishMouseClicked
        if (chk_fish.isSelected()) {
            this.allergy += "Fish ";
            chk_none.setEnabled(false);
        }
        else if (chk_fish.isSelected() == false) {
            this.allergy = this.allergy.replace("Fish ", "");
        }
        if (this.allergy.equals("")) {
            chk_none.setEnabled(true);
        }
    }//GEN-LAST:event_chk_fishMouseClicked

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        String name = tfl_name.getText();
        String age = tfl_age.getText();
        String gender = "";
        if (rb_male.isSelected()) {
            gender = "Male";
        }
        else if (rb_female.isSelected()) {
            gender = "Female";
        }
        else if (!rb_male.isSelected() && !rb_female.isSelected()) {
            gender = "empty";
        }
        String churchName = tfl_church.getText();
        String churchPos = tfl_churchpos.getText();
        String churchAdd = tfl_churchaddress.getText();
        String district = cbx_district.getSelectedItem().toString();
        String email = tfl_email.getText();
        
        String contact = tfl_contact.getText();
        String pastorName = tfl_pastorname.getText();
        String pastorContact = tfl_pastorcontact.getText();
        String campsAttended = tfl_campsattended.getText();
        if (campsAttended.matches("If first time, put 0.")) {
            campsAttended = (String.valueOf(0));
        }
        this.allergy += tfl_other.getText();
        if (name.isEmpty() && age.isEmpty() && gender.matches("empty") && district.isEmpty() && this.allergy.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Complete All Required Fields!", "IBCPMS " + this.version, WARNING_MESSAGE);

        }
        else if (name.matches("Example: Rezane, Warren D.")) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Name!", "IBCPMS " + this.version, WARNING_MESSAGE);

        }
        else if (age.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Your Age!", "IBCPMS " + this.version, WARNING_MESSAGE);

        }
        else if (gender.matches("empty")) {
            JOptionPane.showMessageDialog(null, "Please Select Your Gender!", "IBCPMS " + this.version, WARNING_MESSAGE);

        }
        else if (district.matches("None")) {
            JOptionPane.showMessageDialog(null, "Please Select Your District!", "IBCPMS " + this.version, WARNING_MESSAGE);

        }
        else if (this.allergy.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Select Your Food Preference!", "IBCPMS " + this.version, WARNING_MESSAGE);

        }
        else {
            Contact campContact = new Contact(name,age,gender,churchName,churchPos,churchAdd,district,email,contact,pastorName,pastorContact,campsAttended,this.allergy);
            UserDB udb = new UserDB();
            boolean valid = udb.validate(campContact);
            if (valid) {
                JOptionPane.showMessageDialog(null, "Contact Information Successfully Added.", "IBCPMS " + this.version, INFORMATION_MESSAGE);
                
                clearAll();
            }
            else {
                JOptionPane.showMessageDialog(null, "Error! \nPossible Errors: " + udb.getError(), "IBCPMS " + this.version, ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_subActionPerformed

    private void chk_shrimpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_shrimpMouseClicked
        if (chk_shrimp.isSelected()) {
            this.allergy += "Shrimp ";
            chk_none.setEnabled(false);
        }
        else if (chk_shrimp.isSelected() == false) {
            this.allergy = this.allergy.replace("Shrimp ", "");
        }
        if (this.allergy.equals("")) {
            chk_none.setEnabled(true);
        }
    }//GEN-LAST:event_chk_shrimpMouseClicked

    private void tfl_campsattendedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfl_campsattendedKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_tfl_campsattendedKeyTyped

    private void tfl_pastorcontactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfl_pastorcontactKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_tfl_pastorcontactKeyTyped

    private void tfl_contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfl_contactKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_tfl_contactKeyTyped

    private void tfl_ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfl_ageKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
            || (vChar == KeyEvent.VK_BACK_SPACE)
            || (vChar == KeyEvent.VK_DELETE))) {
        evt.consume();
        }
    }//GEN-LAST:event_tfl_ageKeyTyped

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you wanna exit?", "IBCPMS " + this.version, WARNING_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        else {

        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btn_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseClicked
        setColor(btn_view);
        resetColor(btn_register);
        
        RefreshTable();
        
        RegisterPanel.setVisible(false);
        ViewPanel.setVisible(true);
        
        ind_view.setOpaque(true);
        ind_register.setOpaque(false);
    }//GEN-LAST:event_btn_viewMouseClicked

    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
        setColor(btn_register);
        resetColor(btn_view);

        ViewPanel.setVisible(false);
        RegisterPanel.setVisible(true);
        
        ind_register.setOpaque(true);
        ind_view.setOpaque(false);
    }//GEN-LAST:event_btn_registerMouseClicked

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed
        int row = tbl_responses.getSelectedRow();
        String id = (tbl_responses.getModel().getValueAt(row, 0)).toString();
        try {
            int group = Integer.parseInt(JOptionPane.showInputDialog(null, "Group: "));
            String query = "UPDATE contactinformation SET campergroup = " + group + " WHERE id = '" + id + "'";
            pst = con.prepareStatement(query);
            pst.execute();
            RefreshTable();
            btn_set.setEnabled(false);
            btn_delete.setEnabled(false);
            btn_group.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: \nPossible Errors: " + e.getMessage(), "IBCPMS " + this.version, ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_setActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        RefreshTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void FilterFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilterFieldKeyReleased
        String query = FilterField.getText();
        filter(query);
    }//GEN-LAST:event_FilterFieldKeyReleased

    private void tbl_responsesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_responsesMouseClicked
        btn_set.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_group.setEnabled(false);
    }//GEN-LAST:event_tbl_responsesMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        DefaultTableModel model = (DefaultTableModel)tbl_responses.getModel();
        int option = JOptionPane.showConfirmDialog(null, "Delete this response? ", "NYC 2017 Registration", WARNING_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            int row = tbl_responses.getSelectedRow();
            String id = (tbl_responses.getModel().getValueAt(row, 0)).toString();
            int modelRow = tbl_responses.convertRowIndexToModel( row );
            model.removeRow( modelRow );

            String query = "delete from contactinformation where id = ?";
            try {
                pst = con.prepareStatement(query);
                pst.setString(1, id);
                pst.executeUpdate();
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: \nPossible Errors: " + e.getMessage(), "IBCPMS " + this.version, ERROR_MESSAGE);
            }
            btn_set.setEnabled(false);
            btn_delete.setEnabled(false);
            btn_group.setEnabled(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Deletion Canceled.", "IBCPMS " + this.version, WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_groupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_groupActionPerformed
        //        int group = Integer.parseInt(JOptionPane.showInputDialog(null, "Group: "));
        //        ViewForm vf = new ViewForm(group, this.remote);
        //        vf.setVisible(true);
    }//GEN-LAST:event_btn_groupActionPerformed

    int xx, xy;
    
    private void MenuPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_MenuPanelMouseDragged

    private void MenuPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanelMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_MenuPanelMousePressed

    void setColor(JPanel panel) {
        panel.setBackground(new Color(0, 195, 237));
    }
    
    void resetColor(JPanel panel) {
        panel.setBackground(new Color(31, 74, 98));
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FilterField;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_group;
    private javax.swing.JLabel btn_minimize;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JPanel btn_register;
    private javax.swing.JButton btn_set;
    private javax.swing.JButton btn_sub;
    private javax.swing.JPanel btn_view;
    private javax.swing.JComboBox<String> cbx_district;
    private javax.swing.JCheckBox chk_chicken;
    private javax.swing.JCheckBox chk_fish;
    private javax.swing.JCheckBox chk_none;
    private javax.swing.JCheckBox chk_pork;
    private javax.swing.JCheckBox chk_shrimp;
    private javax.swing.JPanel ind_register;
    private javax.swing.JPanel ind_view;
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
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel lbl_version;
    private javax.swing.JPanel pnl_step1;
    private javax.swing.JRadioButton rb_female;
    private javax.swing.JRadioButton rb_male;
    private javax.swing.JTable tbl_responses;
    private javax.swing.JTextField tfl_age;
    private javax.swing.JTextField tfl_campsattended;
    private javax.swing.JTextField tfl_church;
    private javax.swing.JTextField tfl_churchaddress;
    private javax.swing.JTextField tfl_churchpos;
    private javax.swing.JTextField tfl_contact;
    private javax.swing.JTextField tfl_email;
    private javax.swing.JTextField tfl_name;
    private javax.swing.JTextField tfl_other;
    private javax.swing.JTextField tfl_pastorcontact;
    private javax.swing.JTextField tfl_pastorname;
    private javax.swing.JTextField tfl_total;
    // End of variables declaration//GEN-END:variables
}
