import utils.ManageEmployees;

public class Employee extends javax.swing.JFrame {

    public Employee() {
    
    }

                         
    public void showAddScreen() {

        jLabel1 = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstnamelabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        javax.swing.JLabel roleLabel = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        cb = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Employee");

        lastNameLabel.setText("Last name:");

        firstnamelabel.setText("First name:");

        phoneLabel.setText("Phone number:");

        emailLabel.setText("Email-id:");

        passwordLabel.setText("Password:");

        roleLabel.setText("Role:");

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Driver" }));

        Add.setText("Add");
        Add.setMaximumSize(new java.awt.Dimension(65, 23));
        Add.setMinimumSize(new java.awt.Dimension(65, 23));
        Add.setPreferredSize(new java.awt.Dimension(65, 23));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(firstnamelabel)
                            .addComponent(phoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(passwordLabel)
                            .addComponent(roleLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstName)
                    .addComponent(lastName)
                    .addComponent(phone)
                    .addComponent(email)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cancel)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelabel)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLabel)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }
    
    public void showUpdateScreen(int id)
    {
    	jLabel1 = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstnamelabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        javax.swing.JLabel roleLabel = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        cb = new javax.swing.JComboBox<>();
        Update = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update Employee");

        lastNameLabel.setText("Last name:");

        firstnamelabel.setText("First name:");

        phoneLabel.setText("Phone number:");

        emailLabel.setText("Email-id:");

        passwordLabel.setText("Password:");

        roleLabel.setText("Role:");

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Driver" }));

        Update.setText("Update");
        Update.setMaximumSize(new java.awt.Dimension(65, 23));
        Update.setMinimumSize(new java.awt.Dimension(65, 23));
        Update.setPreferredSize(new java.awt.Dimension(65, 23));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt, id);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(firstnamelabel)
                            .addComponent(phoneLabel)
                            .addComponent(emailLabel)
                            .addComponent(passwordLabel)
                            .addComponent(roleLabel))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstName)
                            .addComponent(lastName)
                            .addComponent(phone)
                            .addComponent(email)
                            .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamelabel)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLabel)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        
        lastName.setText(ManageEmployees.data.get(id)[1]);
        firstName.setText(ManageEmployees.data.get(id)[2]);
        phone.setText(ManageEmployees.data.get(id)[3]);
        email.setText(ManageEmployees.data.get(id)[4]);
        password.setText(ManageEmployees.data.get(id)[5]);
        cb.setSelectedItem(ManageEmployees.data.get(id)[6]);
        
        setVisible(true);
    }
    
    public void showDeleteScreen(int id)
    {
    	
    	

    	        jLabel1 = new javax.swing.JLabel();
    	        lastNameLabel = new javax.swing.JLabel();
    	        firstnamelabel = new javax.swing.JLabel();
    	        phoneLabel = new javax.swing.JLabel();
    	        javax.swing.JLabel roleLabel = new javax.swing.JLabel();
    	        lastName = new javax.swing.JTextField();
    	        firstName = new javax.swing.JTextField();
    	        cb = new javax.swing.JComboBox<>();
    	        Delete = new javax.swing.JButton();
    	        Cancel = new javax.swing.JButton();
    	        cb1 = new javax.swing.JComboBox<>();

    	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    	        jLabel1.setText("Delete Employee");

    	        lastNameLabel.setText("Last name:");

    	        firstnamelabel.setText("First name:");

    	        phoneLabel.setText("Status:");

    	        roleLabel.setText("Role:");

    	        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Driver" }));

    	        Delete.setText("Save");
    	        Delete.setMaximumSize(new java.awt.Dimension(65, 23));
    	        Delete.setMinimumSize(new java.awt.Dimension(65, 23));
    	        Delete.setPreferredSize(new java.awt.Dimension(65, 23));
    	        Delete.addActionListener(new java.awt.event.ActionListener() {
    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
    	            	DeleteActionPerformed(evt, id);
    	            }
    	        });

    	        Cancel.setText("Cancel");
    	        Cancel.addActionListener(new java.awt.event.ActionListener() {
    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
    	                CancelActionPerformed(evt);
    	            }
    	        });

    	        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive"}));

    	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    	        getContentPane().setLayout(layout);
    	        layout.setHorizontalGroup(
    	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	            .addGroup(layout.createSequentialGroup()
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	                    .addGroup(layout.createSequentialGroup()
    	                        .addGap(104, 104, 104)
    	                        .addComponent(jLabel1))
    	                    .addGroup(layout.createSequentialGroup()
    	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	                            .addGroup(layout.createSequentialGroup()
    	                                .addGap(64, 64, 64)
    	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	                                    .addGroup(layout.createSequentialGroup()
    	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
    	                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
    	                                                .addComponent(firstnamelabel)
    	                                                .addGap(48, 48, 48)
    	                                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
    	                                                .addComponent(roleLabel)
    	                                                .addGap(67, 67, 67)
    	                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	                                                    .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    	                                                    .addComponent(cb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    	                                        .addGap(0, 0, Short.MAX_VALUE))
    	                                    .addGroup(layout.createSequentialGroup()
    	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	                                            .addGroup(layout.createSequentialGroup()
    	                                                .addComponent(lastNameLabel)
    	                                                .addGap(49, 49, 49)
    	                                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                                            .addComponent(phoneLabel))
    	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    	                            .addGroup(layout.createSequentialGroup()
    	                                .addGap(47, 47, 47)
    	                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
    	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    	                        .addComponent(Cancel)))
    	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    	        );
    	        layout.setVerticalGroup(
    	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	            .addGroup(layout.createSequentialGroup()
    	                .addContainerGap()
    	                .addComponent(jLabel1)
    	                .addGap(18, 18, 18)
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    	                    .addComponent(lastNameLabel)
    	                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                .addGap(18, 18, 18)
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    	                    .addComponent(firstnamelabel)
    	                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                .addGap(18, 18, 18)
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    	                    .addComponent(roleLabel)
    	                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                .addGap(18, 18, 18)
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    	                    .addComponent(phoneLabel)
    	                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                .addGap(36, 36, 36)
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    	                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    	                    .addComponent(Cancel))
    	                .addContainerGap(25, Short.MAX_VALUE))
    	        );
    	        lastName.setEditable(false);
                firstName.setEditable(false);
                cb.setEditable(false);
                
                lastName.setText(ManageEmployees.data.get(id)[1]);
                firstName.setText(ManageEmployees.data.get(id)[2]);
                cb.setSelectedItem(ManageEmployees.data.get(id)[6]);
                cb1.setSelectedItem(ManageEmployees.data.get(id)[7]);

    	        pack();
    	        cb.setEditable(false);
    	        setVisible(true);
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                    
    	int id = ManageEmployees.data.size()+1;
    	String temp [] = {""+id,lastName.getText(),firstName.getText(),phone.getText(),email.getText(),password.getText(),(String)cb.getSelectedItem(),"Active"};
    	ManageEmployees.data.add(temp);
    	ManageEmployees.updateData();
    	this.dispose();
        Admin admin = new Admin();
        admin.showEmployees();
    }       
    
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt, int id) {                                    
    	ManageEmployees.data.get(id)[7] = (String)cb1.getSelectedItem();
    	ManageEmployees.updateData();
    	this.dispose();
        Admin admin = new Admin();
        admin.showEmployees();
    }  

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	dispose();
    	Admin admin = new Admin();
        admin.showEmployees();
    }     
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt,int id) {                                       
        
    	 phone.setText(ManageEmployees.data.get(id)[3]);
         email.setText(ManageEmployees.data.get(id)[4]);
         password.setText(ManageEmployees.data.get(id)[5]);
         cb.setSelectedItem(ManageEmployees.data.get(id)[6]);
    	
    	ManageEmployees.data.get(id)[1] = lastName.getText();
    	ManageEmployees.data.get(id)[2] = firstName.getText();
    	ManageEmployees.data.get(id)[3] = phone.getText();
    	ManageEmployees.data.get(id)[4] = email.getText();
    	ManageEmployees.data.get(id)[5] = password.getText();
    	ManageEmployees.data.get(id)[6] = (String)cb.getSelectedItem();
    	ManageEmployees.updateData();
    	this.dispose();
        Admin admin = new Admin();
        admin.showEmployees();
    }   


    public static void main(String args[]) {}

    // Variables declaration - do not modify                     
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Update;
    private javax.swing.JButton Delete;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstnamelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneLabel;
    
    // End of variables declaration                   
}
