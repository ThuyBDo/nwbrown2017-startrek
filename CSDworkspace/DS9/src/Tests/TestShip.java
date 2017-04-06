package Tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import GameObjects.Ship;

public class TestShip {
	
	Ship ship;
	
	@Before
	public void init() {
		ship = new Ship();
	}

	@Test
	public void shipDamaged() {
		assertFalse(ship.isDamaged());
	}

	@Test
	public void shipFunctioning() {
		assertTrue(ship.isFunctioning());
	}

	@Test
	public void shipRepaired() {
		assertFalse(ship.isRepaired());
	}
	
	@Test
	public void shipHitShieldBuckledSubsystemDamaged() {
		ship.getShield().buckle();
		ship.hit(1);
		assertTrue(ship.isDamaged());
	}

	@Test
	public void getInitialReservedEnergy() {
		Ship aShip = new Ship();
		assertTrue(aShip.getReservedEnergy() == 10000);
	}
	
}
