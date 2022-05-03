package composer;

import order.Order;

public abstract class AbstractInvoiceComposer {

    public AbstractInvoiceComposer(Order order) {

    }

    public abstract String getTitle();

    public abstract String getBody();

}
