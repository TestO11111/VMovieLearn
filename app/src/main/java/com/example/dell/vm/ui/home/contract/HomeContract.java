package com.example.dell.vm.ui.home.contract;

import com.example.mvplibrary.base.BaseModel;
import com.example.mvplibrary.base.BasePresenter;
import com.example.mvplibrary.base.BaseView;

/**
 * Created by dell on 2017/4/5.
 */

public interface HomeContract {
    abstract class HomeMainContractPresenter extends BasePresenter<HomeMainModelI,HomeMainView>{

    }

    interface HomeMainModelI extends BaseModel{

    }

    interface HomeMainView extends BaseView{
        void returnHomeBean();
    }

}
