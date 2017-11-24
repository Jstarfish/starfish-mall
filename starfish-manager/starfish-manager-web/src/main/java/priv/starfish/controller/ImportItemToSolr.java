package priv.starfish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.starfish.common.pojo.TaotaoResult;
import priv.starfish.common.utils.HttpClientUtil;

/**
 * Created by starfish on 2017/11/14.
 */

@Controller
public class ImportItemToSolr {

    @RequestMapping("/index/import")
    @ResponseBody
    public TaotaoResult importAllItems() {

        try{
            String json = HttpClientUtil.doGet("http://localhost:8891/search/manager/importall", null);
        }catch (Exception e){
            e.printStackTrace();
        }
        // TaotaoResult result = itemService.importAllItems();
        return null;
    }
}
