package DataStructure;

import javax.swing.*;    
public class TableExample {    
    JFrame f;    
    TableExample(){    
    f=new JFrame();    
    String data[][]={ {"09:00-09:50","","","","",""},    
                          {"10:00-10:50","","","","",""},    
                          {"11:00-11:50","","","","",""},
                          {"12:00-12:50","","","","",""},    
                          {"13:00-13:50","","","","",""},    
                          {"14:00-14:50","","","","",""},    
                          {"15:00-15:50","","","","",""},    
                          {"16:00-16:50","","","","",""},    
                          {"17:00-17:50","","","","",""}};    
    String column[]={"hours","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRİDAY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(0,0,2000,2000);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(800,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new TableExample();    
}    
} 
