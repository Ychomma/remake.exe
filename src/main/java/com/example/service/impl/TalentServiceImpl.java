package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Talent;
import com.example.mapper.TalentMapper;
import com.example.service.ITalentService;
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
public class TalentServiceImpl extends ServiceImpl<TalentMapper, Talent> implements ITalentService {

}
