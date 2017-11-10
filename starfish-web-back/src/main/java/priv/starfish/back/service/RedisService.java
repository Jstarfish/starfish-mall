package priv.starfish.back.service;


import priv.starfish.common.pojo.TaotaoResult;

public interface RedisService {

    TaotaoResult syncContent(long contentCid);
}
