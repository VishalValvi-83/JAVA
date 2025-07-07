import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {

		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);

			// Create SessionFactory
			SessionFactory sf = cfg.buildSessionFactory();
			if (sf == null) {
				System.out.println("SessionFactory is null");
				return;
			} else {
				System.out.println("SessionFactory created successfully");
			}
			Session session = sf.openSession();

			if (session == null) {
				System.out.println("Session is null");
				return;
			} else {
				System.out.println("Session opened successfully");
			}
			Transaction tran = session.beginTransaction();

			// Create Employee object
			Employee emp = new Employee();
			emp.setEmpName("Vishal");
			emp.setEmpAge(23);
			emp.setEmpCity("Nandurbar");
			emp.setEmpSalary("26000");
			emp.setEmpDept("IT");

			// Save Employee object
			session.persist(emp);
			tran.commit();
			session.close();
			System.out.println("Employee Data : " + emp.getEmpName() + ", " + emp.getEmpAge() + ", " + emp.getEmpCity()
					+ ", " + emp.getEmpSalary() + ", " + emp.getEmpDept() + ", inserted successfully");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while inserting employee data: " + e.getMessage());
		}

	}
}
