import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.NetworkInterface;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import distance.calculateDistance;
import utils.GenerateInvoice;
import utils.ManageClients;
import utils.ManageEmployees;
import utils.ManageTickets;
import utils.MyDefaultTableModel;

public class Ticket extends javax.swing.JFrame {
	
	public static int costPerParcel = 0;
	
	public static Long DeliveryTime = null;
	
	static String dateText = "";
	
	int selctedRow;

    public void showUpdateScreen(final int id, final String action) { jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    address = new javax.swing.JTextField();
    intersection = new javax.swing.JTextField();
    city = new javax.swing.JTextField();
    zipcode = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    address1 = new javax.swing.JTextField();
    intersection1 = new javax.swing.JTextField();
    city1 = new javax.swing.JTextField();
    zipcode1 = new javax.swing.JTextField();
    jPanel4 = new javax.swing.JPanel();
    jLabel14 = new javax.swing.JLabel();
    deliveryStatus = new javax.swing.JComboBox<>();
    jTextField2 = new javax.swing.JTextField();
    time = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    jTextField3 = new javax.swing.JTextField();
    jPanel5 = new javax.swing.JPanel();
    jTextField1 = new javax.swing.JTextField();
    jLabel16 = new javax.swing.JLabel();
    finalOk = new javax.swing.JButton();
    finalCancel = new javax.swing.JButton();
    jPanel6 = new javax.swing.JPanel();
    jLabel17 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    cost = new javax.swing.JTextField();
    no = new javax.swing.JTextField();
    jLabel19 = new javax.swing.JLabel();
    combo = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Update delivery");

    jScrollPane1.setViewportView(jTable1);

    jLabel2.setText("Deliveries");

    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel4.setText("Pick up Address");

    jLabel5.setText("Adrress line1:");

    jLabel6.setText("Intersection:");

    jLabel7.setText("City");

    jLabel8.setText("Zipcode:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(intersection, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jLabel4))
            .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(intersection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel3.setText("Address:");

    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel9.setText("Delivery Address");

    jLabel10.setText("Adrress line1:");

    jLabel11.setText("Intersection:");

    jLabel12.setText("City");

    jLabel13.setText("Zipcode:");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(zipcode1)
                        .addComponent(city1)
                        .addComponent(intersection1)
                        .addComponent(address1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
            .addGap(51, 51, 51))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(intersection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(zipcode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(14, Short.MAX_VALUE))
    );

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel4.setForeground(new java.awt.Color(255, 255, 255));

    jLabel14.setBackground(new java.awt.Color(204, 204, 204));
    jLabel14.setText("Deliver status");

   

    jTextField2.setBackground(new java.awt.Color(244, 244, 244));

    jLabel15.setText("Exp. Delivery time");

    jLabel20.setText("Act. Delivery time");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2)
                    .addComponent(deliveryStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel20)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(13, 13, 13)
            .addComponent(deliveryStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel15)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(19, Short.MAX_VALUE))
    );

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
    jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel16.setBackground(new java.awt.Color(204, 204, 204));
    jLabel16.setText("Comments");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jTextField1)
            .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 24, Short.MAX_VALUE))
    );

    finalOk.setText("Ok");

    finalCancel.setText("Cancel");

    jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel17.setText("Cost per package:");

    jLabel18.setText("Total no of packages:");

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel18)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addComponent(jLabel17)
                    .addGap(26, 26, 26)))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(cost, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addComponent(no))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17)
                .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel18)
                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(16, Short.MAX_VALUE))
    );

    jLabel19.setText("Driver:");

   

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(finalOk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(1, 1, 1)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(finalCancel)))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(166, 166, 166)
                    .addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(17, 17, 17)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel19)
                .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(finalOk)
                .addComponent(finalCancel))
            .addContainerGap())
    );

       

        deliveryStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending Collection", "Intransit", "Delivered"}));

        int counter = 0;
        if("Pending Collection".equals(ManageTickets.data.get(id)[12]))
        {
        	counter = 0;
        }
        else if("Intransit".equals(ManageTickets.data.get(id)[12]))
        {
        	counter = 1;
        }
        else
        {
        	counter = 2;
        }
        
        deliveryStatus.setSelectedIndex(counter);
      

        String col[] = {"Parcels", "From", "To", "Status"};

        this.tableModel = new MyDefaultTableModel(col, 0);

        for (int i = 0; i < ManageTickets.data.size(); i++) {
           if(ManageTickets.data.get(id)[1].equals(ManageTickets.data.get(i)[1]))
           {
        	   Object obj[] = {ManageTickets.data.get(i)[14], ManageTickets.data.get(i)[2],
                       ManageTickets.data.get(i)[6], ManageTickets.data.get(i)[12]};
                   this.tableModel.addRow(obj);
           }
            
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
                System.out.println(Ticket.this.jTable1.getSelectedRow());
                Ticket.this.selctedRow = Ticket.this.jTable1.getSelectedRow();
// show data


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
        

       

       
        this.finalOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                finalOkActionPerformed(evt, action, id);
            }
        });

        this.finalCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                finalCancelActionPerformed(evt, action);
            }
        });


        {
            this.address.setText(ManageTickets.data.get(id)[2]);
            this.intersection.setText(ManageTickets.data.get(id)[3]);
            this.city.setText(ManageTickets.data.get(id)[4]);
            this.zipcode.setText(ManageTickets.data.get(id)[5]);
            
            this.address.setEditable(false);
            this.intersection.setEditable(false);
            this.city.setEditable(false);
            this.zipcode.setEditable(false);
            
            this.address1.setEditable(false);
            this.intersection1.setEditable(false);
            this.city1.setEditable(false);
            this.zipcode1.setEditable(false);
            
            
            for(String data[]:ManageTickets.data)
            {
            	for(String t:data)
            	{
            		System.out.println(t);
            	}
            }
            

            this.address1.setText(ManageTickets.data.get(id)[6]);
            this.intersection1.setText(ManageTickets.data.get(id)[7]);
            this.city1.setText(ManageTickets.data.get(id)[8]);
            this.zipcode1.setText(ManageTickets.data.get(id)[9]);

            this.jTextField2.setText(ManageTickets.data.get(id)[12]);
            this.jTextField2.setEditable(false);
            this.jTextField1.setText(ManageTickets.data.get(id)[16].trim());
            this.jTextField3.setText(ManageTickets.data.get(id)[17].trim());
            
            this.cost.setText(ManageTickets.data.get(id)[15]);
System.out.println("time: "+ ManageTickets.data.get(id)[11]);
            time.setText(ManageTickets.data.get(id)[11]);
            time.setEditable(false);
            
            no.setText(ManageTickets.data.get(id)[14]);
            
            no.setEditable(false);


        }
        
        if(ManageTickets.data.get(id)[13].isEmpty() || ManageTickets.data.get(id)[13].trim().equals(""))
        {
        	 for (int i = 0; i < ManageEmployees.driverData.size(); i++) {
                 if (ManageEmployees.driverData.get(i)[2].equals("available")) {
                     this.combo.addItem(ManageEmployees.driverData.get(i)[1]);
                 }
             }
        }
        else
        {
        	for (int i = 0; i < ManageEmployees.driverData.size(); i++) {
               
                if (ManageEmployees.driverData.get(i)[0].equals(ManageTickets.data.get(id)[13])) {
                	this.combo.addItem(ManageEmployees.driverData.get(i)[1]);
                    this.combo.setEditable(false);
                    break;
                }
            }
        }
        
       


        cost.setEditable(false);
        // cost per package textbox needs to be set uneditable
        pack();
        setVisible(true);


    }

    public void showAddScreen(final String action) {

    	jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        intersection = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        zipcode = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        address1 = new javax.swing.JTextField();
        intersection1 = new javax.swing.JTextField();
        city1 = new javax.swing.JTextField();
        zipcode1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pickupTime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        packages = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pickup = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        drop = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        deliveryTime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add delivery");

        jLabel2.setText("Pick up Client:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Pick up Address");

        jLabel5.setText("Adrress line1:");

        jLabel6.setText("Intersection:");

        jLabel7.setText("City");

        jLabel8.setText("Zipcode:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intersection, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(intersection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Delivery Address");

        jLabel10.setText("Adrress line1:");

        jLabel11.setText("Intersection:");

        jLabel12.setText("City");

        jLabel13.setText("Zipcode:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intersection1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(city1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(zipcode1))))
                .addGap(223, 223, 223))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(intersection1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(zipcode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setText("Pickup Time:");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt,action);
            }
        });

        jButton2.setText("Get Directions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        packages.setText("1");

        jLabel17.setText("No of packages");

      

        jLabel18.setText("Delivery Client");

       

        jLabel3.setText("Delivery Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel3))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(packages, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addComponent(deliveryTime, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(drop, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(drop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pickupTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(deliveryTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(packages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );
        
        address.setEditable(false);
        city.setEditable(false);
        zipcode.setEditable(false);
        intersection.setEditable(false);
        
        address1.setEditable(false);
        city1.setEditable(false);
        zipcode1.setEditable(false);
        intersection1.setEditable(false);
        
this.pickup.addItemListener(new ItemListener() {
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		if (event.getStateChange() == ItemEvent.SELECTED) {
	          Object item = event.getItem();
	          for (int i = 0; i < ManageClients.data.size(); i++) {
                  System.out.println("test: " + ManageClients.data.get(i)[1]);
                  System.out.println((ManageClients.data.get(i)[1])
                      .equalsIgnoreCase((String)item));
                  if ((ManageClients.data.get(i)[1])
                      .equalsIgnoreCase((String)item)) {
                      Ticket.this.address.setText(ManageClients.data.get(i)[4]+" "+ManageClients.data.get(i)[5]);
                      Ticket.this.city.setText(ManageClients.data.get(i)[6]);
                      Ticket.this.zipcode.setText(ManageClients.data.get(i)[7]);
                      Ticket.this.intersection.setText(""+ManageClients.data.get(i)[5].charAt(0) + ManageClients.data.get(i)[4].charAt(0));
                  }
              }     
	       }
	}
}); 


for (int i = 0; i < ManageClients.data.size(); i++) {
    if (ManageClients.data.get(i)[8].equals("Active")) {
        this.pickup.addItem(ManageClients.data.get(i)[1]);
    }
}

for (int i = 0; i < ManageClients.data.size(); i++) {
    if (ManageClients.data.get(i)[8].equals("Active")) {
        this.drop.addItem(ManageClients.data.get(i)[1]);
    }
}
       

this.drop.addItemListener(new ItemListener() {
	
	@Override
	public void itemStateChanged(ItemEvent event) {
		if (event.getStateChange() == ItemEvent.SELECTED) {
	          Object item = event.getItem();
	          for (int i = 0; i < ManageClients.data.size(); i++) {
                  System.out.println("test: " + ManageClients.data.get(i)[1]);
                  System.out.println((ManageClients.data.get(i)[1])
                      .equalsIgnoreCase((String)item));
                  if ((ManageClients.data.get(i)[1])
                      .equalsIgnoreCase((String)item)) {
                      Ticket.this.address1.setText(ManageClients.data.get(i)[4]+" "+ManageClients.data.get(i)[5]);
                      Ticket.this.city1.setText(ManageClients.data.get(i)[6]);
                      Ticket.this.zipcode1.setText(ManageClients.data.get(i)[7]);
                      Ticket.this.intersection1.setText(""+ManageClients.data.get(i)[5].charAt(0) + ManageClients.data.get(i)[4].charAt(0));
                  }
              }     
	       }
	}
});  

packages.setEditable(false);
deliveryTime.setEditable(false);
        


        pack();
        setVisible(true);
    }// </editor-fold>

    private void jButton1ActionPerformed(final java.awt.event.ActionEvent evt, final String action) {
    	
     	boolean flag = true;
      	 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
      	 try {

              formatter.parse(pickupTime.getText());
             
            
              

           } catch (Exception e) {
               //e.printStackTrace();
               flag = false;
               JOptionPane.showMessageDialog(this, "Incorrect from pickup time enter in MM/dd/yyyy HH:mm format", "Error", JOptionPane.ERROR_MESSAGE);
           }
      	
       	
       	if(flag)
       	{
    	
    	

        int id = ManageTickets.data.size() + 1;
/*        String selected = null;
        if (this.jCheckBox1.isSelected()) {
            selected = "1";
        } else {
            selected = "2";
        }*/


  /*      String driverId = "";
        for (int i = 0; i < ManageEmployees.driverData.size(); i++) {
            if (ManageEmployees.driverData.get(i)[1].equals((String) this.driver.getSelectedItem())) {
                ManageEmployees.driverData.get(i)[2] = "unavailable";
                driverId = ManageEmployees.driverData.get(i)[0];
                ManageEmployees.updateDataDriver();
                break;
            }
        }*/
        
        if(((String)pickup.getSelectedItem()).equals((String)drop.getSelectedItem()))
        {
        	 JOptionPane.showMessageDialog(this, "PickUp address and drop address can't be same", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {

        String temp[] = {"" + id, (String)this.pickup.getSelectedItem(), this.address.getText(), this.intersection.getText(), this.city.getText(),
            this.zipcode.getText(), this.address1.getText(), this.intersection1.getText(), this.city1.getText(),
            this.zipcode1.getText(), this.pickupTime.getText(), dateText, "Pending Collection", " ",
            this.packages.getText(), ""+costPerParcel, " ", " "};
        ManageTickets.data.add(temp);
        ManageTickets.updateData();

        // SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MMM/yyyy hh:mm");

        

        this.dispose();
        if (action.equals("Admin")) {
            Admin admin = new Admin();
            admin.showTickets();
        } else {
            new HomePage().showTicketScreen();
        }

        }
       	}
    }

    private void jButton2ActionPerformed(final java.awt.event.ActionEvent evt) {
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        Date date = null;
boolean flag = true;
        try {

             date = formatter.parse(this.pickupTime.getText());
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (Exception e) {
            //e.printStackTrace();
        	flag = false;
        	JOptionPane.showMessageDialog(this, "Incorrect from pickup time enter in MM/dd/yyyy HH:mm format", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(flag)
        {
    	String pickup = calculateDistance.cal.calculate("D4",intersection.getText());
    	String delivery = calculateDistance.cal.calculate(intersection.getText(),intersection1.getText());
    	String office = calculateDistance.cal.calculate(intersection1.getText(),"D4");
    	
    	new Directions().showDirections(pickup, delivery,office,intersection.getText(),intersection1.getText());
    //	cost Calculation and updation
    	String block1[] = pickup.split("-->");
    	String block2[] = delivery.split("-->");
    	
    	int blocks = block1.length + block2.length -2;
    	
    	int cost = (2*blocks) + 10;
    	
    	int parcels = Integer.parseInt(this.packages.getText());
    	
    	int totalCost = cost + parcels;
    	

    	
    	DeliveryTime = 5*blocks*60000l;
    	
    	
    	
    	Date date1=new Date(date.getTime() + DeliveryTime);
        SimpleDateFormat df2 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
       dateText = df2.format(date1);
    	
    	
    	this.deliveryTime.setText(""+dateText);
    	
    	costPerParcel = cost;
        }
    }


    private void finalOkActionPerformed(final java.awt.event.ActionEvent evt, final String action, final int id) {
    	
    	

    	boolean flag1 = true;
   	 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
   	 try {

           formatter.parse(jTextField3.getText());
          
         
           

        } catch (Exception e) {
            //e.printStackTrace();
            flag1 = false;
            JOptionPane.showMessageDialog(this, "Incorrect from drop time enter in MM/dd/yyyy HH:mm format", "Error", JOptionPane.ERROR_MESSAGE);
        }
   	
    	
    	if(flag1)
    	{
        // anish

        /*ManageTickets.data.get(id)[2] = this.address.getText();
        ManageTickets.data.get(id)[3] = this.intersection.getText();
        ManageTickets.data.get(id)[4] = this.city.getText();
        ManageTickets.data.get(id)[5] = this.zipcode.getText();
        ManageTickets.data.get(id)[6] = this.address1.getText();
        ManageTickets.data.get(id)[7] = this.intersection1.getText();
        ManageTickets.data.get(id)[8] = this.city1.getText();
        ManageTickets.data.get(id)[9] = this.zipcode1.getText();*/
    	
    	boolean flag = ManageTickets.data.get(id)[12].equals("Delivered");
 
        ManageTickets.data.get(id)[12] = (String)deliveryStatus.getSelectedItem();// 12- combo value
        
        
        String driverId = "";
        for (int i = 0; i < ManageEmployees.driverData.size(); i++) {
            if (ManageEmployees.driverData.get(i)[1].equals((String) this.combo.getSelectedItem())) {
                ManageEmployees.driverData.get(i)[2] = "unavailable";
                driverId = ManageEmployees.driverData.get(i)[0];
                ManageEmployees.updateDataDriver();
                break;
            }
        }
        
        
        ManageTickets.data.get(id)[13] = driverId;
        ManageTickets.data.get(id)[16] = jTextField1.getText();// 16-- comments
        ManageTickets.data.get(id)[17]=jTextField3.getText();// 17 -- delivered time
        ManageTickets.updateData();
        
        
        
       boolean flag5 = true;
        
        if(ManageTickets.data.get(id)[12].equals("Delivered")  && !flag)
        {
        	 String dates = "";
             try {
            	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
             Date date = new Date();
             dates = dateFormat.format(date); //2016/11/16 12:08:43
             } 
             catch (Exception e) {
                 e.printStackTrace();
             }
             String id1 = ""+(GenerateInvoice.data.size()+1);
             String temp1[] = {id1,ManageTickets.data.get(id)[1],ManageTickets.data.get(id)[6]+" "+ ManageTickets.data.get(id)[8]+" "+ ManageTickets.data.get(id)[9],dates,""+ManageTickets.data.get(id)[0]};
             
           for(String temp2[]:GenerateInvoice.data)
           {
        	   if(temp2[4].equals(ManageTickets.data.get(id)[0]))
        	   {
        		   flag5 = false;
        	   }
           }
             
             if(flag5)
             {
            	 GenerateInvoice.data.add(temp1);
                 new GenerateInvoice(1).updateData();
             }
            
             
             for (int i = 0; i < ManageEmployees.driverData.size(); i++) {
                 if (ManageEmployees.driverData.get(i)[1].equals((String) this.combo.getSelectedItem())) {
                     ManageEmployees.driverData.get(i)[2] = "available";
                     driverId = ManageEmployees.driverData.get(i)[0];
                     ManageEmployees.updateDataDriver();
                     break;
                 }
             }
             
       	 
        }
       
      
        
        
        
        
        this.dispose();
        if (action.equals("Admin")) {
            Admin admin = new Admin();
            admin.showTickets();
        } else {
            new HomePage().showTicketScreen();
        }
    	}
    }

    private void finalCancelActionPerformed(final java.awt.event.ActionEvent evt, final String action) {
        this.dispose();
        if (action.equals("Admin")) {
            Admin admin = new Admin();
            admin.showTickets();
        } else {
            new HomePage().showTicketScreen();
        }
    }


    public void showDeleteScreen(final int id) {

    }
    
    
    public void showOnlyData()
    {
    	
    }
    
    
    
    private javax.swing.JTextField address;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField city;
    private javax.swing.JTextField city1;
    private javax.swing.JTextField deliveryTime;
    private javax.swing.JComboBox<String> drop;
    private javax.swing.JTextField intersection;
    private javax.swing.JTextField intersection1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField packages;
    private javax.swing.JComboBox<String> pickup;
    private javax.swing.JTextField pickupTime;
    private javax.swing.JTextField zipcode;
    private javax.swing.JTextField zipcode1;
    


    // Variables declaration - do not modify
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Ok;

   


    private javax.swing.JTextField cost;
    private javax.swing.JComboBox<String> deliveryStatus;
    private javax.swing.JButton finalCancel;
    private javax.swing.JButton finalOk;

    private javax.swing.JComboBox<String> combo;

    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;

    private javax.swing.JLabel jLabel19;

    private javax.swing.JLabel jLabel20;

    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField no;
    private javax.swing.JTextField time;

    
    MyDefaultTableModel tableModel;
}
