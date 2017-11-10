package priv.starfish.back.service;

import priv.starfish.pojo.TbContent;

import java.util.List;


public interface ContentService {

	List<TbContent> getContentList(long contentCid);
}
