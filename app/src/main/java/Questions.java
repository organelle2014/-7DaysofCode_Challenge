public class Questions {

    public String mQuizzes [] = {
      "Of the following name/symbol combinations of elements, which one is WRONG?",
      "Of the following symbol/name combinations of elements, which one is WRONG?",
            "The chemical symbol for manganese is",
            "The number 0.005436 has how many significant figures?",
            "The number 10.00 has how many significant figures?",
            "What is the volume of a 2.50 gram block of metal whose density is 6.72 grams per cubic centimeter?",
            "A cube of 1.2 inches on the side has a mass of 36 grams. What is the density in g/cm3?",
    };
    private String[][] mAnswers ={
            {"uranium/U, sulfur/S, nitrogen/N, potassium/K"},
            {"C/carbon, B/barium, F/fluorine, N/nitrogen"},
            {"Mn, Mo, Ma, Ga"},
            {"7, 3, 4, 5"},
            {"1, 2, 3, 4"},
            {"16.8 cubic centimeters, 2.69 cubic centimeters, 0.0595 cubic centimeters, 0.372 cubic centimeters"},
            {"21, 2.2, 30, 1.3"}
    };
    private String mCoreectAnswers[]={
            "nitrogen/N",  "N/nitrogen", "Mn", "3", "4", "2.69 cubic centimeters, 30"
    };
    public String getQuetions(int a){
        String question=mQuizzes[a];
        return question;
    }
    public String getChoice1(int a){
        String choice=mAnswers[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice=mAnswers[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice=mAnswers[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice=mAnswers[a][3];
        return choice;
    }

    public String getmCoreectAnswers(int a) {
        String answer=mCoreectAnswers[a];
        return answer;
    }
}
