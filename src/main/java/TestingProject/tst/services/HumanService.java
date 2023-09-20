package TestingProject.tst.services;

import TestingProject.tst.models.Human;
import TestingProject.tst.repositories.HumanRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class HumanService {
    private final HumanRepository humanRepository;

    public HumanService(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public Human createHuman(Human human) {
        return humanRepository.save(human);
    }

    public Collection<Human> getAllHumans() {
        return humanRepository.findAll();
    }

    public Human getHumanById(Integer id) {
        return humanRepository.findById(id).orElse(null);
    }

    public Human updateHuman(Human human) {
        if (getHumanById(human.getId()) == null) {
            return null;
        }
        return humanRepository.save(human);
    }

    public Human deleteHuman(Human human) {
        Human humanToDelete = getHumanById(human.getId());
        if (humanToDelete == null) {
            return null;
        }
        humanRepository.delete(humanToDelete);
        return humanToDelete;
    }
}
