package com.example.demo.service.Impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
@Service
public class StudentServiceImpl implements StudentService {
    private final Map<Long,Student> store=new HashMap<>();
    private long counter=1;

    @Override
    public
}