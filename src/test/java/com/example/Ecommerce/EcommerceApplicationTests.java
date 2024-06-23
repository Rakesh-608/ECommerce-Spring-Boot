package com.example.Ecommerce;

import com.example.Ecommerce.dto.CategoryRepository;
import com.example.Ecommerce.dto.ProductRepository;
import com.example.Ecommerce.model.Category;
import com.example.Ecommerce.model.Product;
import com.example.Ecommerce.service.CategoryService;
import com.example.Ecommerce.service.OrderService;
import com.example.Ecommerce.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EcommerceApplicationTests {

//	@Bean
	@Autowired
	public ProductRepository productRepo;
	@Autowired
	public CategoryRepository categoryRepository;

	Product p1=new Product();

	@Test
	public void testGetAllProducts(){
		p1.setName("Laptop");
		List<Product> products= new ArrayList<>();
		products.add(p1);
		assertEquals(1,products.size());
	}

	@Test
	public void testGetProductById(){
		p1.setId(1L);
		assertEquals(1,p1.getId());
	}

	@Test
	public void testGetAllCategories(){
		Category c1=new Category();
		c1.setName("Electronics");
		List<Category> categories= new ArrayList<>();
		categories.add(c1);
		assertEquals(1, categories.size());
	}

	@Test
	public void testGetCategoryById(){
		Category c1=new Category();
		c1.setId(1L);
		assertEquals(1, c1.getId());
	}



	@Test
	void contextLoads() {
	}

}
