package XML_JSON.JSON.Jackson_2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyRate {
    @JsonProperty("ccy")
    private String from;
    @JsonProperty("base_ccy")
    private String to;
    @JsonProperty("buy")
    private BigDecimal buy;
    @JsonProperty("sale")
    private BigDecimal sale;

    public CurrencyRate(){

    }

    public CurrencyRate(String from, String to, BigDecimal buy, BigDecimal sale) {
        this.from = from;
        this.to = to;
        this.buy = buy;
        this.sale = sale;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getBuy() {
        return buy;
    }

    public BigDecimal getSale() {
        return sale;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", buy=" + buy.setScale(2, RoundingMode.HALF_UP) +
                ", sale=" + sale.setScale(2, RoundingMode.HALF_UP) +
                '}';
    }
}
