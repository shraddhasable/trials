package com.project.calculator;

import static org.junit.Assert.*;
import org.junit.Test;
import com.project.calculator.TestServlet;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class Testing {

	@Test
	public void twoAndThreeIsFive() throws Exception {
		final double result = new TestServlet().add(2, 3);
		assertThat(result, is(5L));

	}

	@Test
	public void twoAndZeroIsTwo() throws Exception {
		final double result = new TestServlet().add(2, 0);
		assertThat(result, is(2L));
	}

	@Test
	public void twoAndMinusTwoIsZero() throws Exception {
		final double result = new TestServlet().add(2, -2);
		assertThat(result, is(0L));
	}

	@Test
	public void threeMinusTwoIsOne() throws Exception {
		final double result = new TestServlet().subtract(3, 2);
		assertThat(result, is(1L));
	}

	@Test
	public void threeMinusThreeIsZero() throws Exception {
		final double result = new TestServlet().subtract(3, 3);
		assertThat(result, is(0L));
	}

	@Test
	public void threeMinusMinusThreeIsSix() throws Exception {
		final double result = new TestServlet().subtract(3, -3);
		assertThat(result, is(6L));
	}

	@Test
	public void threeXThreeIsNine() throws Exception {
		final double result = new TestServlet().multiply(3, 3);
		assertThat(result, is(9L));
	}

	@Test
	public void threeXZeroIsZero() throws Exception {
		final double result = new TestServlet().multiply(3, 0);
		assertThat(result, is(0L));
	}

	@Test
	public void threeXMinusThreeIsMinusNine() throws Exception {
		final double result = new TestServlet().multiply(3, -3);
		assertThat(result, is(-9L));
	}

}
