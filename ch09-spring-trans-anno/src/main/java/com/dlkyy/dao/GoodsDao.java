package com.dlkyy.dao;

import com.dlkyy.entity.Goods;

/**
 * Created by dlkyy on 2021/3/5 20:25
 */
public interface GoodsDao {
  // 更新库存
  // goods表示本次用户购买的商品信息，id，购买数量
  void updateGoods(Goods goods);
  // 查询商品信息
  Goods selectGoods(Integer id);
}
