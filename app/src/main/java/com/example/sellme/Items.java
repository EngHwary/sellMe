package com.example.sellme;

public class Items {

    private String itemNo;
    private String itemInfo;


    public Items(String itemNo, String itemInfo) {
        this.itemNo = itemNo;
        this.itemInfo = itemInfo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public String getItemInfo() {
        return itemInfo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public void setItemInfo(String itemInfo) {
        this.itemInfo = itemInfo;
    }
}
