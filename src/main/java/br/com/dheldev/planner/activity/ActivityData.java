package br.com.dheldev.planner.activity;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityData(UUID id, String titulo, LocalDateTime occurs_at) {

}
