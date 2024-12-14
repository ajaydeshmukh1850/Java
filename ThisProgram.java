public class ThisProgram {
    
    public static void main(String[] args)
	{
		
        Hero obj = new Hero(10,"Aj");
         System.out.println(obj.getage());
         System.out.println(obj.getName());

    }
}

    class Hero{
        int age;
        String name;

        public Hero(int age , String name)
		{
            System.out.println("constructoctor");
            this.age = age;
            this.name = name;
        }
        public int getage()
		{
            return age;
        }
        public String getName()
		{
            return name;
        }
    }

