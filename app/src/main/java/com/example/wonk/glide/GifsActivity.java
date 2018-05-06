package com.example.wonk.glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import static com.bumptech.glide.load.engine.DiskCacheStrategy.SOURCE;


public class GifsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifs);

        ImageView ImageView = (ImageView) findViewById(R.id.iv_gif);

        Glide.with(this)
                .load("https://media.giphy.com/media/3ohs4rclkSSrNGSlFK/giphy.gif")
                .asGif()
                .placeholder(R.drawable.space)
                .diskCacheStrategy(SOURCE)
                .error(R.drawable.space)
                .into(ImageView);

    }

}
