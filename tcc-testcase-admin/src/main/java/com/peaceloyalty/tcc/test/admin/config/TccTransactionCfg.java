package com.peaceloyalty.tcc.test.admin.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:tcc-transaction.xml"})
public class TccTransactionCfg {
}
