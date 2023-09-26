package com.inventoryms.v1.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "busInventory")
public class BusInventory {


        @Id
        @Column(name = "busNo", nullable = false, length = 10)
        private String busNo;

        @Column(name = "NoOfAvailableSeat")
        private String NoOfAvailableSeat;

        @Column(name = "lastUpdatedDate")
        private String lastUpdatedDate;


}
