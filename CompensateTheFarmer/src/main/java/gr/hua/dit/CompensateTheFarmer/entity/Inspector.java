package gr.hua.dit.CompensateTheFarmer.entity;

import java.util.ArrayList;

public class Inspector extends User{
    private String email;
    private int department;
    private ArrayList<Request> requestsForInspection;

    void inspectRequest(){
        //accect , set sum and inform
        //reject and inform
    };

}
