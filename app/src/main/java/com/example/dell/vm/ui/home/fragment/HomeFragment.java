package com.example.dell.vm.ui.home.fragment;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.example.dell.vm.R;
import com.example.dell.vm.ui.activity.MainActivity;
import com.example.mvplibrary.base.BaseFragment;

import butterknife.BindView;

/**
 * Created by dell on 2017/4/5.
 */

public class HomeFragment  extends BaseFragment implements ViewPager.OnPageChangeListener,MainActivity.OnTitleClickListener {

    private MainActivity mMainActivity;
    @BindView(R.id.home_page_viewPager)
    ViewPager mViewPager;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            mMainActivity = (MainActivity) context;
            mMainActivity.setOnTitleClickListener(this);
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView() {



        mViewPager.addOnPageChangeListener(this);
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (mMainActivity != null) {
            mMainActivity.moveTitleIndicator(position+positionOffset);
        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if (state== ViewPager.SCROLL_STATE_IDLE) {
            TextView textView1 = (TextView) mMainActivity.findViewById(R.id.activity_main_home_title_channel_list);
            TextView textView0= (TextView) mMainActivity.findViewById(R.id.activity_main_home_title_movie_list);
            switch (mViewPager.getCurrentItem()) {
                case 0:
                    textView1.setTextColor(getResources().getColor(R.color.colorGray6));
                    textView0.setTextColor(getResources().getColor(R.color.colorWhite));
                    break;
                case 1:
                    textView0.setTextColor(getResources().getColor(R.color.colorGray6));
                    textView1.setTextColor(getResources().getColor(R.color.colorWhite));
                    break;
            }
        }
    }

    @Override
    public void onMovieTitleClick() {

    }

    @Override
    public void onChannelTitleClick() {

    }
}
