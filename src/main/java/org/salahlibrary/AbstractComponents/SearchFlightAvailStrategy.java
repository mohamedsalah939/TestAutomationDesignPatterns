package org.salahlibrary.AbstractComponents;

import java.util.HashMap;

public interface SearchFlightAvailStrategy {

    void checkAvailability(HashMap<String, String> reservationDestinations);

}
