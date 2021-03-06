package com.wh.mobile.configuration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by sam on 2018/12/14.
 */
@Component
public class RiosBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final String SERIALIZATION_ID = "4086d293-522c-4d25-8485-f1c1f5c09218";

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        if ((beanFactory instanceof DefaultListableBeanFactory)) {
            DefaultListableBeanFactory dlbf = (DefaultListableBeanFactory) beanFactory;
            dlbf.setSerializationId(SERIALIZATION_ID);
        }
    }
}
