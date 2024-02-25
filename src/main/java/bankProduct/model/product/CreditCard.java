package bankProduct.model.product;

import bankProduct.model.dictionary.Currency;
import bankProduct.model.impl.CardTag;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCard extends Product implements CardTag {
    private double percent;
    private double dept;

    public CreditCard(Currency currency, Double balance, String name) {
        super(currency, balance, name);
    }

}