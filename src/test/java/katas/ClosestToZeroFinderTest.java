package katas;

import static org.hamcrest.CoreMatchers.*
;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class ClosestToZeroFinderTest {

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
	public void shouldBeAbleToAddIntToArray() throws Exception {
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		int testEntry = 1;	
		
		underTest.addIntToArray(testEntry);
		int listSize = underTest.retrieveIntListSize();
		
		assertThat(listSize, is(1));
	}
	
	@Test
	public void shouldBeAbleToAddMultipleIntsToArray() throws Exception {
		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
		int testEntry1 = 1;
		int testEntry2 = 2;
		int testEntry3 = 3;
		
		underTest.addIntToArray(testEntry1);
		underTest.addIntToArray(testEntry2);
		underTest.addIntToArray(testEntry3);
		
		assertThat(underTest.retrieveIntListSize(), is(3));
	}
	
//	@Test
//	public void shouldBeAbleToSortList() throws Exception {
//		ClosestToZeroFinder underTest = new ClosestToZeroFinder();
//		int testEntry1 = 12;
//		int testEntry2 = 24;
//		int testEntry3 = 3;
//		int testEntry4 = -1;		
//		underTest.addIntToArray(testEntry1);
//		underTest.addIntToArray(testEntry2);
//		underTest.addIntToArray(testEntry3);
//		underTest.addIntToArray(testEntry4);
//		
//		underTest.sort(underTest);
//		
//		
//	}
}