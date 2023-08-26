package Tests;

import Constants.UpdateAccount_Constants;
import Helpers.UpdateAccount_Helper;
import Request.UpdateAccount_Request.Pojo.UpdateAnAccountRequestData;
import Response.UpdateAccount_Response.UpdateAccount_Response;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

/*;
This class is used for put end ooint withh the different test cases
 */
public class UpdateAccount_Test {


    // creating an object pf CreateAccount_Helper
    private final UpdateAccount_Helper accountUpdateHelper = new UpdateAccount_Helper();

    /*
       This is the test  method to create an account using the name and job
        */
    @Test
    public void testCreateUserAccount() {

        //calling the methodin the accountCreationHelper and send the data and stored in the variable requestData
        UpdateAnAccountRequestData requestData = accountUpdateHelper
                .setAccountUpdateRequestData(UpdateAccount_Constants.cap_name, UpdateAccount_Constants.cap_Job);

        //calling the method in the accountCreationHelper and the stored data
        Response response = accountUpdateHelper.updateAccount(requestData);

        //Creating a object CreateAccount_Response and send the response
        UpdateAccount_Response updateAccountResponse = new UpdateAccount_Response(response);

        //used to log the response  to the console

        System.out.println(updateAccountResponse.getBody().getJob());
        System.out.println(updateAccountResponse.getBody().getName());

        //Validating the response
        Assert.assertEquals(updateAccountResponse.getBody().getName(), UpdateAccount_Constants.cap_name,
                "Expecting" + updateAccountResponse.getBody().getName() + ", but Actual is " + UpdateAccount_Constants.cap_name);

        Assert.assertEquals(updateAccountResponse.getBody().getJob(), UpdateAccount_Constants.cap_Job,
                "Expecting" + updateAccountResponse.getBody().getJob() + ", but Actual is " + UpdateAccount_Constants.cap_Job);

    }
}


