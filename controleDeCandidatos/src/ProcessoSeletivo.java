import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
        
    }
    public static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia","julia","paulo","Augusto","Monica","Fabricio","mirela","Daniela","jorge"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual<candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioDesejado = valorDesejado() ;

            System.out.println("o candidato "+candidato+ "solicitou este valor de salário Pretendido "+ salarioDesejado);
            if(salarioBase >= salarioDesejado){
                System.out.println("o candidato "+ candidato + " foi selecionado para a Vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorDesejado (){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

   public static void analisarCandidato(double salarioDesejado){
        double salarioBase = 2000.0;
        if(salarioBase > salarioDesejado) {
            System.out.println("Ligar para o candidato!");
        }
        else if (salarioBase == salarioDesejado){
            System.out.println("Ligar para enviar uma contra proposta!");
        }
        else {
            System.out.println("Aguardando demais candidatos!");
        }
    }

}
