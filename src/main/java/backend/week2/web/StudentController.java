package backend.week2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import backend.week2.domain.Student;

@Controller
public class StudentController {

	@GetMapping("hello2")
	public String sayGreetingsToStudents(Model model) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Erika", "Koskinen"));
		students.add(new Student("Alexandra", "Testinen"));
		model.addAttribute("students", students);
		return "studentlist";
	}
}
