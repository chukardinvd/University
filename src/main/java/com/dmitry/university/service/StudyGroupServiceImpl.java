package com.dmitry.university.service;

import com.dmitry.university.model.Community.StudyGroup;
import com.dmitry.university.repository.StudyGroupRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudyGroupServiceImpl implements StudyGroupService {

    private StudyGroupRepository studyGroupRepository;


    @Override
    public Page<StudyGroup> findAll(int page, int size) {
        return studyGroupRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public List<StudyGroup> findAll() {
        return studyGroupRepository.findAll();
    }

    @Override
    public StudyGroup findById(int theId) {
        return studyGroupRepository.findById(theId).orElseThrow(() -> new IllegalArgumentException("Invalid Id:" + theId));
    }

    @Override
    public void save(StudyGroup studyGroup) {
        studyGroupRepository.save(studyGroup);
    }

    @Override
    public void deleteById(int theId) {
        studyGroupRepository.deleteById(theId);
    }
}