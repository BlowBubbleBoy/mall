package com.bubbleboy.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bubbleboy.common.service.impl.CrudServiceImpl;
import com.bubbleboy.modules.product.dao.PmsCategoryDao;
import com.bubbleboy.modules.product.dto.PmsCategoryDTO;
import com.bubbleboy.modules.product.entity.PmsCategoryEntity;
import com.bubbleboy.modules.product.service.PmsCategoryService;
import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 商品三级分类
 *
 * @author bubbleboy lishicheng11400@gmail.com
 * @since 1.0.0 2024-09-01
 */
@Service
public class PmsCategoryServiceImpl extends CrudServiceImpl<PmsCategoryDao, PmsCategoryEntity, PmsCategoryDTO> implements PmsCategoryService {

    @Autowired
    private PmsCategoryDao pmsCategoryDao;

    @Override
    public QueryWrapper<PmsCategoryEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<PmsCategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


    @Override
    public List<PmsCategoryEntity> treeList() {

        List<PmsCategoryEntity> categoryList = pmsCategoryDao.selectList(null);

        Map<Long, List<PmsCategoryEntity>> map = categoryList.stream()
                .collect(Collectors.groupingBy(PmsCategoryEntity::getParentCid));

        categoryList.sort((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort())
                    - (menu2.getSort() == null ? 0 : menu2.getSort());
        });


        List<PmsCategoryEntity> rootList = map.getOrDefault(0L, new ArrayList<>());

        for (PmsCategoryEntity root : rootList) {
            root.setChildren(getChildren(root, map));
        }

        return rootList;
    }

    private List<PmsCategoryEntity> getChildren(PmsCategoryEntity root, Map<Long, List<PmsCategoryEntity>> map) {

        List<PmsCategoryEntity> children = map.getOrDefault(root.getCatId(), new ArrayList<>());

        for (PmsCategoryEntity child : children) {
            child.setChildren(getChildren(child, map));
        }

        return children;
    }
}