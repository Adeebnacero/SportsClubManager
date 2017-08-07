package com.example.demo.Domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Adeebo on 2017/08/06.
 */
public class AssetRegister implements Serializable {

    private String assetID;
    private Date date;
    private String assetName;
    private String assetDescription;
    private float assetValue;
    private int assetQuantity;
    private String assetState;

    public AssetRegister() {
    }

    public AssetRegister (Builder builder){

        this.assetID = builder.assetID;
        this.date = builder.date;
        this.assetName = builder.assetName;
        this.assetDescription = builder.assetDescription;
        this.assetValue = builder.assetValue;
        this.assetQuantity = builder.assetQuantity;
        this.assetState = builder.assetState;
    }

    public static class Builder {

        private String assetID;
        private Date date;
        private String assetName;
        private String assetDescription;
        private float assetValue;
        private int assetQuantity;
        private String assetState;

        public Builder assetID(String value) {
            this.assetID = value;
            return this;
        }

        public Builder date(Date value) {
            this.date = value;
            return this;
        }

        public Builder assetName(String value) {
            this.assetName = value;
            return this;
        }

        public Builder assetDescription(String value) {
            this.assetDescription = value;
            return this;
        }

        public Builder assetValue(float value) {
            this.assetValue = value;
            return this;
        }

        public Builder assetQuantity(int value) {
            this.assetQuantity = value;
            return this;
        }

        public Builder assetState(String value) {
            this.assetState = value;
            return this;
        }

        public AssetRegister build(){

            return new AssetRegister(this);
        }
    }

    public String getAssetID() {
        return assetID;
    }

    public Date getDate() {
        return date;
    }

    public String getAssetName() {
        return assetName;
    }

    public String getAssetDescription() {
        return assetDescription;
    }

    public float getAssetValue() {
        return assetValue;
    }

    public int getAssetQuantity() {
        return assetQuantity;
    }

    public String getAssetState() {
        return assetState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssetRegister)) return false;

        AssetRegister that = (AssetRegister) o;

        return assetID.equals(that.assetID);

    }

    @Override
    public int hashCode() {
        return assetID.hashCode();
    }
}
