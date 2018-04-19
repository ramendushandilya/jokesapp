package com.shandilya.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rams0516
 *         Date: 4/19/2018
 *         Time: 5:33 PM
 */
@Configuration
public class ChuckConf {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return  new ChuckNorrisQuotes();
    }
}