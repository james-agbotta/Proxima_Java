package com.proxima.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.proxima.model.*;

public class DriverAssignButtonListener implements ActionListener, ListSelectionListener {

    private JTextArea textBox;

    private Dispatch dispatch;

    private JList<String> hireList;

    private int currentIndex;

    private Street[] driverStreets;
    private  Driver[] drivers;
    private StreetOrganiser map;
    private ArrayList<Street> finalPath;

    public DriverAssignButtonListener(JTextArea text, Dispatch d, JList<String> hires) {
        textBox = text;
        dispatch = d;
        hireList = hires;
        currentIndex = 0;
        drivers = dispatch.getDriverOrganiser().toArray();
        map = dispatch.getMap();
        driverStreets = new Street[map.size()];

    

    }

    public JTextArea getTextBox() {
        return textBox;
    }

    public void setTextBox(JTextArea textBox) {
        this.textBox = textBox;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }

    public JList<String> getHireList() {
        return hireList;
    }

    public void setHireList(JList<String> hireList) {
        this.hireList = hireList;
    }


    public void populateDriverStreets()
    {
 
        driverStreets = new Street[drivers.length];
        for(int i =0; i < drivers.length; i++)
        {   
            driverStreets[i] = map.getStreet(map.findIndex(drivers[i].getCurrentStreet()));
        }


    }

    public Driver nearestDriver(Street query)
    {

        Driver foundDriver = drivers[0];

try{
        ArrayList<ArrayList<Street>> paths = new ArrayList<ArrayList<Street>>();
        for(int i =0 ; i < driverStreets.length; i++)
        {
            
            paths.add(map.getPath(query,driverStreets[i]));
            //System.out.println(i+" path value: "+ paths.get(i).length);

            

        }

        //System.out.println("DABL:Paths populated");
       
        
        for(int i =1; i < paths.size(); i++)
        {
          
            
            if(paths.get(i).size()>paths.get(i-1).size())
            {
                System.out.println(i);
                finalPath= paths.get(i);
                foundDriver= drivers[i];
                
            }


        }

    }catch(Exception e)
    {      
        //new JOptionPane("Paths not found"+ e.getMessage(), JOptionPane.ERROR_MESSAGE);
        
    System.out.println("Error" );
    e.printStackTrace();

    }
 
        return foundDriver;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // TODO Auto-generated method stub

        populateDriverStreets();
        currentIndex = hireList.getSelectedIndex();
        Hire currentHire = dispatch.getHiresData()[currentIndex];
        int pickupStreetIndex= map.findIndex(currentHire.getCurrentStreet());// Dunno why this works... Assume JList object index is odd// nevermind. it broke something else.

        Street pickStreet =map.getStreet(pickupStreetIndex);
        System.out.println(pickStreet.getClass()+"\n"+pickStreet.toString() );
        dispatch.getHiresData()[currentIndex].setChosenDriver(nearestDriver(pickStreet));
        String pathToTake="";
        
        textBox.setText("" + currentHire.getName() + ",  \nPhoneNumber: " + currentHire.getPhoneNumber()
        + "\nCurrent Location: " + currentHire.getCurrentStreet()+"\nChosen Driver: "+currentHire.getChosenDriver().toString() );
        

    }

    @Override
    public void valueChanged(ListSelectionEvent listEvent) {
        // currentIndex= listEvent.getLastIndex();//TODO fix
        currentIndex = hireList.getSelectedIndex();
        Hire currentHire = dispatch.getHiresData()[currentIndex];
        
        textBox.setText("" + currentHire.getName() + ",  \nPhoneNumber: " + currentHire.getPhoneNumber()
                + "\nCurrent Location: " + currentHire.getCurrentStreet()+"\nChosen Driver: "+currentHire.getChosenDriver().toString() );
    }

}
