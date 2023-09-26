package com.inventoryms.v1.api.repositrory;

import com.inventoryms.v1.api.model.BusInventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusInventoryRepository extends JpaRepository<BusInventory,String> {
}
