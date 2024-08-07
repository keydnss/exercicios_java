public class classesatributos {

    public static class placadevideo{
        private String marca;
        private String modelo;
        private int geração;
        private int anodolançamento;
    

        public placadevideo(String marca, String modelo, int geração, int anodolançamento){
            this.marca = marca;
            this.modelo = modelo;
            this.geração = geração;
            this.anodolançamento = anodolançamento;
        }

        public void imprimirdados(){
            System.out.println("\nMarca: "+marca);
            System.out.println("Modelo: "+modelo);
            System.out.println("Geração: "+geração);
            System.out.println("Data de lançamento: "+anodolançamento+"\n");
        }
    }
    public static void main(String[] args){
        placadevideo placadevideo1 = new placadevideo("AMD", "RX6600", 6, 2006);
        placadevideo1.imprimirdados();
    }
}
