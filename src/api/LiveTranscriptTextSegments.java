package api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LiveTranscriptTextSegments {

    @SerializedName("api_version")
    @Expose
    private String apiVersion;
    @SerializedName("response_id")
    @Expose
    private String responseId;
//    @SerializedName("data")
//    @Expose
//    private Data data;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

//    public Data getData() {
//        return data;
//    }
//
//    public void setData(Data data) {
//        this.data = data;
//    }
    
    @SerializedName("message")
    @Expose
    private String message;

    public String getMessage() {
    return message;
    }

    public void setMessage(String message) {
    this.message = message;
    }

}
