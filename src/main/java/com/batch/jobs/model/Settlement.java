package com.batch.jobs.model;

/**
 * Created by kamal on 11/09/16.
 */
public class Settlement {

    private String pan;
    private String nrid;
    private String localtimestamp;
    private String countryCode;
    private String acquirerCountryCode;
    private String issurerCountryCode;
    private String transactionCurrency;
    private String acquirerCurrency;
    private String issurerCurrency;
    private String networkCurrency;
    private String currencyAmount;
    private String acquirerCurrencyAmount;
    private String issurerCurrencyAmount;

    public Settlement() {
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getNrid() {
        return nrid;
    }

    public void setNrid(String nrid) {
        this.nrid = nrid;
    }

    public String getLocaltimestamp() {
        return localtimestamp;
    }

    public void setLocaltimestamp(String localtimestamp) {
        this.localtimestamp = localtimestamp;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAcquirerCountryCode() {
        return acquirerCountryCode;
    }

    public void setAcquirerCountryCode(String acquirerCountryCode) {
        this.acquirerCountryCode = acquirerCountryCode;
    }

    public String getIssurerCountryCode() {
        return issurerCountryCode;
    }

    public void setIssurerCountryCode(String issurerCountryCode) {
        this.issurerCountryCode = issurerCountryCode;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getAcquirerCurrency() {
        return acquirerCurrency;
    }

    public void setAcquirerCurrency(String acquirerCurrency) {
        this.acquirerCurrency = acquirerCurrency;
    }

    public String getIssurerCurrency() {
        return issurerCurrency;
    }

    public void setIssurerCurrency(String issurerCurrency) {
        this.issurerCurrency = issurerCurrency;
    }

    public String getNetworkCurrency() {
        return networkCurrency;
    }

    public void setNetworkCurrency(String networkCurrency) {
        this.networkCurrency = networkCurrency;
    }

    public String getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(String currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public String getAcquirerCurrencyAmount() {
        return acquirerCurrencyAmount;
    }

    public void setAcquirerCurrencyAmount(String acquirerCurrencyAmount) {
        this.acquirerCurrencyAmount = acquirerCurrencyAmount;
    }

    public String getIssurerCurrencyAmount() {
        return issurerCurrencyAmount;
    }

    public void setIssurerCurrencyAmount(String issurerCurrencyAmount) {
        this.issurerCurrencyAmount = issurerCurrencyAmount;
    }

    @Override
    public String toString() {
        return "Settlement{" +
                "pan='" + pan + '\'' +
                ", nrid='" + nrid + '\'' +
                ", localtimestamp='" + localtimestamp + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", acquirerCountryCode='" + acquirerCountryCode + '\'' +
                ", issurerCountryCode='" + issurerCountryCode + '\'' +
                ", transactionCurrency='" + transactionCurrency + '\'' +
                ", acquirerCurrency='" + acquirerCurrency + '\'' +
                ", issurerCurrency='" + issurerCurrency + '\'' +
                ", networkCurrency='" + networkCurrency + '\'' +
                ", currencyAmount='" + currencyAmount + '\'' +
                ", acquirerCurrencyAmount='" + acquirerCurrencyAmount + '\'' +
                ", issurerCurrencyAmount='" + issurerCurrencyAmount + '\'' +
                '}';
    }
}
