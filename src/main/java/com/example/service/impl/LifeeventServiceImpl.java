package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Lifeevent;
import com.example.mapper.LifeeventMapper;
import com.example.service.ILifeeventService;
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
public class LifeeventServiceImpl extends ServiceImpl<LifeeventMapper, Lifeevent> implements ILifeeventService {

}
