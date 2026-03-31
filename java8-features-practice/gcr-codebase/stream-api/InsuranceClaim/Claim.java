package InsuranceClaim;

class Claim {
    String claimId;
    String claimType;
    double amount;

    Claim(String claimId, String claimType, double amount) {
        this.claimId = claimId;
        this.claimType = claimType;
        this.amount = amount;
    }
}