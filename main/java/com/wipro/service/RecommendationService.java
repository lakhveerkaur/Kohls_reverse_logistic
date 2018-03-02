package com.wipro.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.model.Action;
import com.wipro.model.AnalysisInfo;
import com.wipro.model.Product;

@Service
public class RecommendationService {
	private final KieContainer kieContainer;

	@Autowired
	public RecommendationService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

/*	public Product getProductDiscount(Product product) {
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(product);
		kieSession.fireAllRules();
		kieSession.dispose();
		return product;
	}*/
	public Action getInfo(AnalysisInfo info){
		
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(info);
		kieSession.fireAllRules();
		kieSession.dispose();
		//System.out.println(info.getOutput().getActionId()+"---action output---");
		return info.getOutput();
	}
}
