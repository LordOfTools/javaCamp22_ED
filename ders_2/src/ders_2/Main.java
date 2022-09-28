package ders_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Product product1 = new Product(); 
		//burada product tipinde bir değişken olan produt1 i tanımladık bu da new product oluyor
				//set value
		
		product1.setName("delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("ımage1.jpg");
		
		//product1.name ="a Kahve Makinesi";
		//product1.unitPrice = 7500;
		//product1.discount = 7;
		//product1.unitsInStock = 150;
		//product1.imageUrl = "https://www.blabla.com/user/accs/upload/image15a.jpg";
		
				//get value
		//System.out.println(product1.name);
		
		
		Product product2 = new Product();
		
		product2.setName("smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("ımage2.jpg");
		
		//product2.name ="b Kahve Makinesi";
		//product2.unitPrice = 6500;
		//product2.discount = 6;
		//product2.unitsInStock = 15;
		//product2.imageUrl = "https://www.blabla.com/user/accs/upload/image15b.jpg";

		
		
		Product product3 = new Product();
		
		product3.setName("aid kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("ımage3.jpg");
		
		//product3.name ="c Kahve Makinesi";
		//product3.unitPrice = 5500;
		//product3.discount = 14;
		//product3.unitsInStock = 75;
		//product3.imageUrl = "https://www.blabla.com/user/accs/upload/image15c.jpg";
		
		
		//product tipinde array tanımlanabilir yani class türünde
	
		
	
		Product[] products = {product1, product2, product3};
		
	
		
		System.out.println("<ul>");
		
		//foreach tanımladık products içindeki her Product veri tipini genel bir takma isimle çağırdık (product dedik asd filan da olabilir) 
		for (Product product : products) {
			
		System.out.println("<li>"+product.getName()+"</li>");
				
			
		}
		
		System.out.println("</ul>");
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("151515");
		individualCustomer.setPhoneNumber("0505000000");
		individualCustomer.setFirstName("Ad");
		individualCustomer.setLastName("Soyad");
		
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(101);
		corporateCustomer.setCustomerNumber("");
		corporateCustomer.setPhoneNumber("");
		corporateCustomer.setCompanyName("");
		corporateCustomer.setTaxNumber("");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers ) {
			
			System.out.println("Id-------->" + customer.getId()); //ikisi de customer olduğu için ayrıştırıcı olmayan özelliklerini alabilirim
		}
		
		
		
		
		
	}

}
