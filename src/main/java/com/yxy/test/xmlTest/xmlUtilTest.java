package com.yxy.test.xmlTest;

//import com.jd.bk.common.util.xml.ParseXml;
//import com.jd.bk.common.util.xml.XmlUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by syyanxiangyu on 2015/1/26.
 */
public class xmlUtilTest {

    public static void main(String[] args){

        List<JoslReceiptD> list = new ArrayList<JoslReceiptD>();

        JoslReceiptD joslReceiptD = new JoslReceiptD();
        joslReceiptD.setSEQNO("9b9095cf-5a5b-4414-ba8f-e741a8f6a954");
        joslReceiptD.setSheetid("JPO012416");
        joslReceiptD.setLocNo("2");
        joslReceiptD.setSerialid("1");
        joslReceiptD.setGoodsid("JG00145400");
        joslReceiptD.setQty("9");
        joslReceiptD.setGoodsName("XXXXXXX");
        joslReceiptD.setExpectedQty("");
        joslReceiptD.setPackingUnit("");
        joslReceiptD.setDiffQty("");
        joslReceiptD.setShortQty("");
        joslReceiptD.setDamagedQty("");
        joslReceiptD.setEmptyQty("");
        joslReceiptD.setExpiredQty("");
        joslReceiptD.setOtherQty("");
        joslReceiptD.setRemark("");

//        list.add(joslReceiptD);



        JoslReceiptM joslReceiptM =new JoslReceiptM();
        joslReceiptM.setId("8142");
        joslReceiptM.setSEQNO("9b9095cf-5a5b-4414-ba8f-e741a8f6a954");//防重码 不是必填
        joslReceiptM.setSheetid("JPO012416");//入库单号
        joslReceiptM.setSheetType("1");//入库类型 固定值1
        joslReceiptM.setCustomID("1");
        joslReceiptM.setOperator("xll33213");
        joslReceiptM.setStatus("1");
        joslReceiptM.setOperatorID("0");
        joslReceiptM.setLocNo("2");
        joslReceiptM.setTotalQty("100");
        joslReceiptM.setIsDiff("");
        joslReceiptM.setDiffRemark("");
        if(list.size()>0){

            joslReceiptM.setJosl_receipt_d(list);
        }

//        String s = XmlUtil.objectToXml(joslReceiptM,null);

//        ParseXml px = new ParseXml();
//        try {
//            String ss =px.objListToXml(list);
//            System.out.println(ss);
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {+
//            e.printStackTrace();
//        }


//        System.out.println(s.replace("josl__receipt__d","josl_receipt_d").replace("test.xmlTest.JoslReceiptD","JoslReceiptD").replaceFirst("JoslReceiptM","JoslReceiptM xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\""));
    }

}
