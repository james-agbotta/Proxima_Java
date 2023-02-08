package com.proxima.jUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.proxima.model.DriverOrganiser;
import com.proxima.model.Driver;
class DriverOrganiserTest {

	private DriverOrganiser drOrganise;
	

	@Test
	void testAdd() {
		Driver testDriver =new Driver("Test");
		drOrganise = new DriverOrganiser();
		drOrganise.add(testDriver);
		
		assertTrue(drOrganise.getStart().equals(testDriver));
	}
	
	@Test
	void testAddMultiple() {
		Driver[] drivers = new Driver[5];
		drOrganise = new DriverOrganiser();
	
		for(int i = 0; i< drivers.length; i++) { 
			drivers[i] = new Driver("driver_"+i);
		drOrganise.add(drivers[i]);	
		}
		assertEquals(drivers.length, drOrganise.size());
		//08-02-23 test fail due to logic error in driver.add();
		
		
	}

	@Test
	void testContains() {
		Driver[] drivers = new Driver[5];
		drOrganise = new DriverOrganiser();
	
		for(int i = 0; i< drivers.length; i++) { 
			drivers[i] = new Driver("driver_"+i);
		drOrganise.add(drivers[i]);	
		}
		assertTrue(drOrganise.contains(drivers[3]));
	}

	@Test
	void testRemove() {

		
		fail("Not yet implemented");
	}
	
	@Test
	void testSize(){
		Driver[] drivers = new Driver[5];
		drOrganise = new DriverOrganiser();
	
		for(int i = 0; i< drivers.length; i++) { 
			drivers[i] = new Driver("driver_"+i);
		drOrganise.add(drivers[i]);	
		}
		assertEquals(drivers.length,drOrganise.size());
	}

	@Test
	void testPopDriver() {
		Driver[] drivers = new Driver[5];
		drOrganise = new DriverOrganiser();
	
		for(int i = 0; i< drivers.length; i++) { 
			drivers[i] = new Driver("driver_"+i);
		drOrganise.add(drivers[i]);	
		}
		drOrganise.popDriver();
		assertFalse(drOrganise.contains(drivers[4]));

	}
	
	@Test
	void testPopDriverToEmpty() {
		drOrganise = new DriverOrganiser();
		drOrganise.add(new Driver("1"));
		assertFalse(drOrganise.isEmpty());//if empty: stop test
		drOrganise.popDriver();
		assertTrue(drOrganise.getStart()==null);
	}

	@Test
	void testIndexOf() {
		Driver[] drivers = new Driver[5];
		drOrganise = new DriverOrganiser();
	
		for(int i = 0; i< drivers.length; i++) { 
			drivers[i] = new Driver("driver_"+i);
		drOrganise.add(drivers[i]);	
		}
		assertEquals(0,drOrganise.indexOf(drivers[4]));// drivers.length-1 maps to the top of the stack
		assertEquals(1,drOrganise.indexOf(drivers[3]));
		assertEquals(2,drOrganise.indexOf(drivers[2]));// 08-02-2033 Failed, expected 2, returned 1
		assertEquals(3,drOrganise.indexOf(drivers[drivers.length-4]));// 08-02-2033 Failed, expected 3, returned 2
		assertEquals(4,drOrganise.indexOf(drivers[drivers.length-5])); // 08-02-2033 Failed, expected 4, returned 3
		
	}

	@Test
	void testIsEmpty() {
		//fail("Not yet implemented");
		drOrganise = new DriverOrganiser();
		assertTrue(drOrganise.isEmpty());
		drOrganise.add(new Driver("1"));
		assertFalse(drOrganise.isEmpty());
		drOrganise.popDriver();
		assertTrue(drOrganise.isEmpty());
	}

	@Test
	void testGetPathDriver() {
		fail("Not yet implemented");
	}

	@Test
	void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	void testToArray() {
		Driver[] drivers = new Driver[5];
		Driver[] driversReturned;
		Driver[] driversInverted = new Driver[5];
		drOrganise = new DriverOrganiser();
	
		for(int i = 0; i< drivers.length; i++) { 
			drivers[i] = new Driver("driver_"+i);
		drOrganise.add(drivers[i]);	
		driversInverted[drivers.length-(i+1)] = drivers[i];
		}
		driversReturned= drOrganise.toArray();
		assertFalse(drOrganise.isEmpty());
		assertEquals(drivers.length,driversReturned.length);
		assertArrayEquals(driversInverted, driversReturned);
	}

	@Test
	void testGetPathDriverDriver() {
		fail("Not yet implemented");
	}

}
