package by.web3.hyperspace.service;

import by.web3.hyperspace.domain.ErrMsg;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class HttpClient {
    private final String MEDIA_TYPE = "application/json; charset=utf-8";

    private final OkHttpClient client;
    private final Gson gson;

    public HttpClient() {
        this.client = new OkHttpClient();
        this.gson = new Gson();
    }

    public String get(String url, Map<String, String> headers) {
        var requestBuilder = new Request.Builder()
                .url(url)
                .get();

        return runRequest(requestBuilder, headers);
    }

    public String post(String url, String body, Map<String, String> headers) {
        var requestBody = RequestBody.create(body, MediaType.parse(MEDIA_TYPE));
        var requestBuilder = new Request.Builder()
                .url(url)
                .post(requestBody);

        return runRequest(requestBuilder, headers);
    }

    public String put(String url, String body, Map<String, String> headers) {
        var requestBody = RequestBody.create(body, MediaType.parse(MEDIA_TYPE));
        var requestBuilder = new Request.Builder()
                .url(url)
                .put(requestBody);

        return runRequest(requestBuilder, headers);
    }

    public String delete(String url, Map<String, String> headers) {
        var requestBuilder = new Request.Builder()
                .url(url)
                .delete();

        return runRequest(requestBuilder, headers);
    }

    private String runRequest(okhttp3.Request.Builder requestBuilder, Map<String, String> headers) {
        for (var header : headers.entrySet()) {
            requestBuilder.addHeader(header.getKey(), header.getValue());
        }

        var request = requestBuilder.build();
        try (var response = client.newCall(request).execute()) {
            var responseBody = response.body();
            var bodyString = responseBody != null ? responseBody.string() : null;

            if (!response.isSuccessful() || bodyString == null) {
                var err = gson.fromJson(bodyString, ErrMsg.class);
                return gson.toJson(err);

            }
            return bodyString;
        } catch (IOException e) {
            return gson.toJson(new ErrMsg(400, e.getMessage()));
        }
    }
}
