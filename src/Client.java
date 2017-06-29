import utils.ManageClients;

public class Client extends javax.swing.JFrame {

    public Client() {
    
    }

                         
    public void showAddScreen(String action) {


    	 cb1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
     
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
     
        Phone = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Address1 = new javax.swing.JTextField();
        Address2 = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        Zipcode = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Client");

        jLabel2.setText("Name:");

        jLabel4.setText("Phone number:");

        jLabel5.setText("Email Id:");

        jLabel6.setText("Address Line1:");

        jLabel7.setText("Address Line2:");

        jLabel8.setText("City:");

        jLabel9.setText("Zipcode:");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt,action);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt,action);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(Cancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)

                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LastName)

                                    .addComponent(Phone)
                                    .addComponent(Email)
                                    .addComponent(Address1)
                                    .addComponent(Address2)
                                    .addComponent(City)
                                    .addComponent(Zipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))


                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    }
    
    public void showUpdateScreen(int id,String action)
    {



    	 cb1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
     
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
  
        Phone = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Address1 = new javax.swing.JTextField();
        Address2 = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        Zipcode = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update Client");

        jLabel2.setText("Name:");

        jLabel4.setText("Phone number:");

        jLabel5.setText("Email Id:");

        jLabel6.setText("Address Line1:");

        jLabel7.setText("Address Line2:");

        jLabel8.setText("City:");

        jLabel9.setText("Zipcode:");

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	UpdateActionPerformed(evt,id,action);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt,action);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(Cancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                 
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LastName)
                                 
                                    .addComponent(Phone)
                                    .addComponent(Email)
                                    .addComponent(Address1)
                                    .addComponent(Address2)
                                    .addComponent(City)
                                    .addComponent(Zipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setVisible(true);
    
        
        LastName.setText(ManageClients.data.get(id)[1]);
        Phone.setText(ManageClients.data.get(id)[2]);
        Email.setText(ManageClients.data.get(id)[3]);
        Address1.setText(ManageClients.data.get(id)[4]);
        Address2.setText(ManageClients.data.get(id)[5]);
        City.setText(ManageClients.data.get(id)[6]);
        Zipcode.setText(ManageClients.data.get(id)[7]);
        
        setVisible(true);
    }
    
    public void showDeleteScreen(int id,String action)
    {
    	
    	
    	 cb1 = new javax.swing.JComboBox<>();
    	        jLabel1 = new javax.swing.JLabel();
    	        jLabel2 = new javax.swing.JLabel();

    	        jLabel4 = new javax.swing.JLabel();
    	       
    	        LastName = new javax.swing.JTextField();

    	     
    	        Delete = new javax.swing.JButton();
    	        Cancel = new javax.swing.JButton();
    	        cb1 = new javax.swing.JComboBox<>();

    	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    	        jLabel1.setText("Delete Client");

    	        jLabel2.setText("Name:");



    	        jLabel4.setText("Status:");

    	      

    	        Delete.setText("Save");
    	        Delete.setMaximumSize(new java.awt.Dimension(65, 23));
    	        Delete.setMinimumSize(new java.awt.Dimension(65, 23));
    	        Delete.setPreferredSize(new java.awt.Dimension(65, 23));
    	        Delete.addActionListener(new java.awt.event.ActionListener() {
    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
    	            	DeleteActionPerformed(evt, id,action);
    	            }
    	        });

    	        Cancel.setText("Cancel");
    	        Cancel.addActionListener(new java.awt.event.ActionListener() {
    	            public void actionPerformed(java.awt.event.ActionEvent evt) {
    	                CancelActionPerformed(evt,action);
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
    	                                                
    	                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	                                                    .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    	                                                    )))
    	                                        .addGap(0, 0, Short.MAX_VALUE))
    	                                    .addGroup(layout.createSequentialGroup()
    	                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    	                                            .addGroup(layout.createSequentialGroup()
    	                                                .addComponent(jLabel2)
    	                                                .addGap(49, 49, 49)
    	                                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                                            .addComponent(jLabel4))
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
    	                    .addComponent(jLabel2)
    	                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

    	                .addGap(18, 18, 18)
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    	                    .addComponent(jLabel4)
    	                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    	                .addGap(36, 36, 36)
    	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    	                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    	                    .addComponent(Cancel))
    	                .addContainerGap(25, Short.MAX_VALUE))
    	        );
    	        LastName.setEditable(false);

             
                
                LastName.setText(ManageClients.data.get(id)[1]);

             
                cb1.setSelectedItem(ManageClients.data.get(id)[8]);

    	        pack();
    	      
    	        setVisible(true);
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt,String action) {                                    
    	int id = ManageClients.data.size()+1;
    	String temp [] = {""+id,LastName.getText(),Phone.getText(),Email.getText(),Address1.getText(),Address2.getText(),City.getText(),Zipcode.getText(),"Active"};
    	ManageClients.data.add(temp);
    	ManageClients.updateData();
    	this.dispose();
    	if(action.equals("Admin"))
    	{
        Admin admin = new Admin();
        admin.showClients();
    	}
    	else
    	{
    		new HomePage().showClients();
    	}
    }       
    
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt, int id,String action) {                                    
    	ManageClients.data.get(id)[8] = (String)cb1.getSelectedItem();
    	ManageClients.updateData();
    	this.dispose();
    	if(action.equals("Admin"))
    	{
        Admin admin = new Admin();
        admin.showClients();
    	}
    	else
    	{
    		new HomePage().showClients();
    	}
    }  

    private void CancelActionPerformed(java.awt.event.ActionEvent evt,String action) {                                       
    	dispose();
    	if(action.equals("Admin"))
    	{
        Admin admin = new Admin();
        admin.showClients();
    	}
    	else
    	{
    		new HomePage().showClients();
    	}
    }     
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt,int id,String action) {                                       
        
    	ManageClients.data.get(id)[1] = LastName.getText();
    	ManageClients.data.get(id)[2] = Phone.getText();
    	ManageClients.data.get(id)[3] = Email.getText();
    	ManageClients.data.get(id)[4] = Address1.getText();
    	ManageClients.data.get(id)[5] = Address2.getText();
    	ManageClients.data.get(id)[6] = City.getText();
    	ManageClients.data.get(id)[7] = Zipcode.getText();
    	
    	
    	ManageClients.updateData();
    	this.dispose();
    	if(action.equals("Admin"))
    	{
        Admin admin = new Admin();
        admin.showClients();
    	}
    	else
    	{
    		new HomePage().showClients();
    	}
    }   


    public static void main(String args[]) {}

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Address1;
    private javax.swing.JTextField Address2;
    private javax.swing.JTextField City;
    private javax.swing.JTextField Email;
   // private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField Zipcode;
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
   // private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> cb1;
    
    // End of variables declaration                   
}
