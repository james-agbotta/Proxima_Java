package com.proxima.control;

import java.io.File;

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
    private String driversFilePath;
    private String hiresFilePath;
    private String mapFilePath;

    private JAXBContext context;
    private Marshaller marshall;
    private Unmarshaller unmarshall;
    private DriverOrganiser driverList;





    public void driverMarshall(DriverOrganiser d)
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
        
    }
	

}
