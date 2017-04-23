import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * This is a program which connects to MySQL database using JDBC and gets
 * information about VIP users. In this case the information includes only the
 * id's of their orders.
 */


public class Driver {

	public static void main(String[] args) {

		try {
			// Get a connection to the database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/public_laundry1", "root",
					"alonso");

			Statement myStmt = myConn.createStatement();

			// Execute SQL query
			ResultSet myRs = myStmt.executeQuery(
					"SELECT `customers`.`name`, `orders`.`order_id`FROM `customers` JOIN `orders` ON(customers.id= orders.customer_id) "
							+ "where customers.promocode=25253");

			// Process the result set
			while (myRs.next()) {
				System.out.println(
						"Promo user: " + myRs.getString("name") + " with order id: " + myRs.getInt("order_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

