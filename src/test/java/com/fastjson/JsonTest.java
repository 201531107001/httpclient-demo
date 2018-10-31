package com.fastjson;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bean.PhoneMessage;

public class JsonTest {

	// 把JSON文本parse为JavaBean
	@Test
	public void testParseToBean() {
		String str = "{mts:'1321905',province:'四川',catName:'中国联通',telString:'13219055707',areaVid:'30508',ispVid:'137815084',carrier:'四川联通'}";

		PhoneMessage phoneMessage = (PhoneMessage) JSON.parseObject(str, PhoneMessage.class);
		System.out.println(phoneMessage.getProvince());
	}

	// 将JavaBean转换为JSONObject或者JSONArray。
	@Test
	public void testToJSON() {
		PhoneMessage phone = new PhoneMessage();
		phone.setAreaVid("123");
		phone.setCarrier("456");
		phone.setCatName("123");
		phone.setIspVid("123");
		phone.setMts("456");
		phone.setProvince("456");
		phone.setTelString("789");

		JSONObject jsonObject = (JSONObject) JSON.toJSON(phone);
		System.out.println(jsonObject.toString());
	}
	
	// 把JSON文本parse成JSONObject  
	@Test
	public void testParseObject(){
		String str = "{mts:'1321905',province:'四川',catName:'中国联通',telString:'13219055707',areaVid:'30508',ispVid:'137815084',carrier:'四川联通'}";
		JSONObject jsonObject = JSON.parseObject(str);
		
		System.out.println(jsonObject.toString());
	}
	
	//将JavaBean序列化为JSON文本 
	@Test
	public void toJSONString(){
		PhoneMessage phone = new PhoneMessage();
		phone.setAreaVid("123");
		phone.setCarrier("456");
		phone.setCatName("123");
		phone.setIspVid("123");
		phone.setMts("456");
		phone.setProvince("456");
		phone.setTelString("789");
		System.out.println(JSON.toJSONString(phone));
	}
}
