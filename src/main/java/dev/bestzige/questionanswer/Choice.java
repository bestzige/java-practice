package dev.bestzige.questionanswer;

public class Choice {

    private int choiceNo;
    private String choiceItem;

    public Choice(int choiceNo, String choiceItem) {
        this.choiceNo = choiceNo;
        this.choiceItem = choiceItem;
    }

    public int getChoiceNo() {
        return choiceNo;
    }

    public void setChoiceNo(int choiceNo) {
        this.choiceNo = choiceNo;
    }

    public String getChoiceItem() {
        return choiceItem;
    }

    public void setChoiceItem(String choiceItem) {
        this.choiceItem = choiceItem;
    }

    public boolean isMatch(Choice userChoice) {
        return this.choiceNo == userChoice.getChoiceNo();
    }

    @Override
    public String toString() {
        return "Choice{" +
                "choiceNo=" + choiceNo +
                ", choiceItem='" + choiceItem + '\'' +
                '}';
    }
}
