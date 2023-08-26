package Response.FetchAccount_Response.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
*  "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }*/
public class SupportData {
    @JsonProperty("url")
    public String url;
    @JsonProperty("text")
    public String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}