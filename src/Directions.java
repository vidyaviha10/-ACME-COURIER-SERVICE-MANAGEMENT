import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JTextArea;



public class Directions  extends javax.swing.JFrame  {
	
	String previous="";
	final static String newline = System.getProperty("line.separator");
	
	public void showDirections(String pickup,String delivery,String office,String pickupaddress,String deliveryAddress){
		jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Done = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Directions");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel2.setText("Pick up");

        jLabel3.setText("Delivery");

        print.setText("Print");

        jLabel4.setText("Return");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 382, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(print)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Done))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Done)
                    .addComponent(print))
                .addContainerGap())
        );

        pack();
        
        String[] pickupDirections = pickup.split("-->");
        

        
        for(int i =0;i<pickupDirections.length;i++)
        {
        	if(i>1)
        	{
        		//
        		
        		jTextArea1.append(findDirection(pickupDirections[i-1],pickupDirections[i])+System.getProperty("line.separator"));
        	}
        	else if(i>0)
        	{
        		jTextArea1.append("From intersetion "+pickupDirections[0]+" goto intersection "+pickupDirections[1]+newline);
        		findDirection(pickupDirections[i-1],pickupDirections[i]);
        	}
        }
        
        previous = "";
        
  String[] dropDirections = delivery.split("-->");
        

        
        for(int i =0;i<dropDirections.length;i++)
        {
        	if(i>1)
        	{
        		jTextArea2.append(findDirection(dropDirections[i-1],dropDirections[i])+newline);
        	}
        	else if(i>0)
        	{
        		jTextArea2.append("From intersetion "+dropDirections[0]+" goto intersection "+dropDirections[1]+newline);
        		findDirection(dropDirections[i-1],dropDirections[i]);
        	}
        }
        
        previous = "";
        
  String[] officeDirections = office.split("-->");
        

        
        for(int i =0;i<officeDirections.length;i++)
        {
        	if(i>1)
        	{
        		jTextArea3.append(findDirection(officeDirections[i-1],officeDirections[i])+newline);
        	}
        	else if(i>0)
        	{
        		jTextArea3.append("From intersetion "+officeDirections[0]+" goto intersection "+officeDirections[1]+newline);
        		findDirection(officeDirections[i-1],officeDirections[i]);
        	}
        }

        
        setVisible(true);
	}
	
	 private void DoneActionPerformed(java.awt.event.ActionEvent evt) {                                     
	      this.dispose();
	    } 
	 
	 private void  printActionPerformed(java.awt.event.ActionEvent evt) {    
		 try {
			 System.out.println("inside print action");
			 StringBuilder sb = new StringBuilder();
			 sb.append("Pickup Directions: "+jTextArea1.getText());
			 sb.append(newline);
			 sb.append("Drop Directions: "+jTextArea2.getText());
			 sb.append(newline);
			 sb.append("Office Directions: "+jTextArea3.getText());
			 jTextArea4 = new JTextArea();
			 jTextArea4.append(sb.toString());
			 //PrintSupport.printComponent(jTextArea4);
			 
			boolean flag =  jTextArea4.print();
			System.out.println(flag);
			if(!flag)
			{
				SaveAs();
			}
	        } catch (Exception pe) {
	        	System.out.println("2222");
	          System.out.println("Error printing: " + pe.getMessage());
	          System.out.println("calling saveas");
	          SaveAs();
	        }
		 
	    } 
	 
	 public void SaveAs() {
System.out.println("inside save as");
	      final JFileChooser SaveAs = new JFileChooser();
	      SaveAs.setApproveButtonText("Save");
	      int actionDialog = SaveAs.showOpenDialog(this);
	      if (actionDialog != JFileChooser.APPROVE_OPTION) {
	         return;
	      }

	      File fileName = new File(SaveAs.getSelectedFile() + ".txt");
	      BufferedWriter outFile = null;
	      try {
	         outFile = new BufferedWriter(new FileWriter(fileName));

	         jTextArea4.write(outFile);   // *** here: ***

	      } catch (IOException ex) {
	         ex.printStackTrace();
	      } finally {
	         if (outFile != null) {
	            try {
	               outFile.close();
	            } catch (IOException e) {
	               // one of the few times that I think that it's OK
	               // to leave this blank
	            }
	         }
	      }
	   }
	 
	 private String findDirection(String loc1, String loc2)
	 {
		 if(loc1.charAt(0) == loc2.charAt(0))
		 {
			 //System.out.println("inside 1 previous: "+previous);
			 if(loc1.charAt(1) < loc2.charAt(1))
			 {
				 previous = "down";
			 }
			 else
			 {
				 previous = "up";
			 }
			 
			 return "Continue on "+(loc1.charAt(0)+"").toUpperCase()+" street upto intersection "+loc2;
			
		 }
		 else if(loc1.charAt(0) > loc2.charAt(0))
		 {
			 //System.out.println("inside 2 previous: "+previous);
			 if(previous.equals("up"))
			 {
				 previous = "right";
				 return "turn right to intersection "+loc2;
			 }
			 else if(previous.equals("down"))
			 {
				 previous = "left";
				 return "turn left to intersection "+loc2;
			 }
			 else if(previous.equals("straight"))
			 {
				 return "continue straight towards "+loc2;
			 }
			 else
			 {
				 previous = "straight";
				 return "move straight towards "+loc2;
			 }
		 }
		 
		 else
		 {
			 //System.out.println("inside 3 previous: "+previous);
			 
			 if(previous.equals("up"))
			 {
				 previous="left";
				 return "turn left to intersection "+loc2;
			 }
			 else if(previous.equals("down"))
			 {
				 previous = "right";
				 return "turn right to intersection "+loc2;
			 }
			 else if(previous.equals("straight"))
			 {
				 return "continue straight towards "+loc2;
			 }
			 else
			 {
				 previous = "straight";
				 return "move straight towards "+loc2;
			 }
		 }
		 

	 }

	
    private javax.swing.JButton Done;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton print;
}
