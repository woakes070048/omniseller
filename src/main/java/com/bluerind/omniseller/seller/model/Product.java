package com.bluerind.omniseller.seller.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

/**
 * 
 * @author Anuj Bhatnagar
 *
 */
@Document
public class Product {

	@Id
	private String id;

	@Field
	private String name;

	@Field
	private JsonObject details;

	@Field
	private List<String> marketplaces;

	public Product(Map<String, ?> details) {
		this.details = JsonObject.from(details);
	}

	@Override
	public String toString() {
		return details.toString();
	}
}
