package TestingProject.tst.controllers;

import TestingProject.tst.models.Human;
import TestingProject.tst.services.HumanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "human")
public class HumanController {
    private final HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    @PostMapping
    public Human createHuman(@RequestBody Human human) {
        return humanService.createHuman(human);
    }

    @GetMapping
    public Collection<Human> getAllHumans() {
        return humanService.getAllHumans();
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Human> getHumanById(@PathVariable Integer id) {
        Human human = humanService.getHumanById(id);
        if (human == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(human);
    }

    @PutMapping
    public ResponseEntity<Human> updateHuman(@RequestBody Human human) {
        Human updatedHuman = humanService.updateHuman(human);
        if (updatedHuman == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedHuman);
    }

    @DeleteMapping
    public ResponseEntity<Human> deleteHuman(@RequestBody Human human) {
        Human deletedHuman = humanService.deleteHuman(human);
        if (deletedHuman == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deletedHuman);
    }
}
