package com.furkansahan.repository;

import com.furkansahan.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository <Location,Long> {
}
