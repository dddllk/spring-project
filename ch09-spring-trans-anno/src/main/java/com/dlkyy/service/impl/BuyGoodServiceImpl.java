package com.dlkyy.service.impl;

import com.dlkyy.dao.GoodsDao;
import com.dlkyy.dao.SaleDao;
import com.dlkyy.entity.Goods;
import com.dlkyy.entity.Sale;
import com.dlkyy.excep.NotEnoughException;
import com.dlkyy.service.BuyGoodService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

  /**
   * @param goodsId
   * @param nums
   *    rollbackFor：表示发生指定的异常一定回滚
   *      处理逻辑：
   *          1.spring框架会首先去检查你方法抛出的异常是不是在rollbackFor的属性值中
   *              如果异常在rollbackFor列表中，不管是什么类型的异常，一定回滚
   *          2.如果你抛出的异常不在rollbackFor的列表中，spring会判断异常是不是RuntimeException，
   *            如果是一定回滚
   */
  /*@Transactional(
      propagation = Propagation.REQUIRED,
      isolation = Isolation.DEFAULT,
      readOnly = false,
      rollbackFor = {
          NullPointerException.class,
          NotEnoughException.class
      }
  )
  // 注释的代码等同于@Transaction
   */
  // 使用的事务控制的默认值
  // 默认的传播行为是REQUIRED，默认的隔离级别是DEFAULT
  // 默认抛出运行时异常，回滚事务。
  // 注解通常加在要有事务的公共方法上
  // 也可以加在类的上面，表示这个类的所有公共方法都具有这个事务，但是意义不大
  @Transactional
  @Override
  public void buy(Integer goodsId, Integer nums) {
    System.out.println("===buy方法开始====");
    // 记录销售信息，向销售表添加记录
    Sale sale = new Sale();
    sale.setGid(goodsId);
    sale.setNums(nums);
    salDao.insertSale(sale);

    // 查询
    Goods goods = goodsDao.selectGoods(goodsId);

    if(goods == null){
     // 商品不存在
     throw new NullPointerException("编号是：" + goodsId + "商品不存在");
    }else if(goods.getAmount() < nums){
      // 库存不足
      throw new NotEnoughException("编号是：" + goodsId + "库存不足");
    }
    // 库存修改
    Goods buyGoods = new Goods();
    buyGoods.setId(goodsId);
    buyGoods.setAmount(nums);
    goodsDao.updateGoods(buyGoods);

    System.out.println("===buy方法结束====");
  }

  public void setSalDao(SaleDao salDao) {
    this.salDao = salDao;
  }

  public void setGoodsDao(GoodsDao goodsDao) {
    this.goodsDao = goodsDao;
  }
}
