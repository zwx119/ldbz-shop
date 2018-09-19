package cn.ldbz.admin.service;


import cn.ldbz.pojo.TbCategorySecondary;
import cn.ldbz.pojo.LdbzResult;

import java.util.Map;

/**
 * 内容维护
 *
 * @author xubin.
 * @create 2017-02-20 上午11:58
 */


public interface ContentService {


    Map<String, Object> getCategoryList(Integer sEcho, Integer iDisplayStart, Integer iDisplayLength);

    LdbzResult saveCategory(String id, String name, Integer sort_order);

    Map<String,Object> getCategorySecondaryList(Integer sEcho, Integer iDisplayStart, Integer iDisplayLength);

    Map<String,Object> getSearchCategorySecondaryList(String sSearch, Integer sEcho, Integer iDisplayStart, Integer iDisplayLength);

    LdbzResult saveCategorySecondary(TbCategorySecondary categorySecondary);
}
