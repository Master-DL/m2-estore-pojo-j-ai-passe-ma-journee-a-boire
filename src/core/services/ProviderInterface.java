package core.services;

import core.services.impl.Store;
import estorePojo.exceptions.UnknownItemException;

public interface ProviderInterface {

    double getPrice(Object item) throws UnknownItemException;

    int order(Store store, Object item, int qty) throws UnknownItemException;

}
