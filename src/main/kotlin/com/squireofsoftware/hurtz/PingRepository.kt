package com.squireofsoftware.hurtz

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface PingRepository : CrudRepository<Ping, UUID> {
}