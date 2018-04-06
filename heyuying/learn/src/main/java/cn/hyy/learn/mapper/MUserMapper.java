package cn.hyy.learn.mapper;

import cn.hyy.learn.domain.condition.UserCondition;
import cn.hyy.learn.to.resp.GeneralUserTo;

import java.util.List;

/**
 * Created by heyuying on 18-4-6
 */
public interface MUserMapper {
    List<GeneralUserTo> selectGeneralByExample(UserCondition condition);
}
