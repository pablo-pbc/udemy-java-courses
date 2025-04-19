package entities;

public class Individual extends Person{
    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double anualIncome = super.getAnualIncome();
        double healthDiscount = healthExpenditures * 0.5;

        if (anualIncome < 20000) {
            return anualIncome * 0.15 - healthDiscount;
        } else {
            return anualIncome * 0.25 - healthDiscount;
        }
    }
}
