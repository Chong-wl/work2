 public class StoreOneA extends StoreToRent{
    private static final double DISCOUNT_RATE = 0.1;
    private boolean loanRequired;
    private int loanPaymentTerm;
    private boolean specialCustomer;
    private double mouthlyPayment;

    public StoreOneA(boolean loanRequired, int loanPaymentTerm){
        this.loanRequired = loanRequired;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm ) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.loanAmount = loanAmount;
        this.specialCustomer = specialCustomer;
    }



    public boolean getloanRequired(){
        return loanRequired;
    }

    public int getloanPaymentTerm(){
        return loanPaymentTerm;
    }

    public void showStoreInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        public String toString() {
            return "Combining parent toString() \n" + super.toString() + "\n and child toString()\n" +
                    "LOAN DETAILS:\n" +
                    "Loan Amount: " + getLoanAmount() + "\n" +
                    "Loan Payment Term: " + getLoanPaymentTerm() + "\n" +
                    "Interest Rate: " + getINTEREST_RATE() + "\n" +
                    "Special Customer: " + specialCustomer + "\n" +
                    "Monthly Loan Payment: " + monthlyPayment + "\n";
    }
      double loanAmount;
      double INTEREST_RATE = 0.1;
    
    @Override
    public  double calatlateLoanFinancing(){
        if(loanRequired ==true){
            mouthlyPayment = (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
            return mouthlyPayment;
        }
        else{
            return 0;
        }
    }

    @Override
    public double calatlateLoanFinancing(){
        mouthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }
    
 }


     