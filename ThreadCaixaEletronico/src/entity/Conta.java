package entity;

public class Conta {
	private int id;
	private float saldo;
	private float depositar;
	private float sacar;

	public Conta() {
		super();
		this.saldo = 50f;
		this.depositar = 30.0f;
		this.sacar = 50.0f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getDepositar() {
		return depositar;
	}

	public void setDepositar() throws Exception {
		this.saldo += this.depositar;
	}

	public float getSacar() {
		return sacar;
	}

	public void setSacar() throws Exception {
		if (this.getSaldo() >= this.sacar) {
			this.saldo -= this.sacar;
		}
	}

	public float getSaldo() {
		return saldo;
	}

}
