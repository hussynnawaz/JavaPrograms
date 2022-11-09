public class Company {
	// member variables
	private double[][] sales;
	private int salesPerson;
	private int product;
	private double value;
	
	public Company() {
		this.sales = new double[4][5];
	}

	public double[][] getSales() {
		return sales;
	}

	public void setSales(double[][] sales) {
		this.sales = sales;
	}
	
	public void setElements(int i, int j, double value) {
		this.sales[i][j] += value;
	}

	public int getProduct() {
		return product;
	}

	public void setProduct(int product) {
		this.product = product;
	}

	public int getSalesPerson() {
		return salesPerson;
	}

	public void setSalesPerson(int salesPerson) {
		this.salesPerson = salesPerson;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public void display() {
		int i=0;
      		for (double[] ds : sales) {
          		System.out.print(++i+"\t");
          		for (double d : ds) System.out.printf(d + "\t");
          		System.out.println("");
      		}
	}
	
	public void total(double sales[][]) {
    		double totalSales;
        double[] productSales = new double[sales[0].length];
        System.out.println("|Sales | \t\tProducts   \t\t\t     |");
        for (int i = 1; i<= sales[0].length+2; i++) System.out.printf("-------%s ","+"); 
        System.out.println("");
        System.out.print("|Person|");
        for (int i = 1; i<= sales[0].length; i++) System.out.printf("%8d|",i); 
        System.out.print(" Total  |");
        System.out.println(""); 
        for (int i = 1; i<= sales[0].length+2; i++) System.out.printf("-------%s ","+");
        System.out.println("");
        for (int i = 0; i < sales.length; i++) {
            totalSales = 0.0;
            System.out.printf("| %4d |", i + 1);
            for (int j = 0; j < sales[0].length; j++) {
                totalSales += sales[i][j];
                productSales[j] += sales[i][j];
                System.out.printf("%8.2f|", sales[i][j]);
            }
            System.out.printf("%8.2f|\n", totalSales);
        }
        for (int i = 1; i<= sales[0].length+2; i++) System.out.printf("-------%s ","+");
        System.out.println("");
        System.out.print("| Total|");
        for (double s : productSales) System.out.printf("%8.2f|", s);
        System.out.println("");
        for (int i = 1; i<= sales[0].length+1; i++) System.out.printf("-------%s ","+");
        System.out.println("");
    }
}