package com.coobby.admin.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coobby.admin.category.how.CategoryHowRepository;
import com.coobby.admin.category.ingr.CategoryIngrRepository;
import com.coobby.admin.category.kind.CategoryKindRepository;
import com.coobby.admin.category.situ.CategorySituRepository;
import com.coobby.vo.HowCateVO;
import com.coobby.vo.IngrCateVO;
import com.coobby.vo.KindCateVO;
import com.coobby.vo.SituCateVO;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryKindRepository kindRepo;
	
	@Autowired
	CategoryHowRepository howRepo;

	@Autowired
	CategoryIngrRepository ingrRepo;

	@Autowired
	CategorySituRepository situRepo;

	@Override				// 카테고리 전체 삭제 후 받아온 배열을 입력 후 save
	public void saveCategory(String[] kind_name, String[] how_name, String[] ingr_name, String[] situ_name) {
		kindRepo.deleteAll();
		howRepo.deleteAll();
		ingrRepo.deleteAll();
		situRepo.deleteAll();
		
		if(kind_name!=null)
		{
			for(int i=0; i < kind_name.length;i++ ) {
				KindCateVO vo = new KindCateVO();
				vo.setKind_name(kind_name[i]);
				kindRepo.save(vo);
			}
		}		
		if(situ_name!=null) {
			for(int i=0; i < situ_name.length; i++ ) {
				SituCateVO vo = new SituCateVO();
				vo.setSitu_name(situ_name[i]);
				situRepo.save(vo);
			}
		}
		
		if(ingr_name!=null) {
			for(int i=0; i < ingr_name.length; i++ ) {
				IngrCateVO vo = new IngrCateVO();
				vo.setIngr_name(ingr_name[i]);
				ingrRepo.save(vo);
			}
		}
		if(how_name!=null) {
			for(int i=0; i < how_name.length; i++ ) {
				HowCateVO vo = new HowCateVO();
				vo.setHow_name(how_name[i]);
				howRepo.save(vo);
			}
		}
	}

	
	//카테고리페이지 불러올때 동작
	@Override
	public List<KindCateVO> kindList() {
		return (List<KindCateVO>)kindRepo.findAll();
	}

	@Override
	public List<HowCateVO> howList() {
		return (List<HowCateVO>)howRepo.findAll();
	}
	
	@Override
	public List<IngrCateVO> ingrList() {
		return (List<IngrCateVO>)ingrRepo.findAll();
	}

	@Override
	public List<SituCateVO> situList() {
		return (List<SituCateVO>)situRepo.findAll();
	}

}
