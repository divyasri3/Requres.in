package Tests;

import Constants.CreateAccount_Constants;
import Constants.GetAccountConstants;
import Helpers.GetAccount_Helper;
import Response.CreateAccount_Response.CreateAccount_Response;
import Response.FetchAccount_Response.GetAccount_Response;
import Response.FetchAccount_Response.pojo.FetchAccountResponseData;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 this is the test class for the get end point
 */
public class GetAccount_Test {


    // creating an object pf CreateAccount_Helper
    private final GetAccount_Helper accountGetHelper = new GetAccount_Helper();

    /*
       This is the test  method to create an account using the name and job
        */
    @Test
    public void testCreateUserAccount() {

        //calling the method in the accountCreationHelper and the stored data
        Response response = accountGetHelper.getAccount();

        //Creating a object CreateAccount_Response and send the response
   GetAccount_Response AccountFetchResponse = new GetAccount_Response(response);

        //used to log the response  to the console
        System.out.println(AccountFetchResponse.getBody().getPage());
        System.out.println(AccountFetchResponse.getBody().getPer_Page());
        System.out.println(AccountFetchResponse.getBody().getData());
        System.out.println(AccountFetchResponse.getBody().getSupport());

        //Validating the response
        Assert.assertEquals(AccountFetchResponse.getBody().getPage(), GetAccountConstants.page,
                "Expecting" + AccountFetchResponse.getBody().getPage() + ", but Actual is " + GetAccountConstants.page);

        Assert.assertEquals(AccountFetchResponse.getBody().getPer_Page(),  GetAccountConstants.per_Page,
                "Expecting" + AccountFetchResponse.getBody().getPer_Page() + ", but Actual is " + GetAccountConstants.per_Page);

    }
}


