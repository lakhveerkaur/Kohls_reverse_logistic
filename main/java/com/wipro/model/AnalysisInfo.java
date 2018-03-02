package com.wipro.model;

public class AnalysisInfo {

	private String recommendation_engine_output;
	private float avg_monthly_basket_value;
	private String customer_lifetime_value;
	private String loyalty_rank;
	private int frequency_of_engagement;
	private String propensity_to_return;
	private String price_sensitivity;
	private String propensity_to_fraud_customer;
	private String propensity_to_fraud_subcategory;
	private String propensity_to_fraud_geographic;
	private String return_handling_cost;
	private int product_return_frequency;
	private int profit_per_unit;
	private int product_age_at_store;
	private String reason_summary;
	private float recommendation_engine_confidence_score;
	private float market_basket_analysis_engine_confidence_score;
	private int lift;
	public Action getOutput() {
		return output;
	}
	public void setOutput(Action output) {
		this.output = output;
	}
	private Action output;
	public String get() {
		return recommendation_engine_output;
	}
	public String getRecommendation_engine_output() {
		return recommendation_engine_output;
	}
	public void setRecommendation_engine_output(String recommendation_engine_output) {
		this.recommendation_engine_output = recommendation_engine_output;
	}
	public float getAvg_monthly_basket_value() {
		return avg_monthly_basket_value;
	}
	public void setAvg_monthly_basket_value(float avg_monthly_basket_value) {
		this.avg_monthly_basket_value = avg_monthly_basket_value;
	}
	public String getCustomer_lifetime_value() {
		return customer_lifetime_value;
	}
	public void setCustomer_lifetime_value(String customer_lifetime_value) {
		this.customer_lifetime_value = customer_lifetime_value;
	}
	public String getLoyalty_rank() {
		return loyalty_rank;
	}
	public void setLoyalty_rank(String loyalty_rank) {
		this.loyalty_rank = loyalty_rank;
	}
	public int getFrequency_of_engagement() {
		return frequency_of_engagement;
	}
	public void setFrequency_of_engagement(int frequency_of_engagement) {
		this.frequency_of_engagement = frequency_of_engagement;
	}
	public String getPropensity_to_return() {
		return propensity_to_return;
	}
	public void setPropensity_to_return(String propensity_to_return) {
		this.propensity_to_return = propensity_to_return;
	}
	public String getPrice_sensitivity() {
		return price_sensitivity;
	}
	public void setPrice_sensitivity(String price_sensitivity) {
		this.price_sensitivity = price_sensitivity;
	}
	public String getPropensity_to_fraud_customer() {
		return propensity_to_fraud_customer;
	}
	public void setPropensity_to_fraud_customer(String propensity_to_fraud_customer) {
		this.propensity_to_fraud_customer = propensity_to_fraud_customer;
	}
	public String getPropensity_to_fraud_subcategory() {
		return propensity_to_fraud_subcategory;
	}
	public void setPropensity_to_fraud_subcategory(String propensity_to_fraud_subcategory) {
		this.propensity_to_fraud_subcategory = propensity_to_fraud_subcategory;
	}
	public String getPropensity_to_fraud_geographic() {
		return propensity_to_fraud_geographic;
	}
	public void setPropensity_to_fraud_geographic(String propensity_to_fraud_geographic) {
		this.propensity_to_fraud_geographic = propensity_to_fraud_geographic;
	}
	public String getReturn_handling_cost() {
		return return_handling_cost;
	}
	public void setReturn_handling_cost(String return_handling_cost) {
		this.return_handling_cost = return_handling_cost;
	}
	public int getProduct_return_frequency() {
		return product_return_frequency;
	}
	public void setProduct_return_frequency(int product_return_frequency) {
		this.product_return_frequency =product_return_frequency;
	}
	public int getProfit_per_unit() {
		return profit_per_unit;
	}
	public void setProfit_per_unit(int profit_per_unit) {
		this.profit_per_unit = profit_per_unit;
	}
	public int getProduct_age_at_store() {
		return product_age_at_store;
	}
	public void setProduct_age_at_store(int product_age_at_store) {
		this.product_age_at_store = product_age_at_store;
	}
	public String getReason_summary() {
		return reason_summary;
	}
	public void setReason_summary(String reason_summary) {
		this.reason_summary = reason_summary;
	}
	public float getRecommendation_engine_confidence_score() {
		return recommendation_engine_confidence_score;
	}
	public void setRecommendation_engine_confidence_score(float recommendation_engine_confidence_score) {
		this.recommendation_engine_confidence_score = recommendation_engine_confidence_score;
	}
	public float getMarket_basket_analysis_engine_confidence_score() {
		return market_basket_analysis_engine_confidence_score;
	}
	public void setMarket_basket_analysis_engine_confidence_score(float market_basket_analysis_engine_confidence_score) {
		this.market_basket_analysis_engine_confidence_score = market_basket_analysis_engine_confidence_score;
	}
	public int getLift() {
		return lift;
	}
	public void setLift(int lift) {
		this.lift = lift;
	}






}
