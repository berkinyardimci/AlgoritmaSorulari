package maraton2File;

public class Kisiler {
	public String isim;
	public String soyad;
	public String sehir;
	public String TelNo;
	
	public Kisiler(String isim, String soyad, String sehir, String telNo) {
		super();
		this.isim = isim;
		this.soyad = soyad;
		this.sehir = sehir;
		TelNo = telNo;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getTelNo() {
		return TelNo;
	}
	public void setTelNo(String telNo) {
		TelNo = telNo;
	}
	@Override
	public String toString() {
		return "isim=" + isim + ", soyad=" + soyad + ", sehir=" + sehir + ", TelNo=" + TelNo;
	}
}
