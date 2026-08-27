static class QuestLogic
{
    public static bool CanFastAttack(bool knightIsAwake)
    {

        if (knightIsAwake)
        {
            return false;
        }
        return true;
    }

    public static bool CanSpy(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake)
    {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static bool CanSignalPrisoner(bool archerIsAwake, bool prisonerIsAwake)
    {
        if (archerIsAwake == true)
        {
            return false;
        }
        return prisonerIsAwake;
    }

    public static bool CanFreePrisoner(bool knightIsAwake, bool archerIsAwake, bool prisonerIsAwake, bool petDogIsPresent)
    {
        if (petDogIsPresent == true)
        {
            return !archerIsAwake;
        }
        if (petDogIsPresent == false && prisonerIsAwake == true)
        {
            return !(knightIsAwake || archerIsAwake);
        }
        return false;
    }
}
