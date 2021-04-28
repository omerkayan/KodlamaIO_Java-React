//https://github.com/omerkayan
	
public class Main {
	
public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		teacher1.id =1;
		teacher1.name = "Prof. Dr. Engin";
		teacher1.lastName = "Demirog";
		
		Teacher[] teachers = {teacher1};
		
		for (Teacher teacher:teachers) {
			System.out.println("-----------------------");
			System.out.println(teacher.name + " " + teacher1.lastName);
		}
		
		System.out.println("Egitmen sayisi: " + teachers.length);
		System.out.println("-----------------------");
		
		System.out.println("-----------------------");
		Category category1 = new Category();
		category1.id =1;
		category1.categoryName = "Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)";
		
		
		Category category2 = new Category();
		category2.id =2;
		category2.categoryName = "Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)";
		
		Category category3 = new Category();
		category3.id =3;
		category3.categoryName = "Programlamaya Giris Icin Temel Kurs";
		
		Category[] categories = {category1, category2, category3};
		
		for (Category category : categories) {
			System.out.println(category.categoryName);
		}
		
		System.out.println("Kategori sayisi: " +categories.length);
		System.out.println("-----------------------");
	}


}
