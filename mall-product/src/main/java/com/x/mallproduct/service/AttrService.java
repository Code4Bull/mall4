package com.x.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x.common.utils.PageUtils;
import com.x.mallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author kengsir
 * @email czlsk62@gmail.com
 * @date 2024-03-03 22:12:16
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

