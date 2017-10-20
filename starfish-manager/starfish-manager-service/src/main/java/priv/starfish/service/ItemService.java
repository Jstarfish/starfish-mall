package priv.starfish.service;

import priv.starfish.common.pojo.EUDataGridResult;
import priv.starfish.common.pojo.TaotaoResult;
import priv.starfish.pojo.TbItem;

/**
 * Created by starfish on 2017/10/17.
 */
public interface ItemService {

    TbItem getItemById(long itemId);

    EUDataGridResult getItemList(int page, int rows);

    TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
