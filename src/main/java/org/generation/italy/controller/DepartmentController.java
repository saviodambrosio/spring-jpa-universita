package org.generation.italy.controller;

import org.generation.italy.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DepartmentController {

	@Autowired
	private DepartmentRepository repo;
	
	@GetMapping
	public String departmentList(Model model) {
		model.addAttribute("list", repo.findAll(Sort.by("name")));
		return "departments";
	}
}
