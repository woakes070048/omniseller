/**
 * 
 */
package com.bluerind.omniseller.util;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.bluerind.omniseller.seller.model.Product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

/**
 * 
 * @author Anuj Bhatnagar
 *
 */
public class CSVJsonConverterUtil {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		test();
	}
	public static void test() throws JsonProcessingException, IOException {
		CsvMapper mapper = new CsvMapper();
		CsvSchema schema = CsvSchema.emptySchema().withHeader(); 
		MappingIterator<Map<String, String>> it = mapper.readerFor(Map.class).with(schema).readValues(new File("/Users/anuj/Development/products/Omni Seller/products_export.csv"));
		while (it.hasNext()) {
			Map<String, String> rowAsMap = it.next();
			System.out.println(new Product(rowAsMap));
		}
	}

}
