package com.java110.common.constant;

/**
 * 域常量定义类
 *
 * 域变量生成方式为：
 *
 * DOMAIN.+表名称
 *
 * 表示这个域专属于这个表的域，不管是status 还是 attr 还是其他需要用到域的地方
 * Created by wuxw on 2017/4/24.
 */
public class DomainContant {

    /************************************ITEM_DOMAIN START****************************************/

    public final static String ATTR_DOMAIN_PROD="DOMAIN.PROD";//产品域
    public final static String ATTR_DOMAIN_OFFER="DOMAIN.OFFER";//销售品域
    public final static String ATTR_DOMAIN_ORDER_LIST="DOMAIN.ORDER_LIST";//购物车域
    public final static String ATTR_DOMAIN_BUSI_ORDER="DOMAIN.BUSI_ORDER";//订单项域
    public final static String ATTR_DOMAIN_CUST="DOMAIN.CUST";//客户域
    public final static String ATTR_DOMAIN_ACCOUNT="DOMAIN.ACCOUNT";//账户域

    /************************************ITEM_DOMAIN END****************************************/
}
