package Response.FetchAccount_Response.pojo;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/*"page": 2,
    "per_page": 6,
    "total": 12,
    "total_pages": 2,
    "data": */
public class FetchAccountResponseData {
    @JsonProperty("page")
    public int page;

    @JsonProperty("per_page")
    public int per_page;

    @JsonProperty("total")
    public int total;
    @JsonProperty("total_pages")
    public int total_pages;

    @JsonProperty("data")
    public List<Data> data;
    @JsonProperty("support")
    public SupportData support;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_Page() {
        return per_page;
    }

    public void setPer_Page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }


    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }


    public SupportData getSupport() {
        return support;
    }

    public void setSupport(SupportData support) {
        this.support = support;
    }
}