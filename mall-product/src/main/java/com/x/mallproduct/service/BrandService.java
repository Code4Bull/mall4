package com.x.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x.common.utils.PageUtils;
import com.x.mallproduct.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author kengsir
 * @email czlsk62@gmail.com
 * @date 2024-03-03 22:12:16
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

