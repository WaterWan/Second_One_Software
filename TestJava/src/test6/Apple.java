package test6;

public enum Apple {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price;
	
	Apple(int p){
		this.price = p;
	}
	
	public int getPrice(){
		return this.price;
	}
}
