package com.example.cxf.server.service.dto;

public class Country {

    protected String name;
    protected int population;
    protected String capital;
    protected Currency currency;

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * populationプロパティの値を取得します。
     * 
     */
    public int getPopulation() {
        return population;
    }

    /**
     * populationプロパティの値を設定します。
     * 
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * capitalプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * capitalプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * currencyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * currencyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }
}
