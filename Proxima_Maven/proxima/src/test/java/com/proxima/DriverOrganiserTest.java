package com.proxima;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.proxima.model.Driver;
import com.proxima.model.DriverOrganiser;



class DriverOrganiserTest {

	private DriverOrganiser drOrganise;
	Driver[] drivers = {new Driver("driver_1"),new Driver("driver_2"),new Driver("driver_3"),new Driver("driver_4"),new Driver("driver_5")};

@Test
void testDriverOrganiser(){
	Driver testDriver = new Driver("Test");
	drOrganise = new DriverOrganiser(testDriver);
	System.out.print(drOrganise.getStart().toString());
	assertEquals(drOrganise.getStart(),testDriver);
}

	@Test
	void testAdd() {
		Driver testDriver = new Driver("Test");
		drOrganise = new DriverOrganiser();
		drOrganise.add(testDriver);

		assertTrue(drOrganise.getStart().equals(testDriver));
	}

	@Test
	void testAddMultiple() {
		drivers = new Driver[5];
		drOrganise = new DriverOrganiser();

		for (int i = 0; i < drivers.length; i++) {
			drivers[i] = new Driver("driver_" + i);
			drOrganise.add(drivers[i]);
		}
		assertEquals(drivers.length, drOrganise.size());
		// 08-02-23 test fail due to logic error in driver.add();

	}

	@Test
	void testContains() {
		drOrganise = new DriverOrganiser();
		for (int i = 0; i < drivers.length; i++) {
			drOrganise.add(drivers[i]);
		}
		assertTrue(drOrganise.contains(drivers[3]));
	}


	@Test
	void testRemove() {
		
		drOrganise = new DriverOrganiser();

		for (int i = 0; i < drivers.length; i++) {
			drOrganise.add(drivers[i]);
		}
		
		drOrganise.remove(drivers[2]);
		//Test if the driver was removed.
		assertFalse(drOrganise.contains(drivers[2]));
		//Test if the driver is still there.
		assertNull(drOrganise.remove(drivers[2])); 
	}

	@Test
	void testSize() {
		drOrganise = new DriverOrganiser();

		for (int i = 0; i < drivers.length; i++) {
			drOrganise.add(drivers[i]);
		}
		assertEquals(drivers.length, drOrganise.size());
	}

	@Test
	void testPopDriver() {
		drOrganise = new DriverOrganiser();

		for (int i = 0; i < drivers.length; i++) {
			drOrganise.add(drivers[i]);
		}
		drOrganise.popDriver();
		assertFalse(drOrganise.contains(drivers[4]));

	}

	@Test
	void testPopDriverToEmpty() {
		drOrganise = new DriverOrganiser();
		drOrganise.add(new Driver("1"));
		assertFalse(drOrganise.isEmpty());// if empty: stop test
		drOrganise.popDriver();
		assertTrue(drOrganise.getStart() == null);
	}

	@Test
	void testIndexOf() {
		drOrganise = new DriverOrganiser();

		for (int i = 0; i < drivers.length; i++) {
			drOrganise.add(drivers[i]);
		}
		assertEquals(0, drOrganise.indexOf(drivers[4]));// drivers.length-1 maps to the top of the stack
		assertEquals(1, drOrganise.indexOf(drivers[3]));
		assertEquals(2, drOrganise.indexOf(drivers[2]));// 08-02-2033 Failed, expected 2, returned 1
		assertEquals(3, drOrganise.indexOf(drivers[drivers.length - 4]));// 08-02-2033 Failed, expected 3, returned 2
		assertEquals(4, drOrganise.indexOf(drivers[drivers.length - 5])); // 08-02-2033 Failed, expected 4, returned 3

	}

	@Test
	void testIsEmpty() {
		// fail("Not yet implemented");
		drOrganise = new DriverOrganiser();
		assertTrue(drOrganise.isEmpty());
		drOrganise.add(new Driver("1"));
		assertFalse(drOrganise.isEmpty());
		drOrganise.popDriver();
		assertTrue(drOrganise.isEmpty());
	}

	@Test
	void testGetPathDriver() {
		
		drOrganise = new DriverOrganiser();
		Driver[] droPath;
		Driver[] driversInverted = {drivers[4],drivers[3],drivers[2]};
		for (int i = 0; i < drivers.length;i++) {
			
			drOrganise.add(drivers[i]);
			
		}
		droPath = drOrganise.getPath(drivers[2]);

		
		assertNotNull(droPath);
		//System.out.print("DO: "+ droPath.length+ ", DI:" + driversInverted.length);
		assertArrayEquals(driversInverted,droPath) ;
	
		//failed 9-02-23 Bad logic in getPathDriver, fixed 14-02-23
	}

	@Test
	void testInsert() {

		drOrganise = new DriverOrganiser();

		for (int i = 0; i < drivers.length; i++) {
			drOrganise.add(drivers[i]);
		}
		
		Driver addition =new Driver("driver_2.5");
		drOrganise.insert(drivers[1],addition);
		assertEquals(drivers.length+1, drOrganise.size());
		assertTrue(drOrganise.contains(addition));
		//fail("Not yet implemented");
	}

	@Test
	void testToArray() {

		Driver[] driversReturned;
		Driver[] driversInverted = new Driver[5];
		drOrganise = new DriverOrganiser();

		for (int i = 0; i < drivers.length; i++) {
			drOrganise.add(drivers[i]);
			driversInverted[drivers.length - (i + 1)] = drivers[i];
		}
		driversReturned = drOrganise.toArray();
		assertFalse(drOrganise.isEmpty());
		assertEquals(drivers.length, driversReturned.length);
		assertArrayEquals(driversInverted, driversReturned);
		
		//test again, because... theory
		driversReturned = drOrganise.toArray();
		assertFalse(drOrganise.isEmpty());
		assertEquals(drivers.length, driversReturned.length);
		assertArrayEquals(driversInverted, driversReturned);
	}

	@Test
	void testToArrayAlt() {

		Driver[] driversReturned;
		Driver[] driversInverted = new Driver[5];
		drOrganise = new DriverOrganiser(drivers[0]);

		for(int i =1; i< drivers.length; i++){
			drOrganise.add(drivers[i]);
		}

		for (int i = 0; i < drivers.length; i++) {
			
			driversInverted[drivers.length - (i + 1)] = drivers[i];
		}
		driversReturned = drOrganise.toArray();
		assertFalse(drOrganise.isEmpty());
		assertEquals(drivers.length, driversReturned.length);
		assertArrayEquals(driversInverted, driversReturned);
		
		//test again, because... theory
		driversReturned = drOrganise.toArray();
		assertFalse(drOrganise.isEmpty());
		assertEquals(drivers.length, driversReturned.length);
		assertArrayEquals(driversInverted, driversReturned);
	}

	@Test
	void testGetPathDriverDriver() {
		drOrganise = new DriverOrganiser();
		Driver[] droPath;
		Driver[] driversInverted = {drivers[3],drivers[2]};
		for (int i = 0; i < drivers.length;i++) {
			
			drOrganise.add(drivers[i]);
			
		}
		droPath = drOrganise.getPath(drivers[3], drivers[2]);

		
		assertNotNull(droPath);
		//System.out.print("DO: "+ droPath.length+ ", DI:" + driversInverted.length);
		assertArrayEquals(driversInverted,droPath) ;
		
		//failed 14-02-23 ArrayIndexOutOfBoundsException
	}

}
