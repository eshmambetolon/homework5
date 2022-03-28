public class ParliamentOfKyrgyzRepublic{
    int countOfMandates;
    String[] parties;
    String speaker;

    public ParliamentOfKyrgyzRepublic(){
        this.countOfMandates = 120;
        this.parties = new String[]{"Ata-Meken", "Butun Kyrgyzstan", "Reforma"};
        this.speaker = "Elvira Surabaldieva";
    }
    public ParliamentOfKyrgyzRepublic(String[] parties, String speaker){
        this.parties = parties;
        this.speaker = speaker;
        this.countOfMandates = 120;
    }
    public ParliamentOfKyrgyzRepublic(int countOfMandates,String[] parties, String speaker){
        this.countOfMandates = countOfMandates;
        this.parties = parties;
        this.speaker = speaker;
    }
    public void showDutiesOfSpeaker(){
        System.out.println(this.speaker+" oversees compliance with the regulations, gives the floor to individual deputies and announces the results of voting.");
    }
    public void adoptNewLaw(String newLaw){
        for(String party: this.parties){
            System.out.println("The party "+party +" approved the adoption of the "+newLaw);
        }
    }
    public void showPercentageOfMandates(String party,int mandatesOfParty){
        for(String fraction: this.parties){
            if(fraction == party){
                double percentageOfMandates = (double)mandatesOfParty/(double)this.countOfMandates*100;
                System.out.println(party+" occupies "+(int)percentageOfMandates+"% of parliament");
            }
        }
    }
}