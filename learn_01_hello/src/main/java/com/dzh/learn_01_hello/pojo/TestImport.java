package com.dzh.learn_01_hello.pojo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author 戴志豪
 * @date 2023/1/14 19:31
 */
public class TestImport implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.dzh.learn_01_hello.pojo.Tes1"};
    }
}
