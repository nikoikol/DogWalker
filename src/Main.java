class Main
{
    public static void main(String[] args)
        {
            Dogwalkcompany c = new Dogwalkcompany();
            for (int i = 7; i < 11; i++)
            {
                c.addDogs();
            }
            System.out.println(c);
            Dogwalker w = new Dogwalker(3, c);

        }

}