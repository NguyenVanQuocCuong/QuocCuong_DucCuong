
package QuanLiDeTaiTotNghiep;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProjectFrame extends JFrame {

	/**
	 * Nguyen Van Quoc Cuong + Nguyen Duc Cuong 
	 */
	private static final long serialVersionUID = 1L;

	DefaultTableModel tableModel;

	List<Project> projects = new ArrayList<>();

	/**
	 * Creates new form ProjectFrame
	 */
	public ProjectFrame() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tableModel = (DefaultTableModel) tblStudent.getModel();

		showProject();
	}
//ham showProject()  hien thi ket qua len bang 
	private void showProject() {
		projects = ProjectModify.findAll();

		tableModel.setRowCount(0);

		projects.forEach((project) -> {
			tableModel.addRow(new Object[] { project.getId(), project.getProjectname(), project.getDeadline(),
					project.getInstruction() });
		});
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtFullname = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
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
		setTitle("Project Manager");

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Project's Detail Information"));

		jLabel1.setText("Project Name:");

		jLabel3.setText("Deadline:");

		jLabel4.setText("Instruction:");
// ActionListener btnsave 
		btnSave.setText("Save");
		btnSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSaveActionPerformed(evt);
			}
		});
// ActionListener btnReset
		btnReset.setText("Reset");
		btnReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnResetActionPerformed(evt);
			}
		});
// ActionListener btn Delete
		btnDelete.setText("Delete");
		btnDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDeleteActionPerformed(evt);
			}
		});
// ActionListener btn Find
		btnFind.setText("Find");
		btnFind.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnFindActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(15, 15, 15).addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel1).addComponent(jLabel2))
								.addGap(77, 77, 77)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtFullname)))
						.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel3).addGap(116, 116, 116)
								.addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 330,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel5).addComponent(jLabel4))
								.addGap(48, 48, 48)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(txtEmail)
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(btnSave)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnReset)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnDelete)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnFind))
										.addComponent(jLabel5))))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnSave).addComponent(btnReset).addComponent(btnDelete)
								.addComponent(btnFind))
						.addContainerGap(19, Short.MAX_VALUE)));

		tblStudent.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "ID", "Project Name", "Deadline", "Instruction" }) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] canEdit = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tblStudent);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jScrollPane1))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}
// ActionPerformed btn Reset
	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
		txtFullname.setText("");
		txtAge.setText("");
		txtEmail.setText("");

	}
// ActionPerformed btn Save
	private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
		String fullname = txtFullname.getText();
		String age = txtAge.getText();
		String email = txtEmail.getText();

		Project std = new Project(fullname, age, email);

		ProjectModify.insert(std);

		showProject();
	}
// ActionPerformed btn Delete
	private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
		int selectedIndex = tblStudent.getSelectedRow();
		if (selectedIndex >= 0) {
			Project p = projects.get(selectedIndex);

			int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
			System.out.println("option : " + option);

			if (option == 0) {
				ProjectModify.delete(p.getId());
				showProject();
			}
		}
	}
// ActionPerformed btn Find
	private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {
		String input = JOptionPane.showInputDialog(this, "Enter full name to search");
		if (input != null && input.length() > 0) {
			projects = ProjectModify.findByProjectName(input);

			tableModel.setRowCount(0);

			projects.forEach((project) -> {
				tableModel.addRow(new Object[] { project.getId(), project.getProjectname(), project.getDeadline(),
						project.getInstruction() });
			});
		} else {
			showProject();
		}
	}
// Main 
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		/* tao va hien thi bieu mau */
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
