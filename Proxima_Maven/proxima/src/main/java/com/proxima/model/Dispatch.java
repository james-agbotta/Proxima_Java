package com.proxima.model;

public class Dispatch {
   // TODO refactor Organisable if not needed.
   private Hire currentHire;
   private Hire frontHire;
   private StreetOrganiser map;

   // private DriverOrganiser drivers;
   private Hire[] hiresData;

   // Driver Hard coded
   // data that shouldn't belong here
   private Driver[] driversData;

   private DriverOrganiser driverOrganiser;

   // String[] driversString = new String[drivers.length];

   public DriverOrganiser getDriverOrganiser() {
      return driverOrganiser;
   }

   public void setDriverOrganiser(DriverOrganiser driverOrganiser) {
      this.driverOrganiser = driverOrganiser;
   }

   public Dispatch() {
      currentHire = null;
      frontHire = null;
      map = new StreetOrganiser();
      // drivers = new DriverOrganiser();
      initDataSet();

   }

   private void initDataSet() {
      hiresData = new Hire[5];
      hiresData[0] = new Hire("John892123456");
      hiresData[0].setName("John");
      hiresData[0].setCurrentStreet("Sauchiehall Street");
      hiresData[0].setDestination("Buchanan Street");
      hiresData[0].setPhoneNumPrefix(7892);
      hiresData[0].setPhoneNumSuffix(123456);

      hiresData[1] = new Hire("Emily973987654");
      hiresData[1].setName("Emily");
      hiresData[1].setCurrentStreet("Argyle Street");
      hiresData[1].setDestination("Bath Street");
      hiresData[1].setPhoneNumPrefix(7973);
      hiresData[1].setPhoneNumSuffix(987654);

      hiresData[2] = new Hire("James781246813");
      hiresData[2].setName("James");
      hiresData[2].setCurrentStreet("George Square");
      hiresData[2].setDestination("Queen Street");
      hiresData[2].setPhoneNumPrefix(7781);
      hiresData[2].setPhoneNumSuffix(246813);

      hiresData[3] = new Hire("Sarah55369852");
      hiresData[3].setName("Sarah");
      hiresData[3].setCurrentStreet("Clyde Street");
      hiresData[3].setDestination("Stockwell Street");
      hiresData[3].setPhoneNumPrefix(7555);
      hiresData[3].setPhoneNumSuffix(369852);

      hiresData[4] = new Hire("David444135790");
      hiresData[4].setName("David");
      hiresData[4].setCurrentStreet("Custom House Quay");
      hiresData[4].setDestination("Broomielaw");
      hiresData[4].setPhoneNumPrefix(7444);
      hiresData[4].setPhoneNumSuffix(135790);

      // Drivers' Data
      driversData = new Driver[5];

      driversData[0] = new Driver("A1");
      driversData[0].setName("John Smith");
      driversData[0].setCurrentStreet("Sauchiehall Street");
      driversData[0].setRating(4);

      driversData[1] = new Driver("B2");
      driversData[1].setName("Emily Johnson");
      driversData[1].setCurrentStreet("Buchanan Street");
      driversData[1].setRating(3);

      driversData[2] = new Driver("C3");
      driversData[2].setName("David Brown");
      driversData[2].setCurrentStreet("Argyle Street");
      driversData[2].setRating(5);
      driversData[3] = new Driver("D4");
      driversData[3].setName("Sarah Davis");
      driversData[3].setCurrentStreet("George Square");
      driversData[3].setRating(2);
      driversData[4] = new Driver("E5");
      driversData[4].setName("James Wilson");
      driversData[4].setCurrentStreet("Broomielaw");
      driversData[4].setRating(4);

      driverOrganiser = new DriverOrganiser(driversData[0]);

      driverOrganiser.add(driversData[1]);
      driverOrganiser.add(driversData[2]);
      driverOrganiser.add(driversData[3]);
      driverOrganiser.add(driversData[4]);

      // add Map data.
      map.add(new Street("Buchanan Street", "G1 3LB"));// 0
      map.add(new Street("Sauchiehall Street", "G2 3GF"));// 1
      map.add(new Street("Argyle Street", "G2 8AB"));// 2
      map.add(new Street("Union Street", "G1 3QS"));// 3
      map.add(new Street("Ingram Street", "G1 1DW"));// 4

      map.add(new Street("Renfield Street", "G2 1LP"));// 5
      map.add(new Street("Jamaica Street", "G1 4QD"));// 6
      map.add(new Street("Buchanan Street", "G2 1DU"));// 7
      map.add(new Street("West George Street", "G2 1DU"));// 8
      map.add(new Street("St. Vincent Street", "G2 5TF"));// 9

      map.add(new Street("Trongate", "G1 5ES"));// 10
      map.add(new Street("Mitchell Street", "G1 3NU"));// 11
      map.add(new Street("Stockwell Street", "G1 4LW"));// 12
      map.add(new Street("Albion Street", "G1 1RQ"));// 13
      map.add(new Street("Blackfriars Street", "G1 1PE"));// 14

      map.add(new Street("Candleriggs", "G1 1NP"));// 15
      map.add(new Street("High Street", "G1 1NL"));// 16
      map.add(new Street("Saltmarket", "G1 5NA"));// 17
      map.add(new Street("Clyde Street", "G1 4HT"));// 18
      map.add(new Street("Bell Street", "G4 0TQ"));// 19

      map.add(new Street("Bath Street", "G2 4HG"));// 20
      map.add(new Street("West Nile Street", "G1 2RL"));// 21
      map.add(new Street("Broomielaw", "G1 4PA"));// 22
      map.add(new Street("Queen Street", "G1 3DX"));// 23
      map.add(new Street("Glassford Street", "G1 1UL"));// 24

      map.add(new Street("Hope Street", "G2 2TU"));// 25
      map.add(new Street("London Road ", "G1 5NB"));// 26
      map.add(new Street("Brunswick Street", "G1 1TF,"));// 27
      map.add(new Street("Wilson Street", "G1 1SS"));// 28
      map.add(new Street("Bridgegate", "G1 5HZ"));// 29

      // Add neighbours (note the distance is set to 1/10th of a mile)

      // index 0: "Buchanan Street"
      map.addNeighbour(map.getStreet(0), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(0), map.getStreet(2), 3);
      map.addNeighbour(map.getStreet(0), map.getStreet(4), 3);
      map.addNeighbour(map.getStreet(0), map.getStreet(5), 3);
      map.addNeighbour(map.getStreet(0), map.getStreet(21), 2);
      
      // index 1: "Sauchiehall Street"
      map.addNeighbour(map.getStreet(1), map.getStreet(0), 4);
      map.addNeighbour(map.getStreet(1), map.getStreet(2), 4);
      map.addNeighbour(map.getStreet(1), map.getStreet(20), 3);
      map.addNeighbour(map.getStreet(1), map.getStreet(5), 3);
      map.addNeighbour(map.getStreet(1), map.getStreet(21), 2);
     
      // index 2: "Argyle Street"
      map.addNeighbour(map.getStreet(2), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(2), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(2), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(2), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(2), map.getStreet(1), 4);
    
      // index 3: "Union Street"
      map.addNeighbour(map.getStreet(3), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(3), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(3), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(3), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(3), map.getStreet(1), 4);
    
      // index 4: "Ingram Street"
      map.addNeighbour(map.getStreet(4), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(4), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(4), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(4), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(4), map.getStreet(1), 4);
    
      // index 5: "Renfield Street"
      map.addNeighbour(map.getStreet(5), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(5), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(5), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(5), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(5), map.getStreet(1), 4);
     
      // index 6: "Jamaica Street"
      map.addNeighbour(map.getStreet(6), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(6), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(6), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(6), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(6), map.getStreet(1), 4);
    
      // index 7: "Buchanan Street"
      map.addNeighbour(map.getStreet(7), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(7), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(7), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(7), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(7), map.getStreet(1), 4);
     
      // index 8: "West George Street""
      map.addNeighbour(map.getStreet(8), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(8), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(8), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(8), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(8), map.getStreet(1), 4);
     
      // index 9: "St. Vincent Street"
      map.addNeighbour(map.getStreet(9), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(9), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(9), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(9), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(9), map.getStreet(1), 4);
    
      // index 10: "Trongate"
      map.addNeighbour(map.getStreet(10), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(10), map.getStreet(2), 3);
      map.addNeighbour(map.getStreet(10), map.getStreet(4), 3);
      map.addNeighbour(map.getStreet(10), map.getStreet(5), 3);
      map.addNeighbour(map.getStreet(10), map.getStreet(21), 2);
    
      // index 11: "Mitchell Street"
      map.addNeighbour(map.getStreet(11), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(11), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(11), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(11), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(11), map.getStreet(1), 4);
   
      // index 12: "Stockwell Street"
      map.addNeighbour(map.getStreet(12), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(12), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(12), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(12), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(12), map.getStreet(1), 4);
     
      // index 13: "Albion Streett"
      map.addNeighbour(map.getStreet(13), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(13), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(13), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(13), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(13), map.getStreet(1), 4);
     
      // index 14: "Blackfriars Street"
      map.addNeighbour(map.getStreet(14), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(14), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(14), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(14), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(14), map.getStreet(1), 4);
     
      // index 15: "Candleriggs"
      map.addNeighbour(map.getStreet(15), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(15), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(15), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(15), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(15), map.getStreet(1), 4);
     
      // index 16: "High Street"
      map.addNeighbour(map.getStreet(16), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(16), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(16), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(16), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(16), map.getStreet(1), 4);
    
      // index 17: "Saltmarket"
      map.addNeighbour(map.getStreet(17), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(17), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(17), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(17), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(17), map.getStreet(1), 4);
      
      // index 18: "Clyde Street"
      map.addNeighbour(map.getStreet(18), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(18), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(18), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(18), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(18), map.getStreet(1), 4);
     
      // index 19: "Bell Street"
      map.addNeighbour(map.getStreet(19), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(19), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(19), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(19), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(19), map.getStreet(1), 4);
     
      // index 20: "Bath Street"
      map.addNeighbour(map.getStreet(20), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(20), map.getStreet(2), 3);
      map.addNeighbour(map.getStreet(20), map.getStreet(4), 3);
      map.addNeighbour(map.getStreet(20), map.getStreet(5), 3);
      map.addNeighbour(map.getStreet(20), map.getStreet(21), 2);
     
      // index 21: "West Nile Street"
      map.addNeighbour(map.getStreet(21), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(21), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(21), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(21), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(21), map.getStreet(1), 4);
    
      // index 22: "Broomielaw"
      map.addNeighbour(map.getStreet(22), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(22), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(22), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(22), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(22), map.getStreet(1), 4);
     
      // index 23: "Queen Street"
      map.addNeighbour(map.getStreet(23), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(23), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(23), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(23), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(23), map.getStreet(1), 4);
     
      // index 24: "Glassford Street"
      map.addNeighbour(map.getStreet(24), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(24), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(24), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(24), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(24), map.getStreet(1), 4);
     
      // index 25: "Hope Street"
      map.addNeighbour(map.getStreet(25), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(25), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(25), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(25), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(25), map.getStreet(1), 4);
     
      // index 26: "London Road"
      map.addNeighbour(map.getStreet(26), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(26), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(26), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(26), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(26), map.getStreet(1), 4);
      
      // index 27: "Brunswick Street"
      map.addNeighbour(map.getStreet(27), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(27), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(27), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(27), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(27), map.getStreet(1), 4);
      
      // index 28: "Wilson Street"
      map.addNeighbour(map.getStreet(28), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(28), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(28), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(28), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(28), map.getStreet(1), 4);
     
      // index 29: "Bridgegate"
      map.addNeighbour(map.getStreet(29), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(29), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(29), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(29), map.getStreet(1), 4);
      map.addNeighbour(map.getStreet(29), map.getStreet(1), 4);

      /**
       * Old Test data
       * map.add(new Street("Sauchiehall Street", "G2 3ER" ));//0
       * map.add(new Street("Buchanan Street", "G1 2FF" ));//1
       * map.add(new Street("Argyle Street", "G2 8BJ" ));//2
       * map.add(new Street("Bath Street", "G2 4JH" ));//3
       * map.add(new Street("George Square", "G2 1DU" ));//4
       * map.add(new Street("Queen Street", "G1 3AH" ));//5
       * map.add(new Street("Clyde Street", "G1 4LH" ));//6
       * map.add(new Street("Stockwell Street", "G1 4RJ" ));//7
       * map.add(new Street("Broomielaw", "G1 4RQ" ));//8
       * map.add(new Street("Custom House Quay", "G1 4RZ" ));//9
       * 
       * map.addNeighbour(map.getStart(), map.getStreet(1), 5);
       * map.addNeighbour(map.getStart(), map.getStreet(3), 4);
       * map.addNeighbour(map.getStreet(1), map.getStreet(0), 5);
       * map.addNeighbour(map.getStreet(1), map.getStreet(2), 3);
       * map.addNeighbour(map.getStreet(1), map.getStreet(4), 2);
       * 
       * map.addNeighbour(map.getStreet(2), map.getStreet(0), 4);
       * 
       * map.addNeighbour(map.getStreet(2), map.getStreet(3), 6);
       * 
       * map.addNeighbour(map.getStreet(3), map.getStreet(2), 6);
       * map.addNeighbour(map.getStreet(3), map.getStreet(4), 4);
       * 
       * map.addNeighbour(map.getStreet(4), map.getStreet(1), 2);
       * map.addNeighbour(map.getStreet(4), map.getStreet(3), 4);
       * map.addNeighbour(map.getStreet(4), map.getStreet(5), 3);
       * 
       * map.addNeighbour(map.getStreet(5), map.getStreet(4), 3);
       * map.addNeighbour(map.getStreet(5), map.getStreet(1), 8);
       * 
       * map.addNeighbour(map.getStreet(6), map.getStreet(7), 4);
       *        * 
       * map.addNeighbour(map.getStreet(7), map.getStreet(6), 4);
       * map.addNeighbour(map.getStreet(7), map.getStreet(8), 5);
       * 
       * map.addNeighbour(map.getStreet(8), map.getStreet(7), 4);
       * map.addNeighbour(map.getStreet(8), map.getStreet(9), 3);
       * map.addNeighbour(map.getStreet(8), map.getStreet(5), 7);
       * 
       * map.addNeighbour(map.getStreet(9), map.getStreet(8), 3);
       * map.addNeighbour(map.getStreet(9), map.getStreet(6), 5);
       * 
       */

   }

   public Driver[] getDriversData() {
      return driversData;
   }

   public Hire getFrontOfHireList() {
      return frontHire;
   }

   public Hire getCurrentHire() {
      return currentHire;
   }

   public Hire[] getHiresData() {
      return hiresData;
   }

   public StreetOrganiser getMap() {
      return map;
   }

   public void setMap(StreetOrganiser map) {
      this.map = map;
   }

}
