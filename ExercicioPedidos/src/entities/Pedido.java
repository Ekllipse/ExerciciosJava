package entities;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private Date momentoPedido;
	private StatusPedido status;

	private Cliente cliente;
	private List<PedidoItens> listPedidoItens = new ArrayList<>();

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	public Pedido() {
	}

	public Pedido(Date dtAtual, StatusPedido status, Cliente cliente) {
		this.momentoPedido = dtAtual;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Date momentoPedido) {
		this.momentoPedido = momentoPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	

	public List<PedidoItens> getListPedidoItens() {
		return listPedidoItens;
	}
	
	public void AdicionaItem(PedidoItens iten) {
		listPedidoItens.add(iten);
	}
	
	public void RemoveItem(PedidoItens iten) {
		listPedidoItens.remove(iten);
	}
	
	public Double Total() {
		double soma = 0;
		for(PedidoItens c : listPedidoItens) {
			soma += c.getPreco(); 
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double precoTotal = 0;
		sb.append("Momento do pedido: "+ sdf.format(momentoPedido) + "\n");
		sb.append("Status do pedido: " +  status + "\n");
		sb.append("Cliente: " + cliente.getNome() + "(" + sdf.format(cliente.getAniversario()) + ") " + "- " + cliente.getEmail()+ "\n");
		sb.append("Itens do pedido" +  "\n");
		for(PedidoItens c : listPedidoItens) {
			sb.append(c.getProd().getNome() +  ", $" + c.getProd().getPreco() + ", Quantidade: " + c.getQuantidade() + ", Subtotal: $" + c.SubTotal() + "\n");
			precoTotal += c.SubTotal();
		}
		sb.append("Preço Total: $" + precoTotal );
		
		return sb.toString();
		
	}
	
	
	

}
