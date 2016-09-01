/**
 * 
 */
package com.bluerind.omniseller.seller.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

/**
 * @author Anuj Bhatnagar
 *
 */
public interface MarketplaceRepository extends CouchbaseRepository<MarketplaceRepository, String> {

}
