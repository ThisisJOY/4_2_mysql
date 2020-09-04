package com.lagou.repository;

import com.lagou.entity.COrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface COrderRepository extends JpaRepository<COrder, Long> {
}
