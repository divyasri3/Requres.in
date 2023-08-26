package Tests;

import Constants.CreateAccount_Constants;
import Helpers.CreateAccount_Helper;
import Request.CreateAccount_Request.Pojo.CreateAnAccountRequestData;
import Response.CreateAccount_Response.CreateAccount_Response;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
this is the test class for the post end point
 */
public class CreateAccount_Test {

    // creating an object pf CreateAccount_Helper
    private final CreateAccount_Helper accountCreationHelper = new CreateAccount_Helper();

    /*
       This is the test  method to create an account using the name and job
        */
    @Test
    public void testCreateUserAccount() {

        //calling the methodin the accountCreationHelper and send the data and stored in the variable requestData
        CreateAnAccountRequestData requestData =accountCreationHelper.setAccountCreationRequestData(CreateAccount_Constants.cap_name, CreateAccount_Constants.cap_Job);

        //calling the method in the accountCreationHelper and the stored data
        Response response = accountCreationHelper.createAccount(requestData);

        //Creating a object CreateAccount_Response and send the response
        CreateAccount_Response CreationAccountResponse = new CreateAccount_Response(response);

        //used to log the response  to the console
        System.out.println(CreationAccountResponse.getBody().getCreatedAt());
        System.out.println(CreationAccountResponse.getBody().getId());
        System.out.println(CreationAccountResponse.getBody().getJob());
        System.out.println(CreationAccountResponse.getBody().getName());

        //Validating the response
        Assert.assertEquals(CreationAccountResponse.getBody().getName(),CreateAccount_Constants.cap_name,
                "Expecting"+  CreationAccountResponse.getBody().getName()+", but Actual is "+CreateAccount_Constants.cap_name);

        Assert.assertEquals(CreationAccountResponse.getBody().getJob(),CreateAccount_Constants.cap_Job,
                "Expecting"+  CreationAccountResponse.getBody().getJob()+", but Actual is "+CreateAccount_Constants.cap_Job);

    }
}

