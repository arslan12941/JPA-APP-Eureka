package record.service.controller;

import org.springframework.web.bind.annotation.*;
import record.service.repository.RecordRepository;

import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordController {

    private final RecordRepository repo;

    public RecordController(RecordRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Record save(@RequestBody Record r) {
        return repo.save(r);
    }

    @GetMapping
    public List<Record> getAll() {
        return repo.findAll();
    }
}
