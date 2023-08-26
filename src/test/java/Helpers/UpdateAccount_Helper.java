package Helpers;


import Request.CreateAccount_Request.CreateAccount_Request;
import Request.CreateAccount_Request.Pojo.CreateAnAccountRequestData;
import Request.UpdateAccount_Request.Pojo.UpdateAnAccountRequestData;
import Request.UpdateAccount_Request.UpdateAnAccount_Request;
import io.restassured.response.Response;

/*
This class put end point where this class is reusable class
 */
public class UpdateAccount_Helper {

    //This method is used to set the data for account creation
    public  UpdateAnAccountRequestData setAccountUpdateRequestData(Object name, Object job) {

        // create an object for the pojo class
       UpdateAnAccountRequestData requestData = new UpdateAnAccountRequestData();

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
    public Response updateAccount(UpdateAnAccountRequestData requestData){
        return new UpdateAnAccount_Request(requestData).execute_Request();

    }
}
