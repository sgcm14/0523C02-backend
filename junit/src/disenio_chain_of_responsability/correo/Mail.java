package disenio_chain_of_responsability.correo;

    public class Mail {
        private String asunto;
        private String destino;
        private String origen;

        public Mail(String origen, String destino, String asunto) {
            this.origen = origen;
            this.destino = destino;
            this.asunto = asunto;
        }

        public String getOrigen() {
            return origen;
        }

        public String getDestino() {
            return destino;
        }

        public String getAsunto() {
            return asunto;
        }
    }
