    public class Contatos{
        private String nome;
        private String numero;

        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setNumero(String numero) {
            this.numero = numero;
        }

        @Override
        public String toString(){
            return "Nome: " + nome + "\nNumero: " + numero;
        }
    }
