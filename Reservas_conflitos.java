import java.util.Date;

public class Reservas_conflitos {
    private int id_reserva;
    private int id_client;
    private int id_location;
    private Date data_check_in;
    private Date data_check_out;

    public Reservas_conflitos(int id_reserva, int id_client, int id_location, Date data_check_in, Date data_check_out) {
        this.id_reserva = id_reserva;
        this.id_client = id_client;
        this.id_location = id_location;
        this.data_check_in = data_check_in;
        this.data_check_out = data_check_out;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public int getId_location() {
        return id_location;
    }

    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

    public Date getData_check_in() {
        return data_check_in;
    }

    public void setData_check_in(Date data_check_in) {
        this.data_check_in = data_check_in;
    }

    public Date getData_check_out() {
        return data_check_out;
    }

    public void setData_check_out(Date data_check_out) {
        this.data_check_out = data_check_out;
    }
}