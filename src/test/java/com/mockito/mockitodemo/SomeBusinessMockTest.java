package com.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

        @Test
        public void testGreatestNumber(){
            DataService dataService = mock(DataService.class);
            when(dataService.retrieveAllData()).thenReturn(new int[] {54,12,67,10,5});
            SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
            int result = someBusiness.greatestNumber();
            assertEquals(67,someBusiness.greatestNumber());
        }
        @Test
        public void testGreatestNumber_forSingleValue(){
            DataService dataService = mock(DataService.class);
            when(dataService.retrieveAllData()).thenReturn(new int[] {45});
            SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
            int result = someBusiness.greatestNumber();
            assertEquals(45,result);
        }

}






