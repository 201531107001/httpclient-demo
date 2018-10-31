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

}
