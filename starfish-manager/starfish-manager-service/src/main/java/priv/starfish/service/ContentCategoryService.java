package priv.starfish.service;

import priv.starfish.common.pojo.EUTreeNode;
import priv.starfish.common.pojo.TaotaoResult;

import java.util.List;

public interface ContentCategoryService {

    List<EUTreeNode> getCategoryList(long parentId);

    TaotaoResult insertContentCategory(long parentId, String name);
}
