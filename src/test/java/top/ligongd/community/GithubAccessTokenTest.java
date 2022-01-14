package top.ligongd.community;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class GithubAccessTokenTest {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user")
                .header("Authorization", "token " + "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")
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.body());
            String string = response.body().string();
            System.out.println(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
