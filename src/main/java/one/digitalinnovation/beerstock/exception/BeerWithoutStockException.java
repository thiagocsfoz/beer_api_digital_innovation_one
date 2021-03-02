package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerWithoutStockException extends Exception {

    public BeerWithoutStockException(Long id, int quantityStock) {
        super(String.format("Beers with %s ID without stock: %s", id, quantityStock));
    }
}
