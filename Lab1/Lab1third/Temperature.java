package Lab1third;

public class Temperature {
	double t; char s;
	Temperature(double t, char s){
		this.t=t;
		this.s=s;
	}
	Temperature(char s){
		this.s=s;
	}
	Temperature(double t){
		this.t=t;
	}
	Temperature(){
		this.t=0;
		this.s='C';
	}
	public String convert(double t, char s) {
		if(s=='C') {
		t = 9*t/5+32;
		}
		else {
			t=5*(t-32)/9;
		}
		String k = "";
		k+=t;
		k+='F';
		return k;
	}


	public String temp(double t) {
		return convert(t, 'C');
	}
	public String te(char s) {
		return convert(0, s);
		
	}
	public static String ty() {
		return "0 C";
	}

	public static void main(String[] args) {

	}
	public void getTemp(double k, char s){
		if(s=='C'){
			k = 9*k/5+32;
			System.out.println(k);
		}
		else {
			k=5*(k-32)/9;
			System.out.println(k);
		}

	}


}
