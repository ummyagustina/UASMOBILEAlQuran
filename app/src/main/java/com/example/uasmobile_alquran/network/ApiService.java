package com.example.uasmobile_alquran.network;

import com.example.uasmobile_alquran.model.DataAyatItem;
import com.example.uasmobile_alquran.model.DataSurahItem;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import com.example.uasmobile_alquran.model.DataSurahItem;
import com.example.uasmobile_alquran.model.DataAyatItem;


public interface ApiService extends Disposable {
    @GET("data")
    Observable<List<DataSurahItem>> getListSurah();

    @GET("surat/{nomor}")
    Observable<List<DataAyatItem>> getDetailAyat(@Path("nomor")String nomor);


}
