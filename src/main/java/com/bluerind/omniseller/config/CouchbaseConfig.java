package com.bluerind.omniseller.config;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.auditing.EnableCouchbaseAuditing;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@Configuration
@EnableCouchbaseAuditing
@EnableCouchbaseRepositories("com.bluerind.omniseller.seller.repository")
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

	/**
	 * 	
	 */
	private static String ENTITY_TYPE_KEY = "_type";

	public CouchbaseConfig() {
	}

	@Override
	protected List<String> getBootstrapHosts() {
		return Collections.singletonList("127.0.0.1");
	}

	@Override
	protected String getBucketName() {
		return "omniseller";
	}

	@Override
	protected String getBucketPassword() {
		return "";
	}

	@Override
	public String typeKey() {
		return ENTITY_TYPE_KEY;
	}

}
