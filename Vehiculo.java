public class Vehiculo {
    private String modelo;
    private String color;
    private int ruedas;
    private int capacidad;

    public Vehiculo(String modelo, String color, int ruedas, int capacidad) {
        this.setModelo(modelo);
        this.setColor(color);
        this.setRuedas(ruedas);
        this.capacidad = capacidad;
    }


    public void setModelo(String modelo){
        if (modelo == null || modelo.trim().length() < 1){
            System.out.println("El modelo del vehículo no puede estar vacío.");
        } else {
            this.modelo = modelo;
        }
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setColor(String color){
        if (color == null) return;
        color = color.strip().toLowerCase();
        switch (color) {
            case "rojo", "amarillo", "azul", "naranja", "negro", "blanco", "verde", "celeste":
                this.color = color;
                break;
            default:
                System.out.println("No existe ese color para el vehículo.");
                break;
        }
    }
    
    public String getColor(){
        return this.color;
    }

    public void setRuedas(int ruedas){
        if (ruedas < 0){
            System.out.println("El vehículo puede tener menos de 0 ruedas.");
        } else {
            this.ruedas = ruedas;
        }
    }

    public int getRuedas() {
        return this.ruedas;
    }
}