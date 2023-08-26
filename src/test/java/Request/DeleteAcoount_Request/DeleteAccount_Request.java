//package Request.DeleteAcoount_Request;
//
//import Constants.RequestMethod;
//import Request.CreateAccount_Request.Pojo.CreateAnAccountRequestData;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.restassured.response.Response;
//
//public class DeleteAccount_Request {
//    //This is construct which is taking the parameter AccountCreationRequestData
//    public CreateAccount_Request(CreateAnAccountRequestData AccountCreationRequestData) {
//
//        //this .baseUri is taking current class baseUri for post request
//        this.baseUri = "https://reqres.in/api/";
//
//        //this .url is taking currrent class url for post request
//        this.url = "users";
//
//        //this .method is taking current class method for post request
//        this.method = RequestMethod.Post.toString();
//
//        //this .contentType is taking current class contentType for post request
//        this.contentType = "application/json";
//
//        //Serilization :
//        ObjectMapper obj = new ObjectMapper();
//        try {
//
//            //this .body is taking current class body for post request
//            this.body = obj.writeValueAsString(AccountCreationRequestData);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//            throw new RuntimeException("unable to convert member settings objects to json ");
//        }
//
//    }
//
//    /*
//    This method is used to excecute post request
//     */
//    public Response execute_Request() {
//
//        //calling super class method "execute_Request" and store the response in the response
//        Response response = super.execute_Request();
//
//        //This method return the response from the server
//        return response;
//    }
//
//}
