package Helpers;

import Request.CreateAccount_Request.CreateAccount_Request;
import Request.CreateAccount_Request.Pojo.CreateAnAccountRequestData;
import io.restassured.response.Response;
/*
This is the reusable class for post end point
 */
public class CreateAccount_Helper {


    //This method is used to set the data for account creation
    public static CreateAnAccountRequestData setAccountCreationRequestData(Object name, Object job) {

        // create an object for the pojo class
        CreateAnAccountRequestData requestData = new CreateAnAccountRequestData();

        //setting name
        requestData.setName(name);

        //setting job
        requestData.setJob(job);
        //return createDetails object
        return requestData;
    }

    /*
    This method is used to create account
     */
public Response createAccount(CreateAnAccountRequestData requestData){
        return new CreateAccount_Request(requestData).execute_Request();

}

}