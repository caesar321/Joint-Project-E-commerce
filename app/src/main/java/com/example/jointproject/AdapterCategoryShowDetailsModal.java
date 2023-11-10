package com.example.jointproject;

public class AdapterCategoryShowDetailsModal {
    private String id,ImageCSDM,productCSDM,priceCSDM,categoryCSDM;

    public AdapterCategoryShowDetailsModal(String id,String imageCSDM, String productCSDM, String priceCSDM, String categoryCSDM) {
        id=id;
        ImageCSDM = imageCSDM;
        this.productCSDM = productCSDM;
        this.priceCSDM = priceCSDM;
        this.categoryCSDM = categoryCSDM;
    }

    public String getImageCSDM() {
        return ImageCSDM;
    }

    public void setImageCSDM(String imageCSDM) {
        ImageCSDM = imageCSDM;
    }

    public String getProductCSDM() {
        return productCSDM;
    }

    public void setProductCSDM(String productCSDM) {
        this.productCSDM = productCSDM;
    }

    public String getPriceCSDM() {
        return priceCSDM;
    }

    public void setPriceCSDM(String priceCSDM) {
        this.priceCSDM = priceCSDM;
    }

    public String getCategoryCSDM() {
        return categoryCSDM;
    }

    public void setCategoryCSDM(String categoryCSDM) {
        this.categoryCSDM = categoryCSDM;
    }
}
