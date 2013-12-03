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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String content = "{\"message_id\":464827068711607, \"orderMap\":{\"alipayTradeId\":\"2013112700001000720078026380\",\"buyerAlipayId\":\"2088112955722721\",\"buyerCompanyAddressCity\":\"\",\"buyerCompanyAddressCountry\":\"\",\"buyerCompanyAddressProvince\":\"\",\"buyerCompanyAddressStreet\":\"\",\"buyerFoundedPlace\":\"\",\"buyerLoginId\":\"fk030720131127\",\"buyerMemberId\":\"b2b-1910200716\",\"buyerMobile\":\"13871010307\",\"buyerPhone\":\"\",\"buyerRateStatus\":5,\"carriage\":0,\"codActualFeecod\":17585100,\"codAudit\":false,\"codBuyerFee\":0,\"codFeecod\":0,\"codSellerFee\":0,\"codStatus\":0,\"discount\":-17545100,\"discountFee\":0,\"gmtCreate\":\"2013-11-27 10:12:12\",\"gmtModified\":\"2013-11-27 07:05:01\",\"id\":464827068711607,\"invoiceModel\":{\"bankAndAccount\":\"汉口银行友谊支行 101030120109000377\",\"invoiceCompanyName\":\"武汉精达自动化设备有限公司\",\"invoiceId\":599003,\"receiveAddress\":\"湖北省 武汉市 江汉区 新华路349号 新华豪庭A2-801\",\"receiveMobile\":\"13871010307\",\"receiveName\":\"胡建东\",\"receivePost\":\"430022\",\"taxpayerIdentify\":\"42010374144512X\"},\"logisticsStatus\":1,\"orderEntryList\":{\"orderEntry\":[{\"discountPrice\":351702,\"entryCodStatus\":0,\"entryDiscount\":-17545100,\"entryStatus\":\"waitbuyerpay\",\"id\":464827068711607,\"itemDiscountFee\":17585100,\"offerModel\":{\"amount\":20150,\"amountOnSale\":20050,\"detailsUrl\":\"/offer/35259319626.html\",\"gmtApproved\":\"2013-10-19 09:15:52\",\"gmtCreate\":\"2013-10-08 01:01:23\",\"gmtExpire\":\"2014-04-17 09:15:52\",\"gmtLastRepost\":\"2013-11-27 10:12:13\",\"gmtModified\":\"2013-11-27 10:12:13\",\"imageList\":{\"image\":[{\"imageURI\":\"img/ibank/2013/060/534/1030435060_910356506.jpg\",\"searchImageURI\":\"img/ibank/2013/060/534/1030435060_910356506.search.jpg\",\"size120x120ImageURI\":\"img/ibank/2013/060/534/1030435060_910356506.120x120.jpg\",\"size220x220ImageURI\":\"img/ibank/2013/060/534/1030435060_910356506.220x220.jpg\",\"size310x310ImageURI\":\"img/ibank/2013/060/534/1030435060_910356506.310x310.jpg\",\"summImageURI\":\"img/ibank/2013/060/534/1030435060_910356506.summ.jpg\"}]},\"isOfferSupportOnlineTrade\":true,\"isPrivate\":false,\"isSkuOffer\":true,\"isSkuTradeSupported\":false,\"isSupportMix\":true,\"memberId\":\"cnabblp\",\"offerId\":35259319626,\"offerStatus\":\"PUBLISHED\",\"postCategryId\":1032248,\"priceRangeList\":{\"priceRange\":[{\"beginAmount\":1,\"endAmount\":0,\"price\":3517.02}]},\"priceUnit\":\"元\",\"privateProperties\":\"\",\"productFeatureList\":{\"featureAttribute\":[{\"fid\":821,\"name\":\"额定电压\",\"value\":\"Max 1000V AC\"},{\"fid\":3151,\"name\":\"型号\",\"value\":\"UMC22-FBP.0 (ATEX)\"},{\"fid\":819,\"name\":\"额定电流\",\"value\":\"0.24A~63A（可通过外置互感器扩展）\"},{\"fid\":2176,\"name\":\"品牌\",\"value\":\"ABB\"},{\"fid\":100135115,\"name\":\"物料编号\",\"value\":\"10056982\"},{\"fid\":367,\"name\":\"产品认证\",\"value\":\"Atex, cULus, uL, CB, DNV, Gost, CE, CCC\"},{\"fid\":100000729,\"name\":\"加工定制\",\"value\":\"否\"},{\"fid\":100020238,\"name\":\"型号报价\",\"value\":\"4509\"}]},\"qualityLevel\":4,\"saledCount\":100,\"subject\":\"ABB 智能电动机控制单元UMC22-FBP.0 (ATEX);10056982\",\"termOfferProcess\":180,\"tradeType\":\"PRODUCT\",\"type\":\"SALE\"},\"offerSnapshotImageUrlList\":{\"offerSnapshotImage\":[{\"imgUrl\":\"http://img.china.alibaba.com:80/img/order/trading/706/117/860728464/1030435060_910356506.310x310.jpg\",\"midImgUrl\":\"http://img.china.alibaba.com:80/img/order/trading/706/117/860728464/1030435060_910356506.310x310.150x150.jpg\",\"summImgUrl\":\"http://img.china.alibaba.com:80/img/order/trading/706/117/860728464/1030435060_910356506.310x310.summ2.jpg\"}]},\"price\":351702,\"productName\":\"ABB 智能电动机控制单元UMC22-FBP.0 (ATEX);10056982\",\"productPic\":\"/706/117/860728464/1030435060_910356506.310x310.jpg\",\"quantity\":100,\"sourceId\":35259319626}]},\"payStatus\":1,\"refundPayment\":0,\"refundStatus\":\"\",\"sellerAlipayId\":\"2088301275765325\",\"sellerCompanyName\":\"ABB(中国)有限公司上海分公司\",\"sellerEmail\":\"yin.wang@cn.abb.com\",\"sellerMemberId\":\"cnabblp\",\"sellerMobile\":\"13801100259\",\"sellerOrderMemo\":{\"gmtCreate\":\"2013-11-27 10:12:12\",\"gmtModified\":\"2013-11-27 07:05:01\",\"memberId\":\"cnabblp\",\"remark\":\"=#1#=\",\"remarkIcon\":\"1\"},\"sellerPhone\":\"86-010-64231584\",\"sellerRateStatus\":5,\"status\":\"waitbuyerpay\",\"stepPayAll\":false,\"sumPayment\":17585100,\"sumProductPayment\":35170200,\"toAddress\":\"湖北省 武汉市 江汉区 新华路349号 新华豪庭A2-801\",\"toArea\":\"江汉区\",\"toCity\":\"武汉市\",\"toFullName\":\"胡建东\",\"toMobile\":\"13871010307\",\"toPost\":\"430022\",\"toProvince\":\"湖北省\",\"toStree\":\"新华路349号 新华豪庭A2-801\",\"tradeType\":\"6\"}}";
		 OrderModel  orderModel = JSON.parseObject(content, OrderModel.class);
		 String xmlcontent = new XStream().toXML(orderModel);
		 System.out.println(xmlcontent);
		 OrderModel newOrderModel = (OrderModel) new XStream().fromXML(xmlcontent);
		 System.out.println(newOrderModel);
	}

}
