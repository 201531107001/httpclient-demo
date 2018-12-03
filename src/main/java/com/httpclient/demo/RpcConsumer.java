package com.httpclient.demo;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RpcConsumer {
	public static void main(String[] args) throws Exception { 
		
		// 创建HttpClient对象
		CloseableHttpClient client = HttpClients.createDefault(); 
		
		// 声明要请求的url，并构造HttpGet请求
		String url = "http://api.douban.com/v2/movie/top250?from=10&count=2";
		HttpGet get = new HttpGet(url); 
		// 让HttpClient去发送get请求，得到响应
		CloseableHttpResponse response = client.execute(get); 
																
		// 提取响应正文，并打印到控制台
		InputStream is = response.getEntity().getContent();
		String ret = IOUtils.toString(is, "utf-8");
		System.out.println(ret);
		
	}
}
