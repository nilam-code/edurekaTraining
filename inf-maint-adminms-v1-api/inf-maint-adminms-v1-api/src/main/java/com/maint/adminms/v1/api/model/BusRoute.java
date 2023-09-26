package com.maint.adminms.v1.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "busRoute")
public class BusRoute {
        @Id
        @Column(name = "busId", nullable = false, length = 10)
        private String busId;

        @Column(name = "source")
        private String source;

        @Column(name = "destination")
        private String destination;

        @Column(name = "price")
        private Integer price;


}
