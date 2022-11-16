package com.dolunayarge.newsportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.dolunayarge.newsportal.Models.NewsHeadlines;
import com.squareup.picasso.Picasso;

import java.net.URL;
import java.net.URLConnection;

public class DetailsActivity extends AppCompatActivity {
    NewsHeadlines headlines;
    TextView txt_title, txt_author, txt_time, txt_detail, txt_content;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt_title = findViewById(R.id.text_detail_title);
        txt_author = findViewById(R.id.text_detail_author);
        txt_time = findViewById(R.id.text_detail_time);
        txt_detail = findViewById(R.id.text_detail_detail);
        img_news = findViewById(R.id.img_detail_news);
        headlines = (NewsHeadlines) getIntent().getSerializableExtra("data");
        //URL bağlantısı eksik

        txt_title.setText(headlines.getTitle());
        txt_author.setText(headlines.getAuthor());
        txt_time.setText(headlines.getPublishedAt());
        txt_detail.setText(headlines.getDescription());

        Picasso.get().load(headlines.getUrlToImage()).into(img_news);
    }
}