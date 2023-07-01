package com.example.uasmobile_alquran.adapter;

import com.example.uasmobile_alquran.model.DataSurahItem;

import java.util.List;

public interface IViewSurah {
    void getDetailSurah(List<DataSurahItem> data);

    void onErrorMsg(String msg);
}
