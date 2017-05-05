package com.gm.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.gm.datastructure.Joker;

public class JokerTest {

	private Joker joker;

	@Before
	public void init() {
		joker = new Joker();
	}

	@Test
	public void factorialTest() {
		assertTrue("Failed",1==joker.factorialRecursive(2));
	}
}
