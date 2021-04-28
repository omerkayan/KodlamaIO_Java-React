//ttps://github.com/omerkayan
	
public class Category {
	
	public Category() {
		System.out.println("Kategori icin constructer yapisidir.");
	}
	
	public Category(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}
	
	int id;
	String categoryName;	

}
