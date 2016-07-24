/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.test.hasor.core._03_aop;
import net.hasor.core.AppContext;
import net.hasor.core.Hasor;
import net.test.hasor.core._03_aop.myaop.MyAopBean;
import net.test.hasor.core._03_aop.myaop.MyAopSetup;
import net.test.hasor.core._03_aop.myaop.SuperMyAopBean;
import net.test.hasor.core._03_aop.simple.AopBean;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 测试 Aop
 * @version : 2013-8-11
 * @author 赵永春 (zyc@hasor.net)
 */
public class AopTest {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void simpleAopTest() {
        System.out.println("--->>simpleAopTest<<--");
        AppContext appContext = Hasor.createAppContext();
        //
        AopBean fooBean = appContext.getInstance(AopBean.class);
        logger.debug("aopBean : " + fooBean.echo("sayMessage"));
    }
    //
    @Test
    public void myAopTest() {
        System.out.println("--->>myaopAopTest<<--");
        AppContext appContext = Hasor.createAppContext(new MyAopSetup());
        //
        MyAopBean myBean = appContext.getInstance(MyAopBean.class);
        logger.debug("opBean : " + myBean.fooCall("sayMessage"));
        SuperMyAopBean superBean = appContext.getInstance(SuperMyAopBean.class);
        logger.debug("superBean : " + superBean.fooCall("sayMessage"));
    }
}