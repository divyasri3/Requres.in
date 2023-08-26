package Response.UpdateAccount_Response.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/*

This is the pojo class for the post Endpoint  we are going to set the setter and getter

{
    "name": "divya",
    "job": "job",
    "id": "921",
    "createdAt": "2023-08-07T11:30:39.768Z"
}
 */
@Getter
@Setter
public class UpdateAnAccountResponsetData {

    //This is  name variable
    @JsonProperty("name")
    private Object name;

    //This is  job variable
    @JsonProperty("job")
    private Object job;

    //This is  createdAt variable
    @JsonProperty("updatedAt")
    private String updatedAt;

}
