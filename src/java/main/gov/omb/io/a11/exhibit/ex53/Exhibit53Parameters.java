package gov.omb.io.a11.exhibit.ex53;

import org.apache.poi.ss.usermodel.Sheet;

import java.util.List;

public interface Exhibit53Parameters
{
    public int getBudgetYear();
    public String getAgencyCode();
    public List<String> getBureauCodes();

    public Sheet getSheet();

    public boolean isValidateAnySubtotals();
    public boolean isValidateFundingSourceSubtotals();
    public boolean isValidateInvestmentLineSubtotalWithFundingSourceSubtotals();
    public boolean isValidateInvestmentsGroupSubtotals();
    public boolean isValidateMissionAreaSubtotals();
    public boolean isValidatePartSubtotals();
    public boolean isValidatePortfolioTotals();

    public boolean isValidateBudgetAccountsCodesInFundingSources();

    public String getWorkbookAbsolutePath();
    public boolean isDebug();
}
