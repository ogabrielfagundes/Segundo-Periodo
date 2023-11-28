package p2;
import java.util.Scanner;

public class quiz {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho1.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
        cabecalho1.Aluno = "Aluno: Gabriel Ribeiro Miranda Fagundes";
        cabecalho1.Professor = "Professor: Brenno Pimenta";
        cabecalho1.Disciplina = "Disciplina: Algoritmo e Programaçao II";
        cabecalho1.bemVindo = "Bem Vindo ao Quiz!";
        cabecalho1.escrevaCabecalho();


        questoes questoes1 = new questoes();
        questoes1.questoes = "1- Quem é o autor do famoso discurso 'Eu tenho um sonho'?";
        questoes1.A = "A) Nelson Mandela";
        questoes1.B = "B) Zumbi dos Palmares";
        questoes1.C = "C) Barack Obama";
        questoes1.D = "D) Martin Luther King ";
        questoes1.E = "E) Carlota Joaquina";
        questoes1.escrevaquestao();
        questoes1.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        String resposta = (String) sc.nextLine();
        if (questoes1.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("====================================================================== ");
        questoes questoes2 = new questoes();
        questoes2.questoes = "2- Quais as consequências para o Brasil decorrentes da crise na Venezuela??";
        questoes2.A = "A) Fortalecimento do Mercosul";
        questoes2.B = "B) Aumento de mão-de-obra";
        questoes2.C = "C) Sobrecarregamento no sistema público de saúde em Roraima";
        questoes2.D = "D) Crescimento de investimentos estrangeiros";
        questoes2.E = "E) Melhoria nos serviços sociais a fim de atender os imigrantes venezuelanos";
        questoes2.escrevaquestao();
        questoes2.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes2.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes3 = new questoes();
        questoes3.questoes = "3- Em outubro de 2017 um crime em Goiânia chocou o Brasil. O que aconteceu??";
        questoes3.A = "A) Chacina da Candelária";
        questoes3.B = "B) Um adolescente disparou contra colegas em uma sala de aula, dois dos quais morreram";
        questoes3.C = "C) Um segurança ateou fogo em crianças de uma creche, provocando a morte de pelo menos 5";
        questoes3.D = "D) Crime que ficou conhecido como Massacre de Realengo";
        questoes3.E = "E) Um índio foi queimado enquanto dormia em um ponto de ônibus";
        questoes3.escrevaquestao();
        questoes3.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes4 = new questoes();
        questoes4.questoes = "4- Em que país se localizava Auschwitz, o maior campo de concentração nazi?";
        questoes4.A = "A) Alemanha";
        questoes4.B = "B) Estados Unidos";
        questoes4.C = "C) Áustria";
        questoes4.D = "D) Japão";
        questoes4.E = "E) Polônia";
        questoes4.escrevaquestao();
        questoes4.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes4.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes5 = new questoes();
        questoes5.questoes = "5- O que é Pix?“?";
        questoes5.A = "A) Plano de investimento de baixo risco do Banco do Brasil";
        questoes5.B = "B) Conjunto de formas de pagamento realizados por subadquirentes";
        questoes5.C = "C) Forma de pagamento online";
        questoes5.D = "D) Meio de pagamento instantâneo criado pelo Banco Central do Brasil";
        questoes5.E = "E) Produtos de investimento financeiro criados pelo Banco Central do Brasil";
        questoes5.escrevaquestao();
        questoes5.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes5.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes6 = new questoes();
        questoes6.questoes = "6- Qual o motivo da condenação de Luís Inácio Lula da Silva em 2018?";
        questoes6.A = "A) Corrupção e lavagem de dinheiro na Operação Lava Jato";
        questoes6.B = "B) Recebimento de apartamento de luxo no Guarujá (SP) como propina na Operação Lava Jato";
        questoes6.C = "C) Tráfico de influência internacional na Operação Janus";
        questoes6.D = "D) Obstrução da justiça na Operação Lava Jato";
        questoes6.E = "E) Formação de quadrilha na Operação Lava Jato";
        questoes6.escrevaquestao();
        questoes6.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes6.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes7 = new questoes();
        questoes7.questoes = "7- Em que ano e quem foi eleito o primeiro presidente do Brasil?";
        questoes7.A = "A) 1890, Floriano Peixoto";
        questoes7.B = "B) 1889, Hermes da Fonseca";
        questoes7.C = "C) 1930, Getúlio Vargas";
        questoes7.D = "D) 1891, Deodoro da Fonseca";
        questoes7.E = "E) 1822, Deodoro da Fonseca";
        questoes7.escrevaquestao();
        questoes7.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes7.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes8 = new questoes();
        questoes8.questoes = "8- Em que oceano fica Madagascar?";
        questoes8.A = "A) Oceano Antártico";
        questoes8.B = "B) Oceano Atlântico";
        questoes8.C = "C) Oceano Índico";
        questoes8.D = "D) Oceano Pacífico";
        questoes8.E = "E) Oceano Ártico";
        questoes8.escrevaquestao();
        questoes8.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes8.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes9 = new questoes();
        questoes9.questoes = "9- Quais são os cromossomos que determinam o sexo masculino?";
        questoes9.A = "A) Os Y";
        questoes9.B = "B) Os V";
        questoes9.C = "C) Os X";
        questoes9.D = "D) Os W";
        questoes9.E = "E) Os Z";
        questoes9.escrevaquestao();
        questoes9.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes9.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes10 = new questoes();
        questoes10.questoes = "10- As pessoas de qual tipo sanguíneo são consideradas doadores universais?";
        questoes10.A = "A) Tipo A";
        questoes10.B = "B) Tipo B";
        questoes10.C = "C) Tipo AB";
        questoes10.D = "D) Tipo O";
        questoes10.E = "E) Tipo ABO";
        questoes10.escrevaquestao();
        questoes10.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes10.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes11 = new questoes();
        questoes11.questoes = "11- Quem foi o primeiro homem a pisar na Lua? Em que ano aconteceu?";
        questoes11.A = "A) Yuri Gagarin, em 1961";
        questoes11.B = "B) Buzz Aldrin, em 1969";
        questoes11.C = "C) Charles Conrad, em 1969";
        questoes11.D = "D) Charles Duke, em 1971";
        questoes11.E = "E) Neil Armstrong, em 1969";
        questoes11.escrevaquestao();
        questoes11.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes11.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes12 = new questoes();
        questoes12.questoes = "12- Qual o maior animal terrestre?";
        questoes12.A = "A) Elefante africano";
        questoes12.B = "B) Baleia Azul";
        questoes12.C = "C) Dinossauro";
        questoes12.D = "D) Tubarão Branco";
        questoes12.E = "E) Girafa";
        questoes12.escrevaquestao();
        questoes12.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes12.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes13 = new questoes();
        questoes13.questoes = "13- Qual a velocidade da luz?";
        questoes13.A = "A) 300 000 000 metros por segundo (m/s)";
        questoes13.B = "B) 150 000 000 metros por segundo (m/s)";
        questoes13.C = "C) 299 792 458 metros por segundo (m/s)";
        questoes13.D = "D) 199 792 458 metros por segundo (m/s)";
        questoes13.E = "E) 30 000 000 metros por segundo (m/s)";
        questoes13.escrevaquestao();
        questoes13.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes13.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes14 = new questoes();
        questoes14.questoes = "14- Qual a montanha mais alta do Brasil?";
        questoes14.A = "A) Pico Paraná";
        questoes14.B = "B) Monte Roraima";
        questoes14.C = "C) Pico Maior de Friburgo";
        questoes14.D = "D) Pico da Neblina";
        questoes14.E = "E) Pico da Bandeira";
        questoes14.escrevaquestao();
        questoes14.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes14.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes15 = new questoes();
        questoes15.questoes = "15- Quanto tempo a luz do Sol demora para chegar à Terra?";
        questoes15.A = "A) 12 segundos";
        questoes15.B = "B) 8 minutos";
        questoes15.C = "C) 12 horas";
        questoes15.D = "D) 1 dia";
        questoes15.E = "E) 12 minutos";
        questoes15.escrevaquestao();
        questoes15.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes15.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

    }

}
