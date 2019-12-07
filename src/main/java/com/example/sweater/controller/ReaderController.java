package com.example.sweater.controller;

import com.example.sweater.domain.Reader;
import com.example.sweater.repos.ReaderRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/readers")
public class ReaderController {

    private final ReaderRepo repo;

    public ReaderController(ReaderRepo readerRepo) {
        this.repo = readerRepo;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("readers", repo.findAll());

        return "readers";
    }

    @ResponseBody
    @PostMapping("store")
    public void store(
            @RequestParam String lastName,
            @RequestParam String firstName,
            @RequestParam String middleName,
            @RequestParam String phone,
            @RequestParam String email,
            @RequestParam String passportSeries,
            @RequestParam String passportNumber,
            @RequestParam String passportBy
            ) {
        Reader reader = new Reader();

        reader.setFirstName(lastName);
        reader.setMiddleName(firstName);
        reader.setLastName(middleName);
        reader.setPhone(phone);
        reader.setEmail(email);
        reader.setPassportSeries(passportSeries);
        reader.setPassportNumber(passportNumber);
        reader.setPassportBy(passportBy);

        repo.save(reader);
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Integer id) {
        repo.deleteById(id);

        return "redirect:/readers";
    }
}
