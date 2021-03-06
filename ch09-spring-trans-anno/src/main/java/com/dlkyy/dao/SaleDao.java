package com.dlkyy.dao;

import com.dlkyy.entity.Sale;

/**
 * Created by dlkyy on 2021/3/5 20:19
 */
public interface SaleDao {
  // 增加销售记录
  void insertSale(Sale sale);
}
