package net.niuniubao.ant;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/15.
 */
public class HttpClientUtil {

    /**
     * 发送Post类型的json请求
     * @param queryUrl
     * @param json
     * @return
     */
    public static String httpPostJson(String queryUrl,String json){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String resp = "";
        try{
            try {
                HttpPost httpPost = new HttpPost(queryUrl);
                httpPost.setHeader("Content-type","application/json");
                StringEntity stringEntity = new StringEntity(json);
                stringEntity.setContentEncoding("UTF-8");
                stringEntity.setContentType("application/json");
                httpPost.setEntity(stringEntity);
                CloseableHttpResponse response = httpclient.execute(httpPost);
                try {
                    HttpEntity entity = response.getEntity();
                    resp = EntityUtils.toString(entity, "UTF-8");
                } finally {
                    response.close();
                }
            } finally {
                httpclient.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return resp;
    }


    public static String httpPost(String queryUrl,List<NameValuePair> params){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String resp = "";
        try{
            try {
                HttpPost httpPost = new HttpPost(queryUrl);
                httpPost.setHeader("Content-type","application/json");
                httpPost.setEntity(new UrlEncodedFormEntity(params));
                CloseableHttpResponse response = httpclient.execute(httpPost);
                try {
                    HttpEntity entity = response.getEntity();
                    resp = EntityUtils.toString(entity, "UTF-8");
                } finally {
                    response.close();
                }
            } finally {
                httpclient.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return resp;
    }

    public static String httpGet(String queryUrl){
        BufferedReader in = null;
        String content = null;
        try {
            // 定义HttpClient
            CloseableHttpClient client = HttpClients.createDefault();
            // 实例化HTTP方法
            HttpGet request = new HttpGet();
            request.setURI(new URI(queryUrl));
            HttpResponse response = client.execute(request);

            in = new BufferedReader(new InputStreamReader(response.getEntity()
                    .getContent()));
            StringBuffer sb = new StringBuffer("");
            String line = "";
            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null) {
                sb.append(line + NL);
            }
            in.close();
            content = sb.toString();
        } finally {
            if (in != null) {
                try {
                    in.close();// 最后要关闭BufferedReader
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return content;
        }
    }

    public static String httpGetGBK(String queryUrl){
        BufferedReader in = null;
        String content = null;
        try {
            // 定义HttpClient
            CloseableHttpClient client = HttpClients.createDefault();
            // 实例化HTTP方法
            HttpGet request = new HttpGet();
            request.setURI(new URI(queryUrl));
            HttpResponse response = client.execute(request);

            in = new BufferedReader(new InputStreamReader(response.getEntity()
                    .getContent(),"GBK"));
            StringBuffer sb = new StringBuffer("");
            String line = "";
            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null) {
                sb.append(line + NL);
            }
            in.close();
            content = sb.toString();
        } finally {
            if (in != null) {
                try {
                    in.close();// 最后要关闭BufferedReader
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return content;
        }
    }


    public static List<Object> httpGetAll(List<String> urls) {
        return null;
    }
}
