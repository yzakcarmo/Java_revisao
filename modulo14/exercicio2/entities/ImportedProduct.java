package modulo14.exercicio2.entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {}    
    
    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " $ ");
        sb.append(String.format("%.2f", price + customsFee));
        sb.append(" (Taxa: $ ");
        sb.append(String.format("%.2f", customsFee) + ")");
        return sb.toString();
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }    
}
