package com.wipro.springrestcrud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import com.wipro.springrestcrud.test.Addition;

public class AdditionTest {
	private Addition addition;
	@BeforeEach
	public void setup() {
			this.addition=new Addition();
	}
	@Test
	public void test() {
		int i=addition.add(1, 3);
		assertEquals(4,i);
		}
	@Test
	public void test1() {
		int j=addition.mul(2, 5);
		assertEquals(10,j);
		
	}

}
