class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(
        boolean knightIsAwake,
        boolean archerIsAwake,
        boolean prisonerIsAwake,
        boolean petDogIsPresent
    ) {
        if (petDogIsPresent) {
            return !archerIsAwake;
        }
        return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }

    public static void main(String[] args) {
        System.out.println(AnnalynsInfiltration.canFastAttack(true)); 
        System.out.println(AnnalynsInfiltration.canSpy(false, false, false)); 
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(true, true)); 
        System.out.println(
            AnnalynsInfiltration.canFreePrisoner(
                false,  // knightIsAwake
                true,   // archerIsAwake
                true,   // prisonerIsAwake
                false   // petDogIsPresent
            )
        );
    }

}
