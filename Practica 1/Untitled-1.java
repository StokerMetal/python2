// Sistema de Reservación de Hoteles

public class Reserva {
    private int id;
    private String cliente;
    private String habitacion;
    private Date fechaInicio;
    private Date fechaFin;

    public void enviarConfirmacion() {
        // Lógica para enviar confirmación
    }

    public void realizarReserva() {
        // Lógica para realizar reserva
    }
}

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private String telefono;

    public void realizarPago() {
        // Lógica para realizar pago
    }

    public void modificarReserva() {
        // Lógica para modificar reserva
    }
}

public class Habitacion {
    private int numero;
    private String tipo;
    private boolean disponible;

    public void asignar() {
        // Lógica para asignar habitación
    }

    public void actualizarDisponibilidad() {
        // Lógica para actualizar disponibilidad
    }
}

// Aplicación de Pedidos de Comida

public class Pedido {
    private int id;
    private String cliente;
    private String direccion;
    private Date fechaPedido;
    private List<Producto> productos;

    public void enviarConfirmacion() {
        // Lógica para enviar confirmación de entrega
    }

    public void realizarPedido() {
        // Lógica para realizar pedido
    }
}

public class Cliente {
    private int id;
    private String nombre;
    private String email;
    private String direccion;

    public void seleccionarMetodoPago() {
        // Lógica para seleccionar método de pago
    }

    public void crearPerfil() {
        // Lógica para crear perfil
    }
}

public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private boolean disponible;

    public void actualizarDisponibilidad() {
        // Lógica para actualizar disponibilidad del producto
    }

    public void agregarAlCarrito() {
        // Lógica para agregar producto al carrito
    }
}
