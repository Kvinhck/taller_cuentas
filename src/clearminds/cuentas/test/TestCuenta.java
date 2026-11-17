package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta ("03476"); 
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta ("03476","C",98);
		Cuenta cuenta3 = new Cuenta ("03476");
		cuenta3.setTipo("C");
		
		System.out.println("--------VALORES INICIALES--------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		
		cuenta1.setTipo("B");
		cuenta2.setSaldo(250.75);
		cuenta3.setSaldo(1000);

		System.out.println("-------- Valores Modificados ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		Cuenta cuenta4 = new Cuenta("11111");
		Cuenta cuenta5 = new Cuenta("22222", "B", 500);
		Cuenta cuenta6 = new Cuenta("33333", "C", 1500.50);

		System.out.println("-------- Cuentas Adicionales ---------");
		cuenta4.imprimir();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}
	

}
