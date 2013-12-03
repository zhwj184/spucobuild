package com.alibaba.spucobuild;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.spucobuild.domain.OrderModel;
import com.thoughtworks.xstream.XStream;

public class PushServiceController {

	 /// <summary>
    /// 解析订单结果集
    /// </summary>
    /// <param name="param">请求get和post参数集，value需要进行Url decode</param>
    /// <param name="type">json : json格式 xml：xml格式</param>
    /// <returns></returns>
    public OrderModel parse(Map<String, String> param,String SecurityKey,String type)
    {
        OrderModel orderModel = new OrderModel();
        try
        {
            String returnsign = "";

            if (param.get("sign_method").equalsIgnoreCase("HMAC"))
            {
                returnsign = Sign.sign(param, SecurityKey);
            }
            else
            {

                returnsign = Sign.signMD5(param, SecurityKey);
            }

            if (param.get("sign").equals(returnsign))
            {
                if(type != null && type.equalsIgnoreCase("json"))
                {
                    orderModel = JSON.parseObject(param.get("content"), OrderModel.class);
                }else
                {
                	orderModel = (OrderModel) new XStream().fromXML(param.get("content"));
                }
                
                orderModel.retCode = 1;
            }
            else
            {
                orderModel.retCode = -1;
            }
        }
        catch (Exception ex)
        {
            orderModel.retCode = 0;
        }
        return orderModel;
    }



}
