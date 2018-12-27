package com.hbb.bean;

import java.util.List;

public interface ShoppingBean {
List<Shopping> selectShop();
void insertShop(Shopping shopping);
void deleteShop(int id);
Shopping selectShopId(int id);
void updateShop(Shopping shopping);
}
