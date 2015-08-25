package com.yxy.test.xmlTest;

import java.util.List;

/**
 * Created by syyanxiangyu on 2015/1/26.
 */
public class JoslReceiptM {


    private String Id;
    private String SEQNO;
    private String Sheetid;
    private String SheetType;
    private String CustomID;
    private String Operator;
    private String Status;
    private String OperatorID;
    private String LocNo;
    private String TotalQty;
    private String IsDiff;
    private String DiffRemark;

    private List<JoslReceiptD> josl_receipt_d;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getSEQNO() {
        return SEQNO;
    }

    public void setSEQNO(String SEQNO) {
        this.SEQNO = SEQNO;
    }

    public String getSheetid() {
        return Sheetid;
    }

    public void setSheetid(String sheetid) {
        Sheetid = sheetid;
    }

    public String getSheetType() {
        return SheetType;
    }

    public void setSheetType(String sheetType) {
        SheetType = sheetType;
    }

    public String getCustomID() {
        return CustomID;
    }

    public void setCustomID(String customID) {
        CustomID = customID;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getOperatorID() {
        return OperatorID;
    }

    public void setOperatorID(String operatorID) {
        OperatorID = operatorID;
    }

    public String getLocNo() {
        return LocNo;
    }

    public void setLocNo(String locNo) {
        LocNo = locNo;
    }

    public String getTotalQty() {
        return TotalQty;
    }

    public void setTotalQty(String totalQty) {
        TotalQty = totalQty;
    }

    public String getIsDiff() {
        return IsDiff;
    }

    public void setIsDiff(String isDiff) {
        IsDiff = isDiff;
    }

    public String getDiffRemark() {
        return DiffRemark;
    }

    public void setDiffRemark(String diffRemark) {
        DiffRemark = diffRemark;
    }

    public List<JoslReceiptD> getJosl_receipt_d() {
        return josl_receipt_d;
    }

    public void setJosl_receipt_d(List<JoslReceiptD> josl_receipt_d) {
        this.josl_receipt_d = josl_receipt_d;
    }
}
