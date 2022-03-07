public class Project {
	public static void main(String[] args) {
		Student student1 = new Student("Studente1", "fenfe", new Date(3, Month.October, 2001), "dawuhidhuiwa",
				"fhbaejf");
		// System.out.println(student1.getInfo());
		Student student2 = new Student("Studente2", "fenfe", new Date(3, Month.October, 2001), "dawuhidhuiwa",
				"fhbaejf");

		Teacher teacher = new Teacher("teacher", "fenfe", new Date(3, Month.October, 2001), "dawuhidhuiwa",
				"fhbaejf", Subject.Math);

		Secretarians sec = new Secretarians("Sec", "efjkfiuaehf", new Date(10, Month.April, 1999), "uhfeuifhieuh",
				"jefksahfes", "accountant");
		ATA pata = new ATA("atapersonal", "fwehiuaheifu", new Date(20, Month.August, 1987), "jefsuihf", "uifeshfiseh");

		Secretariat secretariat = new Secretariat();
		secretariat.addEntity(sec);
		secretariat.addEntity(pata);

		ClassRoom class1 = new ClassRoom(20);
		class1.addEntity(student1);
		class1.addEntity(teacher);

		ClassRoom class2 = new ClassRoom(10);
		class2.addEntity(student2);

		for (Entity e : class2.getStudents())
			System.out.println(e.getInfo() + "\n");

		for (Entity e : secretariat.getEntities())
			System.out.println(e.getInfo() + "\n");

		for (Entity e : class1.getTeachers())
			System.out.println(e.getInfo() + "\n");
	}
}
