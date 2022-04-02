import java.math.BigDecimal;

class SimpleInterestCalculator {
    private BigDecimal principal;
    private BigDecimal interest;

    SimpleInterestCalculator(String principal, String interest){
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest);
    }

    BigDecimal getPrincipal(){
        return principal;
    };

    BigDecimal getInterest(){
        return interest;
    };

    BigDecimal totalValue(String years){
        BigDecimal interestAmount = principal.multiply(interest).multiply(new BigDecimal(years));
        return interestAmount.add(principal);
    }

    public static void main(String [] args){
        SimpleInterestCalculator test = new SimpleInterestCalculator("500", "0.07");
        System.out.println(test.totalValue("5"));
    }
}