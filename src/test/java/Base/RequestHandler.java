package Base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
This class is used for the base class which is having all reusable code for the request
 */
public class RequestHandler {


    //This is method variable of type String
    public String method;

    //This is baseUri variable of type String
    public String baseUri;

    //This is ContentType variable of type String
    public String contentType;

    //This is body variable of type String
    public String body;

    //This is url variable of type String
    public String url;

    // this is the method which is having all the http request calls like put,post,patch ,delete which  returns response
    public Response execute_Request() {

        //This is response variable of type Response  which is initialized to null
        Response response = null;

        //The baseURI is a Static method present in RestAssured which is initialized to baseUri
        RestAssured.baseURI = baseUri;

        //The given() is a Static method present in RestAssured which is sending request to
        // the server and stored in varibale called "httpRequest"
        RequestSpecification httpRequest = RestAssured.given();

        //Sending request header with the content-Type
        httpRequest.header("content-Type", contentType);

        //This if condition is for the post if the method is post this if condition is executed
        if (method.equalsIgnoreCase("POST")) {

            //Sending request body to the server
            httpRequest.body(body);

            //Sending request method to the server and the response is stored in the variable "response"
            response = httpRequest.post(url);

        }

        //This if condition is for the put if the method is put this if condition is executed
        else if (method.equalsIgnoreCase("PUT")) {

            //Sending request body to the server
            httpRequest.body(body);

            //Sending request method to the server and the response is stored in the variable "response"
            response = httpRequest.put(url);
        }
        //This if condition is for the PATCH if the method is PATCH this if condition is executed
        else if (method.equalsIgnoreCase("PATCH")) {

            //Sending request body to the server
            httpRequest.body(body);

            //Sending request method to the server and the response is stored in the variable "response"
            response = httpRequest.patch(url);
        }
        //This if condition is for the GET if the method is GET this if condition is executed
        else if (method.equalsIgnoreCase("GET")) {

            //Sending request method to the server and the response is stored in the variable "response"
            response = httpRequest.get(url);
        }
        //This if condition is for the DELETE if the method is DELETE this if condition is executed
        else if (method.equalsIgnoreCase("DELETE")) {

            //Sending request method to the server and the response is stored in the variable "response"
            response = httpRequest.delete(url);
        }
        //This if condition is for the extra method which are not implement code then  this if condition is executed
        else {
            throw new RuntimeException("Incorrect method type");
        }

        //It returns the response
        return response;

    }

}
