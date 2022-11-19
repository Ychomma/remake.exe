package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Vacation;
import com.example.mapper.VacationMapper;
import com.example.service.IVacationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类`
 * </p>
 *
 * @author zck
 * @since 2022-11-19
 */
@Service
public class VacationServiceImpl extends ServiceImpl<VacationMapper, Vacation> implements IVacationService {

}
