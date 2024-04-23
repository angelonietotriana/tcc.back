package com.tcc.constants;

public enum EstadosDespacho {
    INICIO(1),
    EN_PROCESO(2),
    ENTREGANDO(3),
    ENTREGADO(4);

    private final Integer estado;

    EstadosDespacho(Integer estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return switch (this) {
            case INICIO -> "inicio";
            case EN_PROCESO -> "en_proceso";
            case ENTREGANDO -> "entregando";
            case ENTREGADO -> "entregado";
            default -> "Unknown";
        };
    }

    public static String fromValue(int value) {
        for (EstadosDespacho enumValue : values()) {
            if (enumValue.estado == value) {
                return enumValue.getEstado();
            }
        }
        return null;
    }
}
