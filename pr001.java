class pr001 {
	public static void main(String args[]) {
		System.out.println("Первая программа на Java");//Выводим строку на консоль
		int var1 = 1024;
		int var2;
		//System.out.println(var2);: Ошибка: переменной не присовенно значение 
		var2 = 411;
		System.out.println(var1/2);
		System.out.println("Результат целочислительного действия: " + var2/2);
		System.out.println("Результат деления привидением типа данных: " +(double)var2/2);
		double var3 = (double)var2/2;

		//пример использования оператора if 
		//if(var1=0)
		//	System.out.println("Условие  var=0 выполнено"); Несовместимость типов в условии
		if(var1/2==512)
                        System.out.println("Условие \"var1/2==512\" выполнено");
		if(true)
			System.out.println("\tУсловие  true \n\tвыполнено");
		System.out.println("Строка для проверки");
		System.out.println();

		// Пример испольщование поератора цикла for
		for (int i=0; i<10; i++)
			System.out.println("Строка номер" + i);
		//i = 10; переменная i локальная и существует только во время выполнения цикла 
		System.out.println();
		int j;
		for (j=0; j<10; j++)
                        System.out.println(j + " ");
		System.out.println();

	}
}
