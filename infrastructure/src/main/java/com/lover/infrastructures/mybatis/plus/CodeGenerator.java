package com.lover.infrastructures.mybatis.plus;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.TemplateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.baomidou.mybatisplus.generator.fill.Property;
import com.lover.infrastructures.mybatis.BaseEntity;
import com.lover.infrastructures.mybatis.EntityBaseMapper;
import com.lover.infrastructures.service.BaseService;
import com.lover.infrastructures.service.IBaseService;

import java.util.Collections;

/**
 * @Description: 代码自动生成
 * @Author: Keen
 * @Date: 2022/11/8
 * @Version: 1.0
 */

public class CodeGenerator {

    public static void main(String[] args) {
        generateMyBatis();
    }

    public static void generateMyBatis(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/start-lover?useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai","root","root")
                .globalConfig(builder -> {
                    builder.author("Keen")
                            .outputDir("F:\\Java\\Spring\\start-love\\domain\\src\\main\\java\\")
                            .disableOpenDir()
                            .fileOverride()
                            .build();
                }).packageConfig(builder -> {
                    builder.parent("com.lover")
                            .moduleName("")
                            .entity("entity")
                            .service("service")
                            .serviceImpl("service.Impl")
                            .other("dto")
                            .mapper("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.xml,"F:\\Java\\Spring\\start-love\\domain\\src\\main\\resources\\mapper"))
                            .build();
                }).strategyConfig(builder -> {
                    builder
                            .addExclude("user_role","role_menu")
                            .entityBuilder()
                            .disableSerialVersionUID()
                            .superClass(BaseEntity.class)
                            .naming(NamingStrategy.underline_to_camel)
                            .columnNaming(NamingStrategy.no_change)
                            .enableLombok()
                            .addSuperEntityColumns("id", "createBy", "createTime", "updateBy", "updateTime")
                            .addTableFills(new Column("createTime", FieldFill.INSERT))
                            .addTableFills(new Property("updateTime", FieldFill.INSERT_UPDATE))
                            .idType(IdType.AUTO)
                            .build();
                    builder.serviceBuilder()
                            .superServiceClass(IBaseService.class)
                            .superServiceImplClass(BaseService.class)
                            .build();
                    builder.mapperBuilder()
                            .superClass(EntityBaseMapper.class)
                            .build();
                }).templateEngine(new FreemarkerTemplateEngine())
                .templateConfig(builder -> {
                    builder.disable(TemplateType.CONTROLLER);
                }).injectionConfig(builder -> {
                })
                .execute();
    }
}
