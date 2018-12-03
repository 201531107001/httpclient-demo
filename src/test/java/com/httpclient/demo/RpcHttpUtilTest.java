package com.httpclient.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.httpclient.demo.RpcHttpUtil;

public class RpcHttpUtilTest {

	@Test
	public void testInvokeHttp() {
		String url = "https://tcc.taobao.com/cc/json/mobile_tel_segment.htm";

		Map<String, String> paramMap = new HashMap<>(1);
		paramMap.put("tel", "13219055707");
		String str = null;
		try {
			str = RpcHttpUtil.invokeHttp(url, RpcHttpUtil.GET, paramMap);
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(str);
	}
	
	@Test
	public void add() {
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("name", "gqm");
		paramMap.put("age", "22");
		paramMap.put("date", "1996-02-19");
		
		String url = "http://localhost:8080/elasticsearch-demo/add";
		System.out.println(call(url, RpcHttpUtil.POST, paramMap));
	}
	
	@Test
	public void update() {
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("id", "PFRZ6WYBj648KJrMkwV-");
		paramMap.put("age", "26");
		paramMap.put("date", "1992-10-15");
		
		String url = "http://localhost:8080/elasticsearch-demo/update";
		System.out.println(call(url, RpcHttpUtil.POST, paramMap));
	}
	
	@Test
	public void delete() {
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("id", "_update");
		
		String url = "http://localhost:8080/elasticsearch-demo/delete";
		System.out.println(call(url, RpcHttpUtil.GET, paramMap));
	}
	
	@Test
	public void get() {
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("id", "PFRZ6WYBj648KJrMkwV-");
		
		String url = "http://localhost:8080/elasticsearch-demo/get";
		System.out.println(call(url, RpcHttpUtil.GET, paramMap));
	}
	
	public String call(String url,String method,Map<String, String> paramMap){
		String str = null;
		try {
			str = RpcHttpUtil.invokeHttp(url, method, paramMap);
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return str;
	}
}
