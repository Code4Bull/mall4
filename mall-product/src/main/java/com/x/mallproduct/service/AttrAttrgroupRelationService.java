package com.x.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x.common.utils.PageUtils;
import com.x.mallproduct.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author kengsir
 * @email czlsk62@gmail.com
 * @date 2024-03-03 22:12:16
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

