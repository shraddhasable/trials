package com.project.calculator;

import static org.junit.Assert.*;
import org.junit.Test;
import com.project.calculator.TestServlet;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TestAgain {

	@Test
	public void twoAndThreeIsFive() throws Exception {
		final double result = new TestServlet().add(2, 3);
		assertThat(result, is(5.0));

	}

	@Test
	public void twoAndZeroIsTwo() throws Exception {
		final double result = new TestServlet().add(2, 0);
		assertThat(result, is(2.0));
	}

	@Test
	public void twoAndMinusTwoIsZero() throws Exception {
		final double result = new TestServlet().add(2, -2);
		assertThat(result, is(0.0));
	}

	@Test
	public void threeMinusTwoIsOne() throws Exception {
		final double result = new TestServlet().subtract(3, 2);
		assertThat(result, is(1.0));
	}

	@Test
	public void threeMinusThreeIsZero() throws Exception {
		final double result = new TestServlet().subtract(3, 3);
		assertThat(result, is(0.0));
	}

	@Test
	public void threeMinusMinusThreeIsSix() throws Exception {
		final double result = new TestServlet().subtract(3, -3);
		assertThat(result, is(6.0));
	}

	@Test
	public void threeXThreeIsNine() throws Exception {
		final double result = new TestServlet().multiply(3, 3);
		assertThat(result, is(9.0));
	}

	@Test
	public void threeXZeroIsZero() throws Exception {
		final double result = new TestServlet().multiply(3, 0);
		assertThat(result, is(0.0));
	}

	@Test
	public void threeXMinusThreeIsMinusNine() throws Exception {
		final double result = new TestServlet().multiply(3, -3);
		assertThat(result, is(-9.0));
	}

}
