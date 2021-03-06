package com.dlkyy.service.impl;

import com.dlkyy.dao.GoodsDao;
import com.dlkyy.dao.SaleDao;
import com.dlkyy.entity.Goods;
import com.dlkyy.entity.Sale;
import com.dlkyy.excep.NotEnoughException;
import com.dlkyy.service.BuyGoodService;

/**
 * Created by dlkyy on 2021/3/5 20:48
 */
public class BuyGoodServiceImpl implements BuyGoodService {

  private SaleDao salDao;
  private GoodsDao goodsDao;

  public BuyGoodServiceImpl() {
  }

  public BuyGoodServiceImpl(SaleDao salDao, GoodsDao goodsDao) {
    this.salDao = salDao;
    this.goodsDao = goodsDao;
  }

  @Override
  public void buy(Integer goodsId, Integer nums) {
    System.out.println("buy begin!");
    // 记录销售信息，向销售表添加记录
    Sale sale = new Sale();
    sale.setGid(goodsId);
    sale.setNums(nums);
    salDao.insertSale(sale);

    // 查询
    Goods goods = goodsDao.selectGoods(goodsId);

    if(goods == null){
     // 商品不存在
     throw new NotEnoughException("编号是：" + goodsId + "商品不存在");
    }else if(goods.getAmount() < nums){
      // 库存不足
      throw new NotEnoughException("编号是：" + goodsId + "库存不足");
    }
    // 库存修改
    Goods buyGoods = new Goods();
    buyGoods.setId(goodsId);
    buyGoods.setAmount(nums);
    goodsDao.updateGoods(buyGoods);

    System.out.println("buy finish!");
  }

  public void setSalDao(SaleDao salDao) {
    this.salDao = salDao;
  }

  public void setGoodsDao(GoodsDao goodsDao) {
    this.goodsDao = goodsDao;
  }
}
