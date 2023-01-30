package poo.RelacionObjetos;

public class Motor {
    private int cilindros;
    private TIpoMotorEnum tipoMotor;

    public Motor() {
        this.cilindros = 4;
        this.tipoMotor = TIpoMotorEnum.OTRO;
    }

    public Motor(int cilindros, TIpoMotorEnum tipoMotor) {
        this.cilindros = cilindros;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public TIpoMotorEnum getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TIpoMotorEnum tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
