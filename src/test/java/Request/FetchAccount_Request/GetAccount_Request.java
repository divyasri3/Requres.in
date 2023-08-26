package Request.FetchAccount_Request;

import Base.RequestHandler;
import Constants.RequestMethod;
import io.restassured.response.Response;

/*

this class is used for get endpoint
*/
public class GetAccount_Request extends RequestHandler {

    //This is construct which is taking the parameter AccountCreationRequestData
    public GetAccount_Request() {

        //this .baseUri is taking current class baseUri for post request
        this.baseUri = "https://reqres.in/api/";

        //this .url is taking currrent class url for post request
        this.url = "users?page=1";

        //this .method is taking current class method for post request
        this.method = RequestMethod.Get.toString();
        this.contentType = "application/json";
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
