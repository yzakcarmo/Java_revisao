package model.entities;

public class Invoice {
    private Double tax;
    private Double basicPayment;

    public Invoice() {}

    public Invoice(Double tax, Double basicPayment) {
        this.tax = tax;
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();

        out.append("FATURA:" + "\n");
        out.append("Aluguel: ");
        out.append(String.format("%.2f", getBasicPayment()));
        out.append("\n");
        out.append("Imposto: ");
        out.append(String.format("%.2f", getTax()));
        out.append("\n");
        out.append("Total: ");
        out.append(String.format("%.2f", getTotalPayment()));

        return out.toString();
    }
}
