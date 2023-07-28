package com.squireofsoftware.hurtz

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class Ping(@Id val id: UUID = UUID.randomUUID(), val ip: String)