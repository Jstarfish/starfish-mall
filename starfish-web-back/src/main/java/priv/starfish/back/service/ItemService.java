package priv.starfish.back.service;


import priv.starfish.common.pojo.TaotaoResult;

public interface ItemService {

    TaotaoResult getItemBaseInfo(long itemId);

    TaotaoResult getItemDesc(long itemId);

    TaotaoResult getItemParam(long itemId);
}
