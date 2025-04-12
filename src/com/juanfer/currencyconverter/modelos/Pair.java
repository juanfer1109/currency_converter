package com.juanfer.currencyconverter.modelos;

public record Pair(String base_code, String target_code, double conversion_rate) {
}
