package entities;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customsFee = customFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	@Override
	public String priceTag() {
		return getName()
				+ " $ " + String.format("%.2f", totalPrice())
				+ "(Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}

}
