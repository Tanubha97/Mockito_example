package com.mockito.mockitodemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)

public class SomeBusinessMockAnnotationTest {
    @Mock
    DataService dataService;

    @InjectMocks
    SomeBusinessImpl someBusiness;

    @Test
    public void testGreatestNumber(){
        // DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[] {54,12,67,10,5});
        // SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataService);
        //int result = someBusiness.greatestNumber();
        assertEquals(67,someBusiness.greatestNumber());
    }
    @Test
    public void testGreatestNumber_forSingleValue(){
        when(dataService.retrieveAllData()).thenReturn(new int[] {45});
        int result = someBusiness.greatestNumber();
        assertEquals(45,result);
    }

    @Test
    public void testGreatestNumber_forNoValue(){
        when(dataService.retrieveAllData()).thenReturn(new int[] { });
        assertEquals(Integer.MIN_VALUE,someBusiness.greatestNumber());
    }




}


