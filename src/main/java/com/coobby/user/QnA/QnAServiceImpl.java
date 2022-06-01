package com.coobby.user.QnA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.vo.QnAVO;

@Service
public class QnAServiceImpl implements QnAService{
	
//	@Autowired
//	private QnARepository qnaRepo;
//	
//	@Override
//	public List<QnAVO> getQnAList() {
//		return (List<QnAVO>) qnaRepo.findAll();
//	}
//	
//	@Override
//	public QnAVO insertQnA(QnAVO vo) {
//		qnaRepo.insertQnA(vo.getMemId(), vo.getQTitle(), vo.getQContent());
//		return qnaRepo.findByQnAId(vo.getMemId());
//	}
//	
//	@Override
//	public QnAVO updateQnA(QnAVO vo) {
//		QnAVO vos = qnaRepo.findById(vo.getQnaNo()).get();
//		vos.setMemId(vo.getMemId());
//		qnaRepo.save(vos);
//		return vos;
//	}
//	
//	@Override
//	public void deleteQnA(Integer qnaNo) {
//		qnaRepo.deleteById(qnaNo);
//	}
	
}
