package com.example.test.DTO;

public class OneItemDto {
    private String item;


    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OneItemDto{" +
                "item='" + item + '\'' +
                '}';
    }


}
