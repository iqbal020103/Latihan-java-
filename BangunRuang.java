package PraktikumPbo1;

public class BangunRuang {
	float panjang,lebar,tinggi,sisi;
	float volumeb,volumek,volume,volumet,volumela;
	float luask,luasb,luasku,luast,luasla;
	
	public static void main(String[] args) {
		
		Kubus ba=new Kubus();
		Balok lk=new Balok();
		Kerucut cu=new Kerucut();
		Tabung ta=new Tabung();
		Bola bo=new Bola();
		
		bo.Bangunruang((float)3.14,9);
		cu.Bangunruang(10,(float) 3.14,20);
		ba.Bangunruang(10);
		lk.Bangunruang(4,8,5);
		ta.Bangunruang((float)3.14,25,20);
	}
}
