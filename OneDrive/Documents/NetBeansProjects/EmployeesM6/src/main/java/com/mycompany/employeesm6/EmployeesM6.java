/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.employeesm6;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class EmployeesM6 {

    public static void main(String[] args) {
        SalariedEmployee sal = new SalariedEmployee("Alexandra Elena", "0091234",
800000);
  CommissionEmployee comm;
        comm = new CommissionEmployee(500000, 200000, 5,
                "Melinda Larasati", "0093456", 0);
 ProjectPlanner pp = new ProjectPlanner(800000, 100000, 2, "Antonio Gabriel",
"0096758", 0);

 System.out.println("===DATA EMPLOYEE====");
 sal.cetakSalaried();
 System.out.println(" ");
 System.out.println(" ");
 System.out.println("===DATA COMMISSION EMPLOYEE===");
 comm.hitungGaji();
 comm.cetakCommission();
 System.out.println(" ");
 System.out.println(" ");
 System.out.println("===DATA PROJECT PLANNER===");
 pp.hitungGajiPP();
 pp.cetakProjectPlanner();
    }

    private static class CommissionEmployee {

        public CommissionEmployee() {
        }

        private CommissionEmployee(int i, int i0, int i1, String melinda_Larasati, String string, int i2) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void hitungGaji() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void cetakCommission() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
