package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Major;
import com.example.mapper.MajorMapper;
import com.example.service.IMajorService;
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
public class MajorServiceImpl extends ServiceImpl<MajorMapper, Major> implements IMajorService {

}
