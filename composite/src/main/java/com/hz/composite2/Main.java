package com.hz.composite2;

/**
 * @author hz
 */
public class Main {

	public static void main(String[] args) {
		Engineer ajay = new Engineer(1001l, "Ajay", "Developer", Department.ENG);
		Engineer vijay = new Engineer(1002l, "Vijay", "SR. Developer", Department.ENG);
		Engineer jay = new Engineer(1003l, "Jay", "Lead", Department.ENG);
		Engineer martin = new Engineer(1004l, "Martin", "QA", Department.ENG);
		Manager kim = new Manager(1005l, "Kim", "Manager", Department.ENG);

		Engineer anders = new Engineer(1006l, "Andersen", "Developer", Department.ENG);
		Manager niels = new Manager(1007l, "Niels", "Sr. Manager", Department.ENG);

		Engineer robert = new Engineer(1008l, "Robert", "Developer", Department.ENG);
		Manager rachelle = new Manager(1009l, "Rachelle", "Product Manager", Department.ENG);

		Engineer shailesh = new Engineer(1010l, "Shailesh", "Engineer", Department.ENG);

		kim.addSubordinates(ajay);
		kim.addSubordinates(martin);
		kim.addSubordinates(vijay);

		niels.addSubordinates(jay);
		niels.addSubordinates(anders);
		niels.addSubordinates(shailesh);

		rachelle.addSubordinates(kim);
		rachelle.addSubordinates(robert);
		rachelle.addSubordinates(niels);

		WorkLoader workLoad = new WorkLoader("composite/work.properties");
		workLoad.getWorkList().forEach(work -> rachelle.assignWork(rachelle, work));
		rachelle.performWork();

	}

}
