package com.java110.order.listener;

import com.java110.core.event.AppListener;
import com.java110.core.event.AppMerchantEvent;
import com.java110.core.event.Ordered;

/**
 * Created by wuxw on 2017/4/14.
 */
public class MerchantDispatchListener implements AppListener<AppMerchantEvent>,Ordered {

    private final static int order = Ordered.dafultValue+1;

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    public void onJava110Event(AppMerchantEvent event) {
        //这里处理 商户相关信息
    }
}
