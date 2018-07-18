import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class data {
    public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		String namalkp;
		String ttl;
		String jenis;
		String alamat;
		String nktp;
		int pilihan;
		
		datad print = new datad ("","");
		datad $print = new datad ("", "", "");
	
		System.out.println("Data penduduk 1");
		System.out.println("_______________");
		System.out.println("Nama lengkap:");
		print.namalkp = namalkp = input.readLine();
		System.out.println("Tempat, tanggal lahir:");
		print.ttl = ttl = input.readLine();
		System.out.println("Jenis Kelamin:");
		print.jenis = jenis = input.readLine();
		System.out.println("Alamat lengkap:");
		print.aleng = alamat = input.readLine();
		System.out.println("Nomor KTP:");
		print.nktp = nktp = input.readLine();
		System.out.println("");
		
		
		System.out.println("Data Penduduk 2");
		System.out.println("_______________");
		System.out.println("Nama lengkap:");
		$print.namalkp = namalkp = input.readLine();
		System.out.println("Tempat, tanggal lahir:");
		$print.ttl = ttl = input.readLine();
		System.out.println("Jenis kelamin:");
		$print.jenis = jenis = input.readLine();
		System.out.println("Alamat lengkap:");
		$print.aleng = alamat = input.readLine();
		System.out.println("Nomor KTP:");
		$print.nktp = nktp = input.readLine();
		System.out.println("");
		
		
		System.out.println("Tampilkan Data Penduduk");
		System.out.println("1. Data Pertama\n"
				+ "2. Data Kedua\n"
				+ "0.Exit");
		System.out.println("Masukan Pilihan : ");
		
		pilihan = Integer.parseInt(input.readLine());

		while (pilihan != 0) {
			switch (pilihan) {
				case 1: 
					System.out.println("Data penduduk 1" + print.getttl());
					System.out.println("_____________________________");
					System.out.println("Nama lengkap: " + print.getnamal());
					System.out.println("Tempat, tanggal lahir: " + print.getttl());
					System.out.println("Jenis kelamin: " + print.getJenis());
					System.out.println("Alamat lengkap: " + print.getaleng());
					System.out.println("Nomor KTP: " + print.getnktp());
					break;
					
				 case 2: 
					System.out.println("Data penduduk 2"    + $print.getttl());
					System.out.println("________________________________");
					System.out.println("Nama lengkap: " + $print.getnamal());
					System.out.println("Tempat, tanggal lahir: " + $print.getttl());
					System.out.println("Jenis kelamin: " + $print.getJenis());
					System.out.println("Alamat lengkap: " + $print.getaleng());
					System.out.println("Nomor KTP: " + $print.getnktp());
					break;    
				 default:                        
			}

			System.out.println("Lihat Data");
			System.out.println("1. Data Pertama\n"
				+ "2. Data Kedua\n"
				+ "0.Exit");
			System.out.println("Masukan Pilihan : ");        
			pilihan = Integer.parseInt(input.readLine());
		}        
    }    
}