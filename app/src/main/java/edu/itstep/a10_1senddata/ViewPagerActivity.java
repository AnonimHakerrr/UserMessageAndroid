package edu.itstep.a10_1senddata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager2 pager;
    private SliderAdapter adapter;
    private List<Slide> slides;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        pager = findViewById(R.id.pager);
        slides = Db.getAllSlides();
        adapter = new SliderAdapter(this, slides);
        pager.setAdapter(adapter);
        pager.setPageTransformer(new Zoom());

    }
}