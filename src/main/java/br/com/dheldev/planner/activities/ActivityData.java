package br.com.dheldev.planner.activities;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityData(UUID id, String titulo, LocalDateTime occurs_at) {

}
