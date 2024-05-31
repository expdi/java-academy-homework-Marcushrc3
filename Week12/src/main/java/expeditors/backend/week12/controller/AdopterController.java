package expeditors.backend.week12.controller;

import expeditors.backend.week12.model.Adopter;
import expeditors.backend.week12.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adopter")
public class AdopterController {

    @Autowired
    private AdopterService adopterService;

    @GetMapping
    public List<Adopter> getAll(){
        return adopterService.getAll();
    }


}

