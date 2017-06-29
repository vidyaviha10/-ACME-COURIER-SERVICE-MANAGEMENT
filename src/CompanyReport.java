import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import utils.MyDefaultTableModel;
import utils.ReportsData;

public class CompanyReport extends javax.swing.JFrame {
	 ArrayList<String[]> data = null;
    /**
     * Creates new form CompanyReport
     */
    public CompanyReport() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        fromDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        toDate = new javax.swing.JTextField();
        get = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("From date");

        jLabel3.setText("To date");

        get.setText("Get");
        get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	getActionPerformed(evt,fromDate.getText(),toDate.getText());
            }
        });

        jLabel1.setText("Company Report");

        jLabel4.setText("Total Revenue");

        String col[] = {"Ticket Id", "Client","Invoice Date", "Revenue"};
        this.tableModel = new MyDefaultTableModel(col, 0);
        this.jTable1.setModel(this.tableModel);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(get))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(get)
                    .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );

        pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }// </editor-fold>                        

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
    	 data = new ReportsData().RevenueReport(from, to);
    	 String col[] = {"Ticket Id", "Client","Invoice Date", "Revenue"};
       	 tableModel = new MyDefaultTableModel(col, 0);
       	 int count = 0;
       	 int length = data.size();
       	 
       	 for(int i = 0;i<=length -2;i++)
       	 {
       		tableModel.addRow(data.get(i));
       	 }

       	if(length !=0)
       	{
       	jTextField1.setText(""+data.get(data.size()-1)[0]);
       	}
       	CompanyReport.this.jTable1.setModel(CompanyReport.this.tableModel);
       	CompanyReport.this.jTable1.repaint();
    	}
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
    		this.jTable1.print();
    		
    		
    	} catch (PrinterException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	 this.dispose();
    }                                        


    
	 

    MyDefaultTableModel tableModel;
    // Variables declaration - do not modify                     
    private javax.swing.JTextField fromDate;
    private javax.swing.JButton get;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField toDate;
    // End of variables declaration                   
}
