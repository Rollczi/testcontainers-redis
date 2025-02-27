package com.redis.testcontainers;

import org.testcontainers.utility.DockerImageName;

/**
 * @deprecated use {@link RedisStackContainer} instead
 */
@Deprecated
public class RedisModulesContainer extends AbstractRedisContainer<RedisModulesContainer> {

	public static final DockerImageName DEFAULT_IMAGE_NAME = DockerImageName.parse("redislabs/redismod");
	public static final String DEFAULT_TAG = "latest";
	public static final String ENV_ENABLED_SUFFIX = "REDIS_MODULES";

	/**
	 * @deprecated use {@link RedisModulesContainer(DockerImageName)} instead
	 */
	@Deprecated
	public RedisModulesContainer() {
		this(DEFAULT_IMAGE_NAME.withTag(DEFAULT_TAG));
	}

	/**
	 * @deprecated use {@link RedisModulesContainer(DockerImageName)} instead
	 */
	@Deprecated
	public RedisModulesContainer(final String tag) {
		this(DEFAULT_IMAGE_NAME.withTag(tag));
	}

	public RedisModulesContainer(final DockerImageName dockerImageName) {
		super(dockerImageName);
	}

	@Override
	public boolean isCluster() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return RedisServer.isEnabled(ENV_ENABLED_SUFFIX);
	}

}
