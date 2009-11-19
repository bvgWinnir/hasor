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
package org.more.beans.info;
import org.more.util.attribute.AttBase;
/**
 * 整个more.beans中最基本的核心类，Prop用于表示一个拥有具体类型的bean定义资源。
 * <br/>Date : 2009-11-18
 * @author 赵永春
 */
public abstract class Prop extends AttBase {
    //========================================================================================Field
    /**  */
    private static final long serialVersionUID = -3350281122432032642L;
    private String            id               = null;                 //唯一的Bean ID
    private String            propType         = null;                 //该类型应该可以通过BeanFactory.getBeanClassLoader().loadClass()获取
    //==========================================================================================Job
    /**获取唯一的Bean ID。*/
    public String getId() {
        return id;
    }
    /**设置唯一的Bean ID。*/
    public void setId(String id) {
        this.id = id;
    }
    /**获取类型，该类型应该可以通过BeanFactory.getBeanClassLoader().loadClass()获取。*/
    public String getPropType() {
        return propType;
    }
    /**设置类型，该类型应该可以通过BeanFactory.getBeanClassLoader().loadClass()获取。*/
    public void setPropType(String propType) {
        this.propType = propType;
    }
}