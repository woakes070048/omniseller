/**
 * 
 */
package com.bluerind.omniseller.seller.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.bluerind.omniseller.seller.model.Product;

/**
 * @author Anuj Bhatnagar
 *
 */
public interface ProductRepository extends CouchbaseRepository<Product, String> {

}
