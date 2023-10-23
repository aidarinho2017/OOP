package Lab1first;

class Analyzer{
	private Data data;
	public Analyzer(Data data) {
		this.data = data;
	}
    public double calculateAverage() {
        if (data.j == 0) {
            return 0.0;
        }
        return (double) data.i / data.j;
    }
    public double getMaximum() {
    	if(data.j==0) {
    		return 0;
    	}
        return (double) data.getMax();
    }
}