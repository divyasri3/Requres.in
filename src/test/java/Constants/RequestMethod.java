package Constants;

/*
This is enum for the constants of http request methods
 */

import groovy.xml.dom.DOMCategory;

public enum RequestMethod {


    Get("GET"),
    Post("POST"),
    Put("PUT"),
    Patch("PATCH"),
    Delete("DELETE");



    public   String value;

    private RequestMethod(String value){

        this.value=value;
    }

}
