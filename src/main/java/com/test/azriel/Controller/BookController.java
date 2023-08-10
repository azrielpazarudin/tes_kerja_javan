package com.test.azriel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.azriel.Services.BooksService;
import com.test.azriel.dto.BooksDto;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BooksService service;
    @GetMapping
    public Object getAll(){
        return service.getAll();
    }
    
    @GetMapping("/{id}")
    public Object getById(@PathVariable int id){
        return service.getById(Integer.toUnsignedLong(id));
    }


    @PostMapping
    public Object save(@RequestBody BooksDto dto){
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public Object put(@PathVariable int id,@RequestBody BooksDto dto){
        return service.put(Integer.toUnsignedLong(id), dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        service.delete(Integer.toUnsignedLong(id));
    }
}
