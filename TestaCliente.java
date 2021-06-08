package exercícios;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Juliana");
		c1.setSobrenome("Martinez");
		c1.setPedido("Suco de laranja");
		
		System.out.println("Nome e sobrenome do(a) cliente: " + c1.getNome() + " " + c1.getSobrenome());
		System.out.println("O pedido do(a) cliente é: " + c1.getPedido());
		
	}
}