package com.bluerind.omniseller.marketplace.api;

import java.util.List;

import javax.json.JsonObject;

/**
 * 
 * @author Anuj Bhatnagar
 *
 */
public interface ProductService {

	JsonObject fetchProducts();

	JsonObject fetchProduct(String productId);

	JsonObject fetchProducts(List<String> productIds);

	JsonObject createProduct(JsonObject productJson);

	JsonObject updateProduct(JsonObject productJson);

	JsonObject deleteProduct(String productId);

	int fetchProductCount();
}
