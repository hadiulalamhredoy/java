
package practisejava;

/**
 *
 * @author Asus
 */
public class Assignment03 {
   
	  public static void main(String[] args) {
		Scannner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String id;
		String title;
		int Price;
		String Description;
		String Category;
		
		System.out.print("Enter the id: ");
		id = input.nextLine();
		System.out.print("Enter the title: ");
		title = input.nextLine();
		System.out.print("Enter the Price: ");
		Price = sc.nextInt();
		System.out.print("Enter the Description: ");
		Description = input.nextLine();
		System.out.print("Enter the Categry: ");
		Category = input.nextLine();
		
		System.out.println("Your id is: "+id);
		System.out.println("The title is: "+title);
		System.out.println("The price is: "+Price);
		System.out.println("The description is: "+Description);
		System.out.println("The category is:: "+Category);
		

	}
} 