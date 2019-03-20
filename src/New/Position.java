package New;

public class Position{
        public static char[] letters = {'A','B','C','D','E','F','G','H'};

        private int number;
        private int letter;

        public Position(int number, int letter) {
            this.number = number;
            this.letter = letter;
        }

        public int getNumber() {
            return number;
        }

        public int getLetter() {
            return letter;
        }

        public void print() {
            System.out.print(letters[letter] + (number + 1));
        }

        void checkPosition(){ }

}
