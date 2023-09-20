package TestingProject.tst.controllers;

import TestingProject.tst.models.Human;
import TestingProject.tst.services.TestingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "human")
public class TestingController {
    private final TestingService testingService;

    public TestingController(TestingService testingService) {
        this.testingService = testingService;
    }

    @PostMapping
    public Human createHuman(@RequestBody Human human) {
        return testingService.createHuman(human);
    }

    @GetMapping
    public Collection<Human> getAllHumans() {
        return testingService.getAllHumans();
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Human> getHumanById(@PathVariable Integer id) {
        Human human = testingService.getHumanById(id);
        if (human == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(human);
    }

    @PutMapping
    public ResponseEntity<Human> updateHuman(@RequestBody Human human) {
        Human updatedHuman = testingService.updateHuman(human);
        if (updatedHuman == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedHuman);
    }

    @DeleteMapping
    public ResponseEntity<Human> deleteHuman(@RequestBody Human human) {
        Human deletedHuman = testingService.deleteHuman(human);
        if (deletedHuman == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deletedHuman);
    }
}
