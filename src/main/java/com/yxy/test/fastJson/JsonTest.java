package com.yxy.test.fastJson;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by syyanxiangyu on 2015/6/4.
 */
public class JsonTest {


    public static void main(String[] args){


        GeiousCycleStagesFMDTO g = new GeiousCycleStagesFMDTO();

        g.setTxnDetailId(1L);         //���ڵ�������ˮ��
        g.setCycleId(2L);               //���ڵ����
        g.setCycleNo(3);               //���ڵ����
        g.setPsPrcpAmt(BigDecimal.valueOf(4));             //���ڵ�������
        g.setPsFeeAmt(BigDecimal.valueOf(5));//���ڵ����ý��
        g.setTxnTime(new Date());//���ڴ���ʱ��
        g.setPsBeginDate(new Date());//���ڿ�ʼʱ��
        g.setPsDueDate(new Date());//Ӧ��������
        g.setTxnDetailType(20103);//��������	(20103��������,20190���ڳ���,20192ȷ�Ϸ���)
        g.setPin("sdfa");//�û�PIN
        g.setAccountId(6L);//�˻����
        g.setCustName("custName");//�ͻ���
        g.setProductType(7);//��ƷID
        g.setProductTypeName("productName");//��Ʒ��
        g.setMerchantChannel(8);//�����̻����
        g.setMerchantChannelName("channelName");//�����̻���

        System.out.print(JSONObject.toJSONString(g));
    }
}
