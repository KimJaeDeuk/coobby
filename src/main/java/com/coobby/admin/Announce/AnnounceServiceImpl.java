package com.coobby.admin.Announce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.user.board.BoardRepository;
import com.coobby.vo.BoardVO;

@Service
public class AnnounceServiceImpl implements AnnounceService{
	@Autowired
	private BoardRepository boardRepo;
	
	@Override
	public List<BoardVO> getBoardList(){
		return (List<BoardVO>) boardRepo.findAll();
	}
	
	@Override
	public void insertBoard(BoardVO vo) {
		boardRepo.save(vo);
	}
	
	@Override
	public BoardVO getBoard(BoardVO vo) {
		BoardVO result = boardRepo.findById(vo.getBoardNo()).get();
		result.setBoardViewcnt(vo.getBoardViewcnt());
		boardRepo.save(result);
		return result;
	}
	
	@Override
	public void deleteBoard(BoardVO vo) {
		boardRepo.deleteById(vo.getBoardNo());
	}
	
	@Override
	public void updateBoard(BoardVO vo) {
		BoardVO result = boardRepo.findById(vo.getBoardNo()).get();
		result.setBoardTitle(vo.getBoardTitle());
		result.setBoardContent(vo.getBoardContent());
		boardRepo.save(result);
	}
}
