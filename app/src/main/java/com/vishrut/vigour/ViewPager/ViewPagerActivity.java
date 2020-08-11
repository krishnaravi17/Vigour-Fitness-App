package com.vishrut.vigour.ViewPager;


import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.vishrut.vigour.Startup.HomePageFragment;
import com.vishrut.vigour.R;


public class ViewPagerActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        pager.setAdapter(new IntroPagerAdapter(getSupportFragmentManager()));
        ViewPagerConfig indicator = (ViewPagerConfig) findViewById(R.id.indicator);
        indicator.setViewPager(pager);


    }

    public class IntroPagerAdapter extends FragmentPagerAdapter {

        public IntroPagerAdapter(FragmentManager fm) {

            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // return new HomePageFragment();
            switch (position) {
                case 0:
                    return new ViewPagerFragment1();
                case 1:
                    return new ViewPagerFragment2();
                case 2:
                    return new ViewPagerFragment3();
                case 3:
                    return new ViewPagerFragment4();
                case 4:
                    return new ViewPagerFragment5();
                case 5:
                    return new HomePageFragment();
            }
            return null;

        }

        @Override
        public int getCount() {
            return 6;
        }


    }
}

