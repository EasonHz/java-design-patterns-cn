package com.hz.memento2;

/**
 * @author hz
 */
public class Main {

	public static void main(String[] args) {
		EmployeeCaretaker caretaker = new EmployeeCaretaker();
		System.out.println("创建员工对象...");
		Employee zhangSan = new Employee(100).setName("张三").setDesignation("Lead").setSalary(100000).setDepartment("R&D").setProject("Transportation Management");
		Employee liSi = new Employee(101).setName("李四").setDesignation("Developer").setSalary(75000).setDepartment("Engineering").setProject("IoT");
		System.out.println(zhangSan);
		System.out.println(liSi);
		//创建备忘录
		EmployeeMemento zhangSanMemento = zhangSan.createMemento();
		EmployeeMemento liSiMemento = liSi.createMemento();
		//添加备忘录
		caretaker.addMemento(zhangSan.getEmpId(), "Saved at intitial stage", zhangSanMemento);
		caretaker.addMemento(liSi.getEmpId(), "Saved at intitial stage",liSiMemento);

		System.out.println("\n张三升职了");
		zhangSan.setDesignation("Manager").setSalary(120000);
		System.out.println("李四被分配到了另一个项目组");
		liSi.setProject("Android App");
		System.out.println(zhangSan);
		System.out.println(liSi);
		//创建备忘录
		zhangSanMemento = zhangSan.createMemento();
		liSiMemento = liSi.createMemento();
		//添加备忘录
		caretaker.addMemento(zhangSan.getEmpId(), "Saved at promotion", zhangSanMemento);
		caretaker.addMemento(liSi.getEmpId(), "Saved at android project",liSiMemento);


		System.out.println("\n张三涨工资拉");
		zhangSan.setSalary(140000);
		System.out.println("李四升职啦");
		liSi.setDesignation("Lead Developer").setSalary(90000);
		System.out.println(zhangSan);
		System.out.println(liSi);
		//创建备忘录
		zhangSanMemento = zhangSan.createMemento();
		liSiMemento = liSi.createMemento();
		//添加备忘录
		caretaker.addMemento(zhangSan.getEmpId(), "Saved at increment", zhangSanMemento);
		caretaker.addMemento(liSi.getEmpId(), "Saved at promotion",liSiMemento);


		System.out.println("\n打印出所有的备忘录");
		caretaker.printStoredMementoObjects();


		System.out.println("\n现在，因为一些原因，需要张三恢复到原始状态.");
		System.out.println("并且让李四回到Android项目.");
		zhangSanMemento = caretaker.getMemento(zhangSan.getEmpId(), "Saved at intitial stage");
		liSiMemento = caretaker.getMemento(liSi.getEmpId(), "Saved at android project");
		//恢复备忘录
		zhangSan.restore(zhangSanMemento);
		liSi.restore(liSiMemento);
		System.out.println(zhangSan);
		System.out.println(liSi);
	}

}
