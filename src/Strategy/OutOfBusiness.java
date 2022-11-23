//OutOfBusiness Class
package Strategy;
public class OutOfBusiness implements TimeStrategy{
	@Override
	public void execute() {
		System.out.println("已打烊");
	}
}
