package Request.UpdateAccount_Request;

import Base.RequestHandler;
import Constants.RequestMethod;

import Request.UpdateAccount_Request.Pojo.UpdateAnAccountRequestData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

/*
this class is for request for post end point and extending the request handler class
 */

public class UpdateAnAccount_Request extends RequestHandler {


    //This is construct which is taking the parameter AccountCreationRequestData
    public UpdateAnAccount_Request(UpdateAnAccountRequestData AccountUpdateRequestData) {

        //this .baseUri is taking current class baseUri for post request
        this.baseUri = "https://reqres.in/api/";

        //this .url is taking currrent class url for post request
        this.url = "users/2";

        //this .method is taking current class method for post request
        this.method = RequestMethod.Put.toString();

        //this .contentType is taking current class contentType for post request
        this.contentType = "application/json";

        //Serilization :
        ObjectMapper obj = new ObjectMapper();
        try {

            //this .body is taking current class body for post request
            this.body = obj.writeValueAsString(AccountUpdateRequestData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("unable to convert member settings objects to json ");
        }

    }

    /*
    This method is used to excecute post request
     */
    public Response execute_Request() {

        //calling super class method "execute_Request" and store the response in the response
        Response response = super.execute_Request();

        //This method return the response from the server
        return response;
    }


}
