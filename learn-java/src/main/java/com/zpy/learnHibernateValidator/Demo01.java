package com.zpy.learnHibernateValidator;

import org.hibernate.validator.HibernateValidator;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @author Zhang Pengyu
 * @description 学习使用HibernateValidator参数校验
 * @date 2022/10/21 10:30
 * @since JDK 1.8
 **/
public class Demo01 {


    //初始化一个校验器工厂
    private static ValidatorFactory validatorFactory = Validation
            .byProvider(HibernateValidator.class)
            .configure()
            //校验失败是否立即返回： true-遇到一个错误立即返回不在往下校验，false-校验完所有字段才返回
            .failFast(false)
            .buildValidatorFactory();
    Validator validator = validatorFactory.getValidator();

    /**
     * 简单对象校验
     */
    @Test
    public void testSimple() {
        SimpleBean s = new SimpleBean();
        s.setAge(5);
        s.setName(" ");
        s.setEmail("email");

        Set<ConstraintViolation<SimpleBean>> result = validator.validate(s);

        System.out.println("遍历输出错误信息:");
        //getPropertyPath() 获取属性全路径名
        //getMessage() 获取校验后的错误提示信息
        result.forEach(r -> System.out.println(r.getPropertyPath() + ":" + r.getMessage()));
    }


}
