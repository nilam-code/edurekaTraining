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
@Table(name = "booking")
public class Booking {
        @Id
        @Column(name = "bookingNo", nullable = false, length = 10)
        private String bookingNo;

        @Column(name = "busNo")
        private String busNo;

        @Column(name = "bookingDate")
        private String bookingDate;

        @Column(name = "source")
        private Integer source;

        @Column(name = "destination")
        private Integer destination;

        @Column(name = "noOfSeats")
        private Integer noOfSeats;

        @Column(name = "status")
        private Integer status;

}
