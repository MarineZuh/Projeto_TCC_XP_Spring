package com.xp.tcc.tcc.controlador;

import com.xp.tcc.tcc.dominio.Aluno;
import com.xp.tcc.tcc.dominio.Tcc;
import com.xp.tcc.tcc.service.TccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tcc")
public class TccController {

    private final TccService tccService;

    @Autowired
    public TccController(TccService tccService) {
        this.tccService = tccService;
    }

    @GetMapping
    public ResponseEntity<List<Tcc>> todos() {
        List<Tcc> tccs = tccService.todos();

        return ResponseEntity.ok(tccs);
    }
    
    @PostMapping
    public ResponseEntity<Tcc> salva(@RequestBody Tcc tcc) {
        Tcc tccSalvo = tccService.salva(tcc);
        return ResponseEntity.status(HttpStatus.CREATED).body(tccSalvo);
    }
}
