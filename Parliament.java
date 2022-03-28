public class Parliament{
    public static void main(String[] args){
        System.out.println("Fifth Convocation");
        ParliamentOfKyrgyzRepublic fifthConvocation = new ParliamentOfKyrgyzRepublic(new String[]{"Ata Jurt", "SDPK", "Ar-Namys", "Respublika", "Ata-Meken"}, "Torobai Zulpukurov");
        fifthConvocation.showDutiesOfSpeaker();
        fifthConvocation.adoptNewLaw("New Constitution Law");
        fifthConvocation.showPercentageOfMandates("Ata-Meken", 19);
        System.out.println();

        System.out.println("Sixth Convocation");
        ParliamentOfKyrgyzRepublic sixthConvocation = new ParliamentOfKyrgyzRepublic(new String[]{"SDPK", "Respublika-Ata Jurt", "Kyrgyzstan", "Onuguu-Progress", "Bir-Bol", "Ata-Meken"}, "Asylbek Zheenbekov");
        sixthConvocation.showDutiesOfSpeaker();
        sixthConvocation.adoptNewLaw("Information Manipulation Law");
        sixthConvocation.showPercentageOfMandates("SDPK", 38);
        System.out.println();
		
        System.out.println("Seventh Convocation");
        ParliamentOfKyrgyzRepublic seventhConvocation = new ParliamentOfKyrgyzRepublic(54,new String[]{"Ata Jurt", "Ishenim", "Yntymak", "Alians", "Butun Kyrgyzstan", "Yiman Nuru"}, "Talant Mamytov");
        seventhConvocation.showDutiesOfSpeaker();
        seventhConvocation.adoptNewLaw("Funeral Law");
        seventhConvocation.showPercentageOfMandates("Ata Jurt", 15);
	}
}