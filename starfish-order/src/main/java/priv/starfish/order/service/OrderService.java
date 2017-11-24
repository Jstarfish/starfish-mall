package priv.starfish.order.service;

import java.util.List;

import priv.starfish.common.pojo.TaotaoResult;
import priv.starfish.pojo.TbOrder;
import priv.starfish.pojo.TbOrderItem;
import priv.starfish.pojo.TbOrderShipping;

public interface OrderService {

	TaotaoResult createOrder(TbOrder order, List<TbOrderItem> itemList, TbOrderShipping orderShipping);
}
