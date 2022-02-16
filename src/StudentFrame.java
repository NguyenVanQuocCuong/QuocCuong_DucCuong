
package QuanLiDeTaiTotNghiep;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class StudentFrame extends JFrame {
    DefaultTableModel tableModel;
    
    List<Student> studentList = new ArrayList<>();
    
    /**
	 * Nguyen Van Quoc Cuong + Nguyen Duc Cuong 
	 */
    public StudentFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        tableModel = (DefaultTableModel) tblStudent.getModel();
        
        showStudent();
    }
    
    private void showStudent() {
        studentList = StudentModify.findAll();
        
        tableModel.setRowCount(0);
        
        studentList.forEach((student) -> {
            tableModel.addRow(new Object[] {student.getId(), student.getFullname(), 
                student.getGender(), student.getEmail(), student.getPhoneNumber()});
        });
    }

    
    @SuppressWarnings("unchecked")                        
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Manager");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Student's Detail Information"));

        jLabel1.setText("Full Name:");

        jLabel2.setText("Gender: ");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel3.setText("Age:");

        jLabel4.setText("Email:");

        jLabel5.setText("Phone Number:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(15)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel5)
        				.addComponent(jLabel4)
        				.addComponent(jLabel3)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2))
        			.addGap(48)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(jPanel1Layout.createSequentialGroup()
        						.addGap(8)
        						.addComponent(cbGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addComponent(txtFullname, 341, 341, 341))
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(txtAge, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(txtEmail)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(btnSave)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnReset)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnDelete)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(btnFind))
        						.addComponent(txtPhoneNumber))))
        			.addGap(29))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(10)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(txtFullname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(cbGender, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(txtAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(txtPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSave)
        				.addComponent(btnReset)
        				.addComponent(btnDelete)
        				.addComponent(btnFind))
        			.addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full Name", "Gender", "Email", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtFullname.setText("");
        cbGender.setSelectedIndex(0);
        txtAge.setText("");
        txtEmail.setText("");
        txtPhoneNumber.setText("");
    }                                        

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String fullname = txtFullname.getText();
        String gender = cbGender.getSelectedItem().toString();
        int age = Integer.parseInt(txtAge.getText());
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        
        Student std = new Student(fullname, gender, email, phoneNumber, age);
        
        StudentModify.insert(std);
        
        showStudent();
    }                                       

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int selectedIndex = tblStudent.getSelectedRow();
        if(selectedIndex >= 0) {
            Student std = studentList.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
            System.out.println("option : " + option);
            
            if(option == 0) {
                StudentModify.delete(std.getId());
                
                showStudent();
            }
        }
    }                                         

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String input = JOptionPane.showInputDialog(this, "Enter full name to search");
        if(input != null && input.length() > 0) {
            studentList = StudentModify.findByFullname(input);
            
            tableModel.setRowCount(0);
        
            studentList.forEach((student) -> {
                tableModel.addRow(new Object[] {student.getId(), student.getFullname(), 
                    student.getGender(), student.getEmail(), student.getPhoneNumber()});
            });
        } else {
            showStudent();
        }
    }                                       

 // main   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Khai bao bien - khong sua doi                
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtPhoneNumber;
}
