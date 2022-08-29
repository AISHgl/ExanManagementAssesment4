package com.globallogic.springexam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.springexam.entity.Result;

@Service
public interface ResultService {
public String adddet(Result rs);
public String updatedet(Result rs);
public List<Result> alldet();
}
