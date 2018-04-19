package entity;

public class CaixaEletronico extends Thread {

	Integer monitor = 0;
	private long id;
	private int saques;
	private int depositos;
	private Conta conta;

	public CaixaEletronico(Conta conta) {
		super();
		this.saques = 500;
		this.depositos = 1000;
		this.conta = conta;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDepositar() throws Exception {
		synchronized (this) {
			if (this.depositos > 0) {
				this.conta.setDepositar();
				this.depositos--;

				if (monitor > 0) {
					this.notifyAll();
					monitor--;
				}
			}
		}
	}

	public void setSacar() throws Exception {
		synchronized (this) {
			if (this.saques > 0 && this.conta.getSaldo() >= this.conta.getSacar()) {
				this.conta.setSacar();
				this.saques--;
			} else {
				this.wait();
				monitor++;
			}
		}
	}

	private boolean encerrar() {
		return (this.depositos <= 0 && this.saques <= 0);
	}

	@Override
	public void run() {
		while (!encerrar()) {

		}
	}
}
