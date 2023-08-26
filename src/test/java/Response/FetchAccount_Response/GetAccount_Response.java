package Response.FetchAccount_Response;

import Base.ResponseHandler;
import Response.CreateAccount_Response.Pojo.CreateAnAccountResponseData;
import Response.FetchAccount_Response.pojo.FetchAccountResponseData;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.io.IOException;

/*
this is class used for the post call response and extending the response Handler
 */
public class GetAccount_Response extends ResponseHandler {

    private FetchAccountResponseData responseData;

    //This is constructor which is taking parater as response
    public GetAccount_Response(Response response) {



        this.code=response.getStatusCode();
        this.body=response.getBody().asPrettyString();

    }

    /**
     * Returns the response body as pojo class if the response code is 201
     */

    public FetchAccountResponseData getBody(){

        try{

            if(this.code==200){

                if(responseData==null) {

                    responseData=new ObjectMapper().readValue(this.body, FetchAccountResponseData.class) ;
                }
            }
            else {

                throw new RuntimeException("Unable to get response body as expected response code is 201 but actual is :"+this .code);

            }
            return responseData;

        }catch(IOException e){
            throw new RuntimeException("Unable to convert the settingsData response body to pojo class",e);

        }
    }

}
