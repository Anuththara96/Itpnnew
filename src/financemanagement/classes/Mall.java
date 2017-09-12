/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financemanagement.classes;

/**
 *
 * @author Anu
 */
public class Mall {
        
        String Current_Assets;
        String Fixed_Assets;
        String Current_Liabilities;
        String LongTerm_Liabilities;
        String Shareholders_Equity;

    public String getCurrent_Assets() {
        return Current_Assets;
    }

    public void setCurrent_Assets(String Current_Assets) {
        this.Current_Assets = Current_Assets;
    }

    public String getFixed_Assets() {
        return Fixed_Assets;
    }

    public void setFixed_Assets(String Fixed_Assets) {
        this.Fixed_Assets = Fixed_Assets;
    }

    public String getCurrent_Liabilities() {
        return Current_Liabilities;
    }

    public void setCurrent_Liabilities(String Current_Liabilities) {
        this.Current_Liabilities = Current_Liabilities;
    }

    public String getLongTerm_Liabilities() {
        return LongTerm_Liabilities;
    }

    public void setLongTerm_Liabilities(String LongTerm_Liabilities) {
        this.LongTerm_Liabilities = LongTerm_Liabilities;
    }

    public String getShareholders_Equity() {
        return Shareholders_Equity;
    }

    public void setShareholders_Equity(String Shareholders_Equity) {
        this.Shareholders_Equity = Shareholders_Equity;
    }
    
}
