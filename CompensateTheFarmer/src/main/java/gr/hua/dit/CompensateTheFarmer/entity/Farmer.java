package gr.hua.dit.CompensateTheFarmer.entity;

import java.util.ArrayList;

public class Farmer extends User{
    private String address;
    private int phoneNumber;
    private ArrayList<Property> properties;
    private ArrayList<Request> requests;

    void newCompensationRequest(){
        //verify request details
    };

    void checkRequestState() {};
}
