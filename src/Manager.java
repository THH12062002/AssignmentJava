public class Manager extends Employee{
    int teamSize;
    @Override
    public void work()
    {
        super.work();
        System.out.println(name + " manages a team of " + teamSize + " in " + department);
    }
}
