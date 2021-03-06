//package com.sample.config;
//
//import com.alibaba.dubbo.config.*;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DubboConfig {
//
//    public class DubboBaseConfig {
//
//        @Bean
//        public RegistryConfig registry() {
//            RegistryConfig registryConfig = new RegistryConfig();
//            registryConfig.setAddress("127.0.0.1:2181");
//            registryConfig.setProtocol("zookeeper");
//            return registryConfig;
//        }
//
//        @Bean
//        public ApplicationConfig application() {
//            ApplicationConfig applicationConfig = new ApplicationConfig();
//            applicationConfig.setName("testApp");
//            return applicationConfig;
//        }
//
//        @Bean
//        public MonitorConfig monitorConfig() {
//            MonitorConfig mc = new MonitorConfig();
//            mc.setProtocol("registry");
//            return mc;
//        }
//
//        @Bean
//        public ReferenceConfig referenceConfig() {
//            ReferenceConfig rc = new ReferenceConfig();
//            rc.setMonitor(monitorConfig());
//            return rc;
//        }
//
//        @Bean
//        public ProtocolConfig protocol() {
//            ProtocolConfig protocolConfig = new ProtocolConfig();
//            protocolConfig.setPort(20880);
//            return protocolConfig;
//        }
//
//        @Bean
//        public ProviderConfig provider() {
//            ProviderConfig providerConfig = new ProviderConfig();
//            providerConfig.setMonitor(monitorConfig());
//            return providerConfig;
//        }
//
//
//    }
//}
