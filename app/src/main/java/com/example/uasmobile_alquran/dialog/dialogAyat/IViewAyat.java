package com.example.uasmobile_alquran.dialog.dialogAyat;

import com.example.uasmobile_alquran.model.DataAyatItem;

import java.util.List;

import tam.pa.alquran.model.DataAyatItem;

public interface IViewAyat {
    void onGetDataAyat(List<DataAyatItem> data);

    void onGetDataAyat(List<DataAyatItem> data);

    void onErrorMsg(String msg);
}
