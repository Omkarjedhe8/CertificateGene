package com.renocrewsoluations.certgenerator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renocrewsoluations.certgenerator.entity.Result;
import com.renocrewsoluations.certgenerator.repository.ResultRepository;

@Service
public class ResultService {
	
	@Autowired
    private final ResultRepository resultRepository;

       public ResultService(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public Optional<Result> getResultById(Long resultId) {
        return resultRepository.findByResultId(resultId);
    }

    public Result createResult(Result result) {
        return resultRepository.save(result);
    }

    public Result updateResult(Result result) {
        return resultRepository.save(result);
    }

    public boolean deleteResult(Long resultId) {
        resultRepository.deleteByResultId(resultId);
        return true;
    }
}
