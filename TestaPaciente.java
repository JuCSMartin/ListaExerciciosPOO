package exercícios;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente();
		
		p1.setNome("Juliana");
		p1.setSobrenome("Martinez");
		p1.setEnfermidade("Enxaqueca");
		p1.setNivel("Grave");
		p1.setPrioridade("Urgência");
		
		System.out.println("Nome e sobrenome do(a) paciente: " + p1.getNome() + " " + p1.getSobrenome());
		System.out.println("Enfermidade: " + p1.getEnfermidade() + " " + p1.getNivel());
		System.out.println("Tipo de atendimento: " + p1.getPrioridade());

}
}