package com.xulg.service;



import com.xulg.pojo.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> queryAll() throws Exception;
    void delById(Long id) throws  Exception;
    Resume findById(Long id) throws  Exception;
    Resume save(Resume resume) throws  Exception;
}
