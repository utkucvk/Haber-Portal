package com.dolunayarge.newsportal;

import com.dolunayarge.newsportal.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse>{
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}