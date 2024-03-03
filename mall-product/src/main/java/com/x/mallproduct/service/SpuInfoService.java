package com.x.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.x.common.utils.PageUtils;
import com.x.mallproduct.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author kengsir
 * @email czlsk62@gmail.com
 * @date 2024-03-03 22:12:15
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

