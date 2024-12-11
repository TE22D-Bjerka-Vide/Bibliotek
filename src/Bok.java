public class Böcker {
        private String titel;
        private int längd;
        private int bokID;
        private Författare författare;

        public bok(String titel, int längd, int bokID, Författare författare) {
            this.titel = titel;
            this.längd = längd;
            this.bokID = bokID;
            this.författare = författare;
        }
        public String getTitel() {
            return titel;
        }

        public int getLängd() {
        return längd;
        }

        public int getBokID() {
        return bokID;
        }

        public Författare getFörfattare() {
        return författare;
        }
}
