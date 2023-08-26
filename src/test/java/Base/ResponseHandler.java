package Base;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.Map;

/*
This  is the class used to have the reusable methods for the response which we can modify at one class
 */
public class ResponseHandler {

    public int code;
    public String body;


    }