package com.example.jointproject;

public class CategoryModal {
    private String  id,Image,TxtCategory;

    public CategoryModal(String id,String image, String txtCategory) {
        id=id;
        Image = image;
        TxtCategory = txtCategory;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getTxtCategory() {
        return TxtCategory;
    }

    public void setTxtCategory(String txtCategory) {
        TxtCategory = txtCategory;
    }
}
