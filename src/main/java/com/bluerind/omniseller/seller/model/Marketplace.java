/**
 * 
 */
package com.bluerind.omniseller.seller.model;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

/**
 * @author Anuj Bhatnagar
 *
 */
@Document
public class Marketplace {

	@Id
	private String id;

	@Field
	private String name;
	
	

}
