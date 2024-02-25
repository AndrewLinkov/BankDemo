package bankProduct.model.product;

import bankProduct.model.dictionary.Currency;
import bankProduct.model.impl.CardTag;
import lombok.Getter;

@Getter
public class DebitCard extends Product implements CardTag {
    private final double percentPerYear;
    public DebitCard(Currency currency, Double balance, String name, double percentPerYear) {
        super(currency, balance, name);
        this.percentPerYear = percentPerYear;
    }

}