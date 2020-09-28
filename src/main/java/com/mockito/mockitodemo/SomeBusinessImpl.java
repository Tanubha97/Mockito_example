package com.mockito.mockitodemo;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService=dataService;
    }

    int greatestNumber(){
        int[] data = dataService.retrieveAllData();
        int max = Integer.MIN_VALUE;

        for (int i : data) {
            if(i>max)
                 max=i;
        }
        return max;
    }


}
