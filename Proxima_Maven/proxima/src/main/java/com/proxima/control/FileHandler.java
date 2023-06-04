package com.proxima.control;

import java.io.File;
import java.util.ArrayList;

//import java.io.*;
//import java.util.Scanner; //TODO remove if unused. Might not need it.
//import java.util.List;
//import javax.xml.XMLConstants;
//import javax.xml.parsers.*;

import com.proxima.model.*;

//JAXB IMPORTS
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;



public class FileHandler {
    private static String driversFilePath = "Test_Files/Drivers.xml" ;
    private static String hiresFilePath = "Test_Files/Hires.xml" ;
    private static String mapFilePath;

    private JAXBContext context;
    private Marshaller marshall;
    private Unmarshaller unmarshall;
  
    private DriverOrganiser driverOrganiser;
    
    private ArrayList<Driver> drivers;




//driver O
    public void driverOrganiserMarshall(DriverOrganiser d)
    {
        context = null;

        try{
            context  = JAXBContext.newInstance(DriverOrganiser.class);
            marshall = context.createMarshaller();
            marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            File file = new File(driversFilePath);

            marshall.marshal(d, file);


        }catch (JAXBException e)
        {
            e.printStackTrace();

        }


    }

    public void driverUnMarshall()
    {
        context = null;
      
        try {
    context = JAXBContext.newInstance();

          File file = new File(driversFilePath);

          unmarshall = context.createUnmarshaller();


         //DriverOrganiser o = (DriverOrganiser) unmarshall.unmarshal(file);

          //System.out.println(o);

      } catch (JAXBException e) {
          e.printStackTrace();
      }

    }
	

}
