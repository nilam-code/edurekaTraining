package com.bookingms.v1.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "passenger")
public class Passenger {

        @Id
        @Column(name = "passengerId", nullable = false, length = 10)
        private String passengerId;

        @Column(name = "bookingNo")
        private String bookingNo;

}
