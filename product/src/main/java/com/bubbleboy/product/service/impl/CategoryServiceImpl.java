package com.bubbleboy.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


import com.bubbleboy.product.dao.CategoryDao;
import com.bubbleboy.product.entity.CategoryEntity;
import com.bubbleboy.product.service.CategoryService;

import java.util.List;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public List<CategoryEntity> getCategoryTree() {

        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        List<CategoryEntity> categoryEntityList = categoryEntities.stream().filter(menu ->
                menu.getParentCid() == 0
        ).map((menu) -> {
            menu.setChildren(getChildren(menu, categoryEntities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return categoryEntityList;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter(child ->
                child.getParentCid() == root.getCatId()

        ).map((menu) -> {
            menu.setChildren(getChildren(menu, all));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return children;
    }
}