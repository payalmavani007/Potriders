package pro.sau.potriders.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import pro.sau.potriders.Adapters.MyCustomPagerAdapter;
import pro.sau.potriders.Adapters.TabsPagerAdapter;
import pro.sau.potriders.Fragments.DescriptionFragment;
import pro.sau.potriders.Fragments.EffectFragment;
import pro.sau.potriders.Fragments.ReviewFragment;
import pro.sau.potriders.R;


public class ListPreview extends AppCompatActivity {

    private ViewPager viewPager,imagepager;
    int images[] = {R.drawable.bluedrumweed, R.drawable.loginbg, R.drawable.listimages, R.drawable.background};
    MyCustomPagerAdapter myCustomPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_preview);
        initalition();
    }

    private void initalition() {

        imagepager = findViewById(R.id.imagepager);
        TabLayout tabLayout =  findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(imagepager, true);
        myCustomPagerAdapter = new MyCustomPagerAdapter(ListPreview.this, images);
        imagepager.setAdapter(myCustomPagerAdapter);
        viewPager =  findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout =  findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        TabsPagerAdapter adapter = new TabsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new DescriptionFragment(), "DESCRIPTION");
        adapter.addFragment(new EffectFragment(), "EFFECT");
        adapter.addFragment(new ReviewFragment(), "REVIEW");
        viewPager.setAdapter(adapter);
    }
}