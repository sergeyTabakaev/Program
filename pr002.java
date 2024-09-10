class pr002 {
	public static void main(String args[]) {
		byte b, bb, bbb;//8-битная переменная
		short s, ss, sss;//16-битная переменая 
		int i, ii, I;//32-битная переменая 
		long l, ll, L;//64-битная переменая 
		b=127;
		bb= (byte) 130;
		s= 32000;
		ss= (short) 33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		//bbb=sss Автопреобразование типов запрещено,так как может привести к искажению значений
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);

		// пример использования различный целых типов 
		ii = 700000;// Длина стороны  куба в миллиметрах
		int v = ii*ii*ii;// объем куба в кубических мм
		System.out.println("Объем куба : " + v);
		long vv =(long)ii*ii*ii;
		System.out.println("Правильно вычеслинный объем куба : " + vv);

		double d, dd;
		d = b/2;
		System.out.println("d =  " + d);
		dd = (double)b/2;
		System.out.println("dd =  " + dd);
		// символный тип данных
	        System.out.println("примеры использования символьного типа\n");
        	char ch;
       		ch = 'D';
	        System.out.println("Значение ch: " + ch );
	        ch++;
	        System.out.println("новое занчение ch:" + ch);
	        ch = 97;
	        System.out.println(" занчение ch с кодом 97:" + ch);
	        I = (int)ch;
	        System.out.println("Код  ch:" + I);
	        ch = 'А';
	        for (int i = 0; i<66; i++) {
        	        I = (int)ch;
	                System.out.print("Код символа " + ch + ":" + I + "\n" );
	                ch++;
		}

	// логический тип данных 
	        System.out.println("примеры использования логического  типа\n");
	        boolean bool;
	        bool = false;
	        System.out.println("Значение bool: "+ bool);
	        bool = true;
	        System.out.println("Значение bool: "+ bool);
	        if(bool) System.out.println("Выводим строку, если \"bool\"true");
	        if(!bool) System.out.println("Выводим строку, если инверсия\"bool\"true");
	        bool = ch=='я';
	        System.out.println("Символ ch равен \"я\" ");
	       }



	}
}
