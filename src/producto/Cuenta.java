package producto;

// Importo la clase Usuario del paquete cliente.
import cliente.Usuario;

public class Cuenta {
	
	/********** Variables **********/
	
	// �Por qu� uso clases y no el dato primitivo? int - Integer / double - Double
	private int numeroCuenta;
	private int nip;
	private Double saldo;
	private Usuario usuario;
	
	/********** Constructores **********/

	// Constructor por defecto:
	public Cuenta(){
			
	}
	
	/* �Qu� constructores necesito realmente? El profesor us� otros. */
		
	// Constructor:
	public Cuenta(int cuenta, int nip, double saldo, Usuario usuario){
		this.numeroCuenta = cuenta;
		this.nip = nip;
		this.saldo = saldo;
		this.usuario = usuario;
	}
	
	public Cuenta(Integer numeroCuenta2, Integer nip2) {
		// TODO Auto-generated constructor stub
	}

	/*********** M�todos **********/
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int cuenta) {
		this.numeroCuenta = cuenta;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	// Ver saldo:
	public Double verSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	// Depositar dinero:
	public Double depositarDinero(Double deposito){
		//if (deposito > 0){
			setSaldo(saldo + deposito);
			return verSaldo();
		//}else{
			//return;
			// devolver ERROR.
		//}
	}
	
	// Verificar saldo:
	public boolean tieneSaldo(Double monto){
		return saldo >= monto;
	}
	
	// Retirar dinero:
	public Double retirarDinero(Double retiro){
		if (tieneSaldo(retiro)){
			setSaldo(saldo - retiro);
		}else{
			System.out.println("No hay saldo suficiente para realizar la extracci�n");
		}
		return saldo;
	}
	
	// Sobrescritura del m�todo toString:
	@Override
	public String toString() {
		return "N� Cuenta #" + numeroCuenta + ", NIP: " + nip + ", Saldo: " + saldo + ", Usuario: " + usuario + "\n";
	}
	
	/* Tengo que revisar bien esto para entender c�mo lo implementa:
	 * 
	 * @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nip == null) ? 0 : nip.hashCode());
		result = prime * result + ((numeroCuenta == null) ? 0 : numeroCuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (nip == null) {
			if (other.nip != null)
				return false;
		} else if (!nip.equals(other.nip))
			return false;
		if (numeroCuenta == null) {
			if (other.numeroCuenta != null)
				return false;
		} else if (!numeroCuenta.equals(other.numeroCuenta))
			return false;
		return true;
	}
	 * 
	 */
}

