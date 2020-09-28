package com.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessTest {
    @Test
    public void testGreatestNumber(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        int result = someBusiness.greatestNumber();
        assertEquals(67,result);
    }

}
class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData(){
        return new int[] {54,12,67,10,5};
    }
}
