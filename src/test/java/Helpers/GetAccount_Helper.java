package Helpers;

import Request.FetchAccount_Request.GetAccount_Request;
import io.restassured.response.Response;

public class GetAccount_Helper {


    public Response getAccount() {
        return new GetAccount_Request().execute_Request();

    }
}
