package desafios;

public class controle {
    private boolean ligdeslg;
    private int volume;
    private  boolean tocando;
    // metodo contrustor
    public controle() {
        setLigdeslg(false);
        setTocando(false);
        setVolume(50);
    }
    // metodos
    public void ligar() {
        setLigdeslg(true);
    }
    public void desligar() {
        setLigdeslg(false);
    }
    public void abrirMenu() {

    }
    public void fecharMenu() {

    }
    public void maisVolume() {
        if (getVolume() != 100 && getVolume() < 100) {
            setVolume(getVolume() + 5);
        }
    }
    public void menosVolume() {
        if (getVolume() != 0 && getVolume() > 0) {
        setVolume(getVolume() - 5);
        }
    }
    public void ligarMudo() {
        if (getVolume() != 0) {
            setVolume(0);
        }
    }
    public void desligarMudo() {
        if (getVolume() == 0) {
            setVolume(50);
        }
    }
    public void play() {
        setTocando(true);
    }
    public void pause() {
        setTocando(false);
    }
    // geter e setters
    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigdeslg() {
        return ligdeslg;
    }

    private void setLigdeslg(boolean ligdeslg) {
        this.ligdeslg = ligdeslg;
    }
}
