package katas;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
public class ClosestToZeroFinderTestBROSS {

	@Test
	public void givenAListWithOneAndTwo_ReturnsOne() throws Exception {
		// Arrange
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		List<Integer> testData = Arrays.asList(1, 2);
		// Act
		int result = underTest.findClosestToZero(testData);
		// Assert
		assertThat(result, equalTo(1));
	}

	@Test
	public void givenALongerListReturnsOne() throws Exception {
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		List<Integer> testData = Arrays.asList(1, 2, 3, 4, 5);
		int result = underTest.findClosestToZero(testData);
		assertThat(result, is(1));
	}

	@Test
	public void shouldReturnFirstValueInSortedList() throws Exception {
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		List<Integer> testData = Arrays.asList(4, 2, 3, 1);
		List<Integer> result = underTest.sortData(testData);
		assertThat(result.get(0), is(1));
	}

	@Test
	public void shouldReturnClosestToZero() throws Exception {
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		List<Integer> testData = Arrays.asList(4, -5, 6, 2, -1, 3);
		List<Integer> sortedData = underTest.sortData(testData);
		int result = underTest.closestToZero(sortedData);
		assertThat(result, is(-1));
	}
	@Test
	public void shouldReturnPositiveInsteadOfNegative() throws Exception {
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		List<Integer> testData = Arrays.asList(4, -4, 2, -2, 3, -3, 1, -1);
		List<Integer> sortedData = underTest.sortData(testData);
		int result = underTest.closestToZero(sortedData);
		assertThat(result, is(1));
	}
	@Test
	public void shouldBeAbleToAcceptIntsFromUser() throws Exception {
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		List<Integer> testData = underTest.addUserIntToDataSet();
		assertThat(testData.size(), is(4));
	}
}

}
