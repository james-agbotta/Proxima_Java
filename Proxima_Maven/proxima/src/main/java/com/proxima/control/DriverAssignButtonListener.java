package com.proxima.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JList;
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
        System.out.println(i+" done");
        }


    }

    public Driver nearestDriver(Street query)
    {
        Driver foundDriver = drivers[0];


        ArrayList<Street[]> paths = new ArrayList<Street[]>();
        for(Street street: driverStreets)
        {
            paths.add(map.getPath(query,street ));

        }
        
 
        return foundDriver;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // TODO Auto-generated method stub

        populateDriverStreets();
        currentIndex = hireList.getSelectedIndex();
        Hire currentHire = dispatch.getHiresData()[currentIndex];
        int pickupStreetIndex= dispatch.getMap().findIndex(currentHire.getCurrentStreet());
        Street pickStreet =dispatch.getMap().getStreet(pickupStreetIndex);
        System.out.println("\n\npickStreet "+ pickStreet.toString());
        dispatch.getHiresData()[currentIndex].setChosenDriver(nearestDriver(pickStreet));

textBox.setText("" + currentHire.getName() + ",  \nPhoneNumber: " + currentHire.getPhoneNumber()
                + "\nCurrent Location: " + currentHire.getCurrentStreet()+"\nChosen Driver: "+currentHire.getChosenDriver().toString());
        

    }

    @Override
    public void valueChanged(ListSelectionEvent listEvent) {
        // currentIndex= listEvent.getLastIndex();//TODO fix
        currentIndex = hireList.getSelectedIndex();
        Hire currentHire = dispatch.getHiresData()[currentIndex];
        textBox.setText("" + currentHire.getName() + ",  \nPhoneNumber: " + currentHire.getPhoneNumber()
                + "\nCurrent Location: " + currentHire.getCurrentStreet()+"\nChosen Driver: "+currentHire.getChosenDriver().toString());
    }

}
