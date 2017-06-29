/*
 * COPYRIGHT. HSBC HOLDINGS PLC 2017. ALL RIGHTS RESERVED.
 *
 * This software is only to be used for the purpose for which it has been
 * provided. No part of it is to be reproduced, disassembled, transmitted,
 * stored in a retrieval system nor translated in any human or computer
 * language in any way or for any other purposes whatsoever without the prior
 * written consent of HSBC Holdings plc.
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import jdk.management.resource.internal.TotalResourceContext;

/**
 * <p>
 * <b> TODO : Insert description of the class's responsibility/role. </b>
 * </p>
 */
public class ReportsData {

    public ArrayList<String[]> getInvoiceReportsData(String from, String to) {
    	
    	  SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
         // SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy hh:mm");

          Date fromdate = null;
          Date todate = null;
          try {

              fromdate = formatter.parse(from);
              System.out.println(fromdate);
              System.out.println(formatter.format(fromdate));

              todate = formatter.parse(to);
              System.out.println(todate);
              System.out.println(formatter.format(todate));

          } catch (Exception e) {
              e.printStackTrace();
          }

        ArrayList<String[]> data = new ArrayList<>();

        for (String temp[] : GenerateInvoice.data) {
        	Date dateToCheck = null;
            String pickClientName = temp[1];
            String pickAddress = "";
            String email = "";
            String no = "";
            String date = temp[3];
            String cost = "";
            
            try {

                dateToCheck = formatter.parse(temp[3]);
                System.out.println(dateToCheck);
                System.out.println(formatter.format(dateToCheck));

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("result "+((dateToCheck.after(fromdate) && dateToCheck.before(todate)) || dateToCheck.compareTo(fromdate)==0 || dateToCheck.compareTo(todate)==0));
            if ((dateToCheck.after(fromdate) && dateToCheck.before(todate)) || dateToCheck.compareTo(fromdate)==0 || dateToCheck.compareTo(todate)==0) 
            {
            	String deliveryAddress = temp[2];

                for (String temp1[] : ManageClients.data) {
                    if (temp1[1].equals(pickClientName)) {
                        email = temp1[2];
                        no = temp1[3];
                        pickAddress = temp1[4] + " " + temp1[5] + " " + temp1[6]+ " " + temp1[7];
                    }


                }

                for (String temp1[] : ManageTickets.data) {
                    if (temp1[0].equals(temp[4])) {
                        cost = temp1[15];
                    }


                }


                String tempData[] = {temp[0], pickClientName, pickAddress,deliveryAddress,cost, email, no, temp[4],date};
                data.add(tempData);
            }
            
        }

return data;
    }

    public ArrayList<String[]> generateBonusReport(final String from, final String to) {

        Map<String, Integer> bonus = new HashMap<>();

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
       
        Date fromdate = null;
        Date todate = null;
        try {

            fromdate = formatter.parse(from);
            System.out.println(fromdate);
            System.out.println(formatter.format(fromdate));

            todate = formatter.parse(to);
            System.out.println(todate);
            System.out.println(formatter.format(todate));

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String temp1[] : GenerateInvoice.data) {

            Date dateToCheck = null;

            Date dropTime = null;
            Date actualdroptime = null;
            try {

                dateToCheck = formatter.parse(temp1[3]);
                System.out.println("tocheck: " +dateToCheck);
                System.out.println(formatter.format(dateToCheck));

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("result "+((dateToCheck.after(fromdate) && dateToCheck.before(todate)) || dateToCheck.compareTo(fromdate)==0 || dateToCheck.compareTo(todate)==0));
            
            if ((dateToCheck.after(fromdate) && dateToCheck.before(todate)) || dateToCheck.compareTo(fromdate)==0 || dateToCheck.compareTo(todate)==0) {

                for (String temp[] : ManageTickets.data) {
                    if (temp[0].equals(temp1[4])) {

                        try {

                            dropTime = formatter1.parse(temp[11]);
                            System.out.println(dropTime);
                            System.out.println(formatter1.format(dropTime));

                            actualdroptime = formatter1.parse(temp[17]);
                            System.out.println(actualdroptime);
                            System.out.println(formatter1.format(actualdroptime));

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
System.out.println("difference: "+(actualdroptime.getTime() - dropTime.getTime()));
                        if ( dropTime.getTime() - actualdroptime.getTime() > 0) {
                            String driverId = temp[13];

                            if (bonus.get(driverId) == null) {

                                bonus.put(driverId, 2);
                            } else {
                                bonus.put(driverId, bonus.get(driverId) + 2);
                            }
                        }


                    }

                }


            }

        }

        ArrayList<String[]> data = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : bonus.entrySet()) {
            for (String t[] : ManageEmployees.data) {
                if (entry.getKey().equals(t[0])) {
                    String tt[] = {t[0], t[2] + " " + t[1], "" + entry.getValue()};
                    data.add(tt);
                }
            }
        }
        
        return data;

    }

    public ArrayList<String[]> RevenueReport(final String from, final String to) {
    	 ArrayList<String[]> data = new ArrayList<>();
        Map<String, Integer> bonus = new HashMap<>();
 SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        
        SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        int totalrevue = 0;
        Date fromdate = null;
        Date todate = null;
        try {

            fromdate = formatter.parse(from);
            System.out.println(fromdate);
            System.out.println(formatter.format(fromdate));

            todate = formatter.parse(to);
            System.out.println(todate);
            System.out.println(formatter.format(todate));

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(String temp1[] : GenerateInvoice.data)
        {


            Date dateToCheck = null;

            Date dropTime = null;
            Date actualdroptime = null;
            try {

                dateToCheck = formatter.parse(temp1[3]);
                System.out.println("tocheck: " +dateToCheck);
                System.out.println(formatter.format(dateToCheck));

            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("result "+((dateToCheck.after(fromdate) && dateToCheck.before(todate)) || dateToCheck.compareTo(fromdate)==0 || dateToCheck.compareTo(todate)==0));
            
            if ((dateToCheck.after(fromdate) && dateToCheck.before(todate)) || dateToCheck.compareTo(fromdate)==0 || dateToCheck.compareTo(todate)==0) {

                for (String temp[] : ManageTickets.data) {
                    if (temp[0].equals(temp1[4])) {

                        try {
                        	  String tt1[] = {temp[0], temp[1],temp1[3], "" +temp[15]};
                        	data.add(tt1);
                        	totalrevue = totalrevue+ Integer.parseInt(temp[15]);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                       




                    }

                }


            }

        
        }
        
       
        String tt[] = {"" +totalrevue};
        data.add(tt);
        
        return data;
    }

}
