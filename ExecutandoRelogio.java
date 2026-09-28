import java.util.Scanner;

public class ExecutandoRelogio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Relogio relogioPulso = new Relogio();
		System.out.println("---Relógio de Pulso---");
		System.out.println("___________________________________");
		System.out.println("Sobre o Relógio inicialmente:");
		relogioPulso.status();
		System.out.println("___________________________________");
		System.out.println("Informe as Horas:");
		int h = sc.nextInt();
		while (h < 0 || h > 23) {
			System.out.println("Não é possível este horário. Escolha novamento entre 0 e 23.");
			h = sc.nextInt();
		}
		relogioPulso.setHoras(h);
		System.out.println("Informe os minutos:");
		int m = sc.nextInt();
		while (m < 0 || m > 59) {
			System.out.println("Não é possível estes minutos. Escolha novamente entre 0 e 59.");
			m = sc.nextInt();
		}
		relogioPulso.setMinutos(m);
		System.out.println("Informe os segundos:");
		int s = sc.nextInt();
		while (s < 0 || s > 59) {
			System.out.println("Não é possível estes segundos. Escolha entre 0 e 59");
			s = sc.nextInt();
		}
		relogioPulso.setSegundos(s);
		System.out.println("___________________________________");
		System.out.println("      Sobre o Relógio  de Pulso Agora:    ");
		relogioPulso.status();
		System.out.println("___________________________________");

		Relogio relogioParede = new Relogio();
		System.out.println("---Relógio de Parede---");
		System.out.println("___________________________________");
		System.out.println("Sobre o Relógio inicialmente:");
		relogioParede.status();
		System.out.println("___________________________________");
		System.out.println("Informe as Horas:");
		int h2 = sc.nextInt();
		while (h2 < 0 || h2 > 23) {
			System.out.println("Não é possível este horário. Escolha novamento entre 0 e 23.");
			h2 = sc.nextInt();
		}
		relogioParede.setHoras(h2);
		System.out.println("Informe os minutos:");
		int m2 = sc.nextInt();
		while (m2 < 0 || m2 > 59) {
			System.out.println("Não é possível estes minutos. Escolha novamente entre 0 e 59.");
			m2 = sc.nextInt();
		}
		relogioParede.setMinutos(m2);
		System.out.println("Informe os segundos:");
		int s2 = sc.nextInt();
		while (s2 < 0 || s2 > 59) {
			System.out.println("Não é possínel estes segundos. Escolha entre 0 e 59");
			s2 = sc.nextInt();
		}
		relogioParede.setSegundos(s2);
		System.out.println("      Sobre o Relógio de Parede Agora:    ");
		relogioParede.status();
	}

}
