package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Achievement;
import com.example.mapper.AchievementMapper;
import com.example.service.IAchievementService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zck
 * @since 2022-11-19
 */
@Service
public class AchievementServiceImpl extends ServiceImpl<AchievementMapper, Achievement> implements IAchievementService {

}
