package com.example.demo.Factory;

import com.example.demo.Domain.AssetRegister;

import java.util.Date;
import java.util.Map;

/**
 * Created by Adeebo on 2017/08/12.
 */
public class AssetRegisterFactory {

    public static AssetRegister getAssetRegister (Map<String, String> values, Date date, float assetValue, int assetQuantity){

        AssetRegister assets = new AssetRegister.Builder()
                .assetID(values.get("assetID"))
                .date(date)
                .assetName(values.get("assetName"))
                .assetDescription(values.get("assetDescription"))
                .assetValue(assetValue)
                .assetQuantity(assetQuantity)
                .assetState(values.get("assetState"))
                .build();

        return assets;
    }
}

