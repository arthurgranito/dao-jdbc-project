package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: department findById =====");

        System.out.println("\n===== TEST 2: department findByDepartment =====");


        System.out.println("\n===== TEST 3: department findAll =====");


        System.out.println("\n===== TEST 4: department insert =====");

        System.out.println("\n===== TEST 5: department update =====");

        System.out.println("\n===== TEST 6: department delete =====");

        sc.close();
    }
}
