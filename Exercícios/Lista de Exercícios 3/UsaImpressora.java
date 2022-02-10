import lista3classes.Impressora;
import java.util.*;


public class UsaImpressora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		Impressora impressora = new Impressora();
		
		impressora.modelo = input.next();
		impressora.cor = input.next();
		impressora.tipoPapel = input.next();
		impressora.bluetooth = true;
		impressora.wifi = true;
		impressora.colorida = true;
		impressora.papel = true;
		impressora.digitalizadora = true;
		
		impressora.status();
		impressora.ligar();
		impressora.digitalizar();
		impressora.copiar();
		impressora.desligar();
		impressora.imprimir();
	}

}
