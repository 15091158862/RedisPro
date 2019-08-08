package com.yangyi.redis.util.cluster;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:读取redis配置信息并装载
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
public class RedisProperties {

	private String clusterNodes;

	private int timeout;

	public String getClusterNodes() {
		return clusterNodes;
	}

	public void setClusterNodes(String clusterNodes) {
		this.clusterNodes = clusterNodes;
	}

	public int getCommandTimeout() {
		return timeout;
	}

	public void setCommandTimeout(int commandTimeout) {
		this.timeout = commandTimeout;
	}
}
