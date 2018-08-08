/**Класс реализующий калькулятор*/
public class Calculator{
	/**результат вычисления*/
	private int result;
	/**Суммируем аргументы*/
	public void add(int ... params){
		for(Integer param : params){
			this.result += param;
		}
	}
	/**получить результат*/
	public int getResult(){
		return this.result;
	}
	/**Очистить результат вычисления*/
	public void clearResult(){
		this.result = 0;
	}
}