public class Dogwalker
{
    private int maxDogs;

    private Dogwalkcompany company;

    public Dogwalker (int max, Dogwalkcompany comp)
    {
        maxDogs = max;
        company = comp;
    }

    public int walkDogs(int hour)
    {
        int dogs = company.numAvailableDogs(hour);
        if (dogs < maxDogs)
        {
            company.updateDogs(hour, dogs);
            return dogs;
        }
        company.updateDogs(hour, maxDogs);
        return maxDogs;
    }
    public int shift(int startHour, int endHour)
    {
        int pay = 0;
        while (startHour <= endHour);
        int dogs = walkDogs(startHour);

    }
}
