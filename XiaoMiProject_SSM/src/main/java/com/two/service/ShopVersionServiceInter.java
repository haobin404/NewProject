package com.two.service;

import java.util.List;

import com.two.bean.ShopVersionBean;

public interface ShopVersionServiceInter {
    abstract List<ShopVersionBean> getShopVersionId(int id);
}
