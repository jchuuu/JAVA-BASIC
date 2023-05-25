package DAY11Two;

public class WebApp {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		// -- 만나는 순간 JVM의 execute engine이 Heap 영역에 데이터 할당
		
		counter.plusDynamicCounter();
		counter.plusDynamicCounter();
		counter.plusDynamicCounter();
		System.out.println(counter.dynamicCounter);
				
		/*System.out.println(counter.dynamicCounter);
		counter.dynamicCounter ++;
		counter.dynamicCounter ++;
		counter.dynamicCounter ++;
		System.out.println(counter.dynamicCounter);*/
		
		Counter counter2 = new Counter();
		System.out.println(counter2.dynamicCounter);
		
		// -- static은 어디에 할당? (Method Area)
		/* Counter.staticCounter ++;
		Counter.staticCounter ++;
		Counter.staticCounter ++; */
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		System.out.println(Counter.staticCounter);
			
		
	}
	
}

