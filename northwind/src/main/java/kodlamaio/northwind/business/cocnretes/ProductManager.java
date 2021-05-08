package kodlamaio.northwind.business.cocnretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
@Service
public class ProductManager implements ProductService {
	ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}

}
