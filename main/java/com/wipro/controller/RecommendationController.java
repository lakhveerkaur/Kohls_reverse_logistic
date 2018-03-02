package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.model.Action;
import com.wipro.model.AnalysisInfo;
import com.wipro.model.Product;
import com.wipro.service.RecommendationService;

@RestController
public class RecommendationController {
	private final RecommendationService recommendationService;

	@Autowired
	public RecommendationController(RecommendationService recommendationService) {
		this.recommendationService = recommendationService;
	}

	@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Action getQuestions(@RequestParam(required = false) String recommendation_engine_output,float avg_monthly_basket_value,String customer_lifetime_value,
								String loyalty_rank,Integer frequency_of_engagement,String propensity_to_return,String price_sensitivity,String propensity_to_fraud_customer,String propensity_to_fraud_subcategory,
								String propensity_to_fraud_geographic,String return_handling_cost,Integer product_return_frequency,Integer profit_per_unit,Integer product_age_at_store,
								String reason_summary,float recommendation_engine_confidence_score,float market_basket_analysis_engine_confidence_score,Integer lift) {

		/*System.out.println("engineOutput ----"+recommendation_engine_output+" avg_basket value "+avg_monthly_basket_value);
		System.out.println("customer_lifetime_value"+ customer_lifetime_value);
		System.out.println("loyalty_rank" +loyalty_rank+" frequency_of_engagement"+ frequency_of_engagement);
		System.out.println("propensity_to_return"+ propensity_to_return+" price_sensitivity"+ price_sensitivity);
		System.out.println("propensity_to_fraud_customer" +propensity_to_fraud_customer +" propensity_to_fraud_subcategory"+propensity_to_fraud_subcategory);
		System.out.println("propensity_to_fraud_geographic"+ propensity_to_fraud_geographic +" return_handling_cost"+return_handling_cost);
		System.out.println("product_return_frequency"+ product_return_frequency+" profit_per_unit"+profit_per_unit+" product_age_at_store"+product_age_at_store);
		System.out.println("reason_summary"+reason_summary +" recommendation_engine_confidence_score"+ recommendation_engine_confidence_score);
		System.out.println("market_basket_analysis_engine_confidence_score "+market_basket_analysis_engine_confidence_score+" lift"+ lift);*/

		AnalysisInfo info = new AnalysisInfo();
		info.setRecommendation_engine_output(recommendation_engine_output);
		info.setAvg_monthly_basket_value(avg_monthly_basket_value);
		info.setCustomer_lifetime_value(customer_lifetime_value);
		info.setLoyalty_rank(loyalty_rank);
		info.setFrequency_of_engagement(frequency_of_engagement);
		info.setPropensity_to_return(propensity_to_return);
		info.setPrice_sensitivity(price_sensitivity);
		info.setPropensity_to_fraud_customer(propensity_to_fraud_customer);
		info.setPropensity_to_fraud_subcategory(propensity_to_fraud_subcategory);
		info.setPropensity_to_fraud_geographic(propensity_to_fraud_geographic);
		info.setReturn_handling_cost(return_handling_cost);
		info.setProduct_return_frequency(product_return_frequency);
		info.setProfit_per_unit(profit_per_unit);
		info.setProduct_age_at_store(product_age_at_store);
		info.setReason_summary(reason_summary);
		info.setRecommendation_engine_confidence_score(recommendation_engine_confidence_score);
		info.setMarket_basket_analysis_engine_confidence_score(market_basket_analysis_engine_confidence_score);
		info.setLift(lift);
		recommendationService.getInfo(info);
		return info.getOutput();
	}
}
