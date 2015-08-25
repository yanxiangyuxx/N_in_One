package com.yxy.test.fastJson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GeiousCycleStagesFMDTO implements Serializable {
	private static final long serialVersionUID = 3087361569067565402L;
	private Long txnDetailId;//分期单交易流水号	
	private Long cycleId;//账期单编号	
	private Integer cycleNo;//分期单编号	
	private BigDecimal psPrcpAmt;//分期单本金金额	
	private BigDecimal psFeeAmt;//分期单费用金额
    private Date txnTime;//分期创建时间
	private Date psBeginDate;//分期开始时间	
	private Date psDueDate;//应还款日期	
	private Integer txnDetailType;//交易类型	(20103分期生成,20190分期冲销,20192确认分期)
	private String pin;//用户PIN	
	private Long accountId;//账户编号	
	private String custName;//客户名	
	private Integer productType;//产品ID	
	private String productTypeName;//产品名	
	private Integer merchantChannel;//消费商户编号	
	private String merchantChannelName;//消费商户名	
	public Long getTxnDetailId() {
		return txnDetailId;
	}
	public void setTxnDetailId(Long txnDetailId) {
		this.txnDetailId = txnDetailId;
	}
	public Long getCycleId() {
		return cycleId;
	}
	public void setCycleId(Long cycleId) {
		this.cycleId = cycleId;
	}
	public Integer getCycleNo() {
		return cycleNo;
	}
	public void setCycleNo(Integer cycleNo) {
		this.cycleNo = cycleNo;
	}
	public BigDecimal getPsPrcpAmt() {
		return psPrcpAmt;
	}
	public void setPsPrcpAmt(BigDecimal psPrcpAmt) {
		this.psPrcpAmt = psPrcpAmt;
	}
	public BigDecimal getPsFeeAmt() {
		return psFeeAmt;
	}
	public void setPsFeeAmt(BigDecimal psFeeAmt) {
		this.psFeeAmt = psFeeAmt;
	}
    public Date getTxnTime() {
        return txnTime;
    }
    public void setTxnTime(Date txnTime) {
        this.txnTime = txnTime;
    }
    public Date getPsBeginDate() {
		return psBeginDate;
	}
	public void setPsBeginDate(Date psBeginDate) {
		this.psBeginDate = psBeginDate;
	}
	public Date getPsDueDate() {
		return psDueDate;
	}
	public void setPsDueDate(Date psDueDate) {
		this.psDueDate = psDueDate;
	}
	public Integer getTxnDetailType() {
		return txnDetailType;
	}
	public void setTxnDetailType(Integer txnDetailType) {
		this.txnDetailType = txnDetailType;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Integer getProductType() {
		return productType;
	}
	public void setProductType(Integer productType) {
		this.productType = productType;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}
	public Integer getMerchantChannel() {
		return merchantChannel;
	}
	public void setMerchantChannel(Integer merchantChannel) {
		this.merchantChannel = merchantChannel;
	}
	public String getMerchantChannelName() {
		return merchantChannelName;
	}
	public void setMerchantChannelName(String merchantChannelName) {
		this.merchantChannelName = merchantChannelName;
	}
	
}
