package com.lfj.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * 生成代码类
 * @date 2020/9/11 9:12
 * @author lfj
 */
@Slf4j
public class CodeGenerator {


    public static void main(String[] args) {
        //项目根目录  不可修改
        String projectPath = "H:\\workspace\\rc-oa";
        log.info("项目根路径"+projectPath);
        //用来获取Mybatis-Plus.properties文件的配置信息
        ResourceBundle rb = ResourceBundle.getBundle("genreator");

        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        // 生成文件的输出目录
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setFileOverride(true);
        // 开启 activeRecord 模式, 使用entity实体类继承Model类实现CRUD功能
//        gc.setActiveRecord(true);
        // XML 二级缓存
        gc.setEnableCache(false);
        // 生成 mapping.xml 的 ResultMap 映射图
        gc.setBaseResultMap(true);
        // 生成 mapping.xml columnList
        gc.setBaseColumnList(true);
        // 是否打开输出目录
        gc.setOpen(false);
        // 作者
        gc.setAuthor("lfj");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.DM);
        dsc.setTypeConvert(new MySqlTypeConvert());
        //注意Mysql 驱动版本问题 我这为8版本
        dsc.setDriverName(rb.getString("jdbc.Driver"));
        dsc.setUsername(rb.getString("jdbc.username"));
        dsc.setPassword(rb.getString("jdbc.password"));
        dsc.setUrl(rb.getString("jdbc.url"));
        mpg.setDataSource(dsc);

        // mapper.xml 路径
        String mapperPackage = rb.getString("mapper.package");

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
         /** 此处可以修改为您的表前缀，如果没有，注释掉即可*/
         //strategy.setTablePrefix(new String[] { "t_" });
        /** 表名生成策略*/
        strategy.setNaming(NamingStrategy.underline_to_camel);
        /** 需要生成的表*/
        String[] arr = new String[]{
                "meeting_main"
        };
        strategy.setInclude(arr);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(rb.getString("parent"));
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setEntity("entity");
        pc.setMapper("dao");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
            }
        };

        List<FileOutConfig> focList = new ArrayList<>(16);

        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/mapper.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {

                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mapper/" + mapperPackage
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

        // 调整 query 生成目录
/*        focList.add(new FileOutConfig("/templates/query.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return rb.getString("OutputDomainDir")+ "/cn/lfj/query/" + tableInfo.getEntityName() + "Query.java";
            }
        });*/

        //调整 entity 生成目录
//        focList.add(new FileOutConfig("/templates/entity.java.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return projectPath+ "/src/main/java/com/lfj/entity/" + tableInfo.getEntityName() + ".java";
//            }
//        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        TemplateConfig tc = new TemplateConfig();
        tc.setController("/templates/controller.java.vm");
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        tc.setEntity("/templates/entity.java.vm");
        tc.setXml(null);
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();
    }


}
