package org.cdk.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

    @Component
    public class Address {
        @Value("Pune")
        String city;

       public Address() {}

        public String getCity() {

            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
