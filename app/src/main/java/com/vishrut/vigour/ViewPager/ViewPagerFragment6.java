package com.vishrut.vigour.ViewPager;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;
import com.vishrut.vigour.R;

public class ViewPagerFragment6 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_view_pager_fragment6, container, false);
        ImageView image = (ImageView) view.findViewById(R.id.viewpagerimage6);
        Picasso.with(getContext()).load(R.drawable.viewpager6).into(image);
        return view;
    }
}
