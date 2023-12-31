package com.project.usoon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.usoon.entity.DishFlavor;
import com.project.usoon.mapper.DishFlavorMapper;
import com.project.usoon.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
