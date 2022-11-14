package com.jf.anno;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
//注解保留的时期
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAopAnno {

}
