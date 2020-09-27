package cn.com.jaav.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
/*
 * md5加密工具类
 */
public class MD5Util
{
    public static String md5Encode(String str)
    {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("md5");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "";
        }
        byte[] bytesArray = str.getBytes(StandardCharsets.UTF_8);
        byte[] md5Bytes = md5.digest(bytesArray);
        StringBuilder hexValue = new StringBuilder();
        for (byte md5Byte : md5Bytes) {
            int val = ((int) md5Byte) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
}
