import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import utils.ManageClients;
import utils.ManageEmployees;
import utils.ManageTickets;
import utils.MyDefaultTableModel;
import utils.ReportsData;

public class Admin extends javax.swing.JFrame {

    int selctedRow = -1;
    ArrayList<String[]> data = null;


    public Admin() {

    }

    
    public void showEmployees() {
System.out.println("showEmployees666666666666666666666666666666");

    	this.getContentPane().removeAll();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        SearchCombo = new javax.swing.JComboBox<>();
        Search = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Employee = new javax.swing.JMenuItem();
        Block = new javax.swing.JMenuItem();
        Ticket = new javax.swing.JMenu();
        Client = new javax.swing.JMenu();
        Invoice = new javax.swing.JMenu();
        Reports = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        //jMenuItem3 = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Employee List");


        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Update)
                                .addGap(86, 86, 86)
                                .addComponent(Delete))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Clear)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Maintain");

        Employee.setText("Employee");
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("employee mouse clicked");
                //EmployeeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	EmployeeMouseClicked(evt);
            }
        });
        jMenu1.add(Employee);

        Block.setText("Block/Unblock");
        Block.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("block mouse clicked");
               // BlockMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	System.out.println("block mouse pressed");
            	 BlockMouseClicked(evt);
            }
        });
        jMenu1.add(Block);

        jMenuBar1.add(jMenu1);

        Ticket.setText("Ticket");
        Ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        
        
        jMenuBar1.add(Ticket);

        Client.setText("Client");
        Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(Client);

        Invoice.setText("Invoice");
        Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(Invoice);

        Reports.setText("Reports");

        jMenuItem1.setText("Bonus Report");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem1MouseClicked(evt);
            }
        });
        Reports.add(jMenuItem1);

        jMenuItem2.setText("Company Report");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem2MouseClicked(evt);
            }
        });
        Reports.add(jMenuItem2);

       /* jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuitem3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        Reports.add(jMenuItem3);*/

        jMenuBar1.add(Reports);

        logout.setText("LogOut");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        

        String col[] = {"Employee Id", "Name", "Role", "Status"};

        this.tableModel = new MyDefaultTableModel(col, 0);

        for (int i = 0; i < ManageEmployees.data.size(); i++) {
           // String id = ManageEmployees.data.get(i)[0];
            Object obj[] = {ManageEmployees.data.get(i)[0], ManageEmployees.data.get(i)[2] + " " + ManageEmployees.data.get(i)[1],
                ManageEmployees.data.get(i)[6], ManageEmployees.data.get(i)[7]};
            this.tableModel.addRow(obj);
        }

        this.jTable1.setModel(this.tableModel); // The 0 argument is number
                                                // rows.

        this.jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        this.jScrollPane1.setViewportView(this.jTable1);


        this.jTable1.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(final MouseEvent e) {
                System.out.println(Admin.this.jTable1.getSelectedRow());
                Admin.this.selctedRow = Admin.this.jTable1.getSelectedRow();

                Admin.this.Update.setEnabled(true);
                Admin.this.Delete.setEnabled(true);


            }

            @Override
            public void mouseExited(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(final MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });



        this.SearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Id", "Name", "Role"}));



        this.Search.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void removeUpdate(final DocumentEvent e) {
                System.out.println("removeUpdate");
                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageEmployees.data.size(); i++) {


                    Object obj[] = {ManageEmployees.data.get(i)[0], ManageEmployees.data.get(i)[2] + " " + ManageEmployees.data.get(i)[1],
                            ManageEmployees.data.get(i)[6], ManageEmployees.data.get(i)[7]};

                  
                    
                    System.out.println("Selected: "+Admin.this.SearchCombo.getSelectedItem()+" search: "+Admin.this.Search.getText()+" data: "+ManageEmployees.data.get(i)[6]);

                    if (((String) Admin.this.SearchCombo.getSelectedItem()).equals("Id")
                            && (Admin.this.Search.getText().equals(ManageEmployees.data.get(i)[0])
                                    || ManageEmployees.data.get(i)[0].contains(Admin.this.Search.getText()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                            && (Admin.this.Search.getText().equalsIgnoreCase(ManageEmployees.data.get(i)[2]+ManageEmployees.data.get(i)[1])
                                    || (ManageEmployees.data.get(i)[2]+ManageEmployees.data.get(i)[1]).toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Role")
                            && (Admin.this.Search.getText().equalsIgnoreCase(ManageEmployees.data.get(i)[6])
                                    || ManageEmployees.data.get(i)[6].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (Admin.this.Search.getText().trim().equals("")) {
                        Admin.this.tableModel.addRow(obj);
                    }           

                }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();

            }

            @Override
            public void insertUpdate(final DocumentEvent e) {
                System.out.println("removeUpdate");
                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageEmployees.data.size(); i++) {


                    Object obj[] = {ManageEmployees.data.get(i)[0], ManageEmployees.data.get(i)[2] + " " + ManageEmployees.data.get(i)[1],
                            ManageEmployees.data.get(i)[6], ManageEmployees.data.get(i)[7]};

                    
                    System.out.println("Selected: "+Admin.this.SearchCombo.getSelectedItem()+" search: "+Admin.this.Search.getText()+" data: "+ManageEmployees.data.get(i)[6]);

                    if (((String) Admin.this.SearchCombo.getSelectedItem()).equals("Id")
                            && (Admin.this.Search.getText().equals(ManageEmployees.data.get(i)[0])
                                    || ManageEmployees.data.get(i)[0].contains(Admin.this.Search.getText()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                            && (Admin.this.Search.getText().equalsIgnoreCase(ManageEmployees.data.get(i)[2]+ManageEmployees.data.get(i)[1])
                                    || (ManageEmployees.data.get(i)[2]+ManageEmployees.data.get(i)[1]).toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Role")
                            && (Admin.this.Search.getText().equalsIgnoreCase(ManageEmployees.data.get(i)[6])
                                    || ManageEmployees.data.get(i)[6].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (Admin.this.Search.getText().trim().equals("")) {
                        Admin.this.tableModel.addRow(obj);
                    }           

                }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();

            }

            @Override
            public void changedUpdate(final DocumentEvent e) {
                System.out.println("removeUpdate");
                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageEmployees.data.size(); i++) {


                    Object obj[] = {ManageEmployees.data.get(i)[0], ManageEmployees.data.get(i)[2] + " " + ManageEmployees.data.get(i)[1],
                            ManageEmployees.data.get(i)[6], ManageEmployees.data.get(i)[7]};

                  
                    
                    System.out.println("Selected: "+Admin.this.SearchCombo.getSelectedItem()+" search: "+Admin.this.Search.getText()+" data: "+ManageEmployees.data.get(i)[6]);

                    if (((String) Admin.this.SearchCombo.getSelectedItem()).equals("Id")
                            && (Admin.this.Search.getText().equals(ManageEmployees.data.get(i)[0])
                                    || ManageEmployees.data.get(i)[0].contains(Admin.this.Search.getText()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                            && (Admin.this.Search.getText().equalsIgnoreCase(ManageEmployees.data.get(i)[2]+ManageEmployees.data.get(i)[1])
                                    || (ManageEmployees.data.get(i)[2]+ManageEmployees.data.get(i)[1]).toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Role")
                            && (Admin.this.Search.getText().equalsIgnoreCase(ManageEmployees.data.get(i)[6])
                                    || ManageEmployees.data.get(i)[6].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (Admin.this.Search.getText().trim().equals("")) {
                        Admin.this.tableModel.addRow(obj);
                    }           

                }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();

            }
        });


        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

      

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

       

        this.Update.setEnabled(false);
        this.Delete.setEnabled(false);

        setVisible(true);
        pack();
        
        System.out.println("end");
    }
    
    public void showInvoice()
    {
    	 this.getContentPane().removeAll();
    	 
    	 jPanel2 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         fromDate = new javax.swing.JTextField();
         jLabel3 = new javax.swing.JLabel();
         toDate = new javax.swing.JTextField();
         get = new javax.swing.JButton();
         jScrollPane1 = new javax.swing.JScrollPane();
         jTable1 = new javax.swing.JTable();
         Open = new javax.swing.JButton();
         
         jMenuBar1 = new javax.swing.JMenuBar();
         jMenu1 = new javax.swing.JMenu();
         Employee = new javax.swing.JMenuItem();
         Block = new javax.swing.JMenuItem();
         Ticket = new javax.swing.JMenu();
         Client = new javax.swing.JMenu();
         Invoice = new javax.swing.JMenu();
         Reports = new javax.swing.JMenu();
         jMenuItem1 = new javax.swing.JMenuItem();
         jMenuItem2 = new javax.swing.JMenuItem();
        // jMenuItem3 = new javax.swing.JMenuItem();
         logout = new javax.swing.JMenu();
         
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

         jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
         String col[] = {"Invoice Id", "Client", "From", "To", "Cost"};
         this.tableModel = new MyDefaultTableModel(col, 0);
         this.jTable1.setModel(this.tableModel);
         jScrollPane1.setViewportView(jTable1);
         
         this.jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
         jLabel1.setText("Invoice Report");

         jLabel2.setText("From date");

         jLabel3.setText("To date");

         get.setText("Get");
         get.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 getActionPerformed(evt,fromDate.getText(),toDate.getText());
             }
         });
         
         Open.setText("Open");
         Open.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 OpenActionPerformed(evt);
             }
         });

         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
         jPanel2.setLayout(jPanel2Layout);
         jPanel2Layout.setHorizontalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                         .addComponent(jLabel2)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                         .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(18, 18, 18)
                         .addComponent(jLabel3)
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                         .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(18, 18, 18)
                         .addComponent(get, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addContainerGap())
             .addGroup(jPanel2Layout.createSequentialGroup()
                 .addGap(170, 170, 170)
                 .addComponent(Open)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         jPanel2Layout.setVerticalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel2Layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jLabel1)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel3)
                     .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(get))
                 .addGap(18, 18, 18)
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(Open)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         
         this.jTable1.addMouseListener(new MouseListener() {

             @Override
             public void mouseReleased(final MouseEvent e) {
                 // TODO Auto-generated method stub

             }

             @Override
             public void mousePressed(final MouseEvent e) {
                 System.out.println(Admin.this.jTable1.getSelectedRow());
                 Admin.this.selctedRow = Admin.this.jTable1.getSelectedRow();
                 Admin.this.Open.setEnabled(true);
                 // Delete.setEnabled(true);

             }

             @Override
             public void mouseExited(final MouseEvent e) {
                 // TODO Auto-generated method stub

             }

             @Override
             public void mouseEntered(final MouseEvent e) {
                 // TODO Auto-generated method stub

             }

             @Override
             public void mouseClicked(final MouseEvent e) {
                 // TODO Auto-generated method stub

             }
         });

         jMenu1.setText("Maintain");

         Employee.setText("Employee");
         Employee.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
             	System.out.println("employee mouse clicked");
                 //EmployeeMouseClicked(evt);
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
             	EmployeeMouseClicked(evt);
             }
         });
         jMenu1.add(Employee);

         Block.setText("Block/Unblock");
         Block.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
             	System.out.println("block mouse clicked");
                // BlockMouseClicked(evt);
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
             	System.out.println("block mouse pressed");
             	 BlockMouseClicked(evt);
             }
         });
         jMenu1.add(Block);

         jMenuBar1.add(jMenu1);

         Ticket.setText("Ticket");
         Ticket.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 TicketMouseClicked(evt);
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
                 
             }
         });
         
         
         jMenuBar1.add(Ticket);

         Client.setText("Client");
         Client.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 ClientMouseClicked(evt);
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
                 
             }
         });
         jMenuBar1.add(Client);

         Invoice.setText("Invoice");
         Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 InvoiceMouseClicked(evt);
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
                
             }
         });
         jMenuBar1.add(Invoice);

         Reports.setText("Reports");

         jMenuItem1.setText("Bonus Report");
         jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem1MouseClicked(evt);
             }
         });
         Reports.add(jMenuItem1);

         jMenuItem2.setText("Company Report");
         jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem2MouseClicked(evt);
             }
         });
         Reports.add(jMenuItem2);

         /*jMenuItem3.setText("jMenuItem3");
         jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 jMenuitem3MouseClicked(evt);
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
                 
             }
         });
         Reports.add(jMenuItem3);*/

         jMenuBar1.add(Reports);

         logout.setText("LogOut");
         logout.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 logoutMouseClicked(evt);
             }
             public void mousePressed(java.awt.event.MouseEvent evt) {
                 
             }
         });
         jMenuBar1.add(logout);

         setJMenuBar(jMenuBar1);

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addContainerGap())
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGap(10, 10, 10)
                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         
         pack();
         this.setVisible(true);
    	 
    }

    private void AddActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
        Employee emp = new Employee();
        emp.showAddScreen();
    }

    private void UpdateActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to Update", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Employee emp = new Employee();
            emp.showUpdateScreen(Admin.this.selctedRow);
        }
    }

    private void DeleteActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Employee emp = new Employee();
            emp.showDeleteScreen(Admin.this.selctedRow);
        }
    }

    private void AddTicketActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
        Ticket ticket = new Ticket();
        ticket.showAddScreen("Admin");
    }

    private void UpdateTicketActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to Update", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Ticket ticket = new Ticket();
            ticket.showUpdateScreen(Admin.this.selctedRow, "Admin");
        }
    }

    private void DeleteTicketActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Ticket ticket = new Ticket();
            ticket.showDeleteScreen(Admin.this.selctedRow);
        }
    }

    private void AddClientActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
        Client client = new Client();
        client.showAddScreen("Admin");
    }

    private void UpdateClientActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to Update", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Client client = new Client();
            client.showUpdateScreen(Admin.this.selctedRow, "Admin");
        }
    }

    private void DeleteClientActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Client client = new Client();
            client.showDeleteScreen(Admin.this.selctedRow, "Admin");
        }
    }


    public void showTickets() {

    	System.out.println("show tickets%%%%%%%%%%%%%%%%%%%5");
    	this.getContentPane().removeAll();
    	jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        SearchCombo = new javax.swing.JComboBox<>();
        Search = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Employee = new javax.swing.JMenuItem();
        Block = new javax.swing.JMenuItem();
        Ticket = new javax.swing.JMenu();
        Client = new javax.swing.JMenu();
        Invoice = new javax.swing.JMenu();
        Reports = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
       // jMenuItem3 = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Employee List");


        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Update)
                                .addGap(86, 86, 86)
                                .addComponent(Delete))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Clear)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Maintain");

        Employee.setText("Employee");
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("employee mouse clicked");
                //EmployeeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	EmployeeMouseClicked(evt);
            }
        });
        jMenu1.add(Employee);

        Block.setText("Block/Unblock");
        Block.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlockMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 BlockMouseClicked(evt);
            }
        });
        jMenu1.add(Block);

        jMenuBar1.add(jMenu1);

        Ticket.setText("Ticket");
        Ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        
        
        jMenuBar1.add(Ticket);

        Client.setText("Client");
        Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(Client);

        Invoice.setText("Invoice");
        Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(Invoice);

        Reports.setText("Reports");

        jMenuItem1.setText("Bonus Report");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem1MouseClicked(evt);
            }
        });
        Reports.add(jMenuItem1);

        jMenuItem2.setText("Company Report");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem2MouseClicked(evt);
            }
        });
        Reports.add(jMenuItem2);

       /* jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuitem3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        Reports.add(jMenuItem3);*/

        jMenuBar1.add(Reports);

        logout.setText("LogOut");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        this.jLabel1.setText("Ticket List");

        String col[] = {"Ticket Id", "Client", "From", "To", "Status"};

        this.tableModel = new MyDefaultTableModel(col, 0);

        for (int i = 0; i < ManageTickets.data.size(); i++) {
            //String id = ManageTickets.data.get(i)[0];
            System.out.println("length: " + ManageTickets.data.get(i).length);
            Object obj[] = {ManageTickets.data.get(i)[0], ManageTickets.data.get(i)[1], ManageTickets.data.get(i)[2],
                ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
            this.tableModel.addRow(obj);
        }

        this.jTable1.setModel(this.tableModel); // The 0 argument is number
                                                // rows.

        this.jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        this.jScrollPane1.setViewportView(this.jTable1);


        this.jTable1.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(final MouseEvent e) {
                System.out.println(Admin.this.jTable1.getSelectedRow());
                Admin.this.selctedRow = Admin.this.jTable1.getSelectedRow();

                Admin.this.Update.setEnabled(true);
                // Admin.this.Delete.setEnabled(true);
            }

            @Override
            public void mouseExited(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(final MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });


        this.Add.setText("Add");
        this.Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                AddTicketActionPerformed(evt);
            }
        });

        this.Update.setText("Update");
        this.Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                UpdateTicketActionPerformed(evt);
            }
        });

        this.Delete.setText("Delete");
        this.Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                DeleteTicketActionPerformed(evt);
            }
        });

        this.SearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Client", "From", "To"}));

       

        this.Search.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void removeUpdate(final DocumentEvent e) {
                System.out.println("removeUpdate");
                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageTickets.data.size(); i++) {

                    //String id = ManageTickets.data.get(i)[0];
                	  Object obj[] = {ManageTickets.data.get(i)[0], ManageTickets.data.get(i)[1], ManageTickets.data.get(i)[2],
                              ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
                    System.out.println("SearchCombo.getSelectedItem(): " + Admin.this.SearchCombo.getSelectedItem()
                        + " Search.getText():  " + Admin.this.Search.getText());
                    if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Client")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[1])
                            || ManageTickets.data.get(i)[1].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        System.out.println("inside ManageTickets.data.get(i)[1]) : " + ManageTickets.data.get(i)[1]);
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("From")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[2])
                            || ManageTickets.data.get(i)[2].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("To")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[6])
                            || ManageTickets.data.get(i)[6].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (Admin.this.Search.getText().trim().equals("")) {
                        Admin.this.tableModel.addRow(obj);
                    }

                }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();

            }

            @Override
            public void insertUpdate(final DocumentEvent e) {
                System.out.println("insertUpdate");


                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageTickets.data.size(); i++) {

                    //String id = ManageTickets.data.get(i)[0];
                	  Object obj[] = {ManageTickets.data.get(i)[0], ManageTickets.data.get(i)[1], ManageTickets.data.get(i)[2],
                              ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
                    System.out.println("SearchCombo.getSelectedItem(): " + Admin.this.SearchCombo.getSelectedItem()
                        + " Search.getText():  " + Admin.this.Search.getText());
                    if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Client")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[1])
                            || ManageTickets.data.get(i)[1].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        System.out.println("inside ManageTickets.data.get(i)[1]) : " + ManageTickets.data.get(i)[1]);
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("From")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[2])
                            || ManageTickets.data.get(i)[2].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("To")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[6])
                            || ManageTickets.data.get(i)[6].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (Admin.this.Search.getText().trim().equals("")) {
                        Admin.this.tableModel.addRow(obj);
                    }

                }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();


            }

            @Override
            public void changedUpdate(final DocumentEvent e) {
                System.out.println("changedUpdate");
                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageTickets.data.size(); i++) {

                    //String id = ManageTickets.data.get(i)[0];
                	  Object obj[] = {ManageTickets.data.get(i)[0], ManageTickets.data.get(i)[1], ManageTickets.data.get(i)[2],
                              ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
                    System.out.println("SearchCombo.getSelectedItem(): " + Admin.this.SearchCombo.getSelectedItem()
                        + " Search.getText():  " + Admin.this.Search.getText());
                    if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Client")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[1])
                            || ManageTickets.data.get(i)[1].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        System.out.println("inside ManageTickets.data.get(i)[1]) : " + ManageTickets.data.get(i)[1]);
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("From")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[2])
                            || ManageTickets.data.get(i)[2].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("To")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[6])
                            || ManageTickets.data.get(i)[6].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (Admin.this.Search.getText().trim().equals("")) {
                        Admin.this.tableModel.addRow(obj);
                    }

                }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();

            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
      
        this.Update.setEnabled(false);
        this.Delete.setEnabled(false);
        setVisible(true);
        pack();

        System.out.println("end");
    }

    void showClients() {

System.out.println("%%%%%%%%%5");
this.getContentPane().removeAll();
    	jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        SearchCombo = new javax.swing.JComboBox<>();
        Search = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Employee = new javax.swing.JMenuItem();
        Block = new javax.swing.JMenuItem();
        Ticket = new javax.swing.JMenu();
        Client = new javax.swing.JMenu();
        Invoice = new javax.swing.JMenu();
        Reports = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
       // jMenuItem3 = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Clients List");


        

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Update)
                                .addGap(86, 86, 86)
                                .addComponent(Delete))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Clear)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Maintain");

        Employee.setText("Employee");
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	System.out.println("employee mouse clicked");
                //EmployeeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	EmployeeMouseClicked(evt);
            }
        });
        jMenu1.add(Employee);

        Block.setText("Block/Unblock");
        Block.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlockMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 BlockMouseClicked(evt);
            }
        });
        jMenu1.add(Block);

        jMenuBar1.add(jMenu1);

        Ticket.setText("Ticket");
        Ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        
        
        jMenuBar1.add(Ticket);

        Client.setText("Client");
        Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(Client);

        Invoice.setText("Invoice");
        Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoiceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(Invoice);

        Reports.setText("Reports");

        jMenuItem1.setText("Bonus Report");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
               
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem1MouseClicked(evt);
            }
        });
        Reports.add(jMenuItem1);

        jMenuItem2.setText("Company Report");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	 jMenuitem2MouseClicked(evt);
            }
        });
        Reports.add(jMenuItem2);

        /*jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuitem3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        Reports.add(jMenuItem3);*/

        jMenuBar1.add(Reports);

        logout.setText("LogOut");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                
            }
        });
        jMenuBar1.add(logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
       


        String col[] = {"Client Id", "Name", "Adress", "Status"};

        this.tableModel = new MyDefaultTableModel(col, 0);

        for (int i = 0; i < ManageClients.data.size(); i++) {
           // String id = ManageClients.data.get(i)[0];
            Object obj[] = {ManageClients.data.get(i)[0], ManageClients.data.get(i)[1],
                ManageClients.data.get(i)[4]+" "+ManageClients.data.get(i)[5]+" "+ManageClients.data.get(i)[6]+" "+ManageClients.data.get(i)[7], ManageClients.data.get(i)[8]};
            this.tableModel.addRow(obj);
        }

        this.jTable1.setModel(this.tableModel); // The 0 argument is number
                                                // rows.

        this.jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        this.jScrollPane1.setViewportView(this.jTable1);


        this.jTable1.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(final MouseEvent e) {
                System.out.println(Admin.this.jTable1.getSelectedRow());
                Admin.this.selctedRow = Admin.this.jTable1.getSelectedRow();
                Admin.this.Update.setEnabled(true);
                Admin.this.Delete.setEnabled(true);

            }

            @Override
            public void mouseExited(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(final MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseClicked(final MouseEvent e) {
                // TODO Auto-generated method stub

            }
        });


        this.Add.setText("Add");
        this.Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                AddClientActionPerformed(evt);
            }
        });

        this.Update.setText("Update");
        this.Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                UpdateClientActionPerformed(evt);
            }
        });

        this.Delete.setText("Delete");
        this.Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                DeleteClientActionPerformed(evt);
            }
        });

        this.SearchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Id", "Name"}));

        

        this.Search.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void removeUpdate(final DocumentEvent e) {
                System.out.println("removeUpdate");
                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageClients.data.size(); i++) {

                  //  String id = ManageClients.data.get(i)[0];
                	 Object obj[] = {ManageClients.data.get(i)[0], ManageClients.data.get(i)[1],
                             ManageClients.data.get(i)[4]+" "+ManageClients.data.get(i)[5]+" "+ManageClients.data.get(i)[6]+" "+ManageClients.data.get(i)[7], ManageClients.data.get(i)[8]};
                    System.out.println("SearchCombo.getSelectedItem(): " + Admin.this.SearchCombo.getSelectedItem()
                        + " Search.getText():  " + Admin.this.Search.getText());
                    if (((String) Admin.this.SearchCombo.getSelectedItem()).equals("Id")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[0])
                            || ManageClients.data.get(i)[0].contains(Admin.this.Search.getText()))) {
                        System.out.println("inside ManageClients.data.get(i)[1]) : " + ManageClients.data.get(i)[1]);
                        Admin.this.tableModel.addRow(obj);
                    } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                        && (Admin.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[1])
                            || ManageClients.data.get(i)[1].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                        Admin.this.tableModel.addRow(obj);
                    } else if (Admin.this.Search.getText().trim().equals("")) {
                        Admin.this.tableModel.addRow(obj);
                    }

                }

                
                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();

            }

            @Override
            public void insertUpdate(final DocumentEvent e) {
                System.out.println("insertUpdate");


                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageClients.data.size(); i++) {

                    //  String id = ManageClients.data.get(i)[0];
                  	 Object obj[] = {ManageClients.data.get(i)[0], ManageClients.data.get(i)[1],
                               ManageClients.data.get(i)[4]+" "+ManageClients.data.get(i)[5]+" "+ManageClients.data.get(i)[6]+" "+ManageClients.data.get(i)[7], ManageClients.data.get(i)[8]};
                      System.out.println("SearchCombo.getSelectedItem(): " + Admin.this.SearchCombo.getSelectedItem()
                          + " Search.getText():  " + Admin.this.Search.getText());
                      if (((String) Admin.this.SearchCombo.getSelectedItem()).equals("Id")
                          && (Admin.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[0])
                              || ManageClients.data.get(i)[0].contains(Admin.this.Search.getText()))) {
                          System.out.println("inside ManageClients.data.get(i)[1]) : " + ManageClients.data.get(i)[1]);
                          Admin.this.tableModel.addRow(obj);
                      } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                          && (Admin.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[1])
                              || ManageClients.data.get(i)[1].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                          Admin.this.tableModel.addRow(obj);
                      } else if (Admin.this.Search.getText().trim().equals("")) {
                          Admin.this.tableModel.addRow(obj);
                      }

                  }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();


            }

            @Override
            public void changedUpdate(final DocumentEvent e) {
                Admin.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageClients.data.size(); i++) {

                    //  String id = ManageClients.data.get(i)[0];
                  	 Object obj[] = {ManageClients.data.get(i)[0], ManageClients.data.get(i)[1],
                               ManageClients.data.get(i)[4]+" "+ManageClients.data.get(i)[5]+" "+ManageClients.data.get(i)[6]+" "+ManageClients.data.get(i)[7], ManageClients.data.get(i)[8]};
                      System.out.println("SearchCombo.getSelectedItem(): " + Admin.this.SearchCombo.getSelectedItem()
                          + " Search.getText():  " + Admin.this.Search.getText());
                      if (((String) Admin.this.SearchCombo.getSelectedItem()).equals("Id")
                          && (Admin.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[0])
                              || ManageClients.data.get(i)[0].contains(Admin.this.Search.getText()))) {
                          System.out.println("inside ManageClients.data.get(i)[1]) : " + ManageClients.data.get(i)[1]);
                          Admin.this.tableModel.addRow(obj);
                      } else if (((String) Admin.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                          && (Admin.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[1])
                              || ManageClients.data.get(i)[1].toLowerCase().contains(Admin.this.Search.getText().toLowerCase()))) {
                          Admin.this.tableModel.addRow(obj);
                      } else if (Admin.this.Search.getText().trim().equals("")) {
                          Admin.this.tableModel.addRow(obj);
                      }

                  }

                Admin.this.jTable1.setModel(Admin.this.tableModel);
                Admin.this.jTable1.repaint();}
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
       
        this.Update.setEnabled(false);
        this.Delete.setEnabled(false);
        setVisible(true);
        pack();

System.out.println("end");
    }

    private void ClearActionPerformed(final java.awt.event.ActionEvent evt) {
        this.Search.setText("");
    }
    
    
    private void EmployeeMouseClicked(final MouseEvent evt)
    {
    	System.out.println("clicked");
    	 showEmployees();
    }
    
    private void BlockMouseClicked(final MouseEvent evt)
    {
    	System.out.println("BlockMouseClicked");
    	new blockUnblock();
    }
    
    
    private void  TicketMouseClicked(final MouseEvent evt)
    {
    	 showTickets();
    }
    
    private void  ClientMouseClicked(final MouseEvent evt)
    {
    	showClients();
    }
    

    

    
    private void  InvoiceMouseClicked(final MouseEvent evt)
    {
    	showInvoice();
    }
          
    
    private void  jMenuitem3MouseClicked(final MouseEvent evt)
    {
    	
    }
    
    private void  jMenuitem1MouseClicked(final MouseEvent evt)
    {
    	new BonusReport();
    }
    
    
    private void  jMenuitem2MouseClicked(final MouseEvent evt)
    {
    	new CompanyReport();
    }
    
    private void  logoutMouseClicked(final MouseEvent evt)
    {
    	this.dispose();
        Login frame = new Login();

        frame.setVisible(true);
    }
    
    private void getActionPerformed(java.awt.event.ActionEvent evt,String from, String to) {                                    
    	boolean flag = true;
      	 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
      	 try {

              formatter.parse(from);
             
            
              

           } catch (Exception e) {
               //e.printStackTrace();
               flag = false;
               JOptionPane.showMessageDialog(this, "Incorrect from date enter in MM/dd/yyyy format", "Error", JOptionPane.ERROR_MESSAGE);
           }
      	 
      	 try{
      		 if(flag)
      		 {
      			 formatter.parse(to);
      		 }
      		
      	 }
      	 catch (Exception e) {
      		//e.printStackTrace();
               flag = false;
               JOptionPane.showMessageDialog(this, "Incorrect to date enter in MM/dd/yyyy format", "Error", JOptionPane.ERROR_MESSAGE);
           }
       	
       	if(flag)
       	{
   	 data = new ReportsData().getInvoiceReportsData(from, to);
   	 String col[] = {"Invoice Id", "Client", "From", "To", "Cost"};
   	 tableModel = new MyDefaultTableModel(col, 0);
   	for(String temp[] : data)
   	{
   	tableModel.addRow(temp);
   	}
   	 Admin.this.jTable1.setModel(Admin.this.tableModel);
   	Admin.this.jTable1.repaint();
       	}
   }
    
    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {     
    	new showInvoice(data.get(selctedRow));
    }
     
    private javax.swing.JButton Open;
    private javax.swing.JTextField fromDate;
    private javax.swing.JButton get;
  
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
  
    private javax.swing.JTextField toDate;
    
    
    

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu Ticket;
    private javax.swing.JMenu Client;
    private javax.swing.JMenu Reports;
    private javax.swing.JMenu Invoice;
    private javax.swing.JMenu logout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
   // private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem Employee;
    private javax.swing.JMenuItem Block;


    // Variables declaration - do not modify
    private javax.swing.JButton Add;
    private javax.swing.JLabel ClientLabel;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel EmplyeeLabel;
    private javax.swing.JLabel InvoiceLabel;
    private javax.swing.JButton LogOut;
    private javax.swing.JComboBox<String> ReportsCombo;
    private javax.swing.JTextField Search;
    private javax.swing.JComboBox<String> SearchCombo;
    private javax.swing.JLabel TicketLabel;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    MyDefaultTableModel tableModel;
    private javax.swing.JButton Clear;
    // End of variables declaration
}
