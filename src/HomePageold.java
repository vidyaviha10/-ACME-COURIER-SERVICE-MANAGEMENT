import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import utils.ManageClients;
import utils.ManageTickets;
import utils.MyDefaultTableModel;


public class HomePageold extends javax.swing.JFrame {

    int selctedRow = -1;

    public HomePageold() {

    }

    public void showAdminPage() {

        this.jLabel1 = new javax.swing.JLabel();
        this.jLabel2 = new javax.swing.JLabel();
        this.Logout = new javax.swing.JButton();
        this.Employee = new javax.swing.JButton();
        this.Client = new javax.swing.JButton();
        this.Reports = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jLabel1.setText("Home Screen");

        this.jLabel2.setText("Welcome Admin");

        this.Logout.setText("LOG OUT");
        this.Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        this.Employee.setText("Employee");
        this.Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });

        this.Client.setText("Client");
        this.Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                ClientActionPerformed(evt);
            }
        });

        this.Reports.setText("Reports");
        this.Reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                ReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup().addGap(52, 52, 52).addComponent(this.jLabel2))
                    .addGroup(layout.createSequentialGroup().addGap(28, 28, 28).addComponent(this.Employee)))
            .addGap(0, 0, Short.MAX_VALUE).addComponent(this.Client).addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.Reports)
                .addComponent(this.Logout)).addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(this.jLabel1).addGap(147, 147, 147)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel1).addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jLabel2)
                    .addComponent(this.Logout))
                .addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.Employee).addComponent(this.Client).addComponent(this.Reports))
            .addContainerGap(97, Short.MAX_VALUE)));

        pack();
        setVisible(true);
    }

    public void showTicketScreen() {


        {

            this.getContentPane().removeAll();
            this.Clear = new javax.swing.JButton();
            this.Clear.setText("Clear");
            this.Clear.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    ClearActionPerformed(evt);
                }
            });
            this.jPanel1 = new javax.swing.JPanel();

            this.TicketLabel = new javax.swing.JLabel();
            this.ClientLabel = new javax.swing.JLabel();
            this.InvoiceLabel = new javax.swing.JLabel();
            this.ReportsCombo = new javax.swing.JComboBox<>();
            this.LogOut = new javax.swing.JButton();
            this.jPanel2 = new javax.swing.JPanel();
            this.jLabel1 = new javax.swing.JLabel();
            this.jScrollPane1 = new javax.swing.JScrollPane();
            this.jTable1 = new javax.swing.JTable();
            this.Add = new javax.swing.JButton();
            this.Update = new javax.swing.JButton();
            this.Delete = new javax.swing.JButton();
            this.SearchCombo = new javax.swing.JComboBox<>();
            this.Search = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            this.jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


            this.TicketLabel.setText("Ticket");
            this.TicketLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(final java.awt.event.MouseEvent evt) {
                    TicketLabelMouseClicked(evt);
                }
            });

            this.ClientLabel.setText("Client");
            this.ClientLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(final java.awt.event.MouseEvent evt) {
                    ClientLabelMouseClicked(evt);
                }
            });

            this.InvoiceLabel.setText("Invoice");
            this.InvoiceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(final java.awt.event.MouseEvent evt) {
                    InvoiceLabelMouseClicked(evt);
                }
            });

            this.ReportsCombo
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Report1", "Report2", "Report3", "Report4"}));

            this.LogOut.setText("Logout");
            this.LogOut.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(final java.awt.event.ActionEvent evt) {
                    LogOutActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
            this.jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()

                    .addComponent(this.TicketLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(this.ClientLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(this.InvoiceLabel).addGap(18, 18, 18)
                    .addComponent(this.ReportsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(this.LogOut)));
            jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                        .addComponent(this.TicketLabel).addComponent(this.ClientLabel).addComponent(this.InvoiceLabel)
                        .addComponent(this.ReportsCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(this.LogOut))
                    .addContainerGap(14, Short.MAX_VALUE)));

            this.jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

            this.jLabel1.setText("Employee List");

            String col[] = {"Ticket Id", "Client", "From", "To", "Status"};

            this.tableModel = new MyDefaultTableModel(col, 0);

            for (int i = 0; i < ManageTickets.data.size(); i++) {
                String id = ManageTickets.data.get(i)[0];
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
                    System.out.println(HomePageold.this.jTable1.getSelectedRow());
                    HomePageold.this.selctedRow = HomePageold.this.jTable1.getSelectedRow();
                    HomePageold.this.Update.setEnabled(true);
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

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this.jPanel2);
            this.jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                        .addComponent(this.Add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(this.Update).addGap(86, 86, 86).addComponent(this.Delete))
                    .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                        .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                    .addGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(this.SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(this.Search, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Clear)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
            jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(this.SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(this.Clear))
                    .addGap(20, 20, 20).addComponent(this.jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.Add)
                        .addComponent(this.Update).addComponent(this.Delete))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(this.jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(this.jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE))
                    .addContainerGap()));
            layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                    .addComponent(this.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(this.jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

            this.Search.getDocument().addDocumentListener(new DocumentListener() {


                @Override
                public void removeUpdate(final DocumentEvent e) {
                    System.out.println("removeUpdate");
                    HomePageold.this.tableModel = new MyDefaultTableModel(col, 0);
                    for (int i = 0; i < ManageTickets.data.size(); i++) {

                        String id = ManageTickets.data.get(i)[0];
                        Object obj[] = {ManageTickets.data.get(i)[0], ManageTickets.data.get(i)[1], ManageTickets.data.get(i)[2],
                            ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
                        System.out.println("SearchCombo.getSelectedItem(): " + HomePageold.this.SearchCombo.getSelectedItem()
                            + " Search.getText():  " + HomePageold.this.Search.getText());
                        if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Client")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[1])
                                || ManageTickets.data.get(i)[1].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            System.out.println("inside ManageTickets.data.get(i)[1]) : " + ManageTickets.data.get(i)[1]);
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("From")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[2])
                                || ManageTickets.data.get(i)[2].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("To")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[6])
                                || ManageTickets.data.get(i)[6].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (HomePageold.this.Search.getText().trim().equals("")) {
                            HomePageold.this.tableModel.addRow(obj);
                        }

                    }

                    HomePageold.this.jTable1.setModel(HomePageold.this.tableModel);
                    HomePageold.this.jTable1.repaint();

                }

                @Override
                public void insertUpdate(final DocumentEvent e) {
                    System.out.println("insertUpdate");


                    HomePageold.this.tableModel = new MyDefaultTableModel(col, 0);
                    for (int i = 0; i < ManageTickets.data.size(); i++) {

                        String id = ManageTickets.data.get(i)[0];
                        Object obj[] = {ManageTickets.data.get(i)[0], ManageTickets.data.get(i)[1], ManageTickets.data.get(i)[2],
                            ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
                        System.out.println("SearchCombo.getSelectedItem(): " + HomePageold.this.SearchCombo.getSelectedItem()
                            + " Search.getText():  " + HomePageold.this.Search.getText());
                        if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Client")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[1])
                                || ManageTickets.data.get(i)[1].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            System.out.println("inside ManageTickets.data.get(i)[1]) : " + ManageTickets.data.get(i)[1]);
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("From")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[2])
                                || ManageTickets.data.get(i)[2].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("To")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[6])
                                || ManageTickets.data.get(i)[6].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (HomePageold.this.Search.getText().trim().equals("")) {
                            HomePageold.this.tableModel.addRow(obj);
                        }

                    }

                    HomePageold.this.jTable1.setModel(HomePageold.this.tableModel);
                    HomePageold.this.jTable1.repaint();


                }

                @Override
                public void changedUpdate(final DocumentEvent e) {
                    System.out.println("changedUpdate");
                    HomePageold.this.tableModel = new MyDefaultTableModel(col, 0);
                    for (int i = 0; i < ManageTickets.data.size(); i++) {

                        String id = ManageTickets.data.get(i)[0];
                        Object obj[] = {ManageTickets.data.get(i)[0], ManageTickets.data.get(i)[1], ManageTickets.data.get(i)[2],
                            ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
                        System.out.println("SearchCombo.getSelectedItem(): " + HomePageold.this.SearchCombo.getSelectedItem()
                            + " Search.getText():  " + HomePageold.this.Search.getText());
                        if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Client")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[1])
                                || ManageTickets.data.get(i)[1].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            System.out.println("inside ManageTickets.data.get(i)[1]) : " + ManageTickets.data.get(i)[1]);
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("From")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[2])
                                || ManageTickets.data.get(i)[2].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("To")
                            && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageTickets.data.get(i)[6])
                                || ManageTickets.data.get(i)[6].toLowerCase()
                                    .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                            HomePageold.this.tableModel.addRow(obj);
                        } else if (HomePageold.this.Search.getText().trim().equals("")) {
                            HomePageold.this.tableModel.addRow(obj);
                        }

                    }

                    HomePageold.this.jTable1.setModel(HomePageold.this.tableModel);
                    HomePageold.this.jTable1.repaint();

                }
            });


            this.TicketLabel.setBackground(Color.GRAY);
            this.TicketLabel.setOpaque(true);


            this.ClientLabel.setOpaque(false);
            this.InvoiceLabel.setOpaque(false);


            this.ClientLabel.setBackground(new Color(240, 240, 240));
            this.InvoiceLabel.setBackground(new Color(240, 240, 240));
            this.Update.setEnabled(false);
            this.Delete.setEnabled(false);
            setVisible(true);
            pack();

        }


        /*
         * GetDirections = new javax.swing.JButton(); Driver = new
         * javax.swing.JButton(); Client = new javax.swing.JButton(); jLabel1 =
         * new javax.swing.JLabel(); jLabel2 = new javax.swing.JLabel(); Logout
         * = new javax.swing.JButton(); Invoice = new javax.swing.JButton();
         *
         * setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         *
         * GetDirections.setText("Get Directions");
         * GetDirections.addActionListener(new java.awt.event.ActionListener()
         * { public void actionPerformed(java.awt.event.ActionEvent evt) {
         * GetDirectionsActionPerformed(evt); } });
         *
         * Driver.setText("Driver"); Driver.addActionListener(new
         * java.awt.event.ActionListener() { public void
         * actionPerformed(java.awt.event.ActionEvent evt) {
         * DriverActionPerformed(evt); } });
         *
         * Client.setText("Client"); Client.addActionListener(new
         * java.awt.event.ActionListener() { public void
         * actionPerformed(java.awt.event.ActionEvent evt) {
         * ClientActionPerformed(evt); } });
         *
         * jLabel1.setText("Home Screen");
         *
         * jLabel2.setText("Welcome Employee");
         *
         * Logout.setText("LOG OUT"); Logout.addActionListener(new
         * java.awt.event.ActionListener() { public void
         * actionPerformed(java.awt.event.ActionEvent evt) {
         * LogoutActionPerformed(evt); } });
         *
         * Invoice.setText("Generate Invice"); Invoice.addActionListener(new
         * java.awt.event.ActionListener() { public void
         * actionPerformed(java.awt.event.ActionEvent evt) {
         * InvoiceActionPerformed(evt); } });
         *
         * javax.swing.GroupLayout layout = new
         * javax.swing.GroupLayout(getContentPane());
         * getContentPane().setLayout(layout); layout.setHorizontalGroup(
         * layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
         * LEADING) .addGroup(layout.createSequentialGroup()
         * .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.
         * Alignment.LEADING) .addGroup(layout.createSequentialGroup()
         * .addGap(151, 151, 151) .addComponent(jLabel1))
         * .addGroup(layout.createSequentialGroup() .addGap(28, 28, 28)
         * .addComponent(Client)
         * .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
         * .addComponent(Driver)
         * .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
         * .addComponent(GetDirections)
         * .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
         * .addComponent(Invoice)))
         * .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
         * Short.MAX_VALUE)) .addGroup(layout.createSequentialGroup()
         * .addGap(37, 37, 37) .addComponent(jLabel2)
         * .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
         * javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         * .addComponent(Logout) .addGap(18, 18, 18)) );
         * layout.setVerticalGroup(
         * layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
         * LEADING) .addGroup(layout.createSequentialGroup() .addGap(20, 20,
         * 20) .addComponent(jLabel1) .addGap(18, 18, 18)
         * .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.
         * Alignment.BASELINE) .addComponent(jLabel2) .addComponent(Logout))
         * .addGap(18, 18, 18)
         * .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.
         * Alignment.BASELINE) .addComponent(Client) .addComponent(Driver)
         * .addComponent(GetDirections) .addComponent(Invoice))
         * .addContainerGap(97, Short.MAX_VALUE)) );
         */
        pack();
        setVisible(true);
    }

    private void LogoutActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void EmployeeActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
        Admin admin = new Admin();
        admin.showEmployees();
    }

    private void ClientActionPerformed(final java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ReportsActionPerformed(final java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void GetDirectionsActionPerformed(final java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void DriverActionPerformed(final java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void InvoiceActionPerformed(final java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void TicketLabelMouseClicked(final java.awt.event.MouseEvent evt) {
        this.TicketLabel.setBackground(Color.GRAY);
        this.TicketLabel.setOpaque(true);


        this.ClientLabel.setOpaque(false);
        this.InvoiceLabel.setOpaque(false);


        this.ClientLabel.setBackground(new Color(240, 240, 240));
        this.InvoiceLabel.setBackground(new Color(240, 240, 240));

        showTicketScreen();


    }

    private void ClientLabelMouseClicked(final java.awt.event.MouseEvent evt) {
        this.ClientLabel.setBackground(Color.GRAY);
        this.ClientLabel.setOpaque(true);

        this.TicketLabel.setOpaque(false);

        this.InvoiceLabel.setOpaque(false);

        this.TicketLabel.setBackground(new Color(240, 240, 240));

        this.InvoiceLabel.setBackground(new Color(240, 240, 240));

        showClients();
    }

    void showClients() {


        this.getContentPane().removeAll();
        this.Clear = new javax.swing.JButton();
        this.Clear.setText("Clear");
        this.Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        this.jPanel1 = new javax.swing.JPanel();

        this.TicketLabel = new javax.swing.JLabel();
        this.ClientLabel = new javax.swing.JLabel();
        this.InvoiceLabel = new javax.swing.JLabel();
        this.ReportsCombo = new javax.swing.JComboBox<>();
        this.LogOut = new javax.swing.JButton();
        this.jPanel2 = new javax.swing.JPanel();
        this.jLabel1 = new javax.swing.JLabel();
        this.jScrollPane1 = new javax.swing.JScrollPane();
        this.jTable1 = new javax.swing.JTable();
        this.Add = new javax.swing.JButton();
        this.Update = new javax.swing.JButton();
        this.Delete = new javax.swing.JButton();
        this.SearchCombo = new javax.swing.JComboBox<>();
        this.Search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));


        this.TicketLabel.setText("Ticket");
        this.TicketLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(final java.awt.event.MouseEvent evt) {
                TicketLabelMouseClicked(evt);
            }
        });

        this.ClientLabel.setText("Client");
        this.ClientLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(final java.awt.event.MouseEvent evt) {
                ClientLabelMouseClicked(evt);
            }
        });

        this.InvoiceLabel.setText("Invoice");
        this.InvoiceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(final java.awt.event.MouseEvent evt) {
                InvoiceLabelMouseClicked(evt);
            }
        });

        this.ReportsCombo
            .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Report1", "Report2", "Report3", "Report4"}));

        this.LogOut.setText("Logout");
        this.LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()

                .addComponent(this.TicketLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(this.ClientLabel).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.InvoiceLabel).addGap(18, 18, 18)
                .addComponent(this.ReportsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addComponent(this.LogOut)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(this.TicketLabel).addComponent(this.ClientLabel)
                    .addComponent(this.InvoiceLabel).addComponent(this.ReportsCombo, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.LogOut))
                .addContainerGap(14, Short.MAX_VALUE)));

        this.jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        this.jLabel1.setText("Employee List");

        String col[] = {"Client Id", "Name", "Adress", "Status"};

        this.tableModel = new MyDefaultTableModel(col, 0);

        for (int i = 0; i < ManageClients.data.size(); i++) {
            String id = ManageClients.data.get(i)[0];
            Object obj[] = {
                ManageClients.data.get(i)[0], ManageClients.data.get(i)[1], ManageClients.data.get(i)[4] + " "
                    + ManageClients.data.get(i)[5] + " " + ManageClients.data.get(i)[6] + " " + ManageClients.data.get(i)[7],
                ManageClients.data.get(i)[8]};
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
                System.out.println(HomePageold.this.jTable1.getSelectedRow());
                HomePageold.this.selctedRow = HomePageold.this.jTable1.getSelectedRow();
                HomePageold.this.Update.setEnabled(true);
                HomePageold.this.Delete.setEnabled(true);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this.jPanel2);
        this.jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                        .addComponent(this.Add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE,
                            Short.MAX_VALUE)
                        .addComponent(this.Update).addGap(86, 86, 86).addComponent(this.Delete))
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                    .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(this.SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(this.Search, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.Clear)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.SearchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(this.Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(this.Clear))
                .addGap(20, 20, 20).addComponent(this.jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(this.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.Add)
                    .addComponent(this.Update).addComponent(this.Delete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(this.jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(this.jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE))
                .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap()
                .addComponent(this.jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(this.jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        this.Search.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void removeUpdate(final DocumentEvent e) {
                System.out.println("removeUpdate");
                HomePageold.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageClients.data.size(); i++) {

                    String id = ManageClients.data.get(i)[0];
                    Object obj[] = {ManageClients.data.get(i)[0], ManageClients.data.get(i)[1], ManageClients.data.get(i)[4] + " "
                        + ManageClients.data.get(i)[5] + " " + ManageClients.data.get(i)[6] + " " + ManageClients.data.get(i)[7],
                        ManageClients.data.get(i)[8]};
                    System.out.println("SearchCombo.getSelectedItem(): " + HomePageold.this.SearchCombo.getSelectedItem()
                        + " Search.getText():  " + HomePageold.this.Search.getText());
                    if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equals("Id")
                        && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[0])
                            || ManageClients.data.get(i)[0].contains(HomePageold.this.Search.getText()))) {
                        System.out.println("inside ManageClients.data.get(i)[1]) : " + ManageClients.data.get(i)[1]);
                        HomePageold.this.tableModel.addRow(obj);
                    } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                        && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[1])
                            || ManageClients.data.get(i)[1].toLowerCase()
                                .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                        HomePageold.this.tableModel.addRow(obj);
                    } else if (HomePageold.this.Search.getText().trim().equals("")) {
                        HomePageold.this.tableModel.addRow(obj);
                    }

                }

                HomePageold.this.jTable1.setModel(HomePageold.this.tableModel);
                HomePageold.this.jTable1.repaint();

            }

            @Override
            public void insertUpdate(final DocumentEvent e) {
                System.out.println("insertUpdate");


                HomePageold.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageClients.data.size(); i++) {

                    String id = ManageClients.data.get(i)[0];
                    Object obj[] = {ManageClients.data.get(i)[0], ManageClients.data.get(i)[1], ManageClients.data.get(i)[4] + " "
                        + ManageClients.data.get(i)[5] + " " + ManageClients.data.get(i)[6] + " " + ManageClients.data.get(i)[7],
                        ManageClients.data.get(i)[8]};
                    System.out.println("SearchCombo.getSelectedItem(): " + HomePageold.this.SearchCombo.getSelectedItem()
                        + " Search.getText():  " + HomePageold.this.Search.getText());
                    if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equals("Id")
                        && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[0])
                            || ManageClients.data.get(i)[0].contains(HomePageold.this.Search.getText()))) {
                        System.out.println("inside ManageClients.data.get(i)[1]) : " + ManageClients.data.get(i)[1]);
                        HomePageold.this.tableModel.addRow(obj);
                    } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                        && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[1])
                            || ManageClients.data.get(i)[1].toLowerCase()
                                .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                        HomePageold.this.tableModel.addRow(obj);
                    } else if (HomePageold.this.Search.getText().trim().equals("")) {
                        HomePageold.this.tableModel.addRow(obj);
                    }

                }

                HomePageold.this.jTable1.setModel(HomePageold.this.tableModel);
                HomePageold.this.jTable1.repaint();


            }

            @Override
            public void changedUpdate(final DocumentEvent e) {
                System.out.println("changedUpdate");
                HomePageold.this.tableModel = new MyDefaultTableModel(col, 0);
                for (int i = 0; i < ManageClients.data.size(); i++) {

                    String id = ManageClients.data.get(i)[0];
                    Object obj[] = {ManageClients.data.get(i)[0], ManageClients.data.get(i)[1], ManageClients.data.get(i)[4] + " "
                        + ManageClients.data.get(i)[5] + " " + ManageClients.data.get(i)[6] + " " + ManageClients.data.get(i)[7],
                        ManageClients.data.get(i)[8]};
                    System.out.println("SearchCombo.getSelectedItem(): " + HomePageold.this.SearchCombo.getSelectedItem()
                        + " Search.getText():  " + HomePageold.this.Search.getText());
                    if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equals("Id")
                        && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[0])
                            || ManageClients.data.get(i)[0].contains(HomePageold.this.Search.getText()))) {
                        System.out.println("inside ManageClients.data.get(i)[1]) : " + ManageClients.data.get(i)[1]);
                        HomePageold.this.tableModel.addRow(obj);
                    } else if (((String) HomePageold.this.SearchCombo.getSelectedItem()).equalsIgnoreCase("Name")
                        && (HomePageold.this.Search.getText().equalsIgnoreCase(ManageClients.data.get(i)[1])
                            || ManageClients.data.get(i)[1].toLowerCase()
                                .contains(HomePageold.this.Search.getText().toLowerCase()))) {
                        HomePageold.this.tableModel.addRow(obj);
                    } else if (HomePageold.this.Search.getText().trim().equals("")) {
                        HomePageold.this.tableModel.addRow(obj);
                    }

                }

                HomePageold.this.jTable1.setModel(HomePageold.this.tableModel);
                HomePageold.this.jTable1.repaint();

            }
        });


        this.ClientLabel.setBackground(Color.GRAY);
        this.ClientLabel.setOpaque(true);


        this.TicketLabel.setOpaque(false);
        this.InvoiceLabel.setOpaque(false);


        this.TicketLabel.setBackground(new Color(240, 240, 240));
        this.InvoiceLabel.setBackground(new Color(240, 240, 240));
        this.Update.setEnabled(false);
        this.Delete.setEnabled(false);
        setVisible(true);
        pack();


    }

    private void InvoiceLabelMouseClicked(final java.awt.event.MouseEvent evt) {
        this.InvoiceLabel.setBackground(Color.GRAY);
        this.InvoiceLabel.setOpaque(true);

        this.TicketLabel.setOpaque(false);
        this.ClientLabel.setOpaque(false);


        this.TicketLabel.setBackground(new Color(240, 240, 240));
        this.ClientLabel.setBackground(new Color(240, 240, 240));


    }

    private void LogOutActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
        Login frame = new Login();

        frame.setVisible(true);
    }

    private void AddTicketActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
        Ticket ticket = new Ticket();
        ticket.showAddScreen("Employee");
    }

    private void UpdateTicketActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to Update", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Ticket ticket = new Ticket();
            ticket.showUpdateScreen(HomePageold.this.selctedRow, "Employee");
        }
    }

    private void DeleteTicketActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Ticket ticket = new Ticket();
            ticket.showDeleteScreen(HomePageold.this.selctedRow);
        }
    }

    private void AddClientActionPerformed(final java.awt.event.ActionEvent evt) {
        this.dispose();
        Client client = new Client();
        client.showAddScreen("Employee");
    }

    private void UpdateClientActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to Update", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Client client = new Client();
            client.showUpdateScreen(HomePageold.this.selctedRow, "Employee");
        }
    }

    private void DeleteClientActionPerformed(final java.awt.event.ActionEvent evt) {
        if (this.selctedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Client client = new Client();
            client.showDeleteScreen(HomePageold.this.selctedRow, "Employee");
        }
    }

    private void ClearActionPerformed(final java.awt.event.ActionEvent evt) {
        this.Search.setText("");
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Client;
    private javax.swing.JButton Employee;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Reports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;


    private javax.swing.JButton Driver;
    private javax.swing.JButton GetDirections;
    private javax.swing.JButton Invoice;
    // End of variables declaration


    // Variables declaration - do not modify
    private javax.swing.JButton Add;
    private javax.swing.JLabel ClientLabel;
    private javax.swing.JButton Delete;

    private javax.swing.JLabel InvoiceLabel;
    private javax.swing.JButton LogOut;
    private javax.swing.JComboBox<String> ReportsCombo;
    private javax.swing.JTextField Search;
    private javax.swing.JComboBox<String> SearchCombo;
    private javax.swing.JLabel TicketLabel;
    private javax.swing.JButton Update;

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    MyDefaultTableModel tableModel;
    private javax.swing.JButton Clear;
    // End of variables declaration
}
