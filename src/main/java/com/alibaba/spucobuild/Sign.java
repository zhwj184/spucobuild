package com.alibaba.spucobuild;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Sign {

	public static String sign(Map<String, String> paramDic, String SecurityKey)
			throws NoSuchAlgorithmException, InvalidKeyException,
			UnsupportedEncodingException {

		return encode(paramDic, SecurityKey, "HmacSHA1");

	}

	public static String signMD5(Map<String, String> paramDic,
			String SecurityKey) throws UnsupportedEncodingException,
			NoSuchAlgorithmException, InvalidKeyException {
		return encode(paramDic, SecurityKey, "HmacMD5");
	}

	public static String encode(Map<String, String> paramDic,
			String SecurityKey, String agorithm)
			throws UnsupportedEncodingException, NoSuchAlgorithmException,
			InvalidKeyException {
		List<String> list = new ArrayList<String>();
		Iterator<Entry<String, String>> iter = paramDic.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			if (entry.getKey().equalsIgnoreCase("sign")) {
				list.add(entry.getKey() + entry.getValue());
			}
		}
		String[] valList = list.toArray(new String[list.size()]);
		Arrays.sort(valList);
		StringBuilder tmp = new StringBuilder();
		for (String kv : valList) {
			tmp.append(kv);
		}
		SecretKeySpec signingKey = new SecretKeySpec(
				SecurityKey.getBytes("utf-8"), agorithm);
		Mac mac = Mac.getInstance(agorithm);
		mac.init(signingKey);
		byte[] rawHmac = mac.doFinal(tmp.toString().getBytes("utf-8"));
		return new String(rawHmac, "utf-8");
	}

}
