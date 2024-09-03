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
	}
}
