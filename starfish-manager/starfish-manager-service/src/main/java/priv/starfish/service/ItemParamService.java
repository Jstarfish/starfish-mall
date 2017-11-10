package priv.starfish.service;

import priv.starfish.common.pojo.TaotaoResult;
import priv.starfish.pojo.TbItemParam;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
